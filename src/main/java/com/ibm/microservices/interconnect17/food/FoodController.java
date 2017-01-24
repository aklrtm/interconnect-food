package com.ibm.microservices.interconnect17.food;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.ibm.microservices.interconnect17.food.model.Food;

@RestController
@EnableConfigurationProperties
@ResponseBody
public class FoodController {

    @Autowired
    private FoodConfiguration config;

    @RequestMapping(method = RequestMethod.GET, path="/food", produces = "application/json")
    public Food getFoodMenu() {
      Food local = new Food();
      local.setMenu(this.config.getMenu());
      local.setType(this.config.getType());
      return local;
    }


}
