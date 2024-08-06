import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Por favor, digite o número da Conta!");
        int numeroConta = Integer.parseInt(scanner.nextLine().trim());

        System.err.println("Por favor, digite o número da Agência!");
        String agenciaConta = scanner.nextLine().trim();

        System.err.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.nextLine().trim();
        
        System.err.println("Por favor, digite o saldo da conta!");
        double saldoConta = Double.parseDouble(scanner.nextLine().trim());

        ContaTerminal conta = new ContaTerminal(numeroConta, agenciaConta, nomeCliente, saldoConta);

        System.out.println("\nOlá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                           conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo R$ " + conta.getSaldo() +
                           " já está disponível para saque.");
        
        scanner.close();
    }
}

