package lv.sda.petstore.ui;

import lv.sda.petstore.controllers.Management;

import javax.swing.*;
import java.awt.*;

/*

Loads a screen with buttons that have add animal(choose type of animal)
Must be a place where to input Caretakers name, and add him, after that allowed to add animals
After adding animal animal appears on the screen with it's health level
There need to be buttons to feed and care for animal
Health level decreases over time
 */
public class PetStoreUI implements UIGenerator{

    private final int frameWidth = 1000;

    private Management management;

    public PetStoreUI(Management management) {
        this.management = management;
    }

    public void generate() {

        JFrame frame = new JFrame();
        frame.setBounds(0,0,frameWidth,700);
        frame.setVisible(true);

        Component caretakerpanel1 = generateCaretakerPanel();

        frame.add(caretakerpanel1);


    }

    private Component generateCaretakerPanel(){
        JPanel panel = new JPanel();
        panel.setBounds(0,0,frameWidth,50);
        panel.setVisible(true);

        final JTextField nameField = new JTextField();
        nameField.setBounds(0,0,100,50);
        nameField.setVisible(true);


        int widthOfNameField = 100;
        int gap = 10;

        JButton addNameButton = new JButton("Add");
        addNameButton.setBounds(widthOfNameField+gap,0,50,50);
        addNameButton.setVisible(true);

        addNameButton.addActionListener((i)->{
            management.createCaretaker(nameField.getText());
        });

        JButton editNameButton = new JButton("Add");
        editNameButton.setBounds(widthOfNameField+gap,0,50,50);
        editNameButton.setVisible(true);

        editNameButton.addActionListener((i)->{nameField.setEnabled(!nameField.isEnabled());});




        panel.add(nameField);
        panel.add(addNameButton);
        panel.setLayout(null);
        return panel;

    }
}
