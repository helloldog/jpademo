package com;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "AUTH_USER")
@Data
public class UserDO {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(length = 32)
    private String name;
    @Column(length = 32)
    private String account;
    @Column(length = 64)
    private String pwd;

    @Column(length = 64)
    private String ttt3;
}