/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.gilles.tp2;


import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author dgilles01
 */
public abstract class Noeud {

    public Vecteur2D force;
    public int id;
    public double px;
    public double py;
    public List<Barre> BarresArrive;
    public List<Barre> BarresDepart;

    /**
     * @return the px
     */
    public double getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(double px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public double getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(double py) {
        this.py = py;
    }

    public Noeud(int id, double px, double py, Vecteur2D force) {
        this.force = force;
        this.id = id;
        this.px = px;
        this.py = py;
        this.BarresArrive = new ArrayList<Barre>();
        this.BarresDepart = new ArrayList<Barre>();
    }

    public Noeud(double px, double py, Vecteur2D force) {
        this.force = force;
        this.id = -1;
        this.px = px;
        this.py = py;
        this.BarresArrive = new ArrayList<Barre>();
        this.BarresDepart = new ArrayList<Barre>();
    }

    public Noeud(double px, double py) {
        this.force = new Vecteur2D(0, 0);
        this.id = -1;
        this.px = px;
        this.py = py;
        this.BarresArrive = new ArrayList<Barre>();
        this.BarresDepart = new ArrayList<Barre>();
    }

    public Noeud(int id, double px, double py) {
        this.force = new Vecteur2D(0, 0);
        this.id = id;
        this.px = px;
        this.py = py;
        this.BarresArrive = new ArrayList<Barre>();
        this.BarresDepart = new ArrayList<Barre>();
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    @Override
    public String toString() {
        return "(" + px + ", py =" + px +")";
    }

    public static int nbrinconnues(Noeud p) {
        String x;
        int n = -1;
        x = p.getClass().getName();

        if (x== "fr.insa.gilles.tp2.NoeudSimple") {
            n = 0;
        }
        if (x=="fr.insa.gilles.tp2.NoeudAppuiSimple") {
            n = 1;
        }
        if (x=="fr.insa.gilles.tp2.NoeudAppuiDouble") {
            n = 2;

        }

        return n;
    }

    public static Noeud entreeNoeud() {

        int x;

        System.out.println("Quelle type de noeud souhaiter vous?");
        x = Lire.i();
        Noeud z;
        NoeudSimple p;
        NoeudAppuiDouble m;
        NoeudAppuiSimple n;

        p = new NoeudSimple(0, 0);
        z = p;
        if (x == 0) {

            p = NoeudSimple.entreeNoeudSimple();
            z = p;
        }
        if (x == 1) {

            n = NoeudAppuiSimple.entreeNoeudAppuiSimple();
            z = n;
        }
        if (x == 2) {

            m = NoeudAppuiDouble.entreeNoeudAppuiDouble();
            z = m;
        }
        if (x == 3) {

            p = NoeudSimple.entreeNoeudSimple2();
            z = p;
        }

        return z;
    }

    public void addBarresArrive(Barre B) {
        this.BarresArrive.add(B);
    }

    public void addBarresDepart(Barre B) {
        this.BarresDepart.add(B);
        
    }
    
    public List<Barre> BarresIncidentes(){
        List<Barre> barresIncidentes = new ArrayList<Barre>();
        barresIncidentes.addAll(this.BarresArrive);
        barresIncidentes.addAll(this.BarresDepart);
        return barresIncidentes;
    }
   
    
}

