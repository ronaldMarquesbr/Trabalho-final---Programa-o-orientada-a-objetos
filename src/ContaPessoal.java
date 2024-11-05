import java.util.ArrayList;

public class ContaPessoal extends Conta implements Balanco {
    private final ArrayList<Transacao> transacoes = new ArrayList<>();
    Cartao[] cartoes;

    public ContaPessoal(String nome, String nomeProprietario, String cpf, Banco banco) {
        super(nome, nomeProprietario, cpf, banco);
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public void removerTransacao(int indexTransacao) {
        try {
            transacoes.remove(indexTransacao);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(STR."Indice \{indexTransacao} está fora do intervalo!");
        }
    }

    public Transacao obterTransacaoPorNome(String nomeTransacao) {
        for (Transacao transacao : transacoes) {
            if (transacao.getNome().equals(nomeTransacao)) {
                return transacao;
            }
        }

        System.out.println(STR."Nenhuma transação com nome \{nomeTransacao} foi encontrada!");
        return null;
    }

    public void mostrarResumoTransacao(String nomeTransacao) {
        Transacao transacaoDesejada = obterTransacaoPorNome(nomeTransacao);
        System.out.println(STR."Transacao: \{transacaoDesejada.getNome()}\nValor: \{transacaoDesejada.getValor()}");
        System.out.println(STR."Data: \{transacaoDesejada.getData()}\n");
    }

    public void mostrarResumoTransacoes() {
        for (Transacao transacao : transacoes) {
            mostrarResumoTransacao(transacao.getNome());
        }
    }

    public int obterSaldo() {
        int saldo = 0;

        for (Transacao transacao : transacoes) {
            if (transacao.getEntrada()) {
                saldo += transacao.getValor();
            } else {
                saldo -= transacao.getValor();
            }
        }

        return saldo;
    }

    @Override
    public int obterQuantidadeEntradas() {
        int quantidadeEntradas = 0;

        for (Transacao transacao : transacoes) {
            if (transacao.getEntrada()) {
                quantidadeEntradas += 1;
            }
        }

        return quantidadeEntradas;
    }

    @Override
    public int obterQuantidadeSaidas() {
        int quantidadeSaidas = 0;

        for (Transacao transacao : transacoes) {
            if (!transacao.getEntrada()) {
                quantidadeSaidas += 1;
            }
        }

        return quantidadeSaidas;
    }

    @Override
    public int obterTotalEntradas() {
        int totalEntradas = 0;

        for (Transacao transacao : transacoes) {
            if (transacao.getEntrada()) {
                totalEntradas += transacao.getValor();
            }
        }

        return totalEntradas;
    }

    public int obterTotalSaidas() {
        int totalSaidas= 0;

        for (Transacao transacao : transacoes) {
            if (!transacao.getEntrada()) {
                totalSaidas += transacao.getValor();
            }
        }

        return totalSaidas;
    }

    @Override
    public void imprimirResumo() {
        System.out.println(STR."Conta: \{nome} | Proprietario: \{nomeProprietario}");
        System.out.println(STR."CPF: \{cpf} | Banco: \{banco.getNome()}");
        System.out.println(STR."Saldo: \{obterSaldo()}");
        System.out.println(STR."Entradas: \{obterTotalEntradas()} | Saidas: \{obterTotalSaidas()}");
        System.out.println("\n");
    }
}
