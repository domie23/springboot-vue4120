package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *客机管理：(PassengerPlaneManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PassengerPlaneManagement")
public class PassengerPlaneManagement implements Serializable {

    //PassengerPlaneManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_plane_management_id")
    private Integer passenger_plane_management_id;
    // 客机编号
    @Basic
    private String passenger_plane_number;
    // 客机型号
    @Basic
    private String aircraft_model;
    // 服役时间
    @Basic
    private String service_time;
    // 状态
    @Basic
    private String state;
    // 客机图片
    @Basic
    private String passenger_plane_picture;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
