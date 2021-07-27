package com.example.aop.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Homosepien")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Homosepien {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private long birthTime;
    public Homosepien(String name) {
        this.name = name;
    }
}
