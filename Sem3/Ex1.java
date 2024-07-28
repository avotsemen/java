package Sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на 
// экран.
public class Ex1 {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d ", list[i]);
        
        }
        System.out.println();

        List<Integer> list2 = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list2.add(rand.nextInt(0,100));
        }
        Collections.sort(list2);
        System.out.println(list2);
    }
}
