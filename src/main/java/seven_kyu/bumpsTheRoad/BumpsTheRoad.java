package seven_kyu.bumpsTheRoad;

/*
Your car is old, it breaks easily.
The shock absorbers are gone and you think it can handle about 15 more bumps before it dies totally.

Unfortunately for you, your drive is very bumpy!
Given a string showing either flat road ("_") or bumps ("n"),
work out if you make it home safely. 15 bumps or under,
return "Woohoo!", over 15 bumps return "Car Dead".
 */

public class BumpsTheRoad {
    public static String bumps(final String road) {
        int count = 0;
        for (int i = 0; i < road.toCharArray().length; i++) {
            if (road.toCharArray()[i] == 'n') {
                count++;
            }
        }
        if (count <= 15) {
            return "Woohoo!";
        } else {
            return "Car Dead";
        }
    }

    //OTHER SAMPLE SOLUTIONS:

//    public static String bumps(final String road) {
//        int count=0;
//        for (int i = 0; i < road.length(); i++) {
//            if (road.charAt(i) =='n')
//                count++;
//        }
//        if (count <= 15)
//            return "Woohoo!";
//        else
//            return "Car Dead";
//    }


//    public static String bumps(final String road) {
//        return road.chars().filter(ch -> ch =='n').count()>15? "Car Dead" : "Woohoo!";
//    }

    public static void main(String[] args) {
        String road = "___nnn___";
        int count = 0;
        for (int i = 0; i < road.toCharArray().length; i++) {
            if (road.toCharArray()[i] == 'n') {
                count++;
            }
        }
        System.out.println(count);
        if (count <= 15) {
            System.out.println("Woohoo!");
        } else {
            System.out.println("Car Dead");
        }
    }
}
