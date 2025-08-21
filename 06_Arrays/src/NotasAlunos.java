public class NotasAlunos {
    public static void main(String[] args){
        double[] notas = new double[]{5.67, 7.5, 10, 8.6, 9};

        for(double nota: notas){
            System.out.println(nota);
        }

        for(int i = 1; i < notas.length; i ++){
            System.out.println("A Nota: "+i+" e :"+notas[i]);
        }
    }
}
