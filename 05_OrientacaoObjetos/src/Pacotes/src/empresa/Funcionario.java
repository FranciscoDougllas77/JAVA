package empresa;

public class Funcionario {
    String nome;
    int idade;
    double salario;
    String cargo;
    String empresa;

    public Funcionario(String nomeInit, int idadeInit,
                       double salarioInit, String cargoInit,
                       String empresaInit){
        nome = nomeInit;
        idade = idadeInit;
        salario = salarioInit;
        cargo = cargoInit;
        empresa = empresaInit;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Empresa: " + empresa);
    }

}
