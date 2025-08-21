//Comentários em Java
// Comentários são uma parte essencial da programação, pois ajudam a documentar o código e a torná-lo mais legível. Em Java, existem três tipos principais de comentários:
// 1. Comentários de linha única: Começam com `//` e se estendem até o final da linha.
// 2. Comentários de múltiplas linhas: Começam com `/*` e terminam com `*/`, permitindo que você escreva comentários que se estendem por várias linhas.
// 3. Comentários Javadoc: Começam com `/**` e são usados para documentar classes, métodos e campos, permitindo a geração de documentação automática.
// Comentários são ignorados pelo compilador e não afetam a execução do programa, mas são extremamente úteis para explicar o propósito do código, fornecer contexto e facilitar a manutenção futura.

public class comentarios {
    public static void main(String[] args) {
        // Este é um comentário de linha única
        System.out.println("Exemplo de comentário de linha única");

        /* Este é um comentário de múltiplas linhas
           que pode se estender por várias linhas */
        System.out.println("Exemplo de comentário de múltiplas linhas");

        /**
         * Este é um comentário Javadoc
         * que pode ser usado para documentar classes, métodos e campos.
         */
        System.out.println("Exemplo de comentário Javadoc");
    }  
}
