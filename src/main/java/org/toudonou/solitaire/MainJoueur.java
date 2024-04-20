package org.toudonou.solitaire;

import java.util.Arrays;

public class MainJoueur {
    private final Carte[] mainJ;
    private final int NBR_CARTES = 6;
    private int nbCartes;

    public MainJoueur() {
        mainJ = new Carte[NBR_CARTES];
        nbCartes = 0;
    }

    public void ajouterCarte(Carte c) {
        if (nbCartes < NBR_CARTES) {
            mainJ[nbCartes] = c;
            nbCartes++;
        }
    }

    public void clear() {
        for (int i = 0; i < nbCartes; i++) {
            mainJ[i] = null;
        }
        nbCartes = 0;
    }

    public void enleverCarte(int index) {
        if (index >= 0 && index < nbCartes) {
            for (int i = index; i < nbCartes - 1; i++) {
                mainJ[i] = mainJ[i + 1];
            }
            mainJ[nbCartes - 1] = null;
            nbCartes--;
        }
    }

    public Carte getCarte(int index) {
        if (index >= 0 && index < nbCartes) {
            return mainJ[index];
        }
        return null;
    }

    public void trieParValeur() {
        Arrays.sort(mainJ, new ValueCarteComparator());
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Il y a ").append(nbCartes).append(" cartes dans la main du joueur").append('\n');

        for (int i = 0; i < nbCartes; i++) {
            if (mainJ[i] != null) {
                s.append(mainJ[i].toString()).append("\n");
            }
        }
        return s.toString();
    }
}
