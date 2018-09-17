package com.zps.gradproject.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Zps
 **/
@Entity
@Table(name="user")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length=20)
    private String userName;  //用户名

    @Column(length=20)
    private String userPassword;  //用户密码

    @Column(length=20)
    private String personalId;  //身份证

    @Column(length=30)
    private String email; //邮箱

    @Column(length=20)
    private String imgUrl; //头像

    @Column(length=20)
    private String phone;  //联系电话

    @Column(length=10)
    private String favoriteFood; //喜爱的食物

    /*
     *  删除标志位
     *  标志该实体是否已删除
     * */
    private boolean deleted = false;
}
