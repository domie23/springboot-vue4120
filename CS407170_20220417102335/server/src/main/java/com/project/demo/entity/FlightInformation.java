package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *航班信息：(FlightInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "FlightInformation")
public class FlightInformation implements Serializable {

    //FlightInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_information_id")
    private Integer flight_information_id;
    // 出发地
    @Basic
    private String place_of_departure;
    // 目的地
    @Basic
    private String destination;
    // 出发时间
    @Basic
    private Timestamp departure_time;
    // 到达时间
    @Basic
    private Timestamp arrival_time;
    // 航班类型
    @Basic
    private String flight_type;
    // 座位类型
    @Basic
    private String seat_type;
    // 客机编号
    @Basic
    private String passenger_plane_number;
    // 客机型号
    @Basic
    private String aircraft_model;
    // 剩余票数
    @Basic
    private Integer remaining_votes;
    // 票价
    @Basic
    private String ticket_price;
    // 封面
    @Basic
    private String cover;
    // 点击数
    @Basic
    private Integer hits;
	// 选座状态
	@Basic
	private String seat;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
