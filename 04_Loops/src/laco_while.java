// Laço while 
// O loop while é utilizado para executar um bloco de código enquanto uma condição for verdadeira.
// Ele é útil quando não se sabe de antemão quantas vezes o loop deve ser executado.

public class laco_while {
    public static void main(String[] args){
        int contador = 0;

        while(contador <= 10){
            System.out.println("O valor atual e: " + contador);
            contador++;
            // O loop começa com contador = 0, e continua enquanto
            // contador for menor ou igual a 10.
        }
        System.out.println("Fim do loop while");
        // Após o loop, uma mensagem é exibida indicando o fim do loop.
    }
}
