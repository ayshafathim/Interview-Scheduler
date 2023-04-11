package com.UST.Interview_Scheduler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private int Id;
    private String name;
    private String phno;
    private String email;
    private String skill;
    private String exprnc;
    private String date;
    private String time;
    private String link;
    private String poc;

}
