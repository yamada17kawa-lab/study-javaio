package com.nuliyang.study_javaio.create_file;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j(topic = "CreateFile")
public class CreateFile {

    public static void main(String[] args) {


        //已存在的文件
        File abc = new File("src/main/resources/abc.txt");
        log.info("abc.txt文件长度: {}", abc.length());
        log.info("abc.txt文件是否存在: {}", abc.exists());

        //不存在的文件
        File def = new File("src/main/resources/def.txt");
        log.info("def.txt文件长度: {}", def.length());
        log.info("def.txt文件是否存在: {}", def.exists());
    }
}
