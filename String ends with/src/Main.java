public class Main {
    public static boolean solution(String str, String ending) {
      int startStr = str.length()-1;
      int endStr =ending.length()-1;
      int res =startStr-endStr;
        for (int i = res; i <str.length(); i++) {
//            if (str.charAt(i) ==ending.charAt(i))
            for (int j = 0; j < res-1; j++) {
                System.out.println(ending.charAt(i));
            }
        }
        return  false;
    }
    public static void main(String[] args) {
       boolean res =solution("abc","bc");
        System.out.println(res);
    }
}