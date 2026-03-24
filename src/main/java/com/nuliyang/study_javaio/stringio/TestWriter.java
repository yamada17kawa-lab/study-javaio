package com.nuliyang.study_javaio.stringio;


import lombok.extern.slf4j.Slf4j;

import java.io.FileWriter;

@Slf4j(topic = "TestWriter")
public class TestWriter {

    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("src/main/resources/test-writer.txt");

            //写一个字符
            writer.write('a');
            writer.write("\r\n");
            writer.write(98);

            //写一个字符数组
            char[] chars = "ciallo !\r\n".toCharArray();
            writer.write(chars);

            //写一个字符串
            writer.write("坚持住，一切都会越来越好的！\r\n");

            //将缓冲区的数据刷新到文件中
            writer.flush();

            //关闭写入器
            writer.close();

            log.info("写入完成");

        } catch (Exception e) {
            log.error("Error occurred", e);
        }
    }
}
