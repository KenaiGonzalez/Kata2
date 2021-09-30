package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
     int[] data = new int[15];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
            
        }
        for (int i = 0; i < 15; i=i+2) {
            data[i]++;
            
        }
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histgr = histo.getHistogram();
        for (Integer integer : histgr.keySet()) {
            System.out.println( integer +" ==> " + histgr.get(integer));
            
        }
    }
    
}
