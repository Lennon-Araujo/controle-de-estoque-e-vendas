
package Conexao;

import br.com.entity.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Utility {
    ConexaoBanco conex = new ConexaoBanco();
    Cliente cli = new Cliente();
    
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
    
    public Cliente buscacliente(Cliente cli){
        conex.conexao();
        conex.executasql("select * from cliente where nome like '%" + cli.getPesquisa() + "%'");
        try {
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
    
}
