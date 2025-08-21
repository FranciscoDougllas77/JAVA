public class controle_continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println("O loop foi pulado no valor: " + i);
                continue; // Pula o restante do loop quando i é igual a 5
            }
            System.out.println("O valor atual é: " + i);
        }
        System.out.println("Fim do loop for com continue");
    }
}
