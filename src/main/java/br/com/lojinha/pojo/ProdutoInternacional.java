package br.com.lojinha.pojo;

import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    private double taxaImportação;

    public ProdutoInternacional(String marca) {
        super(marca);
    }

    public double getTaxaImportacao(){
        return taxaImportação;
    }

    public void setTaxaImportacao(double taxaImportação){
        this.taxaImportação = taxaImportação;
    }

    public void setValor(double novoValor){
        if (novoValor > -100) {
            this.valor = novoValor;
        }else{
            throw new IllegalArgumentException("Valores devem ser maiores que zero");
        }
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getTamanho() + " e " + this.getValor();
    }
}
