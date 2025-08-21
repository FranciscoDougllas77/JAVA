//Operadores unários em Java
// Em Java, os operadores unários são usados para operar em uma única variável.
// Eles incluem operadores de incremento, decremento e negação.
// Os principais operadores unários são: ++ (incremento), -- (decremento) e ! (negação).

public class unarios {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 10;
        int b = 5;

        // Operador unário de incremento
        a++; // a agora é 11
        System.out.println("Incremento: " + a);

        // Operador unário de decremento
        b--; // b agora é 4
        System.out.println("Decremento: " + b);

        // Operador unário de negação
        boolean c = true;
        c = !c; // c agora é false
        System.out.println("Negação: " + c);
    }
}
