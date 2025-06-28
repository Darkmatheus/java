package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quantos números da sequência Fibonacci você quer: ");
        int quantidade = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");

        for (int i = 1; i <= quantidade; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
