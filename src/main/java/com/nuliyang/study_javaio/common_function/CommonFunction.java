package com.nuliyang.study_javaio.common_function;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;

@Slf4j(topic = "CommonFunction")
public class CommonFunction {

    public static void main(String[] args) throws IOException {

        //创建文件及其常用方法
        File abc = new File("src/main/resources/abc.txt");

        log.info("abc.txt文件长度: {}", abc.length());

        log.info("abc.txt文件是否存在: {}", abc.exists());

        log.info("abc.txt文件是否是文件: {}", abc.isFile());

        log.info("abc.txt文件是否是文件夹: {}", abc.isDirectory());

        log.info("abc.txt文件的名字: {}", abc.getName());

        log.info("abc.txt文件的最后修改时间: {}", abc.lastModified());

        log.info("abc.txt文件的创建时的路径: {}", abc.getPath());

        log.info("abc.txt文件的绝对路径: {}", abc.getAbsolutePath());

        log.info("================================================");

        //创建文件夹
        File aaa = new File("src/main/resources/aaa.txt");

        log.info("创建内容为空的新文件: {}", aaa.createNewFile());
        log.info("创建已经存在的文件: {}", aaa.createNewFile());

        File aDirection = new File("src/main/resources/aDirection");
        log.info("创建一级文件夹: {}", aDirection.mkdir());

        File bbb = new File("src/main/resources/aDirection/bbb.txt");
        log.info("在aDirection文件夹中创建文件: {}", bbb.createNewFile());

        File acDirection = new File("src/main/resources/bDirection/cDirection");
        log.info("创建多级文件夹: {}", acDirection.mkdirs());

        log.info("删除文件: {}", abc.delete());
        log.info("无法删除非空文件夹，返回false: {}", aDirection.delete());

        new File("src/main/resources/bDirection/cDirection").mkdirs();

        new File("src/main/resources/bDirection/ccc.txt").createNewFile();

        log.info("================================================");

        //遍历文件夹
        String[] list = new File("src/main/resources/bDirection").list();
        for (String s : list){
            log.info("使用list()，返回一级文件的名称数组");
            log.info("bDirection文件夹下的文件: {}", s);
        }

        File[] listFiles = new File("src/main/resources/bDirection").listFiles();
        for (File file : listFiles){
            log.info("使用listFiles()，返回一级文件的文件对象");
            log.info("bDirection文件夹下的文件: {}", file.getName());
        }


    }
}
