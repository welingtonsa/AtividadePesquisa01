import javax.swing.text.AsyncBoxView.ChildState;

import com.edu.Iterator.Client;
import com.edu.Iterator.ClientInterface;
import com.edu.Iterator.Item;
import com.edu.Iterator.Iterator;
import com.edu.Iterator.IteratorInterface;
import com.edu.Proxy.Intermediary;
import com.edu.Proxy.Proxy;
import com.edu.State.ContextChild;
import com.edu.State.StateChild;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*Teste do Padrão Iterator 
        ClientInterface client = new Client();        
        client.addItemToBucket(new Item("Camiseta", 75, "Algodão"));
        client.addItemToBucket(new Item("Camiseta", 75, "Linho"));
        client.addItemToBucket(new Item("Camiseta", 75, "Seda"));
        IteratorInterface Iterator = new Iterator(client.getBucket()); 
        System.out.println(Iterator.iterateItens());*/

        /* Teste da Padrão State 
        StateChild child = new StateChild(1) ;
        child.eat();
        child.play();

        child.setAge(2);
        child.eat();
        child.play();*/

        /* Teste do Padrão Proxy */
        Proxy proxy = new Intermediary();
        proxy.Accesses("www.google.com");
        proxy.Accesses("www.facebook.com");
        
        
    }
}
