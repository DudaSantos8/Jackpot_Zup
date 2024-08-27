public enum ValoresDoJogo {
    BANANA(10, "Banana"),
    MORANGO(20, "Morango"),
    ESTRELA(40, "Estrela"),
    CARRINHO(45, "Carrinho"),
    RATO(50, "Rato"),
    PIZZA(60, "Pizza"),
    FOGUETE(70, "Foguete");

    private final int pontos;
    private final String nome;

    ValoresDoJogo(int pontos, String nome) {
        this.pontos = pontos;
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Fruta Sorteada: "+ nome +
                "\nPontos da fruta: " + pontos + "\n";
    }
}
