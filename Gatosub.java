class Gato extends Mamifero {
    private String raca;

    public Gato(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return nome + " está miando!";
    }
}
