public class Aula06EstruturasDeRepeticao05 {
    static void main(String[] args) {
        // continue:
        // Descobrir em quantas vezes o valor de um carro pode ser parcelado
        // Condição: valorParcela >= 1000
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println(parcela + " parcelas de " + valorParcela);
        }
    }
}
