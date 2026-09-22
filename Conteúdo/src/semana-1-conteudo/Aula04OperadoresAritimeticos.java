public class Aula04OperadoresAritimeticos {
    public static void main(String[] args) {
        double pao = 9.50;
        double queijo = 7.0;
        double açucar = 1.0;
        double desconto = 5.0;
        int totalDiasDoMes = 30;

        double valorTotal = pao + queijo + açucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasDoMes;

        System.out.println("Valor total: R$" + valorTotal);
        System.out.println("Valor total com desconto: R$" + valorTotalComDesconto);
        System.out.println("Valor total dividido por 2: R$" + valorTotalDividido);
        System.out.println("Valor total mensal: R$" + valorTotalMensal);

        /**
         * operadores racionais
         */

        // % = resto: pode ser usado para saber se um numero é par ou impar
        int resto = 10 % 2;
        System.out.println(resto);

        // operadores logicos: <, >, <=, >=, ==, != (sempre retornam valores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMenorQueVinte);

        boolean isDezIgualAVinte = 10 == 20;
        System.out.println(isDezIgualAVinte);

        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println(isDezDiferenteDeVinte);

        // && (AND) || (OR)
        // &&
        int idade = 35;
        float salario = 3500;


        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        // ||
        double valorTotalContaCorrente = 200;
        double valorTotalContaPopança = 10000;
        float valorPlayCinco = 5000;

        boolean isplayCincoCompravel = valorTotalContaCorrente > valorPlayCinco || valorTotalContaPopança > valorPlayCinco;

        System.out.println(isplayCincoCompravel);

        //Assignment (atribuição): =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000; // a mesma coisa que: bonus = bonus + 1000;
        bonus -= 1000;
        bonus *= 1000;

        System.out.println(bonus);

        // adicionar mais 1 ao valor da variável:
        int contador = 0;
        contador += 1; //pode ser também escrito como: contador++

        System.out.println(contador);

        // diminuir 1 ao valor da variável:
        int contador2 = 0;

        System.out.println("Contador2 =" + ++contador2);
        /*
        então, o resultado vai ser "0" pq tem diferença entre vc colocar o "++" antes ou depois da variavel.
        se vc colocar antes, ele vai imprimir e dps somar 1 (ai o resultado seria 0), se vc colocar depois,
        ele vai somar 1 depois de imprimir (ai o resultado seria 1).
         */
    }
}