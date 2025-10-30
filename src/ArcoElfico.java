
public class ArcoElfico implements Arma {
    public String getNome() { return "Arco Élfico"; }
    public int getDanoBase() { return 12; }
    public int getCustoMana() { return 15; }
    public boolean podeEquipar(Personagem personagem) {
        return personagem.destreza >= 8;
    }
    public void atacar(Personagem atacante, Personagem alvo, Batalha batalha) {
        if (atacante.getMana() >= getCustoMana()) {
            atacante.setMana(atacante.getMana() - getCustoMana());
            for (Personagem inimigo : batalha.getPersonagens()) {
                inimigo.receberDano(getDanoBase());
            }
        }
    }
}
