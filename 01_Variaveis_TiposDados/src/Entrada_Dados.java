/**
 * Classe que demonstra o uso de entrada de dados através de caixas de diálogo
 * utilizando a classe JOptionPane
 */
import javax.swing.JOptionPane;

public class Entrada_Dados {
    /**
     * Método principal que executa o programa
     * @param args argumentos da linha de comando (não utilizados neste exemplo)
     */
    public static void main(String[] args){
        // Solicita e armazena o nome do usuário
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        
        // Solicita e converte a idade para inteiro
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        
        // Solicita e converte a altura para número decimal
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        
        // Exibe todas as informações coletadas em uma única caixa de diálogo
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
    }
}