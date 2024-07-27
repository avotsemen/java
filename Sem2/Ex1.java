package Sem2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите натуральное число: ");
        int n = scanner.nextInt();
        getShuffleStr(n);
    }

    private static void getShuffleStr(int n) {
        String str1 = "c1";
        String str2 = "c2";
        String result = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += str1;
            } else {
                result += str2;
            }
        }
        System.out.println(result);
    }
}