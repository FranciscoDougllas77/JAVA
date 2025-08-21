// Importa a classe Funcionario do pacote empresa
import empresa.Funcionario;

// Classe principal que executa o programa
public class Pagamentos {
    // Método principal que inicia a execução
    public static void main(String[] args) {
        // Cria um novo objeto Funcionario com nome "Miguel" e salário 3456.67
        Funcionario func = new Funcionario("Miguel", 3456.67);

        // Chama o método mostrarNome() do objeto func
        //func.mostrarNome();

        // Chama o método mostrarSalario() do objeto func
        //func.mostrarSalario();

        // Mostra o novo salário do funcionário
        func.AlteraMostrarSalario(func, 1220);
    }
}