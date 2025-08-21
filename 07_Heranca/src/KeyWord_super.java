// Classe base Animal, representa um animal genérico
class Animal{
    public String nome;
    /**
     * Método que imprime um som genérico de animal.
     * Pode ser sobrescrito por subclasses para fornecer sons específicos.
     */
    public void fazerSom(){
        System.out.println("Animal fazendo som");
    }
}

// Classe Cachorro herda de Animal e sobrescreve o método fazerSom
class Cachorro extends Animal{
    /**
     * Método sobrescrito para imprimir o som específico do cachorro.
     * Utiliza 'super.fazerSom()' para chamar o método da classe base antes de exibir o som do cachorro.
     */
    public void fazerSom(){
        super.fazerSom();
        System.out.println("Cachorro latindo");
    }
}

/**
 * Classe principal para demonstrar o uso da palavra-chave 'super'
 * e a sobrescrita de métodos em herança.
 */
public class KeyWord_super {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Rex"; // Define o nome do cachorro
        System.out.println(cachorro.nome); // Exibe o nome do cachorro
        cachorro.fazerSom(); // Chama o método sobrescrito que utiliza 'super'
    }  
}
