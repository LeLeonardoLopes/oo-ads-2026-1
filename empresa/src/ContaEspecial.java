public class ContaEspecial extends ContaBancaria {

    // Atributo
    Double limite;

    // Construtor personalizado
    public ContaEspecial(
            Integer numConta,
            String titular,
            Double saldoInicial,
            Double limite
    ) {
        super(numConta, titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void exibirSaldo() {
        String msg = "Saldo da conta ESPECIAL nº %d de %s é R$ %.2f".formatted(this.getNumConta(), this.titular, this.saldo + this.limite);
        System.out.println(msg);
    }

    public void exibirSaldoReal() {
        String msg = "Saldo (real) da conta ESPECIAL nº %d de %s é R$ %.2f".formatted(this.getNumConta(), this.titular, this.saldo);
        System.out.println(msg);
    }
}
