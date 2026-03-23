package com.nuliyang.study_javaio.charset;


import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;

@Slf4j(topic = "ChartSet")
public class ChartSet {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "想去日本";

        byte[] bytes = str.getBytes();
        log.info("str.getBytes()结果: {}", bytes);

        byte[] bytes1 = str.getBytes("GBK");
        log.info("str.getBytes(GBK)结果: {}", bytes1);

        String str1 = new String(bytes);
        log.info("new String(bytes)结果: {}", str1);

        String str2 = new String(bytes1);
        log.info("new String(bytes1)结果: {}", str2);


        String str3 = new String(bytes1, "GBK");
        log.info("new String(bytes1, GBK)结果: {}", str3);

    }
}
