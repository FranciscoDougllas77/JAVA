// Classe demonstrando variáveis locais e globais
public class VariavelLocalGlobal {

    // Variável global (de instância): pertence ao objeto da classe
    int maiorIdadeGlobal = 30;

    public static void main(String[] args){
        // Variável local: existe apenas dentro do método main
        int maiorIdade = 18;
        System.out.println("A idade e: "+maiorIdade);
        
        // Para acessar a variável global, precisamos de um objeto da classe
        VariavelLocalGlobal obj = new VariavelLocalGlobal();
        obj.metodo2();
    }

    // Método não estático, pode acessar variáveis de instância (globais)
    public void metodo2(){
        System.out.println("Valor da variavel Global = " + maiorIdadeGlobal);
    }
    
}
