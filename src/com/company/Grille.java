package com.company;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by William on 24/10/14.
 */
public class Grille extends Canvas {
    private ArrayList<Case> cases = new ArrayList<Case>();
    private int numColonnes =0;
    private int numLignes = 0;
    private int posx =10;
    private int posy =10;
    private int tailleCase =50;

    public Grille(int numColonnes, int numLignes)
    {
        super();
        this.numColonnes=numColonnes;
        this.numLignes=numLignes;
        //Création des cases
        for(int i=0;i<numColonnes;i++)
        {
            for (int j=0;j<numLignes;j++)
                cases.add(new Case(i,j));

        }

    }

    @Override
    public void paint (Graphics g){
        for (Case c : cases)
            g.drawRect(c.getX()*tailleCase+posx,c.getY()*tailleCase+posy,tailleCase,tailleCase);

    }

}
