/**
 * Programa para calcular a média de 4 notas de um aluno
 * Utiliza JOptionPane para interface gráfica
 */
import javax.swing.JOptionPane; // Corrigido o import do JOptionPane

public class ProgramaCalculo {
    public static void main(String[] args){
        // Solicita as 4 notas do aluno
        String nota1 = JOptionPane.showInputDialog("Digite a Primeira Nota: ");
        String nota2 = JOptionPane.showInputDialog("Digite a Segunda Nota: ");
        String nota3 = JOptionPane.showInputDialog("Digite a Terceira Nota: ");
        String nota4 = JOptionPane.showInputDialog("Digite a Quarta Nota: ");

        // Calcula a média das notas
        double resultado = (Double.parseDouble(nota1) + Double.parseDouble(nota2) + Double.parseDouble(nota3) + Double.parseDouble(nota4)) / 4;

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "A Média do Aluno é: " + resultado); // Corrigido o método showMessageDialog
    }
}
