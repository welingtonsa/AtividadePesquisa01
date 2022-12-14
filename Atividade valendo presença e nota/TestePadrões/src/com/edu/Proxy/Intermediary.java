package com.edu.Proxy;

import java.util.LinkedList;
import java.util.List;

public class Intermediary implements Proxy {
    private List<String>pages = new LinkedList<>();
    private Real subjectReal;

    @Override
    public void Accesses(String webpage) {
        if (!pages.contains(webpage) && pages.size()<10) {
            subjectReal = new Real();
            subjectReal.Accesses(webpage);
            pages.add(webpage);
        } else {
            System.out.println("Pagina "+ webpage + " Acessada com problemas.");
        }
        
    }
    
}
