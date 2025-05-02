package Ex02;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;

public class Ex04 {
    public static void main(String[] args) {
        List<Book> items = List.of(
                new Book(1000, "책1", "저자1"),
                new Book(1002, "책2", "저자2"),
                new Book(1003, "책3", "저자2"),
                new Book(1004, "책4", "저자3"),
                new Book(1005, "책5", "저자3")

        );
        //Map<Boolean, List<Book>> items1 = items.stream().collect(Collections.partitioningBy(b-> b.getIsbn() <= 1002));


        ArrayList<String> items4  = items.stream().map(Book::getTitle).collect(toCollection(ArrayList::new));
        items4.forEach(System.out::println);



        //
        String books = items.stream().map(Book::getTitle).collect(joining(","));
        System.out.println(books);





    }
}
