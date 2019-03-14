package lv.sda.petstore.models;

import java.util.List;

/*
Has name
Age
health level
Allowed food types

 */
public abstract class Animal implements AnimalActions {
    List<FoodTypes> allowedFoodTypes;
}
