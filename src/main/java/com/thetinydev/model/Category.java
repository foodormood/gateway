package com.thetinydev.model;

import java.io.Serializable;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category implements Serializable {

    private UUID id;

    private String name;

    private String nameEn;

    private int order;


}
