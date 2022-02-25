package com.thetinydev.client;

import com.thetinydev.model.Category;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "category-service")
public interface CategoryClient {

    @RequestMapping(method = RequestMethod.GET, value = "/all", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<Category> findAll();

}
