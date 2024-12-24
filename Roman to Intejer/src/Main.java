import java.util.HashMap;
import java.util.Scanner;

public class Main {
    // RIM raqamlari togri qiymatda kiritilayotganini tekshirish
    public static boolean isValidRoman(String str){
        return str.matches("^[IVXLCDM]+$"); // true yoki false qaytarish uchun regex
    }
    public static int romanToInt(String str){
        HashMap<Character, Integer> romanMap
                = new HashMap<>(); // rim raqami jadvali
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int res =0;
        // qiymat ni birinchisi kiyingisdan kichkina bolsa qiymatni ayiradi
        for (int i=0; i<str.length();i++){
            if (i<str.length()-1 && romanMap.get(str.charAt(i))<romanMap.get(str.charAt(i+1))){
                res-=romanMap.get(str.charAt(i));
            }else{
                // bu teskarisi
                res+=romanMap.get(str.charAt(i));
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);// reading cli
        // while loopi agarda isValidRomandan false qaytsa yana qayta ishlashi uchun
        while (true){
            System.out.println("RIM raqamini kiriting: ");
            String romanStr =scanner.next().toUpperCase(); // harflarni kichikdan kattaga o'tkazish
            if (isValidRoman(romanStr)){
             int num  =  romanToInt(romanStr);//RIM raqamidan odatiy raqamga nomerni ogrish
                System.out.println("Sizning raqamingiz: "+num);//natijani ekranga chop etish
                break;
            }else{
                System.out.println("Notugri qiymat kiritilgan boshqatan orinib koring");
            }
        }

    scanner.close(); // scanner oqishi toxtatildi
    }

}