
package br.com.entity;


public class Venda extends Produto {
    
    private String cliente;
    private int idVenda = 0;

    public Venda(String nomeProduto, int quantProduto, double precoProduto) {
        super(nomeProduto, quantProduto, precoProduto);
    }
    
    
    
}
