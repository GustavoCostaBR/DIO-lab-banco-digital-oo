import com.allogica.Entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Banco santander = new Banco("Santander");
        Cliente gustavo = new Cliente();
        gustavo.setNome("Gustavo");

        Conta cc = new ContaCorrente(gustavo, santander);
        Conta poupanca = new ContaPoupanca(gustavo, santander);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        santander.imprimirListaContasInfoPrivadas();
        santander.imprimirListaContasInfoPublicas();
    }
}