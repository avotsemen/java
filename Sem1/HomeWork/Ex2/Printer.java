package Sem1.HomeWork.Ex2;

//Напишите функцию printPrimeNums, 
//которая выведет на экран все простые числа 
//в промежутке от 1 до 1000, каждое на новой строке.
//Напишите свой код в методе printPrimeNums класса Answer.

class Answer {
    public void printPrimeNums() {
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      
      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}