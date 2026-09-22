import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {

//        System.out.println("Eu faço a impressão e pulo a linha");
//        System.out.print("Eu faço a impressão na mesma linha");
//        System.out.printf("Eu faço a impressão formatada");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine(); //quando é uma string, usamos .nextLine()
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt(); //quando é inteiro, usamos .nextInt()
        System.out.println("Idade: " + idade);
    }
}