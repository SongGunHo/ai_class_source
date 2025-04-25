package Ex01;

import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {


            int result = num1 / num2;//ArithmeticException
            System.out.println(result);
            String str = null;
            str = str.toUpperCase(); // 소문자 -> 대문자  null porintExcepitoin
            System.out.println(str);
        }catch (ArithmeticException e){
            String message = e.getMessage();
            System.out.println(message);


        }catch (NullPointerException e){

            String message = e.getMessage();
            System.out.println(message);

        }

    }


}
