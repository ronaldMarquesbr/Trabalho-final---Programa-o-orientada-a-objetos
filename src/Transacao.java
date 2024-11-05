import java.time.LocalDate;

public abstract class Transacao {
    private String nome;
    private int valor;
    private LocalDate data;
    private Categoria categoria;
    private boolean concluida;
    private boolean recorrente;
    private final boolean entrada;

    public Transacao(String nome, int valor,
                     LocalDate data, Categoria categoria,
                     boolean concluida, boolean recorrente, boolean entrada) {
        this.nome = nome;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
        this.concluida = concluida;
        this.recorrente = recorrente;
        this.entrada = entrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public boolean getRecorrente() {
        return recorrente;
    }

    public void setRecorrente(boolean recorrente) {
        this.recorrente = recorrente;
    }

    public boolean getEntrada() {
        return entrada;
    }
}
