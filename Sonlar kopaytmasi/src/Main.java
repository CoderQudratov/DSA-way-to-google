//import java.util.Arrays;
//
//public class Main {
//    public static  int[] productExceptSelf(int[] nums) {
//        // write code here
//        int n = nums.length;
//        int[] prefix = new int[n];
//        int[] suffix = new int[n];// Natija uchun yangi massiv
//         int  product =1;
//         for (int i=0;i<nums.length;i++){
//             product*=nums[i];
//             System.out.println(product);
//
//             prefix[i]=product;
//         }
//         nums=reverseArray();
//        for (int i = 0; i <; i++) {
//
//        }
//         return  prefix;
//    }
//    public static void reverseArray() {
//        int start = 0;
//        int end = array.length - 1;
//
//        while (start < end) {
//            // Elementlarni almashtirish
//            int temp = array[start];
//            array[start] = array[end];
//            array[end] = temp;
//
//            start++;
//            end--;
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr ={1,2,3,4};
//        int[] result =productExceptSelf(arr);
//        System.out.println(Arrays.toString(result));
//    }
//}