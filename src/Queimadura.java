public class Queimadura implements StatusEffect {
    private int danoPorTurno;
    private int turnosRestantes;
    public Queimadura(int dano, int turnos) {
        this.danoPorTurno = dano;
        this.turnosRestantes = turnos;
    }
    public void aplicar(Personagem alvo) {}
    public void aoFinalDoTurno(Personagem alvo) {
        if (turnosRestantes > 0) {
            alvo.receberDano(danoPorTurno);
            turnosRestantes--;
        }
    }
    public boolean estaAtivo() { return turnosRestantes > 0; }
    public String getNome() { return "Queimadura"; }
}
