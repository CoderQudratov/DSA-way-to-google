import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

public class Main {
    public int[] sortedSquares(int[] nums) {
        // write code here
        int[] result = new int[nums.length];
        int left=0,right=nums.length-1;
        for (int i = nums.length-1; i>=0; i--) {
            if (Math.abs(nums[left])>Math.abs(nums[right])){
                result[i]=nums[left]*nums[left];
                left++;
            }else {
                result[i]=nums[right]* nums[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
       int[] arr ={-7,-3,2,3,11};
       int[] res =new Main().sortedSquares(arr);
       for (int i:res){
           System.out.println(i);
       }
    }
}