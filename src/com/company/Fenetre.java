package com.company;

import javax.swing.*;

/**
 * Created by William on 24/10/14.
 */
class Fenetre extends JFrame{

    public Fenetre() {
        JFrame jf = new JFrame("Jeu de la Catin");
        jf.setSize(800,600);
        jf.add(new Grille(4,4));
        jf.setVisible(true);
    }

    public static void main (String[] args)
    {
        new Fenetre();

    }


}
