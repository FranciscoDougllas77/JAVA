// Tipos Primitivos em Java
// Tipos primitivos são os tipos de dados mais básicos em Java. Eles armazenam valores simples
// diretamente na memória e não possuem métodos associados.
// Existem 8 tipos primitivos em Java: byte, short, int, long, float, double, char e boolean.

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos inteiros
        byte b = 100;           // 1 byte, valores de -128 a 127
        short s = 10000;        // 2 bytes, valores de -32.768 a 32.767
        int i = 100000;         // 4 bytes, valores de -2.147.483.648 a 2.147.483.647
        long l = 100000L;       // 8 bytes, valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        // Tipos de ponto flutuante (números com casas decimais)
        float f = 10.5f;        // 4 bytes, precisão simples (~6-7 dígitos decimais)
        double d = 20.99;       // 8 bytes, precisão dupla (~15 dígitos decimais)

        // Tipo caractere
        char c = 'A';           // 2 bytes, armazena um único caractere Unicode

        // Tipo booleano
        boolean bool = true;    // 1 bit, armazena true ou false

        // Exibindo os valores e explicações
        System.out.println("byte: " + b + " // 1 byte, valores de -128 a 127");
        System.out.println("short: " + s + " // 2 bytes, valores de -32.768 a 32.767");
        System.out.println("int: " + i + " // 4 bytes, valores de -2.147.483.648 a 2.147.483.647");
        System.out.println("long: " + l + " // 8 bytes, valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807");
        System.out.println("float: " + f + " // 4 bytes, precisão simples (~6-7 dígitos decimais)");
        System.out.println("double: " + d + " // 8 bytes, precisão dupla (~15 dígitos decimais)");
        System.out.println("char: " + c + " // 2 bytes, armazena um único caractere Unicode");
        System.out.println("boolean: " + bool + " // 1 bit, armazena true ou false");
    }
}