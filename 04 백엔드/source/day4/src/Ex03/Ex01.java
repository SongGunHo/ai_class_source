package Ex03;

import java.io.InputStream;
import java.util.Calendar;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal  = new simpleCalculator();
        int result = cal.add(10,20);
        System.out.println(result);


        System.out.println(cal.num); // 겍체의 변수 생성
        cal.commonMethod();

        InputStream in;
    }
}
