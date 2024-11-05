import java.time.LocalDate;

public class DespesaCartao extends Transacao {
    private int parcelado;
    public DespesaCartao (String nome, int valor,
                          LocalDate data, Categoria categoria,
                          boolean concluida, boolean recorrente, int parcelado){

        super(nome, valor, data, categoria, concluida, recorrente, false);
        this.parcelado = parcelado;
    }

    public int getParcelado() {
        return parcelado;
    }

    public void setParcelado(int parcelado) {
        this.parcelado = parcelado;
    }
}
