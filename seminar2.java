import java.util.Arrays;

public class seminar2 {
    public static void main(String[] args) {
        
    // }
    //     static void strin() {
            String one =  "Петр I первый прорубил окно в Европу";
            String two =  "Домик у которого окно на улицу";
            String[] str1 = one.split(" ");
            String[] str2 = two.split(" ");
            String[] str3 = new String[str1.length > str2.length ? str1.length : str2.length];
            System.out.println(Arrays.toString(str1));
            System.out.println(Arrays.toString(str2));
            int count = 0;
            for (int i=0; i<str1.length; i++){
                for (int j=0; j<str2.length; j++ ){
                    if (str1[i].compareTo(str2[j])==0){
                        str3[count++] = str1[i];
                        
                    }
                    
                }
                
            }
            int minLength = str3.length+1;
            String result = null;
            for (int k=0; k<str3.length;k++) {
                if (str3[k] != null && str3.length<minLength) {
                    minLength = str3.length;
                    result = str3[k];
                }
            }
            System.out.println(result);
                        // System.out.println(Arrays.toString(str3));
                    
                
            
        }
}    
    // 1Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
   
        
    // 2Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.
    // *3Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    // static StringBuilder isReversRecurs (StringBuilder sb) {
    //     System.out.print(sb.charAt(sb.length()-1));
    //     if (sb.length() == 1) {
    //         return sb;
    //     }
    //     return isReversRecurs(sb.deleteCharAt(sb.length()-1));
    // }
    // 4Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
    // 5Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
    // *6Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
    // **7Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

   

    

