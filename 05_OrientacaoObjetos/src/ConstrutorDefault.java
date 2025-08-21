/**
 * Classe que demonstra o uso de construtores em Java
 * Inclui um construtor parametrizado e um construtor padrão (default)
 */
public class ConstrutorDefault {
    /** Dados do funcionário */
    String nome;
    String cargo;
    int idade;
    double salario;

    /**
     * Construtor parametrizado que inicializa todos os atributos
     * @param nomeInit nome inicial do funcionário
     * @param cargoInit cargo inicial do funcionário
     * @param idadeInit idade inicial do funcionário
     * @param salarioInit salário inicial do funcionário
     */
    ConstrutorDefault(String nomeInit, String cargoInit,
                int idadeInit, double salarioInit){
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
        salario = salarioInit;
    }
    
    /**
     * Construtor padrão (default) sem parâmetros
     * Cria um objeto com valores padrão dos atributos
     */
    ConstrutorDefault(){}

    /**
     * Método principal que demonstra a criação de objetos usando diferentes construtores
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args){
        // Cria funcionário usando construtor padrão e atribui valores manualmente
        ConstrutorDefault funcionario1 = new ConstrutorDefault();  
        funcionario1.nome = "João";
        funcionario1.cargo = "Desenvolvedor";
        funcionario1.idade = 30;
        funcionario1.salario = 5000.0;

        // Cria funcionário usando construtor parametrizado
        ConstrutorDefault funcionario2 = new ConstrutorDefault("João", "Desenvolvedor", 30, 5000.0);

        // Exibe informações dos funcionários criados
        System.out.println("Funcionário 1: " + funcionario1.nome + " " + funcionario1.cargo + " " + funcionario1.idade + " " + funcionario1.salario);
        System.out.println("Funcionário 2: " + funcionario2.nome + " " + funcionario2.cargo + " " + funcionario2.idade + " " + funcionario2.salario);

    }
    
}
