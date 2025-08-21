public class TernarioSimples {
    public static void main(String[] args){
        double nota1 = 47.67;
        double nota2 = 48.90;
        double nota3 = 55.45;
        double nota4 = 53.56;

        double mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A Media do Aluno e de: "+mediaAluno);

        String Resultado = mediaAluno >= 70 ? "Aprovado" : (mediaAluno >= 60 ? "Recuperacao" : "Reprovado");

        System.out.println(Resultado);
    }
    
}
