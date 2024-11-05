import java.time.LocalDate;

public class Transferencia extends Transacao {
    private Conta contaDestino;

    public Transferencia(String nome, int valor,
                         LocalDate data, Categoria categoria, boolean concluida,
                         boolean recorrente, boolean entrada, Conta contaDestino) {
        super(nome, valor, data, categoria, concluida, recorrente, entrada);
        this.contaDestino = contaDestino;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }
}
