package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    public Prodotto( String nome, String descrizione, double prezzo) {
        this.codice = codiceRandom();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        iva= prezzo + (prezzo * 22 /100);
        // Correzione: this.iva = iva ( dichiarata come bigDecimal)
    }

    /* Correzione:
     BigDecimal prezzo;
     BigDecimal iva;

     Nel costruttore:
     Va richiesto anche il parametro da inserire
     this.prezzo = prezzo;
     this.iva = iva (oppure 0.22);

    public BigDecimal getPrezzoIvato(){
        if ( prezzo != null && iva != null ){
            // verifica che le variabili di istanza siano state inizializzate
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return  null;
    }
    */


    public int codiceRandom(){
        Random r = new Random();
        return codice = r.nextInt(1100, 2999);
    }

    public void prezzoBase(){
        System.out.println("Il prezzo base dell'articolo " + nome + " è: " + prezzo + "€");
    }

    public void prezzoIva(){
        System.out.println("Il prezzo con Iva all 22% dell'articolo " + nome + " è: " + iva + "€");
    }

    public void nomeEsteso(){
        System.out.println(nome + "-" + codice);
    }
}


