package org.toudonou;

import org.toudonou.solitaire.Deck;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println(deck);
    }
}