/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.gilles.tp2;

/**
 *
 * @author 33771
 */
public class ClassMenuTextuel {

    public static void Menu() {
        System.out.println("Menu Textuel :");
        System.out.println("");
        System.out.println("0:Quitter");
        System.out.println("1:Afficher le Treillis");
        System.out.println("2:Ajouter un Noeud");
        System.out.println("3:Créer une barre a partir de noeud existant");
        System.out.println("4:Supprimer une barre");
        System.out.println("5:Supprimer Noeud");
    }

    public static void MenuText(Treillis T) {
        int index = -1;

        while (index != 0) {
            Menu();
            index = -1;
            while ((index < 0) || (index > 5)) {
                System.out.println("Que voulez vous faire?");
                index = Lire.i();
            }

            if (index == 1) {
                T.AfficheTreillis();
            }
            if (index == 2) {
                T.ajouteNoeud(Noeud.entreeNoeud());
            }
            if (index == 3) {
                int id1, id2, RangNoeud1, RangNoeud2;
                System.out.println("Donner les Id des Noeuds");
                id1 = -1;
                id2 = -1;
                while ((id1 > T.maxIdNoeud()) || (id1 < 0)) {
                    System.out.print("Id Noeud 1 = ");
                    id1 = Lire.i();

                }
                while ((id2 > T.maxIdNoeud()) || (id2 < 0)) {
                    System.out.print("Id Noeud 2 = ");
                    id2 = Lire.i();
                }
                RangNoeud1 = T.RangduNoeud(id1);
                RangNoeud2 = T.RangduNoeud(id2);

                T.ajouteBarre(new Barre(-1, T.NoeudTreillis.get(RangNoeud1), T.NoeudTreillis.get(RangNoeud2)));
            }
            if (index == 4) {
                T.BarreTreillis.toString();

                int NumBarre;
                NumBarre = -2;
                while ((NumBarre < -1) || (NumBarre > T.maxIdBarre())) {
                    System.out.println("Donner l'Id de la barre que vous voulez supprimmer (-& pour changer d'avis)");
                    NumBarre = Lire.i();
                }
                if (NumBarre != -1) {
                    T.BarreTreillis.get(NumBarre).Arrive.BarresArrive.remove(T.BarreTreillis.get(NumBarre));
                    T.BarreTreillis.get(NumBarre).Depart.BarresDepart.remove(T.BarreTreillis.get(NumBarre));
                    T.BarreTreillis.remove(NumBarre);
                    T.DecalageBarreId(NumBarre);
                }else{
                    System.out.println("Vous avez changé d'avis; aucune barre a été retiré");
                }
            }
            if (index == 5) {

                T.NoeudTreillis.toString();

                int NumNoeud;
                NumNoeud = -2;
                while ((NumNoeud < -1) || (NumNoeud > T.maxIdNoeud())) {
                    System.out.println("Donner l'Id du noeud que vous voulez supprimmer (-1pour changer d'avis)");
                    NumNoeud = Lire.i();
                }
                
                if (NumNoeud != -1) {
                    System.out.println(T.NoeudTreillis.get(NumNoeud).BarresIncidentes().size());
                    int NbrBarre = T.NoeudTreillis.get(NumNoeud).BarresIncidentes().size();
                    if (NbrBarre==0) {
                        T.NoeudTreillis.remove(NumNoeud);
                        T.DecalageNoeudId(NumNoeud);
                    } else {
                        System.out.println("Le noeud est attaché aux barre" + T.NoeudTreillis.get(NumNoeud).BarresIncidentes() + "  Le Noeud n'as pas été retiré");
                    }
                }else{
                    System.out.println("Vous avez changé d'avis, rien n'as été changé.");
                }

            }
        }
    }
}
