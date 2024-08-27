package zoologico;
import veterinario.Veterinario;
import animais.Animal;
import animais.Cachorro;
import animais.Cavalo;
import animais.Preguica;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];

        jaulas[0] = new Cachorro("Mustafa", 10);
        jaulas[1] = new Cavalo("Simba", 3);
        jaulas[2] = new Preguica("Timão", 8);

    }

    public void mostrarAnimais() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();
                if (animal instanceof Cachorro) {
                    ((Cachorro) animal).correr();
                } else if (animal instanceof Cavalo) {
                    ((Cavalo) animal).correr();
                } else if (animal instanceof Preguica) {
                    ((Preguica) animal).subirEmArvore();
                }
            }
        }
    }

    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        zoologico.mostrarAnimais();

        Veterinario veterinario = new Veterinario();
        for (Animal animal : zoologico.jaulas) {
            if (animal != null) {
                veterinario.examinar(animal);
            }
        }
    }
}
