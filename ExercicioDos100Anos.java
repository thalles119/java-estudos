import java.time.LocalDate;
import java.util.Scanner;

public class ExercicioDos100Anos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        int anosFaltam = 100 - idade;

        int anoAtual = LocalDate.now().getYear();
        int ano = anoAtual + anosFaltam;

        System.out.println(nome + " você terá 100 anos em " + ano);
    }
}
