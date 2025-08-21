//Uso do var em Java
// O uso do `var` em Java é uma funcionalidade introduzida no Java 10 que permite a inferência de tipos de variáveis locais. Isso significa que você pode declarar uma variável sem especificar explicitamente seu tipo, e o compilador irá inferir o tipo com base no valor atribuído à variável. Essa abordagem pode tornar o código mais conciso e legível, especialmente em casos onde o tipo é óbvio a partir do contexto.

// No entanto, é importante notar que o uso de `var` só é permitido para variáveis locais, não para campos de classe ou parâmetros de métodos. Além disso, o tipo inferido deve ser claro e não ambíguo, caso contrário, o compilador gerará um erro.
public class uso_var {
    public static void main(String[] args) {
        // Exemplo de uso do var
        var numero = 10; // O compilador infere que 'numero' é do tipo int
        var texto = "Olá, mundo!"; // O compilador infere que 'texto' é do tipo String
        var decimal = 3.14; // O compilador infere que 'decimal' é do tipo double

        System.out.println("Número: " + numero); // Saída: Número: 10
        System.out.println("Texto: " + texto); // Saída: Texto: Olá, mundo!
        System.out.println("Decimal: " + decimal); // Saída: Decimal: 3.14
    }
}
