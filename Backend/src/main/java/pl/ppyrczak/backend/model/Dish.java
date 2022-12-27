package pl.ppyrczak.backend.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import pl.ppyrczak.backend.util.Cuisine;
import pl.ppyrczak.backend.util.Meal;

import java.math.BigDecimal;
import java.util.List;

@Data
@Document
public class Dish {
  @Id
  private String id;
  private String imageUrl;
  private String name;
  private Cuisine cuisine;
  private Meal meal;
  private List<String> ingredients;
  private int limit;
  private BigDecimal price;
  private String description;

  public Dish(String imageUrl,
              String name,
              Cuisine cuisine,
              Meal meal,
              List<String> ingredients,
              int limit,
              BigDecimal price,
              String description) {
    this.imageUrl = imageUrl;
    this.name = name;
    this.cuisine = cuisine;
    this.meal = meal;
    this.ingredients = ingredients;
    this.limit = limit;
    this.price = price;
    this.description = description;
  }
}


