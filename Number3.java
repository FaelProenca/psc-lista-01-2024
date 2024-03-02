package org.example;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota um: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota dois: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota tres: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a nota quatro: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media foi de: " + media);




    }
}
