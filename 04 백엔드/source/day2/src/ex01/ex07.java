package ex01;

public class ex07 {
    public static void main(String[] args) {
        /**
         * num [0] . num[1], num [2], num [3]
         * nums : 참조 변수 , 배열애서 첫번째 변수의 주소 값
         */
        int[]nums = new int[4]; // 인트 자료형 변수 4개
        System.out.println(nums);// 첫 번째 변수 의 주소 값


        nums[0] = 10;
        System.out.println(nums[0]);
    }
}
