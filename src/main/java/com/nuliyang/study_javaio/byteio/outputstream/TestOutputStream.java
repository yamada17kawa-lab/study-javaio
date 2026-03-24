package com.nuliyang.study_javaio.byteio.outputstream;

import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Slf4j(topic = "TestOutputStream")
public class TestOutputStream {

    public static void main(String[] args) throws IOException {

        //覆盖数据通道
        OutputStream outputStream1 = new FileOutputStream("src/main/resources/test-outputstream.txt");

        try {

            //写一个字节
            outputStream1.write('w');

            byte[] rn = "\r\n".getBytes();

            outputStream1.write(rn);

            //写一个字节数组
            byte[] bytes = "ciallo !".getBytes();

            outputStream1.write(bytes);
            outputStream1.write(rn);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            outputStream1.close();
        }



        //追加数据通道
        OutputStream outputStream2 = new FileOutputStream("src/main/resources/test-outputstream.txt", true);

        try {
            byte[] zhuijia = "我是追加内容".getBytes();
            outputStream2.write(zhuijia);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            outputStream2.close();
        }



    }
}
