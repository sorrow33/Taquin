package com.company;

import javax.swing.*;

/**
 * Created by William on 24/10/14.
 */
public class Fenetre extends JFrame{

    public Fenetre() {
        super("Jeu de la Catin");
        setSize(800,600);
        setVisible(true);
        add(new Grille(10,10));

    }

    public static void main (String[] args)
    {
        new Fenetre();

    }


}
