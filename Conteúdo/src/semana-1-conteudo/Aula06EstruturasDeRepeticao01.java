public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        //while, do while, for
        //o while deve resultar um valor booleano
        int count = 0; //se essa variável for maior q a condição, não vai imprimir nd

        while (count < 10){
            System.out.println(++count);
            // ou: count += 1;
        }
        do { //quando a afirmação for falsa, ele vai imprimir o "do-while"
//            System.out.println("A condição é falsa");
        } while (count < 10);

        /**
         * O for é dividido em 3 partes: na primeira ele inicializa a variavel, na segunda ele coloca até
         * onde a contagem vai, e na terceira, ele coloca uma incrementação, diz oq essa variável vai
         * fazer a cada iteração, se vai somar, subtrair, multiplicar, dividir...
         */
        for (int i = 0; i < 10; i++){
            System.out.println("Contagem do for: " + (++i + 1));
        }

    }
}
