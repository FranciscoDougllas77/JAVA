//Exercicio03 incremento e decremento
public class exercicio03 {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 10;
        int b = 5;

        // Incremento
        a++; // a agora é 11
        System.out.println("Incremento: " + a);

        // Decremento
        b--; // b agora é 4
        System.out.println("Decremento: " + b);

        // Incremento e Decremento em expressões
        int resultado = ++a + --b; // a é incrementado antes da soma, b é decrementado antes da soma
        System.out.println("Resultado de incremento e decremento em expressões: " + resultado);
    }
}
