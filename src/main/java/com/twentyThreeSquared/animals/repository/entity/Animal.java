package com.twentyThreeSquared.animals.repository.entity;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Animal {

    @Id
    private String id = UUID.randomUUID().toString();

    private String type;
    private int legs;
    private String color;

    public Animal() {}

    public Animal(String type, int legs, String color) {
        this.type = type;
        this.legs = legs;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getLegs() {
        return legs;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("type", type)
                .add("legs", legs)
                .add("color", color)
                .toString();
    }
}
