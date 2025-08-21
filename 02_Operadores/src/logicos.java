// Classe para demonstrar operadores lógicos em Java
public class logicos {
    public static void main(String[] args) {
        // Declarando duas variáveis booleanas
        boolean a = true;   // a recebe verdadeiro
        boolean b = false;  // b recebe falso

        // Operador AND (E lógico): retorna true somente se ambos forem true
        boolean and = a && b;
        System.out.println("AND (a && b): " + and); // false, pois b é false

        // Operador OR (OU lógico): retorna true se pelo menos um for true
        boolean or = a || b;
        System.out.println("OR (a || b): " + or); // true, pois a é true

        // Operador NOT (NÃO lógico): inverte o valor booleano
        boolean notA = !a;
        System.out.println("NOT (!a): " + notA); // false, pois a é true

        // Operador XOR (OU exclusivo): retorna true se os valores forem diferentes
        boolean xor = a ^ b;
        System.out.println("XOR (a ^ b): " + xor); // true, pois a e b são diferentes
    }
}
