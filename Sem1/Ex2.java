package Sem1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int k = getK(scanner, n);
        System.out.println("k = " + k);
    }

    /**
     * @apiNote // Дана последовательность N Целых чисел
     *          // найти количество положительных чисел,
     *          // после которых следует отрицательное число
     * @param scanner
     * @param n
     * @return
     */
    private static int getK(Scanner scanner, int n) {
        int k = 0;
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        int b;
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Введите число " + (i + 2) + ": ");
            b = scanner.nextInt();
            if (a > 0 && b < 0) {
                k++;
            }
            a = b;
        }
        return k;
    }
}
