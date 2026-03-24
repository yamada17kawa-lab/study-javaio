package com.nuliyang.study_javaio.byteio.inputstream;


import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Slf4j(topic = "TestInputStream")
public class TestInputStream {

    public static void main(String[] args) throws IOException {
        //创建文件输入流
        File file1 = new File("src/main/resources/test-inputstream.txt");
        FileInputStream fileInputStream1 = new FileInputStream(file1);

        File file2 = new File("src/main/resources/test-inputstream.txt2.txt");
        FileInputStream fileInputStream2 = new FileInputStream(file2);


        //自定义字节大小读取文件内容
        byte[] bytes = new byte[(int) (file1.length())];
        int length ;
        log.info("==============自定义字节大小读取文件内容==================");
        while ((length = fileInputStream1.read(bytes)) != -1) {
            String s = new String(bytes, 0, length);
            log.info(s);
        }

        fileInputStream1.close();

        //调用api一次性读取全部字节
        log.info("==============调用readAllBytes()一次性读取全部字节==================");
        byte[] allBytes = fileInputStream2.readAllBytes();
        log.info(new String(allBytes));

        fileInputStream2.close();
    }
}
