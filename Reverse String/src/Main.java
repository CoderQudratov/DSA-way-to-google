import java.util.Arrays;

public class Main {
    public static String[] reverseString(String[] s) {
        // write code here
        int i=0;
        int j=s.length-1;
        while(i<j){
            String temp =s[i];

            s[i]=s[j];

            s[j]=temp;

            i++;
            j--;
        }

        return s;
    }
    public static void main(String[] args) {
        String[] arr={"h","e","l","l","o"};
        String[] result=reverseString(arr);
        System.out.println(Arrays.toString(result));
    }
}