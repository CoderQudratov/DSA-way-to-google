public class Main {
    public int[] sortedSquares(int[] nums) {
        // write code here
        for (int i = 0; i < nums.length; i++) {
            int sqrt = (int) Math.pow(nums[i],2);
            nums[i]=sqrt;
        }
        return sortedArr(nums);
    }
    public static int[] sortedArr(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < i; j++) {
             if (nums[j-1]>nums[j]){
                 int temp=nums[j-1];
                 nums[j-1]=nums[j];
                 nums[j]=temp;

             }
            }
        }
        return  nums;
    }
    public static void main(String[] args) {
       int[] arr ={-7,-3,2,3,11};
       int[] res =new Main().sortedSquares(arr);
       for (int i:res){
           System.out.println(i);
       }
    }
}