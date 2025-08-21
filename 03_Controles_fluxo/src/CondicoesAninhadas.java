public class CondicoesAninhadas {
    public static void main(String[] args){
        double nota1 = 47.67;
        double nota2 = 48.90;
        double nota3 = 55.45;
        double nota4 = 53.56;

        double mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A Media e de: " + mediaAluno+ " Pontos");

        if(mediaAluno > 0){
            if(mediaAluno >= 70){
                if(mediaAluno >= 90){
                    System.out.println("Parabens sua media e de: "+mediaAluno);
                }else{
                    System.out.println("AProvado com media de: "+mediaAluno);
                }
                
            }else if(mediaAluno < 70 && mediaAluno >= 60){
                System.out.println("Recuperacao com media de: "+mediaAluno);
                
            }else{
                System.out.println("Reprovado com media de: "+mediaAluno);
            }
        }else{
            System.out.println("Sua Media esta abaixo de 0");
        }
    }
    
}
