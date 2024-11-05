import java.time.LocalDate;

public class Despesa extends Transacao {
    public Despesa (String nome, int valor,
                    LocalDate data, Categoria categoria,
                    boolean concluida, boolean recorrente) {
        super(nome, valor, data, categoria, concluida, recorrente, false);
    }

}
