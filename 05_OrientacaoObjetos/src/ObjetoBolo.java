/**
 * Classe que representa um objeto bolo com quantidade de açúcar
 */
public class ObjetoBolo {

    /** Quantidade de açúcar em gramas */
    int quantidadeAcucar = 100;

    /**
     * Método principal que demonstra a criação de objetos bolo
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args){
        // Cria um bolo de chocolate com 200g de açúcar
        ObjetoBolo boloDeChocolate = new ObjetoBolo();
        boloDeChocolate.quantidadeAcucar = 200;

        // Cria um bolo de baunilha com 150g de açúcar
        ObjetoBolo boloDeBaunilha = new ObjetoBolo();
        boloDeBaunilha.quantidadeAcucar = 150;

        // Exibe as quantidades de açúcar de cada bolo
        System.out.println("Quantidade Acucar Bolo de Chocolate: "+boloDeChocolate.quantidadeAcucar);
        System.out.println("Quantidade Acucar Bolo de Baunilha: "+boloDeBaunilha.quantidadeAcucar);
    }
}
