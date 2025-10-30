import java.util.Random;

public class EspadaLonga implements Arma {
    public String getNome() { return "Espada Longa"; }
    public int getDanoBase() { return 15; }
    public int getCustoMana() { return 0; }
    public boolean podeEquipar(Personagem personagem) {
        return personagem.forca >= 10;
    }
    public void atacar(Personagem atacante, Personagem alvo, Batalha batalha) {
        alvo.receberDano(getDanoBase());
        Random rand = new Random();
        if (rand.nextInt(100) < 30) {
            alvo.adicionarEfeito(new Sangramento(5, 3));
        }
    }
}
