package Ex03;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.LongSummaryStatistics;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // 현재 날짜

        LocalDate date = LocalDate.of(2025,04,02);
        System.out.printf("today%s , date%s%n" , today, date);

        int year = today.getYear();
        //int year = today.get(ChronoField.YEAR);
        int month = today.getMonthValue();
        //int month = today.get(ChronoField.MONTH_OF_YEAR);
        int day = today.getDayOfMonth();
        //int day = today.get(ChronoField.DAY_OF_MONTH);
        System.out.printf("year=%d, moth=%d, day=%d%n", year, month,day);
    }
}
