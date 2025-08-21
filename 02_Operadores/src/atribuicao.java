//Operadores de atribuição são usados para atribuir valores a variáveis.
// Eles podem ser usados para atribuir um valor direto ou para modificar o valor de uma variável existente.
// Os principais operadores de atribuição são: = (atribuição), += (adição e atribuição), -= (subtração e atribuição), *= (multiplicação e atribuição), /= (divisão e atribuição) e %= (módulo e atribuição).
public class atribuicao {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 10;
        int b = 5;

        // Atribuição simples
        int c = a; // c recebe o valor de a
        System.out.println("Atribuição simples: " + c); // 10

        // Atribuição com adição
        c += b; // c = c + b
        System.out.println("Atribuição com adição: " + c); // 15

        // Atribuição com subtração
        c -= b; // c = c - b
        System.out.println("Atribuição com subtração: " + c); // 10

        // Atribuição com multiplicação
        c *= b; // c = c * b
        System.out.println("Atribuição com multiplicação: " + c); // 50

        // Atribuição com divisão
        c /= b; // c = c / b
        System.out.println("Atribuição com divisão: " + c); // 10

        // Atribuição com módulo
        c %= b; // c = c % b
        System.out.println("Atribuição com módulo: " + c); // 0
    }
    
}
