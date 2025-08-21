import java.util.Scanner;

public class SystemJava {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.printf("Digite seu nome: ");
        String nome = entrada.next();

        System.out.printf("Nome: %s\nIdade: %d\nAltura: %.2f", nome, idade, altura);


        entrada.close();
    }
    
}
  