public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome);
        this.forca = 5;
        this.destreza = 7;
        this.inteligencia = 18;
        this.vida = 70;
        this.mana = 150;
    }
    @Override
    public void aplicarPassiva() {
        // Regeneração de Mana: +10 mana por turno
        this.mana += 10;
    }
    @Override
    public boolean podeUsarArma(Arma arma) {
        return arma.getNome().contains("Cajado") || arma.getNome().contains("Adaga");
    }
}
