package Calculator;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int inp1, inp2, inp3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer:");
        inp1 = scanner.nextInt();
        System.out.print("Enter the second integer:");
        inp2 = scanner.nextInt();
        System.out.print("Enter the third integer:");
        inp3 = scanner.nextInt();
        Calculator calculator = new Calculator(inp1, inp2, inp3);
        System.out.println("For the numbers " + calculator.getNum1() + ", " + calculator.getNum2() + " and " + calculator.getNum3());
        System.out.println("Largest is " + calculator.getLargest());
        System.out.println("Smallest is " + calculator.getSmallest());
        System.out.println("Sum is " + calculator.getSum());
        System.out.println("Product is " + calculator.getProduct());
        System.out.println("Average is " + calculator.getAverage());
    }
}
