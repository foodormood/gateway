package com.thetinydev.controller;

import com.thetinydev.client.CategoryClient;
import com.thetinydev.model.Category;
import com.thetinydev.model.input.CreateCategoryInput;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class CategoryController {

    private final CategoryClient categoryClient;

    @QueryMapping
    public List<Category> categories() {
        return categoryClient.findAll();
    }

    @MutationMapping
    public Category createCategory(@Argument CreateCategoryInput input) {
        return categoryClient.createCategory(input);
    }

}
