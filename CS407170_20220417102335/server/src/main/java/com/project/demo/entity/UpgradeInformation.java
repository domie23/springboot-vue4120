package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *机票升舱：(UpgradeInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "UpgradeInformation")
public class UpgradeInformation implements Serializable {

    //UpgradeInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "upgrade_information_id")
    private Integer upgrade_information_id;
    // 出发地
    @Basic
    private String place_of_departure;
    // 目的地
    @Basic
    private String destination;
    // 出发时间
    @Basic
    private String departure_time;
    // 到达时间
    @Basic
    private String arrival_time;
    // 航班类型
    @Basic
    private String flight_type;
    // 客机编号
    @Basic
    private String passenger_plane_number;
    // 客机型号
    @Basic
    private String aircraft_model;
    // 票价
    @Basic
    private String ticket_price;
    // 购买张数
    @Basic
    private String number_of_purchased_sheets;
    // 总金额
    @Basic
    private String total_amount;
    // 用户账号
    @Basic
    private Integer user_account;
    // 申请时间
    @Basic
    private Timestamp application_time;
    // 补票金额
    @Basic
    private Integer ticket_replacement_amount;
    // 申请原因
    @Basic
    private String reason_for_application;
    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
