//Exercicio numero par

import java.util.Random;


public class ex_numeroPar {
    public static void main(String[] args){
        Random gerador = new Random();
        int numero = gerador.nextInt(100);
        System.out.println("Número gerado: " + numero);

        if(numero > 0){
            if(numero % 2 == 0){
                System.out.println("O Numero "+ numero + " é par.");
            }else {
                System.out.println("O Numero "+ numero + " é impar.");
            }
        }else {
            System.out.println("O Numero gerado é negativo ou zero.");
        }
    }
    
}
