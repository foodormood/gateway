package com.thetinydev.client;

import com.thetinydev.model.Item;
import com.thetinydev.model.input.CreateItemInput;
import com.thetinydev.model.input.UpdateItemInput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "item-service")
public interface ItemClient {

    @RequestMapping(method = RequestMethod.GET, value = "/all", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<Item> findAll();

    @RequestMapping(method = RequestMethod.GET, value = "/by-category/{categoryId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<Item> findAllByCategoryId(@PathVariable UUID categoryId);

    @RequestMapping(method = RequestMethod.POST, value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    Item createItem(@RequestBody CreateItemInput input);

    @RequestMapping(method = RequestMethod.POST, value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    Item updateItem(@RequestBody UpdateItemInput input);

}
