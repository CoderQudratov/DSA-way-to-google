public class Main {
    public static String longestCommonPrefix(String[] words) {
        if (words==null||words.length==0){
            return "";
        }
        String prefix =words[0];

        for (int i = 1; i < words.length; i++) {
             while (words[i].indexOf(prefix)!=0){
                 prefix=prefix.substring(0,prefix.length()-1);
                 System.out.println(prefix);
                 if (prefix.isEmpty()){
                     return "";
                 }
             }
        }
        return prefix;
        // write code here
    }
    public static void main(String[] args) {
       String[] arr ={"flower","fow","flight"};
       String res =longestCommonPrefix(arr);
        System.out.println(res);
    }
}