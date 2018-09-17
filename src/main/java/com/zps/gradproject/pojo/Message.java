package com.zps.gradproject.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Zps
 **/
@Entity
@Table(name="message")
@Data
public class Message implements Serializable {

    @Id
    private String id;

    private User user;

    private String message;
}
