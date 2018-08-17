package com.company;

class Product2 {
    private String naam;
    private int prijs;
    public Product2 (String naam, int prijs){
        if (naam.length() < 2 ) throw new IllegalArgumentException("Naam moet minstens 2 karakters lang zijn");
        if (prijs < 0) throw new IllegalArgumentException("De prijs mag niet negatief zijn");

    }

    public String getNaam() {
        return this.naam;
    }

    public int getPrijs() {
        return this.prijs;
    }
}
