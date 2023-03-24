public class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}

public class Sacar {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000.0);

        double valorSaque = 500.0;

        if (conta.sacar(valorSaque)) {
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso. Saldo atual: R$" + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valorSaque);
        }
    }
}

public class Transferir {
    public static void main(String[] args) {
        ContaBancaria contaOrigem = new ContaBancaria("João", 1000.0);
        ContaBancaria contaDestino = new ContaBancaria("Maria", 2000.0);

        double valorTransferencia = 500.0;

        if (contaOrigem.sacar(valorTransferencia)) {
            contaDestino.depositar(valorTransferencia);
            System.out.println("Transferência de R$" + valorTransferencia + " realizada com sucesso. Saldo atual da conta de origem: R$" + contaOrigem.getSaldo() + ". Saldo atual da conta de destino: R$" + contaDestino.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para transferência de R$" + valorTransferencia);
        }
    }
}
