// Exemplo completo de utilização do final em variáveis, métodos e classes

// Variável final: valor não pode ser alterado após atribuição
public class ExemploFinal {

    // Atributo final
    final int valorConstante = 100;

    public static void main(String[] args) {
        final int x = 10; // variável local final
        System.out.println("Valor de x: " + x);

        // x = 20; // Isso causaria erro de compilação, pois x é final

        ExemploFinal exemplo = new ExemploFinal();
        System.out.println("Valor constante: " + exemplo.valorConstante);

        // exemplo.valorConstante = 200; // Isso também causaria erro
    }
}

// Classe final: não pode ser estendida
final class ClasseFinal {
    public void mostrarMensagem() {
        System.out.println("Esta é uma classe final.");
    }
}

// class SubClasse extends ClasseFinal {} // Isso causaria erro de compilação

// Método final: não pode ser sobrescrito por subclasses
class ClasseBase {
    public final void metodoFinal() {
        System.out.println("Este método não pode ser sobrescrito.");
    }
}

class SubClasse extends ClasseBase {
    // public void metodoFinal() {} // Isso causaria erro de compilação
}