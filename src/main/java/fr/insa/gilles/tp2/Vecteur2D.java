/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.gilles.tp2;

/**
 *
 * @author dgilles01
 */
public class Vecteur2D {
    public double px;
    public double py;

    /**
     * @return the px
     */
    public double VgetPx() {
        return px;
    }

    /**
     * @return the py
     */
    public double VgetPy() {
        return py;
    }

    public Vecteur2D(double px, double py) {
        
        this.px = px;
        this.py = py;
    }

    public Vecteur2D(){
        this(0,0);
    }

    @Override
    public String toString() {
        return "(" + px +", py =" + px + ")";
    }
    
    
}
