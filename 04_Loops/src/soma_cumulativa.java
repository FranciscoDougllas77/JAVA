public class soma_cumulativa {
    public static void main(String[] args){
        int soma = 0;

        for(int i = 0; i <= 10; i ++){
            soma += i; // Adiciona o valor de i à soma cumulativa
            System.out.println("A soma cumulativa até " + i + " é: " + soma);
            // Exibe a soma cumulativa atual
        }
    }
}
