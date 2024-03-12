import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ContaCorrente> listaDeContasCorrente = new ArrayList<>();
        listaDeContasCorrente.add(new ContaCorrente(1000, 10));
        listaDeContasCorrente.add(new ContaCorrente(5000, 12));
        listaDeContasCorrente.add(new ContaCorrente(6000, 15));

        List<ContaPoupanca> listaDeContasPoupanca = new ArrayList<>();
        listaDeContasPoupanca.add(new ContaPoupanca(2000, 0.05));
        listaDeContasPoupanca.add(new ContaPoupanca(1000, 0.05));
        listaDeContasPoupanca.add(new ContaPoupanca(500, 0.05));

        List<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.addAll(listaDeContasCorrente);
        listaDeContas.addAll(listaDeContasPoupanca);


        // Polimorfismo esteira do pai
        listaDeContas.forEach(Main::realizarDepositoESaque);
        // esteira da conta corrente
        listaDeContasCorrente.forEach(Main::realizarImpressaoFatura);
        // esteira da conta pounpanca
        listaDeContasPoupanca.forEach(Main::realizarDepositoDeRedimentos);
    }

    public static void realizarDepositoESaque(ContaBancaria conta) {
        conta.sacar(100);
        conta.depositar(400);

        System.out.println("Saldo da conta bancaria: " + conta.getSaldo());
    }


    public static void realizarDepositoDeRedimentos(ContaPoupanca conta) {
       conta.aplicarRendimento();
        System.out.println("Saldo da conta bancaria: " + conta.getSaldo());
    }

    public static void realizarImpressaoFatura(OperacaoFatura fatura) {
        fatura.imprimirFatura();
    }
}
