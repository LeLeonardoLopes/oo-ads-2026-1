public class ContaBancaria {
    // Atributos
    // Protected: apenas a propria classe e seus decendentes tem acesso
    protected Double saldo;
    public String titular;

    // CONSTRUTOR PERSONALIZADO
    // Exige titular e saldo inicial para o objeto passar a existir
    public ContaBancaria(String titular, Double saldoInicial) {
        this.titular = titular;
        //this.saldo = saldoInicial;
        // Chama deposito() para ajustar o saldo inicial da conta,
        // passando pela validação existente no método
        this.depositar(saldoInicial);
    }
    // Métodos
    public void depositar(Double quantia) {
        if(quantia <= 0){
            throw new IllegalArgumentException("O valor deve ser positivo para deposito.");
        }
        this.saldo += quantia;
        System.out.println("Depósito de R$ " + quantia + " para " + this.titular);
    }

    public void sacar(Double quantia) {
        if (quantia > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        this.saldo -= quantia;
        System.out.println("O valor R$" + quantia + " foi sacado.");
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$ " + this.saldo);
    }
}

