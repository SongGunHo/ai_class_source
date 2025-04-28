package Ex01;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {
    public static void main(String[] args) {
        Set<Book> item = new HashSet<>();
        item.add(new Book("책1", 1000, "저자1", "출판사1"));
        item.add(new Book("책2", 1001, "저자2", "출판사2"));
        item.add(new Book("책2", 1001, "저자2", "출판사2"));
        item.add(new Book("책2", 1001, "저자2", "출판사2"));
        item.add(new Book("책3", 1002, "저자3", "출판사3"));
        item.add(new Book("책4", 1003, "저자4", "출판사4"));
        item.add(new Book("책5", 1004, "저자5", "출판사5"));
         for (Book iems : item){
             System.out.println(item);
         }

    }
}
