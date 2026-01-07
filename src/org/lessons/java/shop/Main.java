package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Prima versione esercizio
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
        */

        Prodotto prodotto1 = new Prodotto("Solo nome");
        Prodotto prodotto2 = new Prodotto("Nome", "Descizione", 10);

        System.out.println(prodotto1.getNome());
        prodotto1.setNome("Cambiato nome al prodotto 1");
        System.out.println("Il codice del prodotto è: " + prodotto1.getCodice());
        System.out.println("Il nome del prodotto è: " + prodotto1.getNome());
        System.out.println("La descrizione è: " + prodotto1.getDescrizione());
        System.out.println("Il prezzo base è: " + prodotto1.getPrezzoBase());
        prodotto1.getNomeEsteso();
        prodotto1.getPrezzoIva();
        prodotto1.setDescrizione("La descizione è stata aggiunta");
        prodotto1.setPrezzoBase(15);
        System.out.println("La descrizione aggiornata è: " + prodotto1.getDescrizione());
        System.out.println("Il prezzo base aggiornato è: " + prodotto1.getPrezzoBase());
        prodotto1.getNomeEsteso();
        prodotto1.getPrezzoIva();






        System.out.println(prodotto2.getNome());
        prodotto2.setNome("Diverso");
        System.out.println("Il codice del prodotto è: " + prodotto2.getCodice());
        System.out.println("Il nome del prodotto è: " + prodotto2.getNome());
        System.out.println("La descrizione è: " + prodotto2.getDescrizione());
        System.out.println("Il prezzo base è: " + prodotto2.getPrezzoBase());
        prodotto2.getNomeEsteso();
        prodotto2.getPrezzoIva();
        prodotto2.setDescrizione("La descizione è stata aggiunta");
        prodotto2.setPrezzoBase(15);
        System.out.println("La descrizione aggiornata è: " + prodotto2.getDescrizione());
        System.out.println("Il prezzo base aggiornato è: " + prodotto2.getPrezzoBase());
        prodotto2.getNomeEsteso();
        prodotto2.getPrezzoIva();

    }
}
