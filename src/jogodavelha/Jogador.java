package jogodavelha;

public class Jogador {
    private String simbolo;
    private int valor;

    public Jogador(String simbolo, int valor) {
        this.simbolo = simbolo;
        this.valor = valor;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public int getValor() {
        return valor;
    }
}
