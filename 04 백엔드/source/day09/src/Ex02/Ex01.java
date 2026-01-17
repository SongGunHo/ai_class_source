package Ex02;

import java.util.List;
import java.util.function.Consumer;

public class Ex01 {
    public static void main(String[] args) {
        List<String> items = List.of("사과 ", "오렌지" ,"망고 ");
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//
//        items.forEach(consumer);


//        items.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        //items.forEach(Stringx -> System.out.println());
        items.forEach(System.out::println);
   }
}
