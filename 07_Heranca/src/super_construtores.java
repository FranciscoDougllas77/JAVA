// Classe base Animal, representa um animal genérico
class Animal {
    String nome; // Nome do animal

    // Construtor da classe Animal
    // Recebe o nome do animal como parâmetro
    Animal(String nome) {
        this.nome = nome; // Inicializa o atributo nome
    }
}

// Classe Cachorro herda de Animal, ou seja, é um tipo de Animal
class Cachorro extends Animal {
    String raca; // Raça do cachorro

    // Construtor da classe Cachorro
    // Recebe o nome e a raça do cachorro como parâmetros
    Cachorro(String nome, String raca) {
        super(nome); // Chama o construtor da classe base (Animal) para inicializar o nome
        this.raca = raca; // Inicializa o atributo raca
    }
}

// Classe principal para demonstrar o uso de construtores com herança e a palavra-chave 'super'
public class super_construtores {
    public static void main(String[] args) {
        // Cria um objeto Cachorro, passando o nome e a raça
        Cachorro cachorro = new Cachorro("Rex", "Labrador");


        // Exibe o nome do cachorro (herdado da classe Animal)
        System.out.println("Nome do cachorro: " + cachorro.nome);
        // Exibe a raça do cachorro (definida na classe Cachorro)
        System.out.println("Raça do cachorro: " + cachorro.raca);
    }
}
