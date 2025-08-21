//Contagem de doces com o while
public class contagem_doces {
    public static void main(String[] args) {
        int contador = 1; // Inicializa o contador de doces
        int totalDoces = 10; // Define o total de doces

        while (contador <= totalDoces) { // Enquanto o contador for menor ou igual ao total de doces
            System.out.println("Contando doce número: " + contador); // Exibe o número do doce atual
            contador++; // Incrementa o contador
        }

        System.out.println("Contagem completa! Total de doces contados: " + totalDoces); // Mensagem final
    }
}
