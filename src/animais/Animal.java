package animais;

public abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
