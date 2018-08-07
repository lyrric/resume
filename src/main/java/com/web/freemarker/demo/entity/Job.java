package com.web.freemarker.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "job")
public class Job {
    /**
     * 
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
     * 公司
     */
    private String company;

    /**
     * 职位
     */
    private String position;

    /**
     * 描述
     */
    private String description;

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
     * 公司
     * @return company 公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 公司
     * @param company 公司
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * 职位
     * @return position 职位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 职位
     * @param position 职位
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * 描述
     * @return description 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}