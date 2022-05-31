package seven_kyu.pairOfGloves;

import java.util.HashMap;
import java.util.Map;

/*
Pair of gloves
Winter is coming, you must prepare your ski holidays.
The objective of this kata is to determine the number
of pair of gloves you can constitute from the gloves you have in your drawer.

Given an array describing the color of each glove,
return the number of pairs you can constitute,
assuming that only gloves of the same color can form pairs.

Examples:
input = ["red", "green", "red", "blue", "blue"]
result = 2 (1 red pair + 1 blue pair)

input = ["red", "red", "red", "red", "red", "red"]
result = 3 (3 red pairs)

 */

public class PairOfGloves {
    public static int numberOfPairs(String[] gloves) {
        Map<String,Integer> glovesMap = new HashMap();
        int count = 0;
        int pair = 0;
        for(String x:gloves){
            if(!glovesMap.containsKey(x)){
                glovesMap.put(x,1);
            }else{
                glovesMap.put(x, glovesMap.get(x)+1);
            }
        }
        for (Integer values : glovesMap.values()){
            pair=values/2;
            count += pair;
        }
        return count;
    }
}

/*
OTHER SOLUTION:

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Kata {
  public static int numberOfPairs(String[] gloves) {
    return Stream.of(gloves)
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet()
      .stream()
      .mapToInt(e -> e.getValue().intValue() / 2)
      .sum();
  }
}

====================================
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Stream.of;

interface Kata {
  static int numberOfPairs(String[] gloves) {
    return (int) of(gloves).collect(groupingBy(identity(), counting())).values().stream().mapToLong(n -> n / 2).sum();
  }
}

====================================

import java.util.*;
import java.util.stream.*;

class Kata {
  public static int numberOfPairs(String[] gloves) {

   return (int) Arrays.asList(gloves).stream()
      .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
      .entrySet().stream()
      .mapToLong(pairs -> pairs.getValue() / 2)
      .sum();

}
  }
 */
