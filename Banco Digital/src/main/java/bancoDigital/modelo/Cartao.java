package bancoDigital.modelo;

public class Cartao {
    private String numero;
    private String validade;
    private String cvv;
    private Cliente cliente;
    private Conta conta;

    public Cartao(String numero, String validade, String cvv, Cliente cliente, Conta conta) {
        this.numero = numero;
        this.validade = validade;
        this.cvv = cvv;
        this.cliente = cliente;
        this.conta = conta;
    }

    public String getNumero() {
        return numero;
    }

    public String getValidade() {
        return validade;
    }

    public String getCvv() {
        return cvv;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Conta getConta() {
        return conta;
    }

    public void realizarCompra(double valor) {
        conta.sacar(valor);
        System.out.println("Compra realizada no valor de: " + valor);
    }
}
