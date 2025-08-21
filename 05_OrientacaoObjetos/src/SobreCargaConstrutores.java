/**
 * Classe que demonstra o uso de sobrecarga de construtores em Java
 * Inclui múltiplos construtores com diferentes parâmetros e cenários de uso
 */
public class SobreCargaConstrutores {
    /** Dados do funcionário */
    String nome;
    String cargo;
    int idade;
    double salario;
    String departamento;
    boolean ativo;

    /**
     * Construtor parametrizado que inicializa todos os atributos
     * @param nomeInit nome inicial do funcionário
     * @param cargoInit cargo inicial do funcionário
     * @param idadeInit idade inicial do funcionário
     * @param salarioInit salário inicial do funcionário
     */
    SobreCargaConstrutores(String nomeInit, String cargoInit,
                int idadeInit, double salarioInit){
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
        salario = salarioInit;
        departamento = "Não definido";
        ativo = true;
    }
    
    /**
     * Construtor padrão (default) sem parâmetros
     * Cria um objeto com valores padrão dos atributos
     */
    SobreCargaConstrutores(){
        nome = "Não informado";
        cargo = "Não definido";
        idade = 0;
        salario = 0.0;
        departamento = "Não definido";
        ativo = false;
    }

    /**
     * Construtor que inicializa apenas nome e cargo
     * Útil para funcionários em processo de contratação
     * @param nomeInit nome inicial do funcionário
     * @param cargoInit cargo inicial do funcionário
     */
    SobreCargaConstrutores(String nomeInit, String cargoInit){
        nome = nomeInit;
        cargo = cargoInit;
        idade = 0;
        salario = 0.0;
        departamento = "Não definido";
        ativo = false;
    }

    /**
     * Construtor que inicializa nome, cargo e departamento
     * @param nomeInit nome inicial do funcionário
     * @param cargoInit cargo inicial do funcionário
     * @param departamentoInit departamento inicial do funcionário
     */
    SobreCargaConstrutores(String nomeInit, String cargoInit, String departamentoInit){
        nome = nomeInit;
        cargo = cargoInit;
        departamento = departamentoInit;
        idade = 0;
        salario = 0.0;
        ativo = true;
    }

    /**
     * Construtor que inicializa todos os atributos incluindo departamento e status
     * @param nomeInit nome inicial do funcionário
     * @param cargoInit cargo inicial do funcionário
     * @param idadeInit idade inicial do funcionário
     * @param salarioInit salário inicial do funcionário
     * @param departamentoInit departamento inicial do funcionário
     * @param ativoInit status ativo do funcionário
     */
    SobreCargaConstrutores(String nomeInit, String cargoInit, int idadeInit, 
                          double salarioInit, String departamentoInit, boolean ativoInit){
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
        salario = salarioInit;
        departamento = departamentoInit;
        ativo = ativoInit;
    }

    /**
     * Método para exibir informações do funcionário de forma formatada
     */
    public void exibirInformacoes(){
        System.out.println("=== Informações do Funcionário ===");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Status: " + (ativo ? "Ativo" : "Inativo"));
        System.out.println("================================");
    }

    /**
     * Método principal que demonstra a criação de objetos usando diferentes construtores
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args){
        System.out.println("=== DEMONSTRAÇÃO DE SOBRECARGA DE CONSTRUTORES ===\n");

        // Exemplo 1: Construtor padrão (sem parâmetros)
        System.out.println("1. Funcionário criado com construtor padrão:");
        SobreCargaConstrutores funcionario1 = new SobreCargaConstrutores();
        funcionario1.exibirInformacoes();

        // Exemplo 2: Construtor com nome e cargo apenas
        System.out.println("\n2. Funcionário em processo de contratação:");
        SobreCargaConstrutores funcionario2 = new SobreCargaConstrutores("Maria Silva", "Analista");
        funcionario2.exibirInformacoes();

        // Exemplo 3: Construtor com nome, cargo e departamento
        System.out.println("\n3. Funcionário com departamento definido:");
        SobreCargaConstrutores funcionario3 = new SobreCargaConstrutores("João Santos", "Desenvolvedor", "TI");
        funcionario3.exibirInformacoes();

        // Exemplo 4: Construtor com todos os dados básicos
        System.out.println("\n4. Funcionário com dados completos:");
        SobreCargaConstrutores funcionario4 = new SobreCargaConstrutores("Ana Costa", "Gerente", 35, 8000.0);
        funcionario4.exibirInformacoes();

        // Exemplo 5: Construtor com todos os atributos incluindo status
        System.out.println("\n5. Funcionário com todos os dados incluindo status:");
        SobreCargaConstrutores funcionario5 = new SobreCargaConstrutores("Carlos Lima", "Diretor", 45, 15000.0, "Administrativo", true);
        funcionario5.exibirInformacoes();

        // Exemplo 6: Funcionário inativo
        System.out.println("\n6. Funcionário inativo:");
        SobreCargaConstrutores funcionario6 = new SobreCargaConstrutores("Pedro Alves", "Assistente", 28, 3000.0, "RH", false);
        funcionario6.exibirInformacoes();

        System.out.println("\n=== RESUMO DOS CONSTRUTORES DISPONÍVEIS ===");
        System.out.println("1. SobreCargaConstrutores() - Construtor padrão");
        System.out.println("2. SobreCargaConstrutores(String nome, String cargo) - Nome e cargo");
        System.out.println("3. SobreCargaConstrutores(String nome, String cargo, String departamento) - Nome, cargo e departamento");
        System.out.println("4. SobreCargaConstrutores(String nome, String cargo, int idade, double salario) - Dados básicos");
        System.out.println("5. SobreCargaConstrutores(String nome, String cargo, int idade, double salario, String departamento, boolean ativo) - Todos os dados");
    }
}
