package com.allogica.Entities;

public class ContaCorrente extends ContaAbstractIMPL {
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComunsPrivadas();
    }
}
