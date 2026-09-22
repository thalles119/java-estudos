public class ExercicioDeBreakEContinue {
    public static void main(String[] args) {

        // imprima os numeros de 1 a 10 pulando o 7 e parando no 9:

        for (int i = 1; i <= 10; i++) {
            if (i == 7){
                continue;
            }
            if (i == 9){
                break;
            }
            System.out.println(i);
        }
    }
}
