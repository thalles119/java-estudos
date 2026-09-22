public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        // Doar se saldo for > 5000

        double saldoAtual = 5500;
        String mensagemDoar = "Eu vou doar 500 reais pro DevDojo";
        String mensagemNaoDoar = "Não posso doar nesse monmento.";


        // Operador ternário: (condição) ? verdadeiro : falso
        String resultado = saldoAtual > 5000 ? mensagemDoar : mensagemNaoDoar;

        //ou
        boolean amor = false;
        String resultado2 = amor == true ? "Casar!" : "Separar!";

        System.out.println(resultado);
        System.out.println(resultado2);
    }
}
