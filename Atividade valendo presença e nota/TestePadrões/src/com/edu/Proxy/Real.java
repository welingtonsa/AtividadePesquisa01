package com.edu.Proxy;

public class Real implements Proxy{

    @Override
    public void Accesses(String webpage) {
        System.out.println("Pagina acessada "+ webpage + " Sucesso!");
        
    }
    
    
}
