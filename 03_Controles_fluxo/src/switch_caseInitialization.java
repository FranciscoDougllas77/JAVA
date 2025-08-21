//switch-case Initialization
//
public class switch_caseInitialization {
    public static void main(String[] args){
        int day = 5;

        String tipoDia = switch (day) {
            case 1, 7 -> "Fim de semana"; // Domingo e Sábado
            case 2, 3, 4, 5, 6 -> "Dia da semana"; // Segunda a Sexta
            default -> "Dia inválido"; // Qualquer outro valor
        };
        System.out.println("O dia é: " + tipoDia);

        // Exemplo de uso com uma variável auxiliar
        String tipoDiaAuxiliar;
        switch (day) {
            case 1, 7 -> tipoDiaAuxiliar = "Fim de semana"; // Domingo e Sábado
            case 2, 3, 4, 5, 6 -> tipoDiaAuxiliar = "Dia da semana"; // Segunda a Sexta
            default -> tipoDiaAuxiliar = "Dia inválido"; // Qualquer outro valor
        }
        System.out.println("O dia (com variável auxiliar) é: " + tipoDiaAuxiliar);
    }
}
