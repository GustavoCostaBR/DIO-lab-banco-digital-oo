package com.allogica.Entities;

public abstract class ContaAbstractIMPL implements Conta {



    private Banco banco;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public ContaAbstractIMPL(Cliente cliente, Banco banco) {
        this.cliente = cliente;
        this.banco = banco;
        banco.addConta(this);
    }


    @Override
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComunsPrivadas() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    protected void imprimirInfosComunsPublicas() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
    }

}
