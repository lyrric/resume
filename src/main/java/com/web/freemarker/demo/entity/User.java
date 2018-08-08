package com.web.freemarker.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Table(name = "user")
@Data
public class User {
    /**
     * 
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实名字
     */
    private String realName;

    /**
     * 身高
     */
    private Integer stature;

    /**
     * 民族
     */
    private String nation;

    /**
     * 教育
     */
    private String education;

    /**
     * 电话号码
     */
    private String tel;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 毕业院校
     */
    private String college;

    /**
     * 住址
     */
    private String address;

    /**
     * 求职意向
     */
    private String jobIntention;

    /**
     * 头像
     */
    private String profilePhoto;

    /**
     * 密码
     */
    @JsonIgnore
    private String password;

    /**
     * 自我介绍
     */
    private String introduction;

}