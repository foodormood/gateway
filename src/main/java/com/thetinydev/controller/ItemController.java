package com.thetinydev.controller;

import com.thetinydev.client.ItemClient;
import com.thetinydev.model.Item;
import com.thetinydev.model.input.CreateItemInput;
import com.thetinydev.model.input.UpdateItemInput;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Controller
public class ItemController {

    private final ItemClient itemClient;

    @QueryMapping
    public List<Item> items() {
        return itemClient.findAll();
    }

    @QueryMapping
    public List<Item> itemByCategory(@Argument UUID categoryId) {
        return itemClient.findAllByCategoryId(categoryId);
    }

    @MutationMapping
    public Item createItem(@Argument CreateItemInput input) {
        return itemClient.createItem(input);
    }

    @MutationMapping
    public Item updateItem(@Argument UpdateItemInput input) {
        return itemClient.updateItem(input);
    }
}
