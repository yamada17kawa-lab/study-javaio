package com.nuliyang.study_javaio.stringio;


import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;

@Slf4j(topic = "TestReader")
public class TestReader {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader("src/main/resources/test-inputstream.txt");) {
            //读取一个字符
            log.info("读取一个字符结果: {}", reader.read());

            //读取一个字符数组
            char[] chars = new char[4];
            reader.read(chars);
            log.info("读取一个字符数组: {}", new String(chars));

        } catch (Exception e) {
            log.error("Error occurred", e);
        }
    }
}
