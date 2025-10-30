import java.util.*;

public class Batalha {
    private List<Personagem> personagens = new ArrayList<>();
    private int turnoAtual = 0;

    public void adicionarPersonagem(Personagem p) {
        personagens.add(p);
    }

    public void iniciar() {
        turnoAtual = 1;
        // ... lógica de início de batalha ...
    }

    public void proximoTurno() {
        turnoAtual++;
        for (Personagem p : personagens) {
            p.processarEfeitos();
            p.aplicarPassiva();
        }
        // ... lógica de turnos ...
    }

    public boolean verificarVitoria() {
        // ... lógica de vitória/derrota ...
        return false;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }
}
