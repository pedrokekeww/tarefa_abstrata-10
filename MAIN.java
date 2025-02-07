public class Main {
    public static void main(String[] args) {
        Papagaio papagaio = new Papagaio("Loro");
        System.out.println(papagaio.voar());
        System.out.println(papagaio.emitirSom());

        Cachorro cachorro = new Cachorro("Rex", "Médio", "Labrador");
        System.out.println(cachorro.amamentar());
        System.out.println(cachorro.emitirSom());

        Gato gato = new Gato("Mia", "Persa");
        System.out.println(gato.amamentar());
        System.out.println(gato.emitirSom());
    }
}
