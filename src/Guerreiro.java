public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome);
        this.forca = 15;
        this.destreza = 8;
        this.inteligencia = 5;
        this.vida = 120;
        this.mana = 50;
    }
    @Override
    public void aplicarPassiva() {
        // Pele Dura: reduz dano recebido em 20% (aplicado em receberDano)
    }
    @Override
    public boolean podeUsarArma(Arma arma) {
        return arma.getNome().contains("Espada") || arma.getNome().contains("Machado");
    }
    @Override
    public void receberDano(int dano) {
        super.receberDano((int)(dano * 0.8)); // Reduz 20%
    }
}
