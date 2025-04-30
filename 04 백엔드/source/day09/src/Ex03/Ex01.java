package Ex03;

import java.util.Calendar;

public class Ex01 {
    public static void main(String[] args) {
      Calculator cal = (int num1, int num2)->{
          return num1 + num2;

        };
          int result = cal.add(10,20);
        System.out.println(result);
    }
}
