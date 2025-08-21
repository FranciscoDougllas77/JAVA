// Classe base Animal
class Animal{
    public String nome; // Nome do animal

    // Método que faz o animal emitir um som genérico
    public void fazerSom(){
        System.out.println("Animal fazendo som");
    }
}

// Classe Cachorro que herda de Animal
class Cachorro extends Animal{
    // Sobrescreve o método fazerSom para o som específico do cachorro
    @Override
    public void fazerSom(){
        System.out.println("Cachorro latindo");
    }
}

// Classe principal para testar as anotações
public class Annotations_java {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro(); // Cria um cachorro
        cachorro.nome = "Rex"; // Define o nome do cachorro
        cachorro.fazerSom(); // Chama o método que faz o cachorro latir
    }
   
}
