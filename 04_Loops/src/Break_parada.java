public class Break_parada {
    public static void main(String[] args) {
        // Exemplo de break
        System.out.println("Exemplo de break:");
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                System.out.println("Encontrou o número 5! Parando o loop...");
                break; // Interrompe o loop quando i for igual a 5
            }
            System.out.println("Número atual: " + i);
        }

        System.out.println("\nExemplo de continue:");
        // Exemplo de continue
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                System.out.println("Pulando o número 5!");
                continue; // Pula para a próxima iteração quando i for igual a 5
            }
            System.out.println("Número atual: " + i);
        }
    }
}