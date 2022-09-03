package br.com.lojinha;

import br.com.lojinha.enuns.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony");

        meuProduto.setNome("PS4");
        meuProduto.setValor(10);
        meuProduto.setTamanho(Tamanho.Medio);

        List<ItemIncluso> meusItensInclusos = new ArrayList<>();
        meusItensInclusos.add(new ItemIncluso(2, "Controle(s)"));
        meusItensInclusos.add(new ItemIncluso(1, "Jogo(s)"));
        meusItensInclusos.add(new ItemIncluso(1, "Carregador(s)"));

        meuProduto.setItensInclusos(meusItensInclusos);

        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());

        for (int i = 0; i < meusItensInclusos.size(); i++) { // for (ItemIncluso itemAtual : meuProduto.getItensInclusos()){}
            System.out.println(meuProduto.getItensInclusos().get(i).getQuantidade() + "-" + meuProduto.getItensInclusos().get(i).getNomeItem());
        }

        System.out.println("Acabou os itens!");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Xiaomi");
        meuProdutoNacional.setImpostoNacional(150.20);
        System.out.println("O valor do imposto nacional do meu produto eh: " + meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("IPhone");
        meuProdutoInternacional.setTaxaImportacao(25.8);
        meuProdutoInternacional.setValor(-74.99);
        System.out.println("O valor do meu produto internacional eh: " + meuProdutoInternacional.getValor());

    }
}
