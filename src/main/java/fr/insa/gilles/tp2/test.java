package fr.insa.gilles.tp2;

/**
 *
 * @author dgilles01
 */
public class test {
    
    public static void main(String[] args) {
       
        //Treillis T=new Treillis();
        //ClassMenuTextuel.MenuText(T);
        
       Noeud p,m,noeudop;
       double angle;
        p=Noeud.entreeNoeud();
        m=Noeud.entreeNoeud();
        Barre B, B2;
        B= new Barre(1, p, m);
        B2=new Barre(2,m,p);
        p.addBarresDepart(B);
        p.addBarresDepart(B2);
        m.addBarresArrive(B);
        angle=B.angle(p);
        System.out.println(angle);
        System.out.println(B);
        System.out.println("");
        System.out.println(p);
        System.out.println(m);
        System.out.println();
        System.out.println(p.BarresIncidentes().size());
        for(int i=0; i<p.BarresIncidentes().size();i++){
            System.out.println(p.BarresIncidentes().get(i));
        }
        
        
       
    }
    
}
