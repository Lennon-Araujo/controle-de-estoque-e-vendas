
package Conexao;

import br.com.entity.Cliente;
import br.com.entity.Produto;
import br.com.entity.Venda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Utility {
    ConexaoBanco conex = new ConexaoBanco();
    Cliente cli = new Cliente();
    Produto prod = new Produto();
    Venda venda = new Venda();
    
    public void SalvarCli (Cliente cli){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cliente(nome, endereco, telefone) values(?,?,?)");
            pst.setString(1, cli.getNomeCliente());
            pst.setString(2, cli.getEndCliente());
            pst.setString(3, cli.getTelCliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");                  
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados de cliente!"+ex.getMessage());

        }
       
        
        conex.desconexao();
    }
    
    public Cliente Buscacliente(Cliente cli){
        conex.conexao();
        
        try {
            conex.executasql("select * from cliente where nome like '%" + cli.getPesquisa() + "%'");
            conex.rs.first();
            cli.setIdCliente(conex.rs.getInt("id"));
            cli.setNomeCliente(conex.rs.getString("nome"));
            cli.setEndCliente(conex.rs.getString("endereco"));
            cli.setTelCliente(conex.rs.getString("telefone"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente"+ex.getMessage());
        }
        
        conex.desconexao();
        return cli;
        
    }
    
        public void SalvarProd (Produto prod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into produto(nome_prod, qtd_prod, preco_prod) values(?,?,?)");
            pst.setString(1, prod.getNomeProduto());
            pst.setInt(2, prod.getQuantProduto());
            pst.setDouble(3, prod.getPrecoProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");                  
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados de cliente!"+ex.getMessage());

        }
       
        
        conex.desconexao();
    }
        
        public Produto Buscaprod(Produto prod){
        conex.conexao();
        
        try {
            conex.executasql("select * from produto where nome_prod like '%" + prod.getPesquisaprod() + "%'");
            conex.rs.first();
            
            prod.setId(conex.rs.getInt("id"));
            prod.setNomeProduto(conex.rs.getString("nome_prod"));
            prod.setQuantProduto(conex.rs.getInt("qtd_prod"));
            prod.setPrecoProduto(conex.rs.getDouble("preco_prod"));

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao buscarprod"+ex.getMessage());
        }
        
        conex.desconexao();
        return prod;
        
    }
        
        public void SalvarVenda (Venda venda){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into venda(qtd_prods, total, id_cliente) values(?,?,?)");
            pst.setInt(1, venda.getQtdProd());
            pst.setDouble(2, venda.getValorvenda());
            pst.setInt(3, venda.getIdCliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");                  
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir venda"+ex.getMessage());

        }
       
        
        conex.desconexao();
    }
    
    
    
}
