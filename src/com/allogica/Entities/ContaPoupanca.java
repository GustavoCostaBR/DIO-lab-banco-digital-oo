package com.allogica.Entities;

public class ContaPoupanca extends ContaAbstractIMPL {
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Pupança ===");
        super.imprimirInfosComunsPrivadas();
    }
}
