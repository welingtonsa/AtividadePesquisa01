package com.edu.Iterator;

public class Item implements ItenInterface{
    /* Atributos da classe Item */
    private final String name;
    private final int price;
    private final String description;

    /* Metodo construtor da classe item */
    public Item(String name, int price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    
}
