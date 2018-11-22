package com.nestvision.nest.proxy.nest.client.impl;

import com.nestvision.nest.proxy.base.util.URLUtil;
import com.nestvision.nest.proxy.base.util.XmlUtil;
import com.nestvision.nest.proxy.nest.client.NestClient;
import com.nestvision.nest.proxy.nest.client.NestResponse;
import com.nestvision.nest.proxy.nest.service.NestCertificateService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.xml.transform.StringResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerFactory;

@Slf4j
public class DefaultNestClient extends WebServiceGatewaySupport implements NestClient {

    public String url;

    private static final String SEVERITY_PATH = "//*[name()='severity']/@value";


    public DefaultNestClient(String url) {

        this.url = url;
    }

    protected NestResponse parseResponse(String response) {

//        Document document = XmlUtil.parse(response);
//
//        Element rootElement = document.getDocumentElement();
//
//        final String severity = XmlUtil.getNodeValue(rootElement, SEVERITY_PATH);

        //TODO 取cdrId
        NestResponse soapResponse = new NestResponse();

        soapResponse.setSuccess(true);
        return soapResponse;
    }

    @Override
    public NestResponse request(Source request, String resourceType, String soapAction) {

        String requestUrl = URLUtil.concat(url, resourceType);
        log.info("发起Nest请求:url={},resource={},soapAction={}", requestUrl, resourceType, soapAction);
        NestResponse nestResponse;
        try {
            String response = getWebServiceTemplate().sendSourceAndReceive(requestUrl, request, new SoapActionCallback(soapAction), source -> {
                StringResult stringResult = new StringResult();
                TransformerFactory.newInstance().newTransformer().transform(source, stringResult);
                return stringResult.toString();
            });
            nestResponse = parseResponse(response);
        } catch (Exception e) {
            nestResponse = new NestResponse();
            nestResponse.setSuccess(false);
            nestResponse.setFaultString(e.getMessage());
        }
        return nestResponse;

    }
}
