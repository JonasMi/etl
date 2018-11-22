package com.nestvision.nest.proxy.base.util;

import javax.xml.namespace.NamespaceContext;
import javax.xml.xpath.XPath;

public class XPathFactory {
    public static XPath getXpath() {
        return javax.xml.xpath.XPathFactory.newInstance().newXPath();
    }

    public static XPath getXpath(NamespaceContext context) {
        XPath xPath = getXpath();
        xPath.setNamespaceContext(context);
        return xPath;
    }
}
