//Criando uma Tabuada com o For

import java.util.Scanner;

public class Tabuada_For {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o Primeiro valor para a Tabuada:");
        int n = sc.nextInt();

        System.out.printf("Digite ate qual o numero deseja calcular: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i ++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
        sc.close();
        System.out.println("Tabuada finalizada!");
    }
}
