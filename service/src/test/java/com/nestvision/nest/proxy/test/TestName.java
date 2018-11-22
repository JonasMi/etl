package com.nestvision.nest.proxy.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestName {

    @Test
    public void test() {
        Map<String, String> map = new HashMap<>();
        String m = map.get("s");
        if (m == null) {
            System.out.println("Kong");
        }
    }

    @Test
    public void test1() {
        /*
         * {"issues":
         * [
         * {"severity":"ERROR",
         * "code":"PROCESSING",
         * "diagnostics":"元素值[diagnosisCd]违反术语校验: 编码系统[null],
         * ValueSet[http://www.nestvision.com/platform/app/data/valueset/disease],System[urn:oid:2.16.156.10011.2.3.3.11],
         * reason: Code not found",
         * "location":"37行40列, /Condition[15]/code/coding/code",
         * "error":null,
         * "xmlNode":null,
         * "start":0,"end":0
         * }
         * ]
         * }
         */
    }

}
