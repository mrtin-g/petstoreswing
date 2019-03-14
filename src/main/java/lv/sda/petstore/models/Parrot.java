package lv.sda.petstore.models;

/*
Type
Size
 */
public class Parrot extends Animal {

    // Increase health level
    public boolean eat(FoodTypes foodType) {
        if(allowedFoodTypes.contains(foodType)){
            return true;
        }
        return false;
    }

    public boolean makeSound() {
        return false;
    }
}
