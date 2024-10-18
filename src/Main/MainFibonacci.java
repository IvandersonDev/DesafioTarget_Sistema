package Main;

import Methods.FibonacciChecker;

import java.util.Scanner;

public class MainFibonacci {
    public static void main(String[] args) {
        FibonacciChecker fibonacciChecker = new FibonacciChecker();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        if (fibonacciChecker.isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
        }
    }
}
