//Exercicio Controle de Estoque
public class controle_estoque {
    public static void main(String[] args){
        //Declaração das Variaveis
        String nomeProduto = "Notebook";
        int quantidadeEstoque = 50;
        double precoUnitario = 3456.56;
        boolean disponivel = true;

        double valorTotal = ((double) quantidadeEstoque) * precoUnitario;

        //Exibição dos Dados 
        System.out.println("No Estoque temos o produto: " + nomeProduto);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("Valor Total em Estoque: R$ " + valorTotal);
        
    }
    
}
