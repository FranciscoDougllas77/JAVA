public class exercicio02 {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 10;
        int b = 5;

        // Operadores de Atribuição
        int c = a; // Atribuição simples
        c += b;    // Atribuição com adição
        c -= b;    // Atribuição com subtração
        c *= b;    // Atribuição com multiplicação
        c /= b;    // Atribuição com divisão
        c %= b;    // Atribuição com módulo

        // Exibição dos resultados
        System.out.println("Atribuição simples: " + c);
        System.out.println("Atribuição com adição: " + (c + b));
        System.out.println("Atribuição com subtração: " + (c - b));
        System.out.println("Atribuição com multiplicação: " + (c * b));
        System.out.println("Atribuição com divisão: " + (c / b));
        System.out.println("Atribuição com módulo: " + (c % b));
    }
    
}
