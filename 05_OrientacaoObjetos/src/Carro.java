import java.util.Scanner;

/**
 * Classe que representa um carro com suas características básicas
 * Permite criar objetos carro através de entrada do usuário
 */
public class Carro {
    /** Dados do carro */
    String marca;
    String modelo;
    int anoFabricacao;
    String cor;
    String combustivel;

    /**
     * Construtor parametrizado que inicializa todos os atributos do carro
     * @param marcaInit marca inicial do carro
     * @param modeloInit modelo inicial do carro
     * @param anoFabricacaoInit ano de fabricação inicial do carro
     * @param corInit cor inicial do carro
     * @param combustivelInit tipo de combustível inicial do carro
     */
    Carro(String marcaInit, String modeloInit, int anoFabricacaoInit, String corInit, String combustivelInit){
        marca = marcaInit;
        modelo = modeloInit;
        anoFabricacao = anoFabricacaoInit;
        cor = corInit;
        combustivel = combustivelInit;
    }

    /**
     * Método principal que solicita dados do carro ao usuário e exibe as informações
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Solicita e captura os dados do carro
        System.out.printf("Digite a marca do Carro: ");
        String marca = input.nextLine();
        System.out.printf("Digite o modelo do Carro: ");
        String modelo = input.nextLine();
        System.out.printf("Digite o ano de fabricação do Carro: ");
        int anoFabricacao = input.nextInt();
        System.out.printf("Digite a cor do Carro: ");
        String cor = input.nextLine();
        System.out.printf("Digite o combustível do Carro: ");
        String combustivel = input.nextLine();

        // Cria um objeto carro com os dados informados
        Carro carro1 = new Carro(marca, modelo, anoFabricacao, cor, combustivel);
        
        // Exibe as informações do carro criado
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano de fabricação: " + carro1.anoFabricacao);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Combustível: " + carro1.combustivel);

        input.close();
    }
}
