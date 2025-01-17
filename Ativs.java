import java.util.ArrayList;
import java.util.List;

public class Ativs {
    static int find(int[] integers) {
        ArrayList<Integer> newArr=new ArrayList<>();
        ArrayList<Integer> count =new ArrayList<>();
        for (int i = 0; i < integers.length; i++) {
          if (integers[i]%2==0){
              newArr.add(integers[i]);
          }else {
              count.add(integers[i]);
          }
        }
        return newArr.size()>count.size()? count.get(0):newArr.get(0);
    }

    public static void main(String[] args) {
        int[] arr ={160, 3, 1719, 19, 11, 13, -21};
       int res =find(arr);
        System.out.println(res);
    }
}
