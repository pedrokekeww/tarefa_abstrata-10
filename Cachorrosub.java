class Cachorro extends Mamifero {
    private String tamanho;
    private String raca;

    public Cachorro(String nome, String tamanho, String raca) {
        super(nome);
        this.tamanho = tamanho;
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return nome + " está latindo!";
    }
}
