package com.ibm.microservices.interconnect17.food;

/**
 *  Patterned after https://github.com/aykutakin/SpringConfigurationPropertiesSample
 *  due to issues with YAML-formatted lists
 **/

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Configuration
@ConfigurationProperties(prefix = "interconnect17.food")
public class FoodConfiguration{

  private List<String> menu;

  @Value("${interconnect17.food.type}")
  private String type;

  FoodConfiguration(){
	this.menu = new ArrayList<>();
    this.type = new String();
  }

  public List<String> getMenu(){
    return this.menu;
  }

  public String getType(){
    return this.type;
  }

}
