package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci il nome del prodotto: ");
        String nomeProdotto = sc.nextLine();

        System.out.print("Inserisci una descrizione: ");
        String descrizioneProdotto = sc.nextLine();

        System.out.print("Inserisci il prezzo base del prodotto: ");
        double prezzoProdotto = sc.nextDouble();

        Prodotto prodotto1 = new Prodotto(nomeProdotto, descrizioneProdotto, prezzoProdotto);

        System.out.println("Il codice del prodotto è: " + prodotto1.codice);

        prodotto1.prezzoBase();
        prodotto1.prezzoIva();
        prodotto1.nomeEsteso();
    }
}
