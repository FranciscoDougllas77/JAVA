// Classe base Animal, representa um animal genérico
class Animal{
    // Método que imprime um som genérico de animal
    public void fazerSom(){
        System.out.println("Animal fazendo som");
    }
}

// Classe Cachorro herda de Animal e sobrescreve o método fazerSom
class Cachorro extends Animal{
    // Método sobrescrito para imprimir o som específico do cachorro
    public void fazerSom(){
        System.out.println("Cachorro latindo");
    }
}

// Classe principal para demonstrar a sobrescrita de métodos
public abstract class sobrescrita_metodos {
    public static void main(String[] args) {
        // Cria um objeto do tipo Animal
        Animal animal = new Animal();
        // Cria um objeto do tipo Cachorro
        Cachorro cachorro = new Cachorro();

        // Chama o método fazerSom do Animal
        animal.fazerSom();      // Saída: Animal fazendo som
        // Chama o método fazerSom do Cachorro (método sobrescrito)
        cachorro.fazerSom();    // Saída: Cachorro latindo
    }
}
