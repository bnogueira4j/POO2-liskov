public class ContaCorrente extends ContaBancaria implements OperacaoFatura{
    private double taxaManutencao;

    public ContaCorrente(double saldoInicial, double taxaManutencao) {
        super(saldoInicial);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + taxaManutencao);
    }

    @Override
    public void imprimirFatura() {
        System.out.println("Imprimindo fatura da conta corrente!");
    }
}
