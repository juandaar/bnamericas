package com.bnamericas.bnamericas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Data
@Entity(name = "holy_day")
@ToString
public class HolyDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Si tuviera tiempo utilizaria tipo date y crearia una classe DateUtil
    // para parsear la fecha respecto al formato entregado
    // como no tengo tiempo, lo colocaré string :V
    private String date;
    private String title;
    private String extra;
}
