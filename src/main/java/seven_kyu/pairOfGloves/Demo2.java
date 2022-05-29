package seven_kyu.pairOfGloves;

public class Demo2 {
    public static void main(String[] args) {
//        String[] gloves = {"green", "green", "red", "blue", "yellow", "green", "blue"};
        String[] gloves = {"gray", "black", "purple", "purple", "gray", "black"};
        int counterArray =0;

        for (int i = 0; i < gloves.length; i++) {
            for (int j = i+1; j < gloves.length; j++) {
                if (gloves[i]==gloves[j]){
                    System.out.println(gloves[i] + " and " + gloves[j] + " are similar");
                    counterArray++;
                }
            }
        }
        System.out.println(counterArray);

        if(counterArray%2==0){
            System.out.println(counterArray / 2);
        }else if(counterArray%2!=0){
            System.out.println((counterArray - 1)/2);
        }else if(counterArray==1) {
            System.out.println(counterArray);
        }
    }
}
