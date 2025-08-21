// Exemplo de uso de estruturas condicionais if, else if e else em Java
// Este programa avalia a média de um aluno e imprime o resultado conforme a nota

public class Condicao_If_Else {
    public static void main(String[] args){
        // Definindo a média do aluno (pode ser alterada para testar outros valores)
        double nota1 = 47.67;
        double nota2 = 48.90;
        double nota3 = 55.45;
        double nota4 = 53.56;

        double mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

        // Verifica se a média é maior ou igual a 70
        if(mediaAluno >= 70){
            System.out.println("O Aluno está com média de: " + mediaAluno);
            System.out.println("O Aluno está Aprovado");
        }
        // Se não for maior ou igual a 70, verifica se está entre 50 e 69 (inclusive)
        else if(mediaAluno >= 50 && mediaAluno <= 69){
            System.out.println("O Aluno está com média de: " + mediaAluno);
            System.out.println("Ele está de Recuperação");
        }
        // Se não for nenhum dos casos acima, verifica se a média é menor que 50
        else if(mediaAluno < 50){
            System.out.println("O Aluno está com média de: " + mediaAluno);
            System.out.println("O Aluno está Reprovado.");
        }
        // Caso nenhuma das condições seja atendida (situação improvável)
        else{
            System.out.println("Não foi possível calcular a média.");
        }
    }
}
