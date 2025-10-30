public class Main {
    public static void main(String[] args) {
        // Criação dos personagens
        Guerreiro guerreiro = new Guerreiro("Thorin");
        Arqueiro arqueiro = new Arqueiro("Legolas");
        Mago mago = new Mago("Gandalf");

        // Criação das armas
        EspadaLonga espada = new EspadaLonga();
        ArcoElfico arco = new ArcoElfico();
        CajadoArcano cajado = new CajadoArcano();

        // Equipando armas
        guerreiro.equiparArma(espada);
        arqueiro.equiparArma(arco);
        mago.equiparArma(cajado);

        // Criação da batalha
        Batalha batalha = new Batalha();
        batalha.adicionarPersonagem(guerreiro);
        batalha.adicionarPersonagem(arqueiro);
        batalha.adicionarPersonagem(mago);

        // Simulação de turnos
        for (int turno = 1; turno <= 3; turno++) {
            System.out.println("--- Turno " + turno + " ---");
            guerreiro.atacar(arqueiro, batalha);
            arqueiro.atacar(mago, batalha);
            mago.atacar(guerreiro, batalha);
            batalha.proximoTurno();
            System.out.println(guerreiro.getNome() + " Vida: " + guerreiro.getVida() + " Mana: " + guerreiro.getMana());
            System.out.println(arqueiro.getNome() + " Vida: " + arqueiro.getVida() + " Mana: " + arqueiro.getMana());
            System.out.println(mago.getNome() + " Vida: " + mago.getVida() + " Mana: " + mago.getMana());
        }
    }
}
