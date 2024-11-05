import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario implements Balanco {
    private String nome;
    private final LocalDate dataCriacao;
    private final ArrayList<ContaPessoal> contas =  new ArrayList<>();
    public Usuario(String nome, LocalDate dataCriacao) {
        this.nome = nome;
        this.dataCriacao = dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void adicionarConta(ContaPessoal conta) {
        contas.add(conta);
    }

    public void removerConta(int indexConta) {
        contas.remove(indexConta);
    }

    @Override
    public int obterSaldo() {
        int saldo = 0;
        for (ContaPessoal conta : contas) {
            saldo += conta.obterSaldo();
        }

        return saldo;
    }

    @Override
    public int obterQuantidadeEntradas() {
        int quantidadeEntradas = 0;
        for (ContaPessoal conta : contas) {
            quantidadeEntradas += conta.obterQuantidadeEntradas();
        }

        return quantidadeEntradas;
    }

    @Override
    public int obterQuantidadeSaidas() {
        int quantidadeSaidas = 0;
        for (ContaPessoal conta : contas) {
            quantidadeSaidas += conta.obterQuantidadeSaidas();
        }

        return quantidadeSaidas;
    }

    @Override
    public int obterTotalEntradas() {
        int totalEntradas = 0;
        for (ContaPessoal conta : contas) {
            totalEntradas += conta.obterTotalEntradas();
        }

        return totalEntradas;
    }

    @Override
    public int obterTotalSaidas() {
        int totalSaidas = 0;
        for (ContaPessoal conta : contas) {
            totalSaidas += conta.obterTotalEntradas();
        }

        return totalSaidas;
    }

    @Override
    public void imprimirResumo() {
        System.out.println(STR."Usuario: \{nome} | Data de criacao: \{dataCriacao}");
        for (ContaPessoal conta : contas) {
            System.out.println(STR."\{conta.banco.getNome()}: \{conta.obterSaldo()}");
        }
        System.out.println("\n");
    }
}
