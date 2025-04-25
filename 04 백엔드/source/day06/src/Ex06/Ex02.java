package Ex06;

public class Ex02 {
    public static void main(String[] args) {
        Book book = new Book(1000,"책이름", "저자1", "출판사1");
       int hashcode= book.hashCode();
        System.out.printf("hashcode =%d, System.identityHashCode=%d%n", hashcode, System.identityHashCode(book));


    }
}
