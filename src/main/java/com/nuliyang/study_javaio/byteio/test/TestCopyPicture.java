package com.nuliyang.study_javaio.byteio.test;


import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j(topic = "TestCopyPicture")
public class TestCopyPicture {

    public static void main(String[] args) throws IOException {
        //读取照片字节内容
        try(InputStream fileInputStream = new FileInputStream("src/main/resources/yamadaqiaokeli.jpg");
            OutputStream fileOutputStream = new FileOutputStream("src/main/resources/copy.jpg")) {
            byte[] pictureBytes = fileInputStream.readAllBytes();

            log.info("读取照片内容完成");

            //将照片字节写入到复制文件
            fileOutputStream.write(pictureBytes);

            log.info("写入照片内容完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
