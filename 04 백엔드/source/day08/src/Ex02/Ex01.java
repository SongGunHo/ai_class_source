package Ex02;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");
//
        for (String item : items){
            if(items.lastIndexOf(-1) > 0){
                items.clear();
                System.out.println(item);
            }else {
               items.remove(items);
            }

        }

            System.out.println(items);
//            for (String item: items){
//                items.remove(item);
//                System.out.println(item); // items.toString ()
//            }

//        for (int i =0;  i<items.size(); i++){
//
//
//            items.remove(i);


//            String name = items.get(i);
//            System.out.println(name);



        for(int i=0; i<items.size()-i; -- i){
            items.remove(items);

        }


//       for (String item : items){
//           items.clear();
//           System.out.println(item);
//       }



    }
































        /*
        for(String item: items){
            System.out.println(item);
        }
        */


}
