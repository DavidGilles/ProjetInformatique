/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.gilles.tp2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33771
 */
public class Treillis {

    public List<Noeud> NoeudTreillis;
    public List<Barre> BarreTreillis;

    public Treillis(List<Noeud> NoeudTreillis, List<Barre> BarreTreillis) {
        this.NoeudTreillis = NoeudTreillis;
        this.BarreTreillis = BarreTreillis;
    }

    public Treillis() {
        this.NoeudTreillis = new ArrayList<>();
        this.BarreTreillis = new ArrayList<>();

    }

    @Override
    public String toString() {
        
        return "Treillis{" + "NoeudTreillis=" + NoeudTreillis + ", BarreTreillis=" + BarreTreillis + '}';
    }
    
    public void AfficheTreillis(){
        System.out.println("Le Treillis est composé de ");
        System.out.println(this.NoeudTreillis.size() + " Noeuds :");
        for (int i = 0; i<NoeudTreillis.size();i++){
            System.out.println(this.NoeudTreillis.get(i).toString());
        }
        System.out.println();
        System.out.println(this.BarreTreillis.size() + " Barres :");
        for (int i = 0; i<BarreTreillis.size();i++){
            System.out.println(this.BarreTreillis.get(i).toString());
        }
    }

    public List<Noeud> getNoeudTreillis() {
        return NoeudTreillis;
    }

    public void setNoeudTreillis(List<Noeud> NoeudTreillis) {
        this.NoeudTreillis = NoeudTreillis;
    }

    public List<Barre> getBarreTreillis() {
        return BarreTreillis;
    }

    public void setBarreTreillis(List<Barre> BarreTreillis) {
        this.BarreTreillis = BarreTreillis;
    }

    public int maxIdNoeud() {
        int m;
        m = -1;
        for (int i = 0; i < this.NoeudTreillis.size(); i++) {
            m = Math.max(this.NoeudTreillis.get(i).getId(), m);
        }
        return m;
    }

    public int maxIdBarre() {
        int m;
        m = -1;
        for (int i = 0; i < this.BarreTreillis.size(); i++) {
            m = Math.max(this.BarreTreillis.get(i).getId(), m);
        }
        return m;
    }

    public void ajouteNoeud(Noeud n) {
        if (!this.NoeudTreillis.contains(n)) {
            n.setId(this.maxIdNoeud() + 1);
            this.NoeudTreillis.add(n);
        }
    }

    public void ajouteBarre(Barre b) {
        if (!this.BarreTreillis.contains(b)) {
            this.ajouteNoeud(b.Depart);
            this.ajouteNoeud(b.Arrive);
            b.setId(this.maxIdBarre() + 1);
            this.BarreTreillis.add(b);
            b.Arrive.addBarresArrive(b);
            b.Depart.addBarresDepart(b);
        }
    }
    
    
    public int RangduNoeud (int id){
        int i;
        i=0;
        while ((id!=this.NoeudTreillis.get(i).getId())&&(id<=this.maxIdNoeud())){
            i=i+1;
            
        }
        if (i>this.maxIdNoeud()){
            i=0;
        }
        return i;
        
    }
    public void DecalageBarreId(int NumBarre){
        int id;
        id=NumBarre;
        for(int i = id; i<this.maxIdBarre();i++){
            this.BarreTreillis.get(i).setId(i);
        }
        
    }
    
    public void DecalageNoeudId(int NumNoeud){
        int id;
        id=NumNoeud;
        for(int i = id; i<this.maxIdNoeud();i++){
            this.NoeudTreillis.get(i).setId(i);
        }
        
    }
    
}
