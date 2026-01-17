package Ex02;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex05 {
    public static void main(String[] args) {
        List<Book> items = List.of(
                new Book(1000, "책1", "저자1"),
                new Book(1002, "책2", "저자2"),
                new Book(1003, "책3", "저자2"),
                new Book(1004, "책4", "저자3"),
                new Book(1005, "책5", "저자3")

        );
        Map<String , List<Book>> items1 = items.stream().collect(Collectors.groupingBy(Book::getAuthor));


    }
}
