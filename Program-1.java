input:

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/subtract/multiply/divide): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b, op);
        System.out.println("Result = " + calc.calculate());

        sc.close();
    }
}

class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    double calculate() {
        if (operation.equals("add")) {
            return a + b;
        } else if (operation.equals("subtract")) {
            return a - b;
        } else if (operation.equals("multiply")) {
            return a * b;
        } else if (operation.equals("divide")) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Cannot divide by zero!");
                return 0;
            }
        } else {
            System.out.println("Invalid operation!");
            return 0;
        }
    }
}

Output:
Enter first number: 2
Enter second number: 2
Enter operation (add/subtract/multiply/divide): add
Result = 4.0
