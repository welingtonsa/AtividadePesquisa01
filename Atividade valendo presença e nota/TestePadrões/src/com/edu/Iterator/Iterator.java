package com.edu.Iterator;

import java.util.List;

public class Iterator implements IteratorInterface {
    /* Atributos da classe Iteratos */
    private final List<ItenInterface> bucket;

    /* Metodo construtor da Classe Iterator */
    public Iterator (List<ItenInterface> bucket){
        this.bucket = bucket;
    }

    @Override
    public String iterateItens() {
        StringBuilder output = new StringBuilder();
        for (ItenInterface item : bucket) {
            output.append(String.format("%s %s %s \n",
                             item.getName(), item.getPrice(), item.getDescription()));
        }
        return output.toString();
    }
    
}
