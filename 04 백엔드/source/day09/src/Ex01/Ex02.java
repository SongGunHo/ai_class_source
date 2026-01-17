package Ex01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex02 {
    public static void main(String[] args) {
        //TreeMap<String , String> member = new TreeMap<>();
        TreeMap<String , String> member = new TreeMap<>();
        member.put("user01", "회원1");
        member.put("user02", "회원2");
        member.put("user03", "회원3");
        member.put("user04", "회원4");
        member.put("user05", "회원5");


//        Set<Map.Entry<String, String>> entries = member.entrySet();
//        for (Map.Entry<String, String> entry : entries){
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.printf("key=%s, value =%s%n", key, value);
//        }
//    }
        for (Map.Entry<String, String>entry: member.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
              System.out.printf("key=%s, value =%s%n", key, value);


        }
    }
}
