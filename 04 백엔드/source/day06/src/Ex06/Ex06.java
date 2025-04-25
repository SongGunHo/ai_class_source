package Ex06;

import java.time.LocalDate;

public class Ex06 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate date = LocalDate.now();
        System.out.println(localDate == date); // 동일성
        System.out.println(localDate.equals(date)); // 동등성
    }
}
