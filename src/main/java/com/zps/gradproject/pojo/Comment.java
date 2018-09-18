package com.zps.gradproject.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Zps
 * @date 2018/9/18 15:50
 **/
@Data
@Entity
@Table(name="Comment")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String user;

    private String userCode;

    private String words;

    private String images;

    private Long commentID;

    private boolean deleted = false;
}
