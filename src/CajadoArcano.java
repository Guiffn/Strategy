
public class CajadoArcano implements Arma {
    public String getNome() { return "Cajado Arcano"; }
    public int getDanoBase() { return 8; }
    public int getCustoMana() { return 25; }
    public boolean podeEquipar(Personagem personagem) {
        return personagem.inteligencia >= 12;
    }
    public void atacar(Personagem atacante, Personagem alvo, Batalha batalha) {
        if (atacante.getMana() >= getCustoMana()) {
            atacante.setMana(atacante.getMana() - getCustoMana());
            alvo.receberDano(getDanoBase());
            alvo.adicionarEfeito(new Queimadura(10, 2));
        }
    }
}
