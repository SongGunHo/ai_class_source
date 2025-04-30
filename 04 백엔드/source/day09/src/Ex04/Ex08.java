package Ex04;

import java.util.function.BiPredicate;

public class Ex08 {
    public static void main(String[] args) {
        // 메개 변수 사용 순서가 변경 되었으므로 예상 불가 매서드 참조 적용x
       // BiPredicate<String , String> cond  = (s1,s2) -> s1.equals(s2);
            BiPredicate<String , String> cond = String :: equals;



    }
}
