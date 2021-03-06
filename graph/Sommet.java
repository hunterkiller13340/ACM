package graph;

import java.util.ArrayList;

/**
 * Created by anthonybertrant on 10/11/2016.
 * Description: Classe de creation et gestion d'un sommet d'un eventuel graph.
 */

public class Sommet {

    private int nomSommet;
    private ArrayList<Arete> listeAretes = new ArrayList();

    /** Creer un sommet de nom nomSommet
     * @param nomSommet
     */
    public Sommet(int nomSommet) {
        this.nomSommet = nomSommet;
    }

    public int getNomSommet() {
        return nomSommet;
    }

    public ArrayList<Arete> getListAretes() {
        return listeAretes;
    }

    public void setArete(Arete arete){
        listeAretes.add(arete);
    }

    public void setNomSommet(int nomSommet) {
        this.nomSommet = nomSommet;
    }

    public void setAretes(ArrayList<Arete> listeAretes) {
        this.listeAretes = listeAretes;
    }

    @Override
    public String toString() {
        return String.valueOf(nomSommet);
    }
}
