import empresa.Funcionario;
import java.util.Scanner;

public class Pagamentos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.printf("Digite a sua Idade: ");
        int idade = sc.nextInt();

        System.out.printf("Digite o seu Salario R$: ");
        double salario = sc.nextDouble();

        System.out.printf("Digite o cargo: ");
        String cargo = sc.nextLine();

        System.out.printf("Digite a empresa: ");
        String empresa = sc.nextLine();

        Funcionario NovoFunc = new Funcionario(nome, idade, salario, cargo, empresa);

        sc.close();
    }

}