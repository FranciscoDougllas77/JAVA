//Exercício: Nível de Satisfação
public class ex_nivelSatisfacao {
    public static void main(String[] args) {
        int nivelSatisfacao = 3; // Exemplo de nível de satisfação (1 a 5)

        String mensagem = switch (nivelSatisfacao) {
            case 1 -> "Muito insatisfeito";
            case 2 -> "Insatisfeito";
            case 3 -> "Neutro";
            case 4 -> "Satisfeito";
            case 5 -> "Muito satisfeito";
            default -> "Nível de satisfação inválido";
        };

        System.out.println("Nível de satisfação: " + mensagem);
    }
    
}
