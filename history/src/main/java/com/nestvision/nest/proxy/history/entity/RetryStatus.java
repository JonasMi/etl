package com.nestvision.nest.proxy.history.entity;

public enum RetryStatus {

                         WAITTING {
                             @Override
                             public String displayName() {

                                 return "等待重发";
                             }
                         },
                         RETRYING {
                             @Override
                             public String displayName() {

                                 return "重发中";
                             }
                         },
                         RETRYED {
                             @Override
                             public String displayName() {

                                 return "已重发";
                             }
                         };

    public abstract String displayName();
}
