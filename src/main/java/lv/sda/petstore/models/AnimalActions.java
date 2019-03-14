package lv.sda.petstore.models;

/*
* Eat checks if animal can eat a certain food.
*
*
* */
public interface AnimalActions {
    public boolean eat(FoodTypes foodType);
    public boolean makeSound();

}
