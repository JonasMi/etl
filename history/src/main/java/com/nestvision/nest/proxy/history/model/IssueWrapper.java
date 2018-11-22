package com.nestvision.nest.proxy.history.model;

import java.util.List;

import lombok.Data;

@Data
public class IssueWrapper {

    private List<ValidatorIssue> issues;
}
