package com.zps.gradproject.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Zps
 * @date 2018/9/25 17:10
 **/
@Data
@Entity
@Table(name="gbt")
public class Weather {

    @Id
    private Long id;

    private String name;

    private Long parentId;

    private Long cityCode;

    private Long zipCode;

    private String mergerName;
}
