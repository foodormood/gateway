package com.thetinydev.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Item implements Serializable {

    private String id;

    private String name;

}
