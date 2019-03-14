package lv.sda.petstore.ui;

import lv.sda.petstore.controllers.Management;

/*

Loads a screen with buttons that have add animal(choose type of animal)
Must be a place where to input Caretakers name, and add him, after that allowed to add animals
After adding animal animal appears on the screen with it's health level
There need to be buttons to feed and care for animal
Health level decreases over time
 */
public class PetStoreUI implements UIGenerator{

    private Management management;

    public PetStoreUI(Management management) {
        this.management = management;
    }

    public void generate(Management management) {

    }
}
