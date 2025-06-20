package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *余额充值：(BalanceRecharge)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "BalanceRecharge")
public class BalanceRecharge implements Serializable {

    //BalanceRecharge编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "balance_recharge_id")
    private Integer balance_recharge_id;
    // 账号编号
    @Basic
    private String account_number;
    // 充值金额
    @Basic
    private Integer recharge_amount;
    // 用户账号
    @Basic
    private Integer user_account;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
