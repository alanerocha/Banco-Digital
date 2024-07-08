package bancoDigital.modelo;

public class SeguroDeVida {
    private String numeroApolice;
    private double valorSegurado;
    private Cliente cliente;
    private boolean ativo;

    public SeguroDeVida(String numeroApolice, double valorSegurado, Cliente cliente) {
        this.numeroApolice = numeroApolice;
        this.valorSegurado = valorSegurado;
        this.cliente = cliente;
        this.ativo = false;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public double getValorSegurado() {
        return valorSegurado;
    }

    public void setValorSegurado(double valorSegurado) {
        this.valorSegurado = valorSegurado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void ativar() {
        this.ativo = true;
        System.out.println("Seguro de vida ativado para a cliente " + cliente.getNome());
    }

    @Override
    public String toString() {
        return String.format("SeguroDeVida{numeroApolice='%s', valorSegurado=%.2f, cliente=%s, ativo=%s}",
                numeroApolice, valorSegurado, cliente.getNome(), ativo);
    }
}
