import java.util.Scanner;

public class Sem1 {
    public static void main(String[] args) {
        // In: n = 234
        // Out: 15
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        int sum = 0;
        int pr = 1;
        while (n != 0) {
            sum += n % 10;
            pr *= n % 10;
            n /= 10;
        }
        System.out.println("result: " + (pr - sum));
    }
}
