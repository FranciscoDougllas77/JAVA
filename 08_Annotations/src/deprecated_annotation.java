// Exemplo completo da anotação @Deprecated em Java

class RegrasAposentadoria {

    /**
     * @deprecated Este método está obsoleto. 
     * Use mostrarNovasRegrasParaAposentadoria() em seu lugar.
     */
    @Deprecated
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras para aposentadoria (OBSOLETO)");
    }

    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("Novas regras para aposentadoria");
    }
}

public class deprecated_annotation {
    public static void main(String[] args) {
        RegrasAposentadoria regras = new RegrasAposentadoria();

        // Utilizando método obsoleto (irá gerar um aviso de deprecated)
        regras.mostrarRegrasParaAposentadoria();

        // Utilizando o método novo recomendado
        regras.mostrarNovasRegrasParaAposentadoria();
    }
}
