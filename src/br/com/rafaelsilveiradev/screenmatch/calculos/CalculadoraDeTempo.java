package br.com.rafaelsilveiradev.screenmatch.calculos;
import br.com.rafaelsilveiradev.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

}
