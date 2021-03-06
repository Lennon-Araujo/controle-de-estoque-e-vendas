
package br.com.entity;


public class Cliente {


    
    private int idCliente;
    private String nomeCliente;
    private String endCliente;
    private String telCliente;
    private String pesquisa;

    // construtores

    public Cliente() {
    }
    
    
    public Cliente(int idCliente, String nomeCliente, String endCliente, String telCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.endCliente = endCliente;
        this.telCliente = telCliente;
    }
    
    
    //getters e setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndCliente() {
        return endCliente;
    }

    public void setEndCliente(String endCliente) {
        this.endCliente = endCliente;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }
    
        /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    //métodos
    @Override
    public String toString() {
        return "Cliente Cadastrado!\n" + "Código do Cliente: " + idCliente + "; Nome: " + nomeCliente + ";"
                + " Endereço: " + endCliente + "; Telefone: " + telCliente;
    }
    
    
    
    
    
}
