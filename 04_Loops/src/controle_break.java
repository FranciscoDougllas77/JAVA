public class controle_break {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println("O loop foi interrompido no valor: " + i);
                break; // Interrompe o loop quando i é igual a 5
            }
            System.out.println("O valor atual é: " + i);
        }
        System.out.println("Fim do loop for com break");
    }
}
