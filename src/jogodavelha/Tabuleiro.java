package jogodavelha;

public class Tabuleiro  {
    private String[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new String[3][3];
    }

    public void imprimeTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((tabuleiro[i][j] == null ? "-" : tabuleiro[i][j]));
                if (j + 1 != 3) {
                    System.out.print(" | ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public boolean fazerJogada(int linha, int coluna, String simbolo) {
        if(linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == null) {
            tabuleiro[linha][coluna] = simbolo;
            return true;
        }
        return false;
    }

    public boolean tabuleiroCompleto() {
        for(int i=0; i < tabuleiro.length; i++) {
            for(int j=0; j < tabuleiro.length; j++) {
                if(tabuleiro[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean verificaVitoria(String marca) {
        for(int i=0; i < tabuleiro.length; i++) {
            if((tabuleiro[i][0] == marca && tabuleiro[i][1] == marca && tabuleiro[i][2] == marca) || (tabuleiro[0][i] == marca && tabuleiro[1][i] == marca && tabuleiro[2][i] == marca)) {
                return true;
            }
            if((tabuleiro[0][0] == marca && tabuleiro[1][1] == marca && tabuleiro[2][2] == marca || (tabuleiro[0][2] == marca && tabuleiro[1][1] == marca && tabuleiro[2][0] == marca))) {
                return true;
            }
        }
        return false;
    }
}
