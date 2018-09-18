package com.zps.gradproject.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Zps
 * @date 2018/9/4 16:27
 **/
@Data
@Entity
@Table(name="menu")
public class Menu implements Serializable {

    @Id
    private String id;

    private String foodName;

    private String foodPrice;

    private String number;

    private Date date;

    private String foodCode;

    private String shopCode;

    /*
     *  删除标志位
     *  标志该实体是否已删除
     * */
    private boolean deleted = false;
}
