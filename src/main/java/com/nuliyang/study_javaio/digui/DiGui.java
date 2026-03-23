package com.nuliyang.study_javaio.digui;


import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j(topic = "DiGui")
public class DiGui {

    /*
     * 计算n的阶乘，5的阶乘=1*2*3*4*5;6的阶乘=1*2*3*4*5*6;
     */
    public  static int jiecheng(int n){
       if (n==1){
           return 1;
       }else {
           return n*jiecheng(n-1);
       }
    }


    /*
     * 找到我本地在D盘的DxDiag.txt文件
     */
    public static void findFile(File file, String fileName){
        if (!file.exists() || file.isFile() || fileName == null
        || file.length() == 0) {
            return;
        }
        if (file.isFile() ) {
            if (file.getName().contains(fileName)){
                log.info("找到文件: {}", file.getAbsolutePath());
                return;
            }
        }
        File[] files = file.listFiles();
        assert files != null;
        log.info("正在遍历文件夹: {}", file.getAbsolutePath());
        if (files.length > 0 && files != null){
            for (File f : files) {
                if (f.isFile() ) {
                    if (f.getName().contains(fileName)){
                        log.info("找到文件: {}", f.getAbsolutePath());
                        return;
                    }
                }else {
                    findFile(f,fileName);
                }
            }
        }
    }

    public static void main(String[] args) {
        log.info("5的阶乘为: {}", jiecheng(5));
        findFile(new File("D:/"),"DxDiag.txt");
    }
}
