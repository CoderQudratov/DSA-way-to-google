public class Main {
    public static int[][] generate(int n) {
        // write code here
        int[][] arr =new int[n][];
       for (int i =0;i<n;i++){
           arr[i] =new int[i+1];
           arr[i][0]=1;
           arr[i][i]=1;
           for (int j = 1; j < i; j++) {
               arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
           }
       }
        return arr;

    }
    public static void main(String[] args) {
        System.out.println(generate(2));
    }
}