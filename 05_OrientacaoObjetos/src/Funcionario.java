/**
 * Classe que representa um Funcionário com suas informações básicas.
 */
public class Funcionario {
    /** Dados do funcionário */
    String nome;
    String cargo;
    int idade;
    double salario;

    /**
     * Método principal para demonstração da classe
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Pedro";
        funcionario.salario = 1500;
        funcionario.idade = 40;
        funcionario.cargo = "Desenvolvedor de Software";

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Salario: " + funcionario.salario);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("Cargo: " + funcionario.cargo);
    }
}