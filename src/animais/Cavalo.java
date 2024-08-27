package animais;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz hii hii!");
    }

    public void correr() {
        System.out.println(getNome() + " está correndo!");
    }
}
