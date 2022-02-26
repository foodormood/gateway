package com.thetinydev.model.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateItemInput {

    private UUID id;

    private UUID categoryId;

    private String name;

    private String nameEn;

    private String imageUrl;

}
