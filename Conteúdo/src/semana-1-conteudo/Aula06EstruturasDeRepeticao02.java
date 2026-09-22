public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Exercício: imprimir os numeros pares de 0 a 100

        for (int i = 1; i <= 100; i+=2){
            System.out.println(i);
        }

        //ou:
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }

        }

    }
}
