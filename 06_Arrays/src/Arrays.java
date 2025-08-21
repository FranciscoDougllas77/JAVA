
public class Arrays {
    /**
     * Classe demonstrativa sobre Arrays em Java
     * Um array é uma estrutura de dados que armazena um conjunto fixo de elementos do mesmo tipo
     */

    public static void main(String[] args){
        // Declaração do array: Define um array de inteiros, mas ainda não aloca memória
        int[] meuArray;

        // Primeira forma de criar e inicializar um array:
        // 1. Aloca memória para 3 elementos
        meuArray = new int[3];

        // 2. Atribui valores individualmente a cada posição
        meuArray[0] = 23;  // Primeira posição (índice 0)
        meuArray[1] = 42;  // Segunda posição (índice 1)
        meuArray[2] = 100; // Terceira posição (índice 2)

        // Segunda forma de criar e inicializar um array (forma mais concisa):
        // Cria o array e já atribui os valores em uma única linha
        meuArray = new int[]{23, 42, 100};

        // Imprimindo os valores do array:
        // Acessa e exibe cada elemento do array usando seu índice
        System.out.println(meuArray[0]); // Imprime o primeiro elemento
        System.out.println(meuArray[1]); // Imprime o segundo elemento
        System.out.println(meuArray[2]); // Imprime o terceiro elemento

        //Alterando Elementos do Array
        meuArray[1] = 33;
        System.out.println(meuArray[1]);


        //Percorrendo um Array com For
        for(int i = 0; i < meuArray.length; i++){
            System.out.println("Na posicao: "+ i + " Temos " + meuArray[i]);
        }

        //Percorrendo um Array com For-Each
        for(int valor: meuArray){
            System.out.println(valor);
        }

    }
}