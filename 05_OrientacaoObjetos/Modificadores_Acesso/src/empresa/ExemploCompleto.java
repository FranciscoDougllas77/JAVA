package empresa;

public class ExemploCompleto {
    public static void main(String[] args) {
        System.out.println("=== Demonstração de Funcionários ===");
        
        // Usando diferentes construtores (sobrecarga)
        Funcionario f1 = new Funcionario("João", 2000.0);
        Funcionario f2 = new Funcionario("Maria"); // Usa salário base
        
        // Usando métodos estáticos
        System.out.println("\nTotal de funcionários: " + Funcionario.getTotalFuncionarios());
        System.out.println("Salário base atual: " + Funcionario.getSalarioBase());
        
        // Alterando salário base (método estático)
        Funcionario.setSalarioBase(1600.0);
        System.out.println("Novo salário base: " + Funcionario.getSalarioBase());
        
        System.out.println("\n=== Demonstração de Gerentes ===");
        
        // Usando diferentes construtores de Gerente
        Gerente g1 = new Gerente("Carlos", 5000.0, 0.15); // bônus específico
        Gerente g2 = new Gerente("Ana", 4500.0);          // bônus padrão
        Gerente g3 = new Gerente("Pedro");                // salário base e bônus padrão
        
        // Demonstrando herança e sobrescrita
        System.out.println("\nInformações do Gerente:");
        g1.mostrarSalario();
        g1.calcularSalarioComBonus();
        
        // Demonstrando sobrecarga de métodos
        System.out.println("\nDemonstrando aumentos de salário:");
        f1.AlteraMostrarSalario(f1, 500);                  // aumento fixo
        f2.AlteraMostrarSalario(f2, 10, true);            // aumento percentual
        
        // Mostrando total final de funcionários
        System.out.println("\nTotal final de funcionários: " + Funcionario.getTotalFuncionarios());
    }
} 