package com.nestvision.nest.proxy.history.entity;

import org.w3c.dom.Node;

import lombok.Data;

/**
 * 问题类
 * Created by renz on 2016/6/21.
 */
@Data
public class ValidatorIssue {
    private ResultSeverityEnum severity; //信息类别

    private IssueType code;

    private String diagnostics; //诊断

    private String path; // 节点路径

    private String fullXPath; // 节点xpath

    private String elementComment; //节点描述

    private String location; //定位

    private XlsModelErrorCategory error; //错误

    private Node xmlNode;

    private TerminologyIssue terminologyIssue;

    private int start = 0;
    private int end = 0;

    @Data
    public static class TerminologyIssue {
        private String codeSystem;
        private String codeSystemName;
        private String codeSystemDescription;
        private String valueSet;
        private String valueSetName;
        private String valueSetDescription;
        private String reason;
    }

    

    
}
