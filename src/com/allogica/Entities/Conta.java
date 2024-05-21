package com.allogica.Entities;

public interface Conta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

    void setAgencia(int agencia);

    void setNumero(int numero);

}
