package org.toudonou.solitaire;

import java.util.Comparator;

public class ValueCarteComparator implements Comparator<Carte> {
    @Override
    public int compare(Carte c1, Carte c2) {
        return c1.getValeur().compareTo(c2.getValeur());
    }
}
