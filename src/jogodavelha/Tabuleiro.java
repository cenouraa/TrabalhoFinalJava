package jogodavelha;

public class Tabuleiro  {
    private String[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new String[3][3];
    }

    public void imprimeTabuleiro() {
        for (String[] strings : tabuleiro) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (j + 1 != tabuleiro.length)
                    System.out.print(strings[j] + " | ");
                else
                    System.out.print(strings[j]);
            }
            System.out.println();
        }
    }

    public boolean fazerJogada(int linha, int coluna, String marca) {
        if(tabuleiro[linha][coluna] == null) {
            tabuleiro[linha][coluna] = marca;
            return true;
        }
        return false;
    }
}
