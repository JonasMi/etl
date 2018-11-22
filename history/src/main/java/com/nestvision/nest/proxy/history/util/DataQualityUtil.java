package com.nestvision.nest.proxy.history.util;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import com.nestvision.nest.proxy.base.util.XPathFactory;

import lombok.Data;

@Data
public class DataQualityUtil {
	public final static int STATUS_COORDINATOR = 4;
	
	public final static String TYPE_COORDINATOR = "coordinator";
	
	public final static String TYPE_VALIDATOR = "validator";
	
	public final static String BLANK_REPLACE = "-";
	
	public final static String NOT_UPLOAD ="未上传";
	
	public final static String SOAPACTION="SOAPAction";
	
	public final static String PARAMETERS = "Parameters";
	
	public final static String IGNORE_REFERENCE_CHECK = "ignoreReferenceCheck";
	
	public final static String BUNDLE = "Bundle";
	
	public final static String SPLIT_UNDERLINE = "_";
	
	public static String getResourceIdentifier(Document document, String physicalInterfaceName) throws XPathExpressionException {
        XPath xpath = XPathFactory.getXpath();
        if (physicalInterfaceName.equals("Bundle")) {
            return (String) xpath.evaluate(physicalInterfaceName + "/entry/resource/Composition/identifier/value/@value", document, XPathConstants.STRING);
        }
        if(physicalInterfaceName.equals("Medication")){
        	return (String)xpath.evaluate(physicalInterfaceName+"/code/coding/code/@value", document,XPathConstants.STRING);
        }
        return (String) xpath.evaluate(physicalInterfaceName + "/identifier/value/@value", document, XPathConstants.STRING);
    }
}
