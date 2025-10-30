import java.util.Random;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome);
        this.forca = 8;
        this.destreza = 15;
        this.inteligencia = 7;
        this.vida = 90;
        this.mana = 80;
    }
    @Override
    public void aplicarPassiva() {
        // Esquiva: 25% de chance de evitar ataque
    }
    @Override
    public boolean podeUsarArma(Arma arma) {
        return arma.getNome().contains("Arco") || arma.getNome().contains("Adaga");
    }
    @Override
    public void receberDano(int dano) {
        Random rand = new Random();
        if (rand.nextInt(100) < 25) {
            // Esquivou
            return;
        }
        super.receberDano(dano);
    }
}
