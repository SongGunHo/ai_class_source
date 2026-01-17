package Ex02;

import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {
        //String value = "안녕";
        String value = null;



        Optional<String> opt = Optional.ofNullable(value);
        //String vlaue1 = Optional.ofNullable
        //String value2  = opt.orElse("기본값"); // 값이  null 이면 기본 값으로 대체
        //System.out.println(value2);
//        String value1 = opt.orElseGet(() ->{
//            // 추가 로직
//            return "기본값";
//        });
//        System.out.println(value1);




//        if(opt.isPresent()) {
//            String value2 = opt.get(); //  값이  null 이
//            System.out.println(value2);
//        }
    }
}
