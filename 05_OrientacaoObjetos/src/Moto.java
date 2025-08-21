import java.util.Scanner;

public class Moto {
    String marca;
    String modelo;
    int anoFabricacao;
    String cor;
    double valor;

    


    Moto(String marcaInit, String modeloInit, int anoFabricacaoInit, String corInit, double valorInit){
        marca = marcaInit;
        modelo = modeloInit;
        anoFabricacao = anoFabricacaoInit;
        cor = corInit;
        valor = valorInit;
    }

    public void informacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: " + valor);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a marca da Moto: ");
        String marca = input.nextLine();

        System.out.printf("Digite o modelo da Moto: ");
        String modelo = input.nextLine();

        System.out.printf("Digite o ano de fabricação da Moto: ");
        int anoFabricacao = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha pendente

        System.out.printf("Digite a cor da Moto: ");
        String cor = input.nextLine();

        System.out.printf("Digite o valor da Moto: ");
        double valor = input.nextDouble();
        
        Moto moto1 = new Moto(marca, modelo, anoFabricacao, cor, valor);
        System.out.println("\nInformações da Moto:");
        moto1.informacoes();

        input.close();
    }

}
