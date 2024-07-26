package Sem1.HomeWork.Ex3;

// В методе calculate класса Calculator реализовать калькулятор, 
// который будет выполнять математические операции (+, -, *, /) 
// над двумя целыми числами и возвращать результат вещественного типа.
// В классе Printer необходимо реализовать проверку переданного оператора, 
// при некорректном операторе программа должна вывести сообщение об ошибке 
// "Некорректный оператор: 'оператор'".

class Calculator {
    public double calculate(char op, int a, int b) {
        switch (op) {
            case '+':
                return (double) a + b;
            case '-':
                return (double) a - b;
            case '*':
                return (double) a * b;
            case '/':
                if (b != 0) {
                    return (double) a / b;
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на выполнение, вы можете варьировать эти параметры
            a = 8;
            op = '.';
            b = 0;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        try {
            double result = calculator.calculate(op, a, b);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}