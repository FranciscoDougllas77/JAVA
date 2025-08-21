// Classe base Veiculo representa um veículo genérico
class Veiculo{
    String marca;   // Marca do veículo
    String modelo;  // Modelo do veículo
    int ano;        // Ano de fabricação

    // Construtor da classe Veiculo
    Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
}

// Classe Carro herda de Veiculo e adiciona o atributo portas
class Carro extends Veiculo{
    int portas; // Número de portas do carro

    // Construtor da classe Carro
    Carro(String marca, String modelo, int ano, int portas){
        super(marca, modelo, ano); // Chama o construtor da classe base
        this.portas = portas;
    }
}

// Classe principal para testar as classes Veiculo e Carro
public class Exercicio_veiculo {
    public static void main(String[] args){
        // Cria um objeto Carro
        Carro carro = new Carro("Ford", "Fiesta", 2024, 4);
        // Exibe as informações do carro
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Portas: " + carro.portas);
    }
}
