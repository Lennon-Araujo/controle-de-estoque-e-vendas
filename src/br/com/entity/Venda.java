
package br.com.entity;


public class Venda extends Cliente {
    

    private int idVenda;
    private int qtdProd;
    private double valorvenda;

    public Venda() {
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getQtdProd() {
        return qtdProd;
    }

    public void setQtdProd(int qtdProd) {
        this.qtdProd = qtdProd;
    }

    public double getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(double valorvenda) {
        this.valorvenda = valorvenda;
    }

   
    public Double totalVenda(Double preco){
        this.valorvenda += preco;
        
        return this.valorvenda;
        
    }
}
    
    
  
