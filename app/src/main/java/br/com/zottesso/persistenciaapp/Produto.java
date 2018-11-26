package br.com.zottesso.persistenciaapp;

import com.orm.SugarRecord;


public class Produto extends SugarRecord {

    private String nome;
    private double valor;



    public Produto() {

    }

    @Override
    public String toString(){
        return "Nome: "+nome+" - Preço R$ "+valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
