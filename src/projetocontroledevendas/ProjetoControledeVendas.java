
package projetocontroledevendas;

import ConnectionFac.Conexao;
import br.com.entity.Produto;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProjetoControledeVendas {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
             new Conexao().getConnection();
        JOptionPane.showMessageDialog(null, "Conectado!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "deu ruim");
        }
       
        
        sc.close();
         

    }
    
}
