import java.time.LocalDate;

public class DespesaCartao extends Transacao {
    private String numeroCartao;
    private int parcelado;
    public DespesaCartao (String nome, int valor,
                          LocalDate data, Categoria categoria, boolean concluida,
                          boolean recorrente, int parcelado, String numeroCartao){

        super(nome, valor, data, categoria, concluida, recorrente, false);
        this.parcelado = parcelado;
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getParcelado() {
        return parcelado;
    }

    public void setParcelado(int parcelado) {
        this.parcelado = parcelado;
    }
}
