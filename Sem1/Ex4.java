package Sem1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Дан массив целых чисел.
        // Верно ли, что массив является симметричным.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            arr[i] = scanner.nextInt();
        }

        if (isSimmetr(arr)) {
            System.out.println("Массив симметричный");
        } else {
            System.out.println("Массив не симметричный");
        }

        System.out.println("Массив выглядит так:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static boolean isSimmetr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
