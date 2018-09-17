package com.zps.gradproject.pojo;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Zps
 * @date 2018/8/29 15:12
 **/
@Entity
@Data
@Table(name="Merchant")
public class Merchant implements Serializable {

    @Id
    @Column(length=20)
    private String id;

    @Column(length=20)
    private String registPersonName; //注册人名称

    @Column(length=30)
    private String shopName; //店铺名称

    @Column(length=25)
    private String address; //店铺地址

    @Column(length=20)
    private String telephone; //联系电话

    @Column(length=30)
    private String email; //邮箱

    private String code;  //店铺代码

    /*
    *  删除标志位
    *  标志该实体是否已删除
    * */
    private boolean deleted = false;

}
