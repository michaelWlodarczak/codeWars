package six_kyu.sumsOfParts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {

        List<List<Integer>> cases =
                Arrays.asList(Arrays.asList(0, 1, 3, 6, 10),
                        Arrays.asList(1, 3, 6, 10),
                        Arrays.asList(3, 6, 10),
                        Arrays.asList(6, 10),
                        Arrays.asList(10),
                        Arrays.asList());

        List<Integer> result = cases.stream()
                .map(list -> list.stream().mapToInt(Integer::intValue).sum())
                .collect(Collectors.toList());

        System.out.println(result); // print [20, 20, 19, 16, 10, 0]
    }
}
