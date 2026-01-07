package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    public Prodotto(String nome, String descrizione, double prezzo) {
        this.codice = codiceRandom();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        iva = prezzo + (prezzo * 22 / 100);
        // Correzione: this.iva = iva ( dichiarata come bigDecimal)
    }

    public Prodotto(String nome) {
        this.codice = codiceRandom();
        this.nome = nome;
        this.descrizione = "L'articolo non ha descrizione";
        this.prezzo = 0;
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

    private int codiceRandom() {
        Random r = new Random();
        return codice = r.nextInt(1100, 2999);
    }

    public int getCodice() {
        return this.codice;
    }

//    public void prezzoBase(){
//        System.out.println("Il prezzo base dell'articolo " + nome + " è: " + prezzo + "€");
//    }

//    public void prezzoIva(){
//        System.out.println("Il prezzo con Iva all 22% dell'articolo " + nome + " è: " + iva + "€");
//    }
//
//    public void nomeEsteso(){
//        System.out.println(nome + "-" + codice);
//    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty() || nome.equals(" ")) {
            System.out.println("Il nome inserito non è valido");
        } else {
            this.nome = nome;
        }
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        if (descrizione.isEmpty() || descrizione.equals(" ")) {
            System.out.println("La descrizione è vuota");
        } else {
            this.descrizione = descrizione;
        }
    }

    public double getPrezzoBase() {
        System.out.println("Il prezzo base dell'articolo " + nome + " è: " + prezzo + "€");
        return this.prezzo;
    }

    public void setPrezzoBase(double prezzo) {
        if (prezzo > 0) {
            this.prezzo = prezzo;
        } else {
            System.out.println("Il prezzo deve essere superiore a 0€");
        }
    }

    public void getPrezzoIva() {
        if (this.prezzo == 0){
            System.out.println("L'iva non può essere calcolata");
        } else  {
            System.out.println("Il prezzo con Iva al 22% dell'articolo " + nome + " è: " + iva + "€");
        }
    }

    public void getNomeEsteso() {
        System.out.println(nome + "-" + codice);
    }
}


