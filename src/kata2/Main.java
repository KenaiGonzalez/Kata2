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
        HashMap<Integer,Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else histogram.put(data[i], 1);
        }
        
        for (Integer integer : histogram.keySet()) {
            System.out.println( integer +" ==> " + histogram.get(integer));
            
        }
    }
    
}
