package com.edu.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client implements ClientInterface {

    private final List<ItenInterface> bucket = new ArrayList<>();

    
    public List<ItenInterface> getBucket() {
      
        return  this.bucket;
    }

   
    public void addItemToBucket(ItenInterface item) {
        this.addItemToBucket(item);
        
    }
    
}
