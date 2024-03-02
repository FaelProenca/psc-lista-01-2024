package org.example;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o preco do litro da gasolina: ");
        double litro = sc.nextDouble();
        System.out.println("Quantos litros foram vendidos: ");
        double litrosVendidos = sc.nextDouble();
        double precoGasolina = litro * litrosVendidos;
        System.out.println("O preco da gasolina foi de: " + precoGasolina);
    }
}
