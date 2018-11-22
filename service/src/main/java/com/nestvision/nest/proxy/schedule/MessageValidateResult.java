package com.nestvision.nest.proxy.schedule;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

public class MessageValidateResult {

    private Object source;

    private List<InvalidColumn> invalidColumns;

    private List<MessageValidateResult> internalResults;

    public MessageValidateResult(Object source) {
        this.source = source;
        invalidColumns = new ArrayList<>();
        internalResults = new ArrayList<>();
    }

    public void addInvalidColumn(InvalidColumn invalidColumn) {
        invalidColumns.add(invalidColumn);
    }

    public void addInternalResult(MessageValidateResult result) {
        Assert.isTrue(result != this, "校验结果不能够添加自己到内部校验结果中");
        internalResults.add(result);
    }
    
    public Object getSource() {
        return source;
    }
    public List<InvalidColumn> getInvalidColumns() {
        return invalidColumns;
    }

    public List<MessageValidateResult> getInternalResults() {
        return internalResults;
    }

    public boolean isValid() {

        return invalidColumns.isEmpty() && (internalResults.isEmpty());
    }

}
