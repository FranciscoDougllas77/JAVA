//Operadores de comparação são usados para comparar dois valores.
// Eles retornam um valor booleano (true ou false) dependendo do resultado da comparação.
// Os principais operadores de comparação são: == (igualdade), != (diferença), > (maior que), < (menor que), >= (maior ou igual a) e <= (menor ou igual a).
public class comparacao {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 10;
        int b = 5;

        // Igualdade
        boolean igual = (a == b);
        System.out.println("Igual: " + igual);

        // Diferença
        boolean diferente = (a != b);
        System.out.println("Diferente: " + diferente);

        // Maior que
        boolean maiorQue = (a > b);
        System.out.println("Maior que: " + maiorQue);
        
        // Menor que
        boolean menorQue = (a < b);
        System.out.println("Menor que: " + menorQue); 
        
        // Maior ou igual a
        boolean maiorOuIgual = (a >= b);
        System.out.println("Maior ou igual a: " + maiorOuIgual);
        
        // Menor ou igual a
        boolean menorOuIgual = (a <= b);
        System.out.println("Menor ou igual a: " + menorOuIgual);

        // Comparação de strings
        String str1 = "Java";
        String str2 = "Java";
        boolean stringsIguais = str1.equals(str2);
        System.out.println("Strings iguais: " + stringsIguais);
    }
}
