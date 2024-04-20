package org.toudonou.solitaire;

public enum CouleurCarte {
    PIQUE(0),
    COEUR(1),
    CARREAUX(2),
    TREFLES(3);

    private final int valeur;

    private CouleurCarte(int valeur) {
        this.valeur = valeur;
    }

    public static CouleurCarte intToCouleurCarte(int valeur) {
        CouleurCarte[] couleurs = CouleurCarte.values();
        if (0 <= valeur && valeur < couleurs.length) {
            return couleurs[valeur];
        }
        return null;
    }
}
