public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(double saldoInicial, double taxaRendimento) {
        super(saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo *= (1 + taxaRendimento);
    }
}
