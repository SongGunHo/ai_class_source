package Ex03;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        String [] fruits = {"사과, 오렌지, 망고, 멜론"};
        Myfunc myfunc = new Myfunc(){
        public String[] apply(String[] items, String ch){
            for(int i=0; i<items.length; i++) {
                items[i] = ch + items[i] + ch;
            }
            return items;
            }
        };

    }
    public static void method(Myfunc myfunc, String[] items, String ch){
        String[] result = myfunc.apply(items, "*");
        System.out.println(Arrays.toString(result));
    }
}
