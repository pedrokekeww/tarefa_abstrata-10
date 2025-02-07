class Papagaio extends Ave {
    public Papagaio(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return nome + " está imitando sons!";
    }
}
