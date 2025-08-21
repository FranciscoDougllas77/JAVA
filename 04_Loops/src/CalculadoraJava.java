import java.util.Scanner;
public class CalculadoraJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora de Numeros:");
        System.out.printf("Digite o primeiro numero: ");
        int numero1 = entrada.nextInt();

        System.out.printf("Digite o segundo numero: ");
        int numero2 = entrada.nextInt();

        //Criando a tabela de Calculos
        System.out.println("""
                Tabela de Calculos:
                [1] Somar
                [2] Subtrair
                [3] Multiplicar
                [4] Dividir
                [5] Sair
                """);

        System.out.printf("Digite a opcao: ");
        int opcao = entrada.nextInt();
        System.out.println("A Opção escolhida foi: " + opcao);

        switch (opcao) {
            case 1 -> System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + (numero1 + numero2));
            case 2 -> System.out.println("A subtração de " + numero1 + " e " + numero2 + " é: " + (numero1 - numero2));
            case 3 -> System.out.println("A multiplicação de " + numero1 + " e " + numero2 + " é: " + (numero1 * numero2));
            case 4 -> System.out.println("A divisão de " + numero1 + " e " + numero2 + " é: " + (numero1 / numero2));
            default -> System.out.println("Opção inválida");
        }

        entrada.close();
    }
    
}
