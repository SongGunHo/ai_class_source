package Ex04;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ex01 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> cal = (a, b )-> a+ b;
        int result = cal.apply(10,20);
        System.out.println(result);
    }
}
