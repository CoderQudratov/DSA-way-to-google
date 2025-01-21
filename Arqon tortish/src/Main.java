import java.util.Arrays;

public class Main {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] results = new int[n]; // Natija uchun yangi massiv

        for (int i = 0; i < n; i++) {
            int leftSum = 1, rightSum = 1;

            // Hakamdan oldingi jamoa kuchini hisoblash
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Hakamdan keyingi jamoa kuchini hisoblash
            for (int j = i + 1; j < n; j++) {
                rightSum += nums[j];
            }

            // Natijani aniqlash
            if (leftSum > rightSum) {
                results[i] = -1;
            } else if (rightSum > leftSum) {
                results[i] = 1;
            } else {
                results[i] = 0;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // Test massiv
        int[] res = leftRightDifference(arr); // Funksiyani chaqiramiz

        System.out.println(Arrays.toString(res)); // Natijani chiqaramiz
    }
}
