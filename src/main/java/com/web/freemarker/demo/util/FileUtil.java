package com.web.freemarker.demo.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class FileUtil {

    private static final DateTimeFormatter pathFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    private static String getPath(){
        return LocalDate.now().format(pathFormatter);
    }

    /**
     * 生成完整的上传路径
     * @param ext
     * @return
     */
    public static String generateFullUploadPath(String ext){
        return getPath()+("/")+System.currentTimeMillis()+(".")+(ext);
    }

    /**
     * 根据文件名获取扩展名
     * @param fileName
     * @return
     */
    public static String getExtByName(String fileName){
        if(fileName == null) return null;
        String []temp = fileName.split("\\.");
        if(temp.length < 2) return null;
        return temp[temp.length-1];
    }
}
