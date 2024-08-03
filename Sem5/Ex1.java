package Sem5;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    private static final String Map = null;

    public static void main(String[] args) {
        System.out.println("areIsomorphic(\"add\" , \"egg\") = " + areIsomorphic("add" , "egg"));
        System.out.println("areIsomorphic(\"foo\" , \"bar\") = " + areIsomorphic("foo" , "bar"));
        System.out.println("areIsomorphic(\"paper\" , \"title\") = " + areIsomorphic("paper" , "title"));
        System.out.println("areIsomorphic(\"paper\" , \"tisle\") = " + areIsomorphic("paper" , "tisle"));
    }

    private static boolean areIsomorphic(String string, String string2) {
        if (string.length() != string2.length()){
            return false;
        }
        Map<Character, Character> map1 = new HashMap<Character, Character>();
        for (int i = 0; i < string.length(); i++) {
            char c1 = string.charAt(i);
            char c2 = string2.charAt(i);
            if (map1.containsKey(c1)) {
                if (map1.get(c1)!=c2){
                    return false;
                }
            } else if (map1.containsValue(c2)) {
                return false;
            } else {
                map1.put(c1, c2);
            }
            
        }
        return true;
    }
}
