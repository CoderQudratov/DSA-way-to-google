public class Main {
    public static boolean is_valid(String s) {
           int balance =0;
            for (int i = 0; i < s.length(); i++) {
              if (s.charAt(i) =='('){
                  balance+=1;
              }else balance-=1;
            }
            if (balance<0) return false;
            return balance==0?true:false;
    }
    public static void main(String[] args) {
        String s ="(()))";
        boolean result =is_valid(s);
        System.out.println(result);
    }
}