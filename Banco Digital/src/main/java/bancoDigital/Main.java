package bancoDigital;

import bancoDigital.modelo.*;

public class Main {
    public static void main(String[] args) {
        Cliente Ana = new Cliente();
        Ana.setNome("Ana");

        Conta cc = new ContaCorrente(Ana);
        Conta poupanca = new ContaPoupanca(Ana);

        cc.depositar(500);
        cc.transferir(250, poupanca);

        cc.imprimirExtrato();
        System.out.println();  
        poupanca.imprimirExtrato();
        System.out.println();  

        Cartao cartao = new Cartao("5509-3648-9786-4567", "07/28", "346", Ana, cc);
        cartao.realizarCompra(300);
        System.out.println();  

        Transacao transacao = new Transacao(150, "Compra", cc);
        System.out.println(String.format("Transação: %s no valor de %.2f", transacao.getTipo(), transacao.getValor()));
        System.out.println();  

        SeguroDeVida seguro = new SeguroDeVida("ABC123456789", 50000, Ana);
        seguro.ativar();
        System.out.println(); 
}

}