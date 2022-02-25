package com.thetinydev.client;

import com.thetinydev.model.Category;
import com.thetinydev.model.input.CreateCategoryInput;
import com.thetinydev.model.input.UpdateCategoryInput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "category-service")
public interface CategoryClient {

    @RequestMapping(method = RequestMethod.GET, value = "/all", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<Category> findAll();

    @RequestMapping(method = RequestMethod.POST, value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    Category createCategory(@RequestBody CreateCategoryInput input);

    @RequestMapping(method = RequestMethod.POST, value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    Category updateCategory(@RequestBody UpdateCategoryInput input);

}
