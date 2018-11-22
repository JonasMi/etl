package com.nestvision.nest.proxy.history.model;

/**
 * xls定义模型的错误分类
 * Created by renz on 2016/7/19.
 */
public enum XlsModelErrorCategory {
    REDUNDANT_NORMAL("普通多余节点", 1), REDUNDANT_LIST("集合多余节点", 2), LACK("缺少节点", 3), VALUE_SET_NOT_MATCH("值集不匹配", 4);

    private String name;

    private int index;

    XlsModelErrorCategory(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (XlsModelErrorCategory c : XlsModelErrorCategory.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
