package bancoDigital.modelo;

public class Transacao {
    private double valor;
    private String tipo;
    private Conta conta;

    public Transacao(double valor, String tipo, Conta conta) {
        this.valor = valor;
        this.tipo = tipo;
        this.conta = conta;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public Conta getConta() {
        return conta;
    }
}
