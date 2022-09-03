package br.com.lojinha.pojo;

public class ItemIncluso {
    private int quantidade;
    private String nomeItem;

    public ItemIncluso(int quantidade, String nomeItem){
        this.quantidade = quantidade;
        this.nomeItem = nomeItem;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }
}
