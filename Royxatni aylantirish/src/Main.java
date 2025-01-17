public class Main {
    public static void main(String[] args) {
        // Dastlabki massiv
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // Massivni teskari tartibda aylantirish
        rotate(nums, k);

        // Natijani chiqarish
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void  rotate(int[] nums,int k){
       int n= nums.length; //arrayni uzunligini olish
       k=k%n; //haqiqiy sonligini teskhirish
       reverce(nums,0,n-1); //arrayni birmarta aylantirish
       reverce(nums,0,k-1); // arrayni berilgan kgacha aylantirish
       reverce(nums,k,n-1); // kdan boshlab ngacha aylantirish

    }
    public static void reverce(int[] nums,int start,int end){
        while (start<end){
            int temp=nums[start];

            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
