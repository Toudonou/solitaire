package org.toudonou.solitaire;

public class Carte {
    private final ValeurCarte valeur;
    private final CouleurCarte couleur;

    public Carte(int valeur, int couleur) {
        this.valeur = ValeurCarte.intToValeurCarte(valeur);
        this.couleur = CouleurCarte.intToCouleurCarte(couleur);
    }

    public Carte(ValeurCarte valeur, CouleurCarte couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public ValeurCarte getValeur() {
        return valeur;
    }

    public CouleurCarte getCouleur() {
        return couleur;
    }

    public String getCouleurCommeChaine() {
        return couleur.toString();
    }

    public String getValeurCommeChaine() {
        return valeur.toString();
    }

    @Override
    public String toString() {
        return this.valeur.toString() + " de " + this.couleur.toString();
    }
}
