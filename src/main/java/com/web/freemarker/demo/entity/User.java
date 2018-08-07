package com.web.freemarker.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "user")
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
    private Date birthday;

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
    private String password;

    /**
     * 自我介绍
     */
    private String introduction;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户名
     * @return username 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 真实名字
     * @return real_name 真实名字
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真实名字
     * @param realName 真实名字
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 身高
     * @return stature 身高
     */
    public Integer getStature() {
        return stature;
    }

    /**
     * 身高
     * @param stature 身高
     */
    public void setStature(Integer stature) {
        this.stature = stature;
    }

    /**
     * 民族
     * @return nation 民族
     */
    public String getNation() {
        return nation;
    }

    /**
     * 民族
     * @param nation 民族
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     * 教育
     * @return education 教育
     */
    public String getEducation() {
        return education;
    }

    /**
     * 教育
     * @param education 教育
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     * 电话号码
     * @return tel 电话号码
     */
    public String getTel() {
        return tel;
    }

    /**
     * 电话号码
     * @param tel 电话号码
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * 生日
     * @return birthday 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 生日
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 电子邮箱
     * @return email 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 电子邮箱
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 毕业院校
     * @return college 毕业院校
     */
    public String getCollege() {
        return college;
    }

    /**
     * 毕业院校
     * @param college 毕业院校
     */
    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    /**
     * 住址
     * @return address 住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 住址
     * @param address 住址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 求职意向
     * @return job_intention 求职意向
     */
    public String getJobIntention() {
        return jobIntention;
    }

    /**
     * 求职意向
     * @param jobIntention 求职意向
     */
    public void setJobIntention(String jobIntention) {
        this.jobIntention = jobIntention == null ? null : jobIntention.trim();
    }

    /**
     * 头像
     * @return profile_photo 头像
     */
    public String getProfilePhoto() {
        return profilePhoto;
    }

    /**
     * 头像
     * @param profilePhoto 头像
     */
    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto == null ? null : profilePhoto.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 自我介绍
     * @return introduction 自我介绍
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 自我介绍
     * @param introduction 自我介绍
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}