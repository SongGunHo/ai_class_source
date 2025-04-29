package Ex02;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex06 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");
        System.out.println(items);


        Iterator<String> itr = items.iterator();


        while (itr.hasNext()){
            String item = itr.next();
            System.out.println(item);
        }
        while (itr.hasNext()){
            String item = itr.next();
            System.out.println(item);
        }


//        for (String itr : items ){
//            String  items= itr.next();
//        }
    }
}
