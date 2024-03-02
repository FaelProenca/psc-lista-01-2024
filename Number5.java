package org.example;

import java.util.Scanner;

public class Number5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Passagem alemanha: ");
        double alemanha = sc.nextDouble();
        System.out.println("Passagem portugal: ");
        double portugal = sc.nextDouble();
        System.out.println("Passagem italia: ");
        double italia = sc.nextDouble();
        System.out.println("Numero de pessoas: ");
        int pessoas = sc.nextInt();
        double precoViagem = alemanha + portugal + italia;
        System.out.println("Preco da viagem: " + (precoViagem * pessoas));
    }
}
