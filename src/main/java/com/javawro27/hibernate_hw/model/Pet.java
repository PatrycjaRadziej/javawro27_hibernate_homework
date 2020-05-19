package com.javawro27.hibernate_hw.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table()
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private String ownerName;
    private double weight;
    private boolean pureRace;

    @Enumerated(value = EnumType.STRING)
    private Race race;


}
