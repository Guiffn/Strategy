public interface StatusEffect {
    void aplicar(Personagem alvo);
    void aoFinalDoTurno(Personagem alvo);
    boolean estaAtivo();
    String getNome();
}
