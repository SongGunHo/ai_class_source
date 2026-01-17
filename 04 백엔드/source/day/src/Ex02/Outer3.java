package Ex02;

public class Outer3 {
    public void method(){
        class inner {
            public int add (int num1 , int num2, int num3){
                return num1 +num2 + num3;
            }

        }
        inner in = new inner();
        int result = in.add(10,20,30);
        System.out.println(result);
    }
}
