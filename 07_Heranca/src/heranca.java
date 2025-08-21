// Classe base Animal, representa um animal genérico
class Animal{
    // Método que simula o animal comendo
    void comer(){
        System.out.println("Animal comer");
    }
}

// Classe Cachorro herda de Animal, ou seja, é um tipo de Animal
class Cachorro extends Animal{
    // Método específico do cachorro, que simula o latido
    void latir(){
        System.out.println("Cachorro latir");
    }
}

// Classe principal para executar o programa
public class heranca {
    public static void main(String[] args) {
        // Cria um objeto do tipo Cachorro
        Cachorro c = new Cachorro();
        // Chama o método comer herdado da classe Animal
        c.comer();
        // Chama o método latir da classe Cachorro
        c.latir();
    }
}
