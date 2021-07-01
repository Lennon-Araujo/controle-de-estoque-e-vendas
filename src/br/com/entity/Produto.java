
package br.com.entity;

public class Produto {
    //atributos
    private int id;
    private String nomeProduto;
    private int quantProduto;
    private double precoProduto;
    
    //métodos
    
    public Produto() {
    }

    public Produto(String nomeProduto, int quantProduto, double precoProduto) {
        this.id += 1;
        this.nomeProduto = nomeProduto;
        this.quantProduto = quantProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void cadastrarProduto(String prod, int quant, double preco){
        this.nomeProduto = prod;
        this.quantProduto += quant;
        this.precoProduto += preco;
        this.setId(this.id+1);
    }
    public void excluirProduto(String prod, int quant){
        this.quantProduto -= quant;
    }
    
    public String consultarProduto(int id) {
        if (this.id == id){
            return "Produtos{" + "id=" + id + ", nomeProduto=" + nomeProduto + ", quantProduto=" + quantProduto + ", precoProduto=" + precoProduto + '}';

        } else{
           return "Código do produto inválido.";
        }
    }
    public Double subTotal (double preco,int qtd){
        return preco * qtd;
    }
    
    
    
    
    
}
