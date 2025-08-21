public class switch_caseAntigo {
    public static void main(String[] args) {
        int nivelSatisfacao = 3; // Exemplo de nível de satisfação (1 a 5)
        String mensagem;

        switch (nivelSatisfacao) {
            case 1:
                mensagem = "Muito insatisfeito";
                break;
            case 2:
                mensagem = "Insatisfeito";
                break;
            case 3:
                mensagem = "Neutro";
                break;
            case 4:
                mensagem = "Satisfeito";
                break;
            case 5:
                mensagem = "Muito satisfeito";
                break;
            default:
                mensagem = "Nível de satisfação inválido";
        }

        System.out.println("Nível de satisfação: " + mensagem);
    }
}
