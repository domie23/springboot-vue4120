package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *疫情政策：(EpidemicPolicy)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "EpidemicPolicy")
public class EpidemicPolicy implements Serializable {

    //EpidemicPolicy编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "epidemic_policy_id")
    private Integer epidemic_policy_id;
    // 地区编号
    @Basic
    private String area_number;
    // 地区名称
    @Basic
    private String region_name;
    // 日期
    @Basic
    private Timestamp date;
    // 封面
    @Basic
    private String cover;
    // 政策详情
    @Basic
    private String details_of_epidemic_policy;
    // 点击数
    @Basic
    private Integer hits;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
