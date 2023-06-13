package com.mabroor.springboot.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Actor {
    @Id
    @GeneratedValue
    private Integer id;
    private  String name;
    private  String Birthday;
    private  String Height;
    public Actor(String name, String birthday, String height) {
        this.name = name;
        Birthday = birthday;
        Height = height;
    }

    public Actor() {}


    // getters
    public String getName() {
        return name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getHeight() {
        return Height;
    }
    public Integer getId() {
        return id;
    }


    //setters
    public void setId(Integer id) {
            this.id = id;
        }
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public void setHeight(String height) {
        Height = height;
    }
    // ToString
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", Height='" + Height + '\'' +
                '}';
    }
}
