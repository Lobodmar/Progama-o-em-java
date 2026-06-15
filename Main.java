public class Main {

    public static void main(String[] args) {

        // Instanciando objetos
        Produto produto1 = new Produto("Mouse Gamer", 89.90, 15);

        Produto produto2 = new Produto("Teclado Mecânico", 249.90, 8);

        // Chamando o método
        produto1.exibirInformacoes();

        produto2.exibirInformacoes();
    }
}
