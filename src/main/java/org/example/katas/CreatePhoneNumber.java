package org.example.katas;
/**
 * kata can be found here https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
 *
 */
public class CreatePhoneNumber {

    private static String kataName = "https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java";

    public static String getKataName() {
        return kataName;
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder(14);
        String pattern = "() -";
        int chars = 0;
        int nums = 0;
        for (int i = 0; i < 14; i++){
            if (i == 0 || i == 4 || i == 5 || i == 9){
                sb.append(pattern.charAt(chars));
                chars++;
            }
            else{
                sb.append(numbers[nums]);
                nums++;
            }
        }
        return sb.toString();
    }
}
