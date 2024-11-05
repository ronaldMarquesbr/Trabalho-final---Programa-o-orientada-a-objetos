public abstract class Conta {
    protected String nomeProprietario;
    protected String nome;
    protected String cpf;
    protected Banco banco;

    public Conta (String nome, String nomeProprietario, String cpf, Banco banco) {
        this.nome = nome;
        this.nomeProprietario = nomeProprietario;
        this.cpf = cpf;
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario (String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
