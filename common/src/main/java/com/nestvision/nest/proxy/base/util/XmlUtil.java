package com.nestvision.nest.proxy.base.util;

import java.io.StringReader;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

import org.apache.commons.io.IOUtils;
import org.springframework.xml.transform.StringResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class XmlUtil {

    private XmlUtil() {

    }

    public static Node getNode(Node node, String expression) {
        try {
            return (Node) XPathFactory.getXpath().evaluate(expression, node, XPathConstants.NODE);
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getNodeValue(Node node, String expression) {
        try {
            return (String) XPathFactory.getXpath().evaluate(expression, node, XPathConstants.STRING);
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
    }

    public static Document parse(String source) {

        StringReader sr = new StringReader(source);
        InputSource inputSource = new InputSource(sr);
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            IOUtils.closeQuietly(sr);
        }

    }

    public static String transformToString(Document document) {
        return transformToString(new DOMSource(document.getDocumentElement()));
    }

    public static String transformToString(Node node) {
        return transformToString(new DOMSource(node));
    }

    public static String transformToString(DOMSource domsource) {
        StringResult stringResult = new StringResult();
        Transformer transformer = newTransformer();
        try {

            transformer.transform(domsource, stringResult);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
        return stringResult.toString();
    }

    private static Transformer newTransformer() {
        Transformer transformer = null;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
        } catch (TransformerConfigurationException | TransformerFactoryConfigurationError e) {
            throw new RuntimeException(e);
        }
        Properties properties = transformer.getOutputProperties();
        properties.setProperty(OutputKeys.ENCODING, "utf-8");
        properties.setProperty(OutputKeys.METHOD, "xml");
        properties.setProperty(OutputKeys.VERSION, "1.0");
        properties.setProperty(OutputKeys.INDENT, "no");
        transformer.setOutputProperties(properties);
        return transformer;
    }
}
