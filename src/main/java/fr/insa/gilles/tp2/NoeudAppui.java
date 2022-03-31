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
public abstract class NoeudAppui extends Noeud {

    public NoeudAppui(double px, double py) {
        super(px, py);
    }

    public NoeudAppui(int id, double px, double py) {
        super(id, px, py);
    }

    public NoeudAppui(int id, double px, double py, Vecteur2D force) {
        super(id, px, py, force);
    }

    public NoeudAppui(double px, double py, Vecteur2D force) {
        super(px, py, force);
    }

    @Override
    public String toString() {
        return "NoeudAppui{px= "+ px +"py = " + py +'}'+"Force("+force + " ID= "+ id;
    }

    
    
    
    
}
