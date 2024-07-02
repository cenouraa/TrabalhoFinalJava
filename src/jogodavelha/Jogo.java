package jogodavelha;

public class Jogo {
    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogadorAtual;

    public Jogo() {
        tabuleiro = new Tabuleiro();
        jogador1 = new Jogador("X", 1);
        jogador2 = new Jogador("O", 2);
        jogadorAtual = jogador1;
    }

    public void iniciarJogo() {
        System.out.println("Vez de Jogador " + jogadorAtual.getValor());
        tabuleiro.imprimeTabuleiro();
    }

    private void alternarTurno() {
        jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
    }
}
