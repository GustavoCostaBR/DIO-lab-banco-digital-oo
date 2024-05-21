package com.allogica.Entities;

import java.util.ArrayList;
import java.util.List;


public class Banco {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private String nome;
    private List<ContaAbstractIMPL> contas;

    public String getNome() {
        return nome;
    }


    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirListaContasInfoPublicas(){
        System.out.println("Informações Públicas: ");
        for(ContaAbstractIMPL conta : contas){
            conta.imprimirInfosComunsPublicas();
        }
    }

    public void imprimirListaContasInfoPrivadas(){
        System.out.println("Informações Privadas: ");
        for(ContaAbstractIMPL conta : contas){
            conta.imprimirInfosComunsPrivadas();
        }
    }

    public void addConta(ContaAbstractIMPL conta){
        conta.setAgencia(AGENCIA_PADRAO);
        conta.setNumero(SEQUENCIAL++);
        this.contas.add(conta);
    }

}
