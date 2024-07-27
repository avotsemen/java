package Sem2;

import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введдите строку: ");
        String strOriginal = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        if(IsPalindrome(strOriginal)){
            System.out.println("Строка является палиндромом");
        }else{
            System.out.println("Строка не является палиндромом");
        }

    }

    private static boolean IsPalindrome(String strOriginal) {
        String strReversed = new StringBuilder(strOriginal).reverse().toString();
        if (strOriginal.equals(strReversed)) {
            return true;
        }else{
            return false;
        }
    }
}
