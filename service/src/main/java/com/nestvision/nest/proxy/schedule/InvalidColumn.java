package com.nestvision.nest.proxy.schedule;

import com.nestvision.nest.proxy.nest.entity.DataQuaityReportInvalidColumn;
import com.nestvision.nest.proxy.nest.entity.DataQuaityReportInvalidColumn.InvalidType;

public class InvalidColumn {
    private String name;

    private String displayName;

    private InvalidType invalidType;

    private String invalidMessage;

    private String columnValue;

    public InvalidColumn(String name, String displayName, InvalidType invalidType, String invalidMessage, String columnValue) {

        this.name = name;
        this.displayName = displayName;
        this.invalidType = invalidType;
        this.invalidMessage = invalidMessage;
        this.columnValue = columnValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public DataQuaityReportInvalidColumn.InvalidType getInvalidType() {
        return invalidType;
    }

    public void setInvalidType(DataQuaityReportInvalidColumn.InvalidType invalidType) {
        this.invalidType = invalidType;
    }

    public String getInvalidMessage() {
        return invalidMessage;
    }

    public void setInvalidMessage(String invalidMessage) {
        this.invalidMessage = invalidMessage;
    }

    public String getColumnValue() {
        return columnValue;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }
}
