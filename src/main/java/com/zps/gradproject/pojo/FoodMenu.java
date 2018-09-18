package com.zps.gradproject.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Zps
 * @date 2018/9/18 17:20
 *
 * 食物菜单
 * 食物编号
 **/
@Entity
@Data
@Table(name="foodmenu")
public class FoodMenu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String foodName;

    private String foodeCode;

    private boolean deleted = false;
}
