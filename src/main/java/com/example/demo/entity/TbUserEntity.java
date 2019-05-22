package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Table(name="tbuser")
public class TbUserEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String userName;
    private String password;
}
