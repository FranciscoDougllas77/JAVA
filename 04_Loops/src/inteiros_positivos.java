public class inteiros_positivos {
    public static void main(String[] args){
        int contador = 0;

        do{
            contador ++; // Incrementa o contador
            if (contador >= 0){
                System.out.println("O valor atual é: " + contador); // Exibe o valor atual do contador
            } else {
                System.out.println("O número não é positivo, encerrando o loop.");
                break; // Interrompe o loop se o número não for positivo    
            }
        }while (contador < 10); // Continua o loop enquanto o contador for menor que 10
    }
}
