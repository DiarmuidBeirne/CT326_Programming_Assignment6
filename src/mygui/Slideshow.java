package mygui;

/*
Assignmnet6
Author: 15331436 | Diarmuid Beirne

18 Oct 2017
*/

import java.awt.*;
import javax.swing.*;

public class Slideshow extends JFrame{

    private JComboBox imagesComboBox;
    private JButton animalBackgroundButton, flowerBackgroundButton, foodBackgroundButton;

    private String names[] = {"Animals", "Flowers", "Food"};

    public Slideshow()
    {
        super("Slide Shows");
        Container container = getContentPane();
        container.setLayout( new FlowLayout());

        imagesComboBox = new JComboBox( names );
        imagesComboBox.setMaximumRowCount(3);

        animalBackgroundButton = new JButton( " Animal background color");
        flowerBackgroundButton = new JButton( " Flower background color");
        foodBackgroundButton = new JButton( " Food background color");

        //imagesComboBox.addItemListener(
        //       new ItemLister)


        container.add(imagesComboBox);
        container.add(animalBackgroundButton);
        container.add(flowerBackgroundButton);
        container.add(foodBackgroundButton);
        setSize(350, 500);
        setVisible( true);


    }

    public static void main (String args[] ){

        Slideshow app = new Slideshow();
        app.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }


}

