package Ex01;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        /* 수정 불가 리스트 추가 제거 변경 ㄹ*/
        //List<String> items = List.of("사과 ", "오렌지" , "망고");
        List<String> items = Arrays.asList("사과", "오렌지", "망고");

        items.add("망고");


        System.out.println(items);
    }
}
