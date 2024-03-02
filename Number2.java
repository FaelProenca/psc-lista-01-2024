package org.example;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = sc.nextInt();

        System.out.println("soma " + (num1 + num2 ));
        System.out.println("subtracao " + (num1 - num2));
        System.out.println("multiplicacao " + (num1 * num2 ));
    }
}
