// File: promocoes_Automaticas.java
// Promocoes automaticas em Java são um conceito importante que se refere à forma como o
// Java lida com a conversão de tipos de dados durante operações aritméticas e atribuições. 
//Quando você realiza operações entre diferentes tipos de dados, o Java pode promover
// automaticamente um tipo menor para um tipo maior para evitar perda de dados.

// Por exemplo, se você somar um inteiro e um número de ponto flutuante, o inteiro 
//será promovido a um ponto flutuante antes da operação ser realizada. Isso garante
// que o resultado da operação seja preciso e não perca informações.
// Este conceito é fundamental para entender como o Java lida com tipos de dados
 //e operações aritméticas, especialmente quando se trata de evitar erros de tipo e garantir a precisão dos cálculos.
public class promocoes_Automaticas {
    public static void main(String[] args) {
        // Exemplo de promoção automática
        int inteiro = 10;
        double pontoFlutuante = 5.5;

        // O inteiro será promovido a double antes da soma
        double resultado = inteiro + pontoFlutuante;

        System.out.println("Resultado da soma: " + resultado); // Saída: Resultado da soma: 15.5

        // Outro exemplo com tipos menores
        byte b = 10;
        short s = 20;

        // O byte será promovido a int antes da soma
        int resultado2 = b + s;

        System.out.println("Resultado da soma de byte e short: " + resultado2); 
        // Saída: Resultado da soma de byte e short: 30
    }
    
}
