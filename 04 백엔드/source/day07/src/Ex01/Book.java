package Ex01;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Objects;

public class Book extends java.lang.Object{
    private int BookId; // 도서명
    private String BookTitle; // 책이름
    private String BookAuthor; // 저자
    private String BookPublisher; // 춢판사
    /**
     *
     * 동등성 비교 동등서은 가치 판단이 중요
     *
     *
     */

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book ){

            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", BookTitle='" + BookTitle + '\'' +
                ", BookAuthor='" + BookAuthor + '\'' +
                ", BookPublisher='" + BookPublisher + '\'' +

                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(BookId,BookTitle, BookAuthor, BookPublisher);
    }

    public Book(String bookTitle, int bookId, String bookAuthor, String bookPublisher) {
        BookTitle = bookTitle;
        BookId = bookId;
        BookAuthor = bookAuthor;
        BookPublisher = bookPublisher;






    }
}
