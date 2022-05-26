package seven_kyu.hiddenCubicNumbers;

public class Demo2_isCubic {
    public static void main(String[] args) {
        int m = 124;

        System.out.println(isCubic(m));
    }


    public static boolean isCubic(int m) {
        String[] sNums = Integer.toString(m).split("");
        if (sNums.length == 1) {
            int x = Integer.parseInt(sNums[0]);
            return (m == (int) ((int) Math.pow(x, 3)));
        } else if (sNums.length == 2) {
            int x = Integer.parseInt(sNums[0]);
            int y = Integer.parseInt(sNums[1]);
            return (m == (int) ((int) Math.pow(x, 3) + Math.pow(y, 3)));
        } else if (sNums.length == 3) {
            int x = Integer.parseInt(sNums[0]);
            int y = Integer.parseInt(sNums[1]);
            int z = Integer.parseInt(sNums[2]);
            return (m == (int) ((int) Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3)));
        }
        return false;
    }
}
