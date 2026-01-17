package Ex03;

public class Ex06 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        * 클래스 -> 메모리 ( 코드 & 상수 ) 로드., 반환값 Class 클래스 객체

         */




       Class cls = Class.forName("Ex01.Book");
        System.out.println(cls);
    }
}

