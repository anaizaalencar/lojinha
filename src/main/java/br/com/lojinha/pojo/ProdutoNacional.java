package br.com.lojinha.pojo;

import br.com.lojinha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {

    private double impostoNacional;

    public ProdutoNacional(String marca) {
        super(marca);
    }

    public double getImpostoNacional(){
        return impostoNacional;
    }

    public void setImpostoNacional(double impostoNacional){
        this.impostoNacional = impostoNacional;
    }

    public String getDadosFavoritos(){
        return this.getNome() + ", " + this.getTamanho() + " e " + this.getValor();
    }
}
