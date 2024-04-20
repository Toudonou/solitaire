package org.toudonou.solitaire;

public enum ValeurCarte {
    AS(1),
    DEUX(2),
    TROIS(3),
    QUATRE(4),
    CINQ(5),
    SIX(6),
    SEPT(7),
    HUIT(8),
    NEUF(9),
    DIX(10),
    VALET(11),
    DAME(12),
    ROI(13);

    final int valeur;

    private ValeurCarte(int valeur) {
        this.valeur = valeur;
    }

    public static ValeurCarte intToValeurCarte(int valeur) {
        ValeurCarte[] valeurs = ValeurCarte.values();
        if (0 <= valeur - 1 && valeur - 1 < valeurs.length) {
            return valeurs[valeur - 1];
        }
        return null;
    }
}
