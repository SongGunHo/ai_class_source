package Ex04;

import java.util.function.Function;

public class Ex04 {
    public static void main(String[] args) {
        Function<String , String> func1 = x -> x;// 항등 함수
        Function<String , String> func2 = Function.identity();// 항등 함수
        String value = func2.apply("massage");
        System.out.println(value);
    }
}
