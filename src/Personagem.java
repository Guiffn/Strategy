import java.util.*;

public abstract class Personagem {
    protected String nome;
    protected int vida, mana, forca, destreza, inteligencia;
    protected Arma arma;
    protected List<StatusEffect> efeitos = new ArrayList<>();

    public Personagem(String nome) {
        this.nome = nome;
    }

    public abstract void aplicarPassiva();
    public abstract boolean podeUsarArma(Arma arma);

    public void equiparArma(Arma arma) {
        if (podeUsarArma(arma) && arma.podeEquipar(this)) {
            this.arma = arma;
        }
    }

    public void atacar(Personagem alvo, Batalha batalha) {
        if (arma != null) {
            arma.atacar(this, alvo, batalha);
        }
    }

    public void receberDano(int dano) {
        this.vida -= dano;
    }

    public void adicionarEfeito(StatusEffect efeito) {
        efeitos.add(efeito);
    }

    public void processarEfeitos() {
        Iterator<StatusEffect> it = efeitos.iterator();
        while (it.hasNext()) {
            StatusEffect e = it.next();
            e.aoFinalDoTurno(this);
            if (!e.estaAtivo()) it.remove();
        }
    }

    // Getters e setters
    public int getVida() { return vida; }
    public int getMana() { return mana; }
    public void setMana(int mana) { this.mana = mana; }
    public String getNome() { return nome; }
}
