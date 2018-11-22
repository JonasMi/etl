package com.nestvision.nest.proxy.nest.client.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.URI;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.InMemoryDnsResolver;
import org.apache.http.protocol.HttpContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import com.nestvision.nest.proxy.nest.NestCertificateException;
import com.nestvision.nest.proxy.nest.NestCertificateNotFoundException;
import com.nestvision.nest.proxy.nest.client.NestClient;
import com.nestvision.nest.proxy.nest.client.NestClientStorage;
import com.nestvision.nest.proxy.nest.entity.NestCertificate;
import com.nestvision.nest.proxy.nest.service.NestCertificateService;

import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultNestClientStorage extends PathMatchingResourcePatternResolver implements NestClientStorage {

    private Map<String, NestClient> centerNestClients = new HashMap<>();

    private Map<String, NestClient> frontNestClients = new HashMap<>();

    public static final String CERTIFICATE_FILE_SUFFIX = ".jks";

    @Value("${nest.center.server:https://fhir.lfwsxx.org.cn/ws/}")
    private String nestCenterServerUrl;

    @Value("${nest.center.server.ip:192.168.2.200}")
    private String nestCenterServerIP;

    private int readTimeout = 60000;

    @Autowired
    private NestCertificateService nestCertificateService;
    
    @Value("${resource.path.certs}")
    private String certResourcePath;

    @PostConstruct
    protected void init() throws NestCertificateException {
        final String location = certResourcePath;
        Resource[] resources;
        try {
            log.info("开始加载本地SSL证书,证书目录:" + location);
            resources = findPathMatchingResources(location);
            log.info("资源总数:"+resources.length+"个");
        } catch (IOException e) {
            log.error("从{}加载本地SSL证书失败", location);
            throw new NestCertificateException("从{}加载本地SSL证书失败:" + e.getMessage(), e);
        }
        for (Resource resource : resources) {
            String certificateName = FilenameUtils.getBaseName(resource.getFilename());
            if (!nestCertificateService.exists(certificateName)) {
                NestCertificate certificate = null;
                InputStream input = null;
                try {
                    input = resource.getInputStream();
                    certificate = loadCertificate(certificateName, input);
                    nestCertificateService.save(certificate);
                    log.debug("从本地SSL证书[{}]加载到数据库当中", certificateName);
                } catch (IOException e) {
                    log.warn("加载本地SSL证书失败:" + certificateName, e);
                    throw new NestCertificateException("加载本地SSL证书失败:" + e.getMessage(), e);
                } finally {
                    IOUtils.closeQuietly(input);
                }
            }

        }
        log.info("加载本地SSL证书完成,证书目录:" + location);
    }

    private NestCertificate loadCertificate(String name, InputStream input) throws IOException {

        NestCertificate certificate = new NestCertificate();
        certificate.setCn(name);
        certificate.setContent(IOUtils.toByteArray(input));
        certificate.setPassword("changeit");
        return certificate;
    }

    @Override
    public NestClient fetchCenterNestClient(String cn) {

        NestClient nestClient = centerNestClients.get(cn);
        if (nestClient == null) {
            try {
                log.debug("创建医院:{}的Nest中心机客户端", cn);
                nestClient = createCenterNestClient(cn);
                centerNestClients.put(cn, nestClient);
            } catch (Exception e) {
                log.error("无法创建医院:" + cn + "的Nest中心机客户端,错误:" + e.getMessage(), e);

            }
        }
        return nestClient;
    }

    @Override
    public NestClient fetchFrontNestClient(String cn) {

        NestClient nestClient = frontNestClients.get(cn);
        if (nestClient == null) {
            log.debug("创建医院:{}的Nest前置机客户端", cn);
            nestClient = createFrontNestClients(cn);
            frontNestClients.put(cn, nestClient);
        }
        return nestClient;
    }

    protected NestClient createFrontNestClients(String cn) {

        String gateawayUrl = getGateAwayUrl(cn);
        DefaultNestClient client = new DefaultNestClient(gateawayUrl);
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        messageSender.setReadTimeout(readTimeout);

        client.setMessageSender(messageSender);
        return client;
    }

    protected NestClient createCenterNestClient(String cn) throws Exception {

        DefaultNestClient client = null;
        if (StringUtils.endsWith(nestCenterServerUrl, "/")) {
            client = new DefaultNestClient(nestCenterServerUrl);
        } else {
            client = new DefaultNestClient(nestCenterServerUrl + "/");
        }
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        messageSender.setReadTimeout(readTimeout);

        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());

        NestCertificate nestCertificate = nestCertificateService.findOne(cn);
        if (nestCertificate == null) {
            throw new NestCertificateNotFoundException(cn);
        }
        byte[] content = nestCertificate.getContent();

        ByteArrayInputStream input = new ByteArrayInputStream(content);
        String password = nestCertificate.getPassword();
        try {
            keyStore.load(input, password.toCharArray());
        } catch (Exception e) {
            throw e;
        } finally {
            IOUtils.closeQuietly(input);
        }
        SSLSocketFactory socketFactory = new SSLSocketFactory(SSLSocketFactory.TLS, keyStore, password, null, null, new TrustStrategy() {
            public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                return true;
            }
        }, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        URI nestServerURI = URI.create(nestCenterServerUrl);
        String host = nestServerURI.getHost();
        InMemoryDnsResolver dnsResolver = new InMemoryDnsResolver();
        dnsResolver.add(host, Inet4Address.getAllByName(nestCenterServerIP));
        HeaderHttpRequestInterceptor headerHttpRequestInterceptor = new HeaderHttpRequestInterceptor();
        HttpClient httpClient = HttpClients.custom().setSSLSocketFactory(socketFactory).addInterceptorFirst(headerHttpRequestInterceptor).setDnsResolver(dnsResolver).build();
        messageSender.setHttpClient(httpClient);
        client.setMessageSender(messageSender);
        return client;
    }

    private String getGateAwayUrl(String cn) {

        return "";
    }
    
    private class HeaderHttpRequestInterceptor implements HttpRequestInterceptor {
        @Override
        public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
            request.removeHeaders("Content-Length");
        }
    }

}
