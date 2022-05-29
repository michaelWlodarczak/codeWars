package seven_kyu.pairOfGloves;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        String[] gloves = {"green", "green", "red", "blue", "yellow", "green"};

        System.out.println(Arrays.toString(gloves));

        System.out.println("'For i' loop: ");
        for (int i = 0; i < gloves.length; i++) {
            System.out.print(gloves[i] + ", ");
        }

        Set<String> gloveSet = new HashSet<>();
        Set<String> gloveSetDEMO = new HashSet<>();

        gloveSetDEMO.add("green");
        gloveSetDEMO.add("green");
        gloveSetDEMO.add("red");
        gloveSetDEMO.add("blue");
        gloveSetDEMO.add("yellow");
        gloveSetDEMO.add("green");

        System.out.println("\ngloves set as it it: " + gloveSetDEMO);

        for (int i = 0; i < gloves.length; i++) {
            gloveSet.add(gloves[i]);
        }
        System.out.println("gloves set by 'for i' loop: " + gloveSet);

        List<String> glovesList = new ArrayList<>();
        int counterList =0;
        int counterArray =0;
        for (int i = 0; i < gloves.length; i++) {
            glovesList.add(gloves[i]);
        }
        System.out.println("gloves list: " + glovesList);


        for (int i = 0; i < glovesList.size(); i++) {
            for (int j = i+1; j < glovesList.size(); j++) {
                if (glovesList.get(i).equals(glovesList.get(j))){
                    System.out.println(glovesList.get(i) + " and " + glovesList.get(j) + " are similar");
                    counterList++;
                }
            }
        }
        System.out.println(counterList);

        for (int i = 0; i < gloves.length; i++) {
            for (int j = i+1; j < gloves.length; j++) {
                if (gloves[i]==gloves[j]){
                    System.out.println(gloves[i] + " and " + gloves[j] + " are similar");
                    counterArray++;
                }
            }
        }
        System.out.println(counterArray);

    }
}
