import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class Consolename {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        double altura;

        System.out.println("Escreva seu nome: ");
        nome = ler.nextLine();
        System.out.println("Escreva sua idade");
        idade = ler.nextInt();
        System.out.println("Escreva sua altura");
        altura = ler.nextDouble();
System.out.println("Nome " + nome + " idade " + idade + " altura " + altura);

    }
}
