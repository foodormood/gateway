package com.thetinydev.model.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCategoryInput {

    private String name;

    private String nameEn;

    private int order;

}
