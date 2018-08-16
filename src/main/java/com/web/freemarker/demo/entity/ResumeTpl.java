package com.web.freemarker.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * 简历模版
 */
@Data
public class ResumeTpl {
    /**
     * 
     */
    private Integer id;

    /**
     * 封面
     */
    private String thumb;

    /**
     * 模版路径
     */
    private String path;

    /**
     * 模版描述
     */
    private String description;


}