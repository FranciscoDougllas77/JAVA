package empresa;
import empresa.Funcionario;

public class Teste {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Miguel", 3456.67);
        func.mostrarNome();
        func.mostrarSalario();
    }
    
}
