package eight_kyu.tenMinWalk;

public class Demo2 {
    public static void main(String[] args) {

        int vertical = 0;
        int horizontal = 0;
        int time = 0;
//        char[] walk = {'n', 's', 'w', 'e'};
        //        char[] walk = {'n','s','n','s','n','s','n','s','n','s'};
//        char[] walk = {'w','e','w','e','w','e','w','e','w','e','w','e'};
//        char[] walk = {'w'};
        char[] walk = {'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};

        for (int i = 0; i < walk.length; i++) {
            if (walk.equals('n')) {
                vertical = vertical + 1;
            }
            if (walk.equals('s')) {
                vertical = vertical - 1;
            }
            if (walk.equals('w')) {
                horizontal = horizontal - 1;
            }
            if (walk.equals('e')) {
                horizontal = horizontal + 1;
            }
            time++;
        }
        System.out.println("Vertical: " + vertical);
        System.out.println("Horizontal: " + horizontal);
        System.out.println("Time: " + time);
        if (vertical == 0 && horizontal == 0 && time == 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
