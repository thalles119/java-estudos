public class Aula07Arrays02 {
    public static void main(String[] args) {
        //inicalização padrão (quando não atribuimos nenhum valor para o Array):
        //byte, short, int, long (0)
        //float, double (0.0)
        //char ('\u0000') caracter 
        //boolean (false)
        //String (null)

        int [] idades = new int[3];
        System.out.println(idades [0]);
        System.out.println(idades [1]);
        System.out.println(idades [2]);

        String [] nomes = new String[3];
        System.out.println(nomes [0]);
        System.out.println(nomes [1]);
        System.out.println(nomes [2]);

        char [] caracteres = new char[3];
        System.out.println(caracteres [0]);
        System.out.println(caracteres [1]);
        System.out.println(caracteres [2]);

        boolean [] idadess = new boolean[3];
        System.out.println(idadess [0]);
        System.out.println(idadess [1]);
        System.out.println(idadess [2]);

        String [] personagens = new String [4];
        personagens [0] = "Thallys";
        personagens [1] = "Rachel";
        personagens [2] = "Rodrigo";
        personagens [3] = "Esthefany";

        for (int i = 0; i < personagens.length ; i++) { // personagens.length retorna o tamanho do Array
            System.out.println(personagens [i]);
        }
    }
}
