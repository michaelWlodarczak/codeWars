package seven_kyu.pairOfGloves;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {

//        String[]gloves = {"red", "green", "red", "blue", "blue"};
          String[]gloves = {"red", "red"};
//        String[]gloves = {"red", "green", "blue"};
//        String[]gloves = {"gray", "black", "purple", "purple", "gray", "black"};
//        String[]gloves = {"red", "green", "blue", "blue", "red", "green", "red", "red", "red"};

        Map<String,Integer> glovesMap = new HashMap();
        for(String x:gloves){
            if(!glovesMap.containsKey(x)){
                glovesMap.put(x,1);
            }else{
                glovesMap.put(x, glovesMap.get(x)+1);
            }
        }
        System.out.println(glovesMap + "\n");

        /*
        Similar effect like above but using Collection.
        List<String> sampleList= Arrays.asList(gloves);
        for(String inpt:gloves){
            int frequency= Collections.frequency(sampleList,inpt);
            System.out.println(inpt+" "+frequency);
        }
         */

//        int sum = glovesMap.values().stream().mapToInt(i->i).sum();
//        System.out.println("sum of values: " +

        int count = 0;
        int pair = 0;
        for (Integer values : glovesMap.values()){
            pair=values/2;
            System.out.println(pair);
            count += pair;
        }
        System.out.println(count);


    }
}

