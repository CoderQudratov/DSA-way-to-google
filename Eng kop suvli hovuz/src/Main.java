public class Main {
    public static int maxArea(int[] nums) {
        // write code here
       int i=0,j=nums.length-1;
       int max_area=0;
       while (i<j){
            int area =(j-i)*Math.min(nums[i],nums[j]);
            max_area=Math.max(area,max_area);
            if (nums[i]<nums[j]){
                i+=1;
            }else {
                j-=1;
            }
       }
       return max_area;
    }
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int res=maxArea(arr);
        System.out.println(res);
    }
}