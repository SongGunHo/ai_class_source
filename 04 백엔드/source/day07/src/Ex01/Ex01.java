package Ex01;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book("책1",1000,"저자1", "츨판사1");
        Book book1 = new Book("책2",1100,"저자2", "츨판사2");

        System.out.printf("book == book1 주소 =%s book.equals(book1)%d%n", System.identityHashCode(book1));

        System.out.printf("book == book1=%d", System.identityHashCode(book));
        System.out.printf("book == book1=%d", System.identityHashCode(book1));


    }
}
