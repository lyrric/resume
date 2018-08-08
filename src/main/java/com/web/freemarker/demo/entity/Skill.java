package com.web.freemarker.demo.entity;


import lombok.Data;

@Data
public class Skill {
    /**
     * 
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 技能名称
     */
    private String name;

    /**
     * 熟练度
     */
    private Integer experience;


}