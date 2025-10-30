public class Atordoado implements StatusEffect {
    private int turnosRestantes;
    public Atordoado(int turnos) {
        this.turnosRestantes = turnos;
    }
    public void aplicar(Personagem alvo) {}
    public void aoFinalDoTurno(Personagem alvo) {
        if (turnosRestantes > 0) {
            // Lógica para impedir ação do personagem
            turnosRestantes--;
        }
    }
    public boolean estaAtivo() { return turnosRestantes > 0; }
    public String getNome() { return "Atordoado"; }
}
