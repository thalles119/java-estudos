public class Aula07Arrays03 {
    public static void main(String[] args) {

        // formas de inicialização:
        int [] numeros = new int [5];
        int [] numeros2 = {1, 2, 3, 4, 5}; // Abreviação de um Array, não precisa declarar o tamanho do Array, pois ele é definido pelo número de elementos que você colocou dentro das chaves.
        int [] numeros3 = new int [] {1, 2, 3, 4, 5}; // Forma completa de inicialização de um Array, onde você declara o tamanho do Array e os elementos dentro das chaves.

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        for (int num: numeros3) { //outra forma de exibir o valor do Array, utilizando o for each.
            System.out.println(num);
        }
    }
}
