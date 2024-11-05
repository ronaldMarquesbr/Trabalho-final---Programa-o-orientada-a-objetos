import java.time.LocalDate;


public class Cartao {
    private String apelido;
    private String numero;
    private int limite;
    private int diaAbertura;
    private int diaFechamento;
    private int diaVencimento;

    public Cartao(String apelido, String numero, int limite, int diaAbertura, int diaFechamento, int diaVencimento) {
        this.apelido = apelido;
        this.numero = numero;
        this.limite = limite;
        this.diaAbertura = diaAbertura;
        this.diaFechamento = diaFechamento;
        this.diaVencimento = diaVencimento;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNumero() {
        return numero;
    }

    public int getLimite() {
        return limite;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getDiaAbertura() {
        return diaAbertura;
    }

    public void setDiaAbertura(int diaAbertura) {
        this.diaAbertura = diaAbertura;
    }

    public int getDiaFechamento() {
        return diaFechamento;
    }

    public void setDataFechamento(int diaFechamento) {
        this.diaFechamento = diaFechamento;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
}
