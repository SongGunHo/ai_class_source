package Ex01;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        int [] [] nums = {{1,2,3}, {4,5,6}};
        int [][] nums1 ={{ 1,2,3},{4,5,6,}};

        boolean isSame = Arrays.deepEquals(nums, nums1);
        System.out.println(isSame);
    }
}
