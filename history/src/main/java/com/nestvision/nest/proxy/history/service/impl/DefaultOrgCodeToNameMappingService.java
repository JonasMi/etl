package com.nestvision.nest.proxy.history.service.impl;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.InMemoryDnsResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.nestvision.nest.proxy.history.entity.LookuptableWapper;
import com.nestvision.nest.proxy.history.entity.MappingDetail;
import com.nestvision.nest.proxy.history.entity.MappingDetailWrapper;
import com.nestvision.nest.proxy.history.entity.PageableTenants;
import com.nestvision.nest.proxy.history.entity.Tenant;
import com.nestvision.nest.proxy.history.service.OrgCodeToNameMappingService;
import com.nestvision.nest.proxy.nest.api.response.Authentication;

/*@Service*/
public class DefaultOrgCodeToNameMappingService implements OrgCodeToNameMappingService {
	@Value("${nest.url.lookuptables}")
	private String lookuptablesUrl;
	
	@Value("${nest.url.http}")
    private String http;

    @Value("${nest.domain}")
    private String domain;

    @Value("${nest.ip}")
    private String ip;

    @Value("${nest.username}")
    private String username;

    @Value("${nest.password}")
    private String password;

    @Value("${nest.tenant.name}")
    private String tenantName;
    
    @Value("${nest.url.sign}")
    private String signUrl;
    
    private String XAuthToken;
    @Value("${nest.url.runAsTenant}")
    private String runAsTenantUrl;
    
    @Value("${nest.url.tenants}")
    private String tenantsUrl;

    private Map<String, String> orgCodeToNameMapping = new HashMap<>();

    private RestTemplate restTemplate;

    @Override
    public String getUpHospitalName(String upHospital) {
        return orgCodeToNameMapping.get(upHospital);
    }

    @PostConstruct
    public void init() {
        try {
            InMemoryDnsResolver dnsResolver = new InMemoryDnsResolver();
            dnsResolver.add(domain, Inet4Address.getAllByName(ip));
            HttpClient client = HttpClients.custom().setDnsResolver(dnsResolver).build();
            HttpComponentsClientHttpRequestFactory cf = new HttpComponentsClientHttpRequestFactory(client);
            this.restTemplate = new RestTemplate(cf);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        sign();
        orgCodeToNameMappingInit();

    }

    private void sign() {
        HttpHeaders headers = new HttpHeaders();
        String md5Password = StringUtils.upperCase(DigestUtils.md5Hex(password));
        headers.set("X-Auth-Username", username);
        headers.set("X-Auth-Password", md5Password);
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<Authentication> responseEntity;
        try {

            responseEntity = restTemplate.exchange(http + domain + signUrl, HttpMethod.POST, requestEntity, Authentication.class);
        } catch (RestClientException e) {
            throw new RestClientException("在调用登陆接口发生错误:" + e.getMessage(), e);
        }
        this.XAuthToken = responseEntity.getBody().getToken();
        tenantLogin();
    }

    private List<Tenant> findTenants() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Auth-Token", XAuthToken);
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        return restTemplate.exchange(http + domain + tenantsUrl, HttpMethod.GET, requestEntity, PageableTenants.class).getBody().getContent();
    }

    private void tenantLogin() {
        List<Tenant> tenants = findTenants();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Auth-Token", XAuthToken);
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        String tenantIdentifier = null;
        for (Tenant tenant : tenants) {
            if (tenant.getName().equals(tenantName)) {
                tenantIdentifier = tenant.getIdentifier();
                break;
            }
        }
        restTemplate.exchange(http + domain + runAsTenantUrl + tenantIdentifier + "/", HttpMethod.GET, requestEntity, String.class);
    }

    private void orgCodeToNameMappingInit() {
        String identifier = getMappingIdentifier();
        String tableDetailUrl = "/nest/api/lookuptables/" + identifier + "/entries?page.page=1&page.size=1000&page.sort=leftSide&page.sort.dir=asc";
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Auth-Token", XAuthToken);
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        String url = http + domain + tableDetailUrl;
        List<MappingDetail> mappingDetails = restTemplate.exchange(url, HttpMethod.GET, requestEntity, MappingDetailWrapper.class).getBody().getContent();
        for (MappingDetail mappingDetail : mappingDetails) {
            orgCodeToNameMapping.put(mappingDetail.getLeftSide(), mappingDetail.getRightSide());
        }
    }

    private String getMappingIdentifier() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Auth-Token", XAuthToken);
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);
        String url = http + domain + lookuptablesUrl;
        LookuptableWapper lookuptableWapper = restTemplate.exchange(url, HttpMethod.GET, requestEntity, LookuptableWapper.class).getBody();
        return lookuptableWapper.getContent().get(0).getIdentifier();
    }

}
