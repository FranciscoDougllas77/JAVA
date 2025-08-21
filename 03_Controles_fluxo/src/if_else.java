//Condicionais if e else
// As estruturas condicionais if e else são usadas para executar diferentes blocos de código com base em uma condição.
// A estrutura if executa um bloco de código se a condição for verdadeira, enquanto a estrutura else executa um bloco de código se a condição for falsa.
// A estrutura if pode ser combinada com else if para testar várias condições em sequência.
public class if_else {
    public static void main(String[] args){
        int numero1 = 10;
        int numero2 = 12;

        int soma = numero1 + numero2;

        if(soma >= 20){
            System.out.println("A Soma e maior que 20 e igual a: " + soma);
        }else if(soma >= 10 && soma < 20){
            System.out.println("A Soma e maior que 10 e menor que 20 e igual a: " + soma);
        }else{
            System.out.println("A Soma e menor que 10 e igual a: " + soma);
        }
    }
    
}
