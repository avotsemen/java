import java.util.Scanner;

public class Sem1 {
    public static void main(String[] args) {
        // In: n = 234
        // Out: 15
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        int result = getSumMinusPr(n);

        System.out.println("result: " + result);
    }
    
/**
 * 
 * @param n начальное значение
 * @return произведение минус сумма
 */
    private static int getSumMinusPr(int n) {
        int sum = 0;
        int pr = 1;
        while (n != 0) {
            sum += n % 10;
            pr *= n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}
