/**
 * Exemplo de uso do loop while em Java
 * Este programa demonstra um contador que incrementa até 10
 * usando um loop while com condição de parada
 */
public class while_JavaWeb {
    public static void main(String[] args){
        // Inicializa o contador em 0
        int contador = 0;
        
        // Loop while que executa indefinidamente até encontrar um break
        while(true){
            // Incrementa o contador a cada iteração
            contador ++;
            // Exibe o número atual do contador
            System.out.println("Numero Atual: "+contador);

            // Condição de parada: quando o contador atingir 10
            if(contador == 10){
                break; // Interrompe o loop
            }
        }

        int Numero = 0;
        do{
            Numero++;
            System.out.println("Do while: "+Numero);
            if(Numero == 10){
                break; // Interrompe o loop
            }
        }while(true);
    }
}
