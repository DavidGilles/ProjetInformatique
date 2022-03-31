/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.gilles.tp2;
import java.lang.Math;

/**
 *
 * @author dgilles01
 */
public class Barre {

    public int Id;
    public Noeud Depart;
    public Noeud Arrive;
    public double TractionMax;
    public double CompressionMax;
    public double CoutMetre;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public Noeud getDepart() {
        return Depart;
    }

    public Noeud getArrive() {
        return Arrive;
    }

    public double getTractionMax() {
        return TractionMax;
    }

    public void setTractionMax(double TractionMax) {
        this.TractionMax = TractionMax;
    }

    public double getCompressionMax() {
        return CompressionMax;
    }

    public void setCompressionMax(double CompressionMax) {
        this.CompressionMax = CompressionMax;
    }

    public double getCoutMetre() {
        return CoutMetre;
    }

    public void setCoutMetre(double CoutMetre) {
        this.CoutMetre = CoutMetre;
    }

    public Barre(int Id, Noeud Depart, Noeud Arrive) {
        this.Id = Id;
        this.Depart = Depart;
        this.Arrive = Arrive;
        this.CompressionMax = 0;
        this.TractionMax = 0;
        this.CoutMetre = 1;

    }

    public  Noeud NoeudOppose(Noeud p) {

        if (this.Arrive == p) {
            p = this.Depart;
        } else {
            if (this.Depart == p) {
                p = this.Arrive;
            }
        }
        return p;
    }
    
    public double angle(Noeud n){
        Noeud n2;
        
        double prodsca, normeb,angle;
        n2=this.NoeudOppose(n);
        
        normeb=Math.sqrt(Math.pow((n2.px-n.px),2)+Math.pow((n2.py-n.py),2));
        prodsca=((n2.px)-(n.px));
        angle=(Math.acos(prodsca/normeb)*180)/Math.PI;
        
        return angle;
    }
    
    

    @Override
    public String toString() {
        return "Barre n° "+ Id+"("+ Depart.getId() + " / " + Arrive.getId()+")" ;
    }

}
