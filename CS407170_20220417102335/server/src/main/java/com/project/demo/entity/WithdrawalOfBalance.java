package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *余额提现：(WithdrawalOfBalance)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "WithdrawalOfBalance")
public class WithdrawalOfBalance implements Serializable {

    //WithdrawalOfBalance编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "withdrawal_of_balance_id")
    private Integer withdrawal_of_balance_id;
    // 账号编号
    @Basic
    private String account_number;
    // 账户余额
    @Basic
    private String account_balance;
    // 提现金额
    @Basic
    private Integer withdrawal_amount;
    // 提现时间
    @Basic
    private Timestamp withdrawal_time;
    // 提现银行卡
    @Basic
    private String withdrawal_bank_card;
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
