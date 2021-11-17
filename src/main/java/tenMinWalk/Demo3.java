package tenMinWalk;

public class Demo3 {
    public static void main(String[] args) {
        char[]walk = {'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};

        if (walk.length==10 && walk.equals('n')==walk.equals('s') && walk.equals('w')==walk.equals('e')){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        //todo - not passing, think why?

//        System.out.println(walk.equals('n'));
//        System.out.println(walk.equals('s'));
//        System.out.println(walk.equals('w'));
//        System.out.println(walk.equals('e'));

        int countN = 0;
        int countS = 0;
        int countW = 0;
        int countE = 0;
        for (int i = 0; i < walk.length; i++) {
            if (walk[i]=='n'){
                countN++;
            }if (walk[i]=='s'){
                countS++;
            }if (walk[i]=='w'){
                countW++;
            }if (walk[i]=='e'){
                countE++;
            }
        }
        System.out.println(countN);
        System.out.println(countS);
        System.out.println(countW);
        System.out.println(countE);
        if (countN==countS && countW==countE && walk.length==10){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

}
