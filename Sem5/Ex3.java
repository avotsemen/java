/*
Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXII = 2022

 */
package Sem5;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {

        System.out.println(rimToArabic("IX")); // 2022

    }

    private static int rimToArabic(String string) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        String rimData = string;
        Integer arabData = map.get(rimData.charAt(rimData.length()-1));
        for (int i = 0; i < rimData.length()-1; i++) {
            if (map.get(rimData.charAt(i)) < map.get(rimData.charAt(i + 1))) {
                arabData -= map.get(rimData.charAt(i));
            } else {
                arabData += map.get(rimData.charAt(i));
            }
        }
        return arabData;
    }
}
