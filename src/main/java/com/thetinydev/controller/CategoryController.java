package com.thetinydev.controller;

import com.thetinydev.client.CategoryClient;
import com.thetinydev.client.ItemClient;
import com.thetinydev.model.Category;
import com.thetinydev.model.Item;
import com.thetinydev.model.input.CreateCategoryInput;
import com.thetinydev.model.input.UpdateCategoryInput;
import com.thetinydev.security.ContextHolder;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Controller
public class CategoryController {

    private final CategoryClient categoryClient;
    private final ItemClient itemClient;

    @QueryMapping
    public List<Category> categories() {
        String t = ContextHolder.getCurrentUserId();
        return categoryClient.findAll();
    }

    @QueryMapping
    public Category category(@Argument UUID id) {
        return categoryClient.fetchCategory(id);
    }

    @SchemaMapping
    public List<Item> items(Category category) {
        return itemClient.findAllByCategoryId(category.getId());
    }

    @MutationMapping
    public Category createCategory(@Argument CreateCategoryInput input) {
        return categoryClient.createCategory(input);
    }

    @MutationMapping
    public Category updateCategory(@Argument UpdateCategoryInput input) {
        return categoryClient.updateCategory(input);
    }
}
