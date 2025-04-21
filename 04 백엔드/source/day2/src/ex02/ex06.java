package ex02;

public class ex06 {
    public static void main(String[] args) {
        // length 속성
        int [] nums = {10,20,30,40,50,60};
        System.out.printf("nums.length:%d%n", nums.length);
        for (int i=0; i<=nums.length-1; i++){
            System.out.printf("nums[%d]:%d%n",i , nums[i]);
        }
    }
}
