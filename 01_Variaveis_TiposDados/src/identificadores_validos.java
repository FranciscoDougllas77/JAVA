// Identificadores válidos em Java
// Identificadores válidos são nomes que podem ser usados para identificar variáveis, métodos, classes e outros elementos no código Java. Eles devem seguir algumas regras específicas:
// 1. Podem conter letras (maiúsculas e minúsculas), dígitos (0-9), o caractere de sublinhado (_) e o cifrão ($).
// 2. Não podem começar com um dígito.
// 3. Não podem ser palavras-chave reservadas da linguagem Java (como `int`, `class`, `public`, etc.).
public class identificadores_validos {
    public static void main(String[] args) {
        // Exemplos de identificadores válidos
        int numero = 10; // Válido
        String nomeCompleto = "João Silva"; // Válido
        double _valor = 20.5; // Válido
        float $preco = 15.99f; // Válido

        System.out.println("Número: " + numero); // Saída: Número: 10
        System.out.println("Nome Completo: " + nomeCompleto); // Saída: Nome Completo: João Silva
        System.out.println("Valor: " + _valor); // Saída: Valor: 20.5
        System.out.println("Preço: " + $preco); // Saída: Preço: 15.99
        
        // Comentários explicativos sobre os identificadores
        // Exemplos de identificadores inválidos
        // int 1numero = 5; // Inválido, começa com dígito
        // String nome-completo = "Maria"; // Inválido, contém hífen
        // double class = 3.14; // Inválido, 'class' é uma palavra-chave

        System.out.println("Identificadores válidos em Java foram demonstrados.");
    }
    
}
