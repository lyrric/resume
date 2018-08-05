package com.web.freemarker.demo.entity;

import java.util.Date;

public class Education {
    /**
     * 
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date endDate;

    /**
     * 学校名
     */
    private String college;

    /**
     * 专业
     */
    private String specialty;

    /**
     * 本科/专科
     */
    private String type;

    /**
     * 主修课程
     */
    private String courses;

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
     * 用户ID
     * @return user_id 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 开始时间
     * @return start_date 开始时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 开始时间
     * @param startDate 开始时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 结束时间
     * @return end_date 结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 结束时间
     * @param endDate 结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 学校名
     * @return college 学校名
     */
    public String getCollege() {
        return college;
    }

    /**
     * 学校名
     * @param college 学校名
     */
    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    /**
     * 专业
     * @return specialty 专业
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * 专业
     * @param specialty 专业
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    /**
     * 本科/专科
     * @return type 本科/专科
     */
    public String getType() {
        return type;
    }

    /**
     * 本科/专科
     * @param type 本科/专科
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 主修课程
     * @return courses 主修课程
     */
    public String getCourses() {
        return courses;
    }

    /**
     * 主修课程
     * @param courses 主修课程
     */
    public void setCourses(String courses) {
        this.courses = courses == null ? null : courses.trim();
    }
}