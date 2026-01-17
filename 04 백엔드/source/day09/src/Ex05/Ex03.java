package Ex05;

import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;

public class Ex03 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setIsbn(1000);
        //ToIntFunction<Book> func = Book:: getIsbn;
        //IntSupplier<Book> func = book::getIsbn;


    }
}
