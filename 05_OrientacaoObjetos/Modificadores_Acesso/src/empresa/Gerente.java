package empresa;

public class Gerente extends Funcionario {
    private double bonus;
    private static final double BONUS_PADRAO = 0.1; // 10% de bônus padrão

    // Construtor com bônus específico
    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    // Sobrecarga do construtor usando bônus padrão
    public Gerente(String nome, double salario) {
        this(nome, salario, BONUS_PADRAO);
    }

    // Sobrecarga do construtor usando salário base e bônus padrão
    public Gerente(String nome) {
        super(nome);
        this.bonus = BONUS_PADRAO;
    }

    // Método que sobrescreve mostrarSalario da classe pai
    @Override
    protected void mostrarSalario() {
        super.mostrarSalario();
        System.out.println("Bonus: " + (bonus * 100) + "%");
    }

    // Método específico da classe Gerente
    public void calcularSalarioComBonus() {
        double salarioBase = getSalarioBase();
        System.out.println("Salário base do gerente: " + salarioBase);
        System.out.println("Bônus aplicado: " + (bonus * 100) + "%");
        System.out.println("Total de funcionários na empresa: " + getTotalFuncionarios());
    }
} 