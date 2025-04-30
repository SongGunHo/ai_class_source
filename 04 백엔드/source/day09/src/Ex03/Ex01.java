package Ex03;

import java.util.Calendar;

public class Ex01 {
    public static void main(String[] args) {
      //Calculator cal = (int num1, int num2)->{ // int 제거 해도 상관은 없음 왜냐하면 인터 페이스에 정의 되 있기 때문에

        // return num1 + num2;

        };
        Calculator cal = (a, b) ->a +b ;
          int result = cal.add(10,20);


}
