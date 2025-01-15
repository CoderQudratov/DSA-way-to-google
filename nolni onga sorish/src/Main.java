import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int[] moveZeroes(int[] nums) {
        // write code here
        int countIndex =0;
        for (int i =0; i<nums.length;i++){
          if (nums[i]!=0){
              nums[countIndex]=nums[i];
              countIndex++;
          }
        }
        for (int i = countIndex; i < nums.length; i++) {
            nums[i]=0;
        }
        return  nums;

    }

    public static void main(String[] args) {
        int[] arr ={1,2,0,3,0,9};
        int[] result =moveZeroes(arr);
       for (int num:result){
           System.out.println(num);
       }
    }
}