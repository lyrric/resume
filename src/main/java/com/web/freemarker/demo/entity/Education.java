package com.web.freemarker.demo.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Table(name = "education")
@Data
public class Education {
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
    private LocalDate startDate;

    /**
     * 结束时间
     */
    private LocalDate endDate;

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


}