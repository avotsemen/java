/**
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
**/

package Sem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Ex2 {
    public static void main(String[] args) {
        Map<Character, Character> pair = new HashMap<>();
        pair.put('(', ')');
        pair.put('[', ']');
        pair.put('{', '}');
        pair.put('<', '>');
        Stack<Character> lifo = new Stack<>();
        List<String> lines = new ArrayList<>();
        lines.add("a+(d*3)");
        lines.add("[a+(1*3)");
        lines.add("[6+(3*3)]");
        lines.add("{a}[+]{(d*3)}");
        lines.add("<{a}+{(d*3)}>");
        lines.add("a+(d*3){a+]}{(d*3)}");
        for (String line : lines) {
            isPairs(line, lifo, pair);
            System.out.println(line + " " + isPairs(line, lifo, pair));
        }

    }

    public static boolean isPairs(String str, Stack lifo, Map pair) {

        for (char c : str.toCharArray()) {
            if (pair.containsKey(c)) {
                lifo.push(c);
            } else if (pair.containsValue(c)) {
                if (!lifo.isEmpty() && pair.get(lifo.peek()).equals(c)) {
                    lifo.pop();
                } else {
                    System.out.println("1");
                    return false;
                }
            }

            if (lifo.isEmpty()) {
                System.out.println("2");
                return true;
            } else {
                System.out.println("3");
                return false;
            }
        }
        System.out.println("4");
        return false;
    }
}
