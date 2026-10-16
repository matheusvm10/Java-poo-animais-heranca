public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro("Rex");
        animais[1] = new Gato("Felix");
        animais[2] = new Passaro("Piu");

        System.out.println("=== SISTEMA DE ANIMAIS ===");

        for (Animal animal : animais) {
            animal.emitirSom();
            System.out.println("----------------");
        }
    }
}