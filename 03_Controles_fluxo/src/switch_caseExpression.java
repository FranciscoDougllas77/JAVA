//switch-case expression
// A partir do Java 12, é possível usar a expressão switch para retornar valores diretamente
// sem a necessidade de usar uma variável auxiliar ou o comando break.

public class switch_caseExpression {
    public static void main(String[] args){
        int day = 3; // Exemplo de dia da semana (1 a 7)

        String dayNome = switch (day){
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Dia inválido";
        };
        System.out.println("O dia da semana é: " + dayNome);
       
    }
    
}
