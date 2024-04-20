package org.toudonou.solitaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private final Random random;
    private List<Carte> deck;
    private int cartesUtilisees;

    public Deck() {
        this.deck = new ArrayList<Carte>();
        this.cartesUtilisees = 0;
        this.random = new Random();

        ValeurCarte[] valeurs = ValeurCarte.values();
        CouleurCarte[] couleurs = CouleurCarte.values();

        for (CouleurCarte couleur : couleurs) {
            for (ValeurCarte valeur : valeurs) {
                deck.add(new Carte(valeur, couleur));
            }
        }

    }

    public void shuffle() {
        int size = deck.size();
        for (int i = 0; i < size; i++) {
            Carte temp = deck.get(i);
            int randomIndex = random.nextInt(deck.size());
            deck.set(i, deck.get(randomIndex));
            deck.set(randomIndex, temp);
        }
    }

    public Carte distribuerCarte() {
        if (!deck.isEmpty()) {
            cartesUtilisees++;
            return deck.removeFirst();
        }
        return null;
    }

    public int cartesRestantes() {
        return deck.size() - cartesUtilisees;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Liste des cartes dans le deck\n");
        for (Carte carte : deck) {
            if (carte != null) {
                s.append(carte.toString()).append("\n");
            }
        }
        return s.toString();
    }
}
