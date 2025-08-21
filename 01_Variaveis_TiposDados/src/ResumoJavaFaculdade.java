/**
* Exemplo Resumido dos Principais Conceitos Iniciais de Java
* Inclui: comentários, tipos primitivos, variáveis, entrada de dados, identificadores, promoções automáticas, var, variáveis locais/globais e cálculos simples.
*/
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ResumoJavaFaculdade {

   // Variável global (de instância)
   int idadeGlobal = 30;

   public static void main(String[] args) {
       // 1. Comentários
       // Este é um comentário de linha única

       /* Este é um comentário
          de múltiplas linhas */

       /**
        * Comentário Javadoc
        * Usado para documentar classes e métodos
        */

       // 2. Identificadores válidos
       int numero = 10;
       String nomeCompleto = "Maria Silva";
       double _valor = 20.5;
       float $preco = 15.99f;

       // 3. Tipos primitivos
       byte b = 100;
       short s = 10000;
       int i = 100000;
       long l = 100000L;
       float f = 10.5f;
       double d = 20.99;
       char c = 'A';
       boolean bool = true;

       // 4. Declaração e uso de variáveis
       int farinha = 2;
       System.out.println("Receita: " + farinha + " xícaras de farinha");

       // 5. Variáveis locais e globais
       int idadeLocal = 18;
       System.out.println("Idade local: " + idadeLocal);
       ResumoJavaFaculdade obj = new ResumoJavaFaculdade();
       obj.mostrarIdadeGlobal();

       // 6. Entrada de dados via Scanner (console)
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite seu nome: ");
       String nome = entrada.nextLine();
       System.out.print("Digite sua idade: ");
       int idade = entrada.nextInt();
       System.out.print("Digite sua altura: ");
       double altura = entrada.nextDouble();
       System.out.println("Nome: " + nome + " | Idade: " + idade + " | Altura: " + altura);

       // 7. Entrada de dados via JOptionPane (caixa de diálogo)
       String nota1 = JOptionPane.showInputDialog("Digite a Primeira Nota:");
       String nota2 = JOptionPane.showInputDialog("Digite a Segunda Nota:");
       double media = (Double.parseDouble(nota1) + Double.parseDouble(nota2)) / 2;
       JOptionPane.showMessageDialog(null, "Média das duas notas: " + media);

       // 8. Promoções automáticas
       int inteiro = 10;
       double pontoFlutuante = 5.5;
       double resultado = inteiro + pontoFlutuante; // int promovido para double
       System.out.println("Soma com promoção automática: " + resultado);

       // 9. Uso do var (Java 10+)
       var texto = "Olá, mundo!";
       var decimal = 3.14;
       System.out.println("Texto: " + texto + " | Decimal: " + decimal);

       // 10. Cálculo de área de retângulo
       double base = 5.0;
       double alturaRet = 3.5;
       double area = base * alturaRet;
       System.out.println("Área do retângulo: " + area);

       // 11. Controle de estoque simples
       String nomeProduto = "Notebook";
       int quantidadeEstoque = 50;
       double precoUnitario = 3456.56;
       boolean disponivel = true;
       double valorTotal = quantidadeEstoque * precoUnitario;
       System.out.println("Produto: " + nomeProduto + " | Quantidade: " + quantidadeEstoque + " | Preço: R$" + precoUnitario + " | Disponível: " + (disponivel ? "Sim" : "Não") + " | Valor Total: R$" + valorTotal);

       entrada.close();
   }

   // Método para mostrar variável global
   public void mostrarIdadeGlobal() {
       System.out.println("Idade global (de instância): " + idadeGlobal);
   }
}
