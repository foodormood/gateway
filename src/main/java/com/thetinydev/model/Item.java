package com.thetinydev.model;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class Item implements Serializable {

    private UUID id;

    private String name;

    private String nameEn;

    private String imageUrl;
}
