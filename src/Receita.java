import java.time.LocalDate;

public class Receita extends Transacao {
    public Receita(String nome, int valor, LocalDate data, Categoria categoria, boolean concluida, boolean recorrente) {
        super(nome, valor, data, categoria, concluida, recorrente, true);
    }
}
