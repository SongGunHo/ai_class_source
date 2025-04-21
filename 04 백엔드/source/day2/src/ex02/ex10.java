package ex02;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class ex10 {
    public static void main(String[] args) {
        int [][] nums ={
                {10,20,30}, // 0행
                {40,50,60} // 1행

        };
        System.out.println("nums.length:" + nums.length);
        System.out.println("nums[0].length" +nums[0].length); // 0의 갯수
        for(int i=0; i< nums.length;i++){ //0행 1행
            for (int j=0; j< nums.length; j++){
                System.out.printf("nums[%d][%d]:%d%n", i,j, nums[i][j]);
            }
        }
    }
}
