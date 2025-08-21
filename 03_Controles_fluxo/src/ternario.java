//Condicional ternario
public class ternario {
    public static void main(String[] args){
        double preco = 19.90;
        System.out.println("O preço do produto é: " + preco);
        
        // Condicional ternário para calcular o desconto
        // Se o preço for menor que 20.00, o desconto é de 10%, caso contrário, é de 5%
        double desconto = (preco < 20.00) ? preco * 0.1: preco * 0.05;
        System.out.println("O desconto é: " + desconto);
    }
    
}
