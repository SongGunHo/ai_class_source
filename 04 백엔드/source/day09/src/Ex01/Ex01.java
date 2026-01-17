package Ex01;

import java.util.HashMap;
import java.util.HashSet;

public class Ex01 {
    public static void main(String[] args) {
        HashMap<String , String> member = new HashMap<>();
        member.put("user01", "회원1");
        member.put("user02", "회원2");
        member.put("user03", "회원3");
        member.put("user04", "회원4");
        member.put("user05", "회원5");
        member.put("user3", "(수정)회원3");
        member.remove("user3");
        String user3 = member.get("user3");
        System.out.println(user3);



        // 값이 null  일때 기본값 대체
        user3 = member.getOrDefault("user3", "회원3");
        member.remove(user3);

    }
}
