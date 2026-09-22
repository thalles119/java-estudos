public class Aula06EstruturasDeRepeticao04 {
    static void main(String[] args) {
        // break:
        // Descobrir em quantas vezes o valor de um carro pode ser parcelado
        // Condição: valorParcela >= 1000
        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal ; parcela++) {

            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                break;
            }
            System.out.println(parcela + " parcelas de " + valorParcela);
        }
    }
}
