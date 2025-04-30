package Ex06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<String> fruits3 = List.of("사과","사과","사과" ,"오렌지", "망고", "멜론");
        String [] fruits4 = fruits3.stream().skip(Comparator.reverseOrder()).distinct().map(s->"♡"+ s +"♡").toArray(String [] :: new);
        System.out.println(Arrays.toString(fruits4));


    }
}
