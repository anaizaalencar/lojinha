package br.com.lojinha.pojo;

import br.com.lojinha.enuns.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;

    public Produto (String marca){
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor){
        if (novoValor > 0) {
            this.valor = novoValor;
        }else{
            throw new IllegalArgumentException("Valores devem ser maiores que zero");
        }
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public void setItensInclusos(List<ItemIncluso> itensInclusos) {
        this.itensInclusos = itensInclusos;
    }

    public List<ItemIncluso> getItensInclusos() {
        return itensInclusos;
    }
}
