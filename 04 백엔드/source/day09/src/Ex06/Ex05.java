package Ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Ex05 {
    public static void main(String[] args) {
       List <String> items = map(List.of("사과", "오렌지", "멜론"), s-> "" + s);

    }
    List<String> newItems = new ArrayList<>();
    static List<String> map(List<String> items, UnaryOperator<String> func){
        for (String item : items) {

            String converted  = func.apply(item);
        }
        return newItems;

    }
}
