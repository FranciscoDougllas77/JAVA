import java.util.Scanner;

public class LendoDadosViaTeclado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Idade: " + idade);

        sc.close();
    }
}
