public class Passaro extends Animal {
    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Piu Piu!");
    }
}