//Instanceof é um operador que verifica se um objeto é uma instância de uma classe específica ou de uma interface.
// Ele retorna um valor booleano (true ou false) dependendo do resultado da verificação.

public class instanceof_java {
    public static void main(String[] args){
        // Exemplo de uso do operador instanceof
        Object obj = "Hello, World!"; // String é um objeto em Java
        if (obj instanceof String){
            System.out.println("O objeto é uma instância da classe String.");
        } else {
            System.out.println("O objeto não é uma instância da classe String.");
        }
    }
}
