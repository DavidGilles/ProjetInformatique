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
public class NoeudAppuiSimple extends NoeudAppui {

    public NoeudAppuiSimple(double px, double py) {
        super(px, py);
    }

    public NoeudAppuiSimple(int i, double d, double d1, Vecteur2D vd) {
        super(i, d, d1, vd);
    }

    public NoeudAppuiSimple(double d, double d1, Vecteur2D vd) {
        super(d, d1, vd);
    }

    @Override
    public String toString() {
        String Ret;
        Ret = "";
        int NbrBA = BarresArrive.size();
        if (NbrBA!=0) {
            Ret = Ret + " Les barres d'arrive sont : ";
            for (int i = 0; i < BarresArrive.size(); i++) {
                Ret = Ret + BarresArrive.get(i).toString();
            }
        }
        int NbrBD=BarresDepart.size();
        if (NbrBD!=0) {
            Ret = Ret + " Les barres de depart sont : ";
            for (int i = 0; i < NbrBD; i++) {
                Ret = Ret + BarresDepart.get(i).toString();
            }
        }

        return "NoeudAppuiSimple{px= " + px + "py = " + py + '}' + " ID= " + id + Ret;

    }

    public static NoeudAppuiSimple entreeNoeudAppuiSimple() {

        int id;
        double px, py, fx, fy;

        
        System.out.println("Donner x");
        px = Lire.d();
        System.out.println("Donner y");
        py = Lire.d();
        System.out.println("Quelle force sont appliqués?");
        System.out.println("Composante en X");
        fx = Lire.d();
        System.out.println("Composante en Y");
        fy = Lire.d();

        NoeudAppuiSimple p = new NoeudAppuiSimple(0, 0);
        p = new NoeudAppuiSimple( px, py, new Vecteur2D(fx, fy));

        return p;
    }

}
