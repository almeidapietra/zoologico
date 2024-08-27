package animais;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz zzzz...");
    }

    public void subirEmArvore() {
        System.out.println(getNome() + " está subindo na árvore!");
    }
}