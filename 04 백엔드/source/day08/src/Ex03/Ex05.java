package Ex03;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex05 {
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) { // 오른 차순 정렬
                return o2.compareTo(o1);
            }
        };
        //TreeSet<String> items = new TreeSet<>(comp); // 메게 변수
        TreeSet<String> items = new TreeSet<>(Comparator.reverseOrder()); // 메게 변수

        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");

        System.out.println(items);


    }
}

