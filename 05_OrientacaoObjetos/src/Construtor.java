public class Construtor {
    String nome;
    String cargo;
    int idade;
    double salario;

    //Este e o Construtor
    // Construtor(String nome, String cargo, int idade, double salario){
    //     this.nome = nome;
    //     this.idade = idade;
    //     this.cargo = cargo;
    //     this.salario = salario;
    //}

    //Caso não queira utiliza o this
     Construtor(String nomeInit, String cargoInit, int idadeInit, double salarioInit){
        nome = nomeInit;
        idade = idadeInit;
        cargo = cargoInit;
        salario = salarioInit;
    }

    public static void main(String[] args){
        Construtor funcionario1 = new Construtor("João", "Desenvolvedor", 49, 2345.56);

        Construtor funcionario2 = new Construtor("Mateus", "Gerente", 60, 5678.56);

        System.out.println(funcionario1.nome + funcionario1.cargo + funcionario1.idade + funcionario1.salario);
        System.out.println(funcionario2);
    }
}
