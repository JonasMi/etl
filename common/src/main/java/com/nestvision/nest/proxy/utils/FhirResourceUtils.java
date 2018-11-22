package com.nestvision.nest.proxy.utils;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 小小 on 2018/7/18 09:23
 */
@Slf4j
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class FhirResourceUtils {

    private static final String PREFIX = "//fhir:/";

    private static final Map<String, String> NAMESPACE = new HashMap<String, String>() {{
        put("fhir", "http://hl7.org/fhir");
    }};

    public static String getIdentifierNamespace(byte[] bytes) {
        return getIdentifierNamespace(createDocument(bytes));
    }

    public static String getIdentifierValue(byte[] bytes) {
        return getIdentifierValue(createDocument(bytes));
    }

    public static String getIdentifierNamespace(Document document) {
        String resourceName = getRootElementName(document);
        String namespacePath = PREFIX + resourceName + "/identifier/@value";
        if (resourceName.equals("Bundle")) {
            namespacePath = PREFIX + resourceName + "/entry/resource/Composition/identifier/@value";
        } else if (resourceName.equals("Medication")) {
            namespacePath = PREFIX + resourceName + "/code/coding/@value";
        }

        XPath x = document.createXPath(namespacePath);
        x.setNamespaceURIs(NAMESPACE);
        Node node = x.selectSingleNode(document);

        return node.getStringValue();
    }

    public static String getIdentifierValue(Document document) {
        String resourceName = getRootElementName(document);
        String valuePath = PREFIX + resourceName + "/identifier/value/@value";

        if (resourceName.equals("Bundle")) {
            valuePath = PREFIX + resourceName + "/entry/resource/Composition/identifier/value/@value";
        } else if (resourceName.equals("Medication")) {
            valuePath = PREFIX + resourceName + "/code/coding/code/@value";
        }

        XPath x = document.createXPath(valuePath);
        x.setNamespaceURIs(NAMESPACE);
        Node node = x.selectSingleNode(document);

        return node.getStringValue();
    }

    public static Document createDocument(byte[] bytes) {
        SAXReader saxReader = new SAXReader();
        Document document;
        try {
            document = saxReader.read(new ByteArrayInputStream(bytes));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            //TODO 异常处理
            throw new IllegalArgumentException(e);
        }
        return document;
    }

    private static String getRootElementName(Document document) {
        return document.getRootElement().getName();
    }
}
