package Sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "one", "2", "three", "4", "five", "6", "seven", "eight", "nine", "ten"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            try {
                Integer.parseInt(element);
                iterator.remove();
            } catch (NumberFormatException e) {
                System.out.println("Invalid element: " + element);

            }
            System.out.println("list: " + list.toString());
        }
    }
}
