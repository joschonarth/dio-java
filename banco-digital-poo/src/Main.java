public class Main {

    public static void main(String[] args) {
        
        Cliente joao = new Cliente();
        joao.setNome("Joao Otavio");
        
        Conta corrente = new ContaCorrente(joao);
        Conta poupanca = new ContaPoupanca(joao);
        
        corrente.depositar(100);
        corrente.transferir(50, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
