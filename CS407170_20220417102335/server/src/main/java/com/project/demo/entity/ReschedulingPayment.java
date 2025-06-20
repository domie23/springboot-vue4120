package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *改签付款：(ReschedulingPayment)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ReschedulingPayment")
public class ReschedulingPayment implements Serializable {

    //ReschedulingPayment编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rescheduling_payment_id")
    private Integer rescheduling_payment_id;
    // 用户账号
    @Basic
    private Integer user_account;
    // 改签出发地
    @Basic
    private String change_of_departure;
    // 改签目的地
    @Basic
    private String change_destination;
    // 起飞时间
    @Basic
    private Timestamp departure_time;
    // 落地时间
    @Basic
    private Timestamp landing_time;
    // 改签航班类型
    @Basic
    private String change_flight_type;
    // 改签座位类型
    @Basic
    private String change_seat_type;
    // 改签客机编号
    @Basic
    private String change_the_passenger_plane_number;
    // 改签客机型号
    @Basic
    private String change_the_aircraft_model;
    // 改签票价
    @Basic
    private Integer ticket_price_change;
    // 改签购买张数
    @Basic
    private Integer number_of_changed_purchase_sheets;
    // 改签总计
    @Basic
    private String total_re_signing;
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
