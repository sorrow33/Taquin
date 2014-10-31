package com.company;

import java.awt.*;

/**
 * Created by William on 24/10/14.
 */
class Case {

    private int ligne;
    private int colonne;
    private int jeton;
    private Color couleur;


    public Case (int x,int y,int valeur,Color col)
    {
        super();
        this.ligne=x;
        this.colonne=y;
        this.jeton=valeur;
        this.couleur=col;
    }

    public int getLigne()
    {
        return ligne;
    }

    public int getColonne()
    {
        return colonne;
    }

    public void setJeton(int jeton) {
        this.jeton = jeton;
    }

    public int getJeton()
    {
        return jeton;
    }
    public Color getCouleur()
    {
        return couleur;
    }

    public void setCouleur(Color couleur)
    {
        this.couleur=couleur;
    }
}
