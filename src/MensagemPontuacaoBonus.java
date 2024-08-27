public enum MensagemPontuacaoBonus {
    NIVEL1("Parabens você conseguiu a maior pontuação no nivel facil agora tente um nivel mais dificil!!!"),
    NIVEL2("Parabens você conseguiu a maior pontuação no nivel médio agora testa a sorte no extremo!!!"),
    NIVEL3("Parabens você conseguiu a maior pontuação do jogo já dá pra jogar na mega sena!!!");

    private final String mensagemPontuacaoBonus;

    MensagemPontuacaoBonus(String mensagemPontuacaoBonus) {
        this.mensagemPontuacaoBonus = mensagemPontuacaoBonus;
    }

    public String getMensagemPontuacaoBonus() {
        return mensagemPontuacaoBonus;
    }
}
