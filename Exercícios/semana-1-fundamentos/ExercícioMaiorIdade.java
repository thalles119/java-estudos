public class ExercícioMaiorIdade {
    public static void main(String[] args) {

        int [] idades = {20, 22, 24};

        int maior = idades[0];

        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
            }
        }
        System.out.println("Maior idade: " + maior);
    }
}