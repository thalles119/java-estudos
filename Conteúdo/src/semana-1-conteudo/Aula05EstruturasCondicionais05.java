import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais05 {
    static void main(String[] args) {

        byte dia = 5;
        //switch só aceita os tipos: char, int, byte short, enum e String

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break; //tem q colocar pra parar o código quando achar a condição certa
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }
        char sexo = 'M';

        switch (sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
