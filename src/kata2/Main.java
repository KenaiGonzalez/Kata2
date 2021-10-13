package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
     String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
       
        
        Histogram histo = new Histogram(data);
        Map<String,Integer> histgr = histo.getHistogram();
        for (String key : histgr.keySet()) {
            System.out.println( key +" ==> " + histgr.get(key));
            
        }
    }
    
}
