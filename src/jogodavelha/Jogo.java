package jogodavelha;

import entradados.Console;
import java.util.Scanner;

public class Jogo {
    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogadorAtual;
    private Jogada jogada;

    public Jogo() {
        tabuleiro = new Tabuleiro();
        jogador1 = new Jogador("X", 1);
        jogador2 = new Jogador("O", 2);
        jogadorAtual = jogador1;

    }

    public void iniciarJogo() {
        while(!tabuleiro.tabuleiroCompleto()) {
            System.out.println("Vez de Jogador " + jogadorAtual.getValor());
            tabuleiro.imprimeTabuleiro();
            realizarJogada(jogadorAtual);
            if(tabuleiro.verificaVitoria(jogadorAtual.getSimbolo())) {
                System.out.println("O jogador " + jogadorAtual.getValor() + " venceu!");
                break;
            }
            alternarTurno();
        }
        if(tabuleiro.tabuleiroCompleto()) {
            System.out.println("O jogo terminou em empate!");
        }
    }

    private void alternarTurno() {
        jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
    }

    private void realizarJogada(Jogador jogador) {
        jogada = new Jogada();
        boolean jogadaValida;
        do {
            jogada.setLinha(Console.lerInt("Linha da jogada: ") -1);
            jogada.setColuna(Console.lerInt("Coluna da jogada: ") -1);
            jogadaValida = tabuleiro.fazerJogada(jogada.getLinha(), jogada.getColuna(), jogador.getSimbolo());
            if(!jogadaValida) {
                System.out.println("Jogada inválida. Tente novamente.");
                tabuleiro.imprimeTabuleiro();
            }
        }
        while(!jogadaValida);
    }
}
