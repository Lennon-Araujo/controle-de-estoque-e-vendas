/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import ConnectionFac.Conexao;
import br.com.entity.Cliente;
import br.com.entity.Produto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenno
 */
public class viewSistema extends javax.swing.JFrame {

    List<Cliente> listaCliente = new ArrayList<>();
    List<Produto> listaProduto = new ArrayList<>();
    
    public void listarProduto(){
        //modelo padrão para usar tabela
        DefaultTableModel dados = (DefaultTableModel) Tabela.getModel();
        dados.setNumRows(0); //limpando os dados da tabela
        
        for(Produto produto : listaProduto){
            //Object é classe pai de todas as classes
            dados.addRow(new Object[]{
                produto.getId(),
                produto.getNomeProduto(),
                produto.getPrecoProduto(),
                produto.getQuantProduto(),
                produto.subTotal(produto.getPrecoProduto(), produto.getQuantProduto())
                
            });
            
        }
    }

    public viewSistema() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        TituloPage = new javax.swing.JLabel();
        PanelDadosDoCliente = new javax.swing.JPanel();
        LabelCodCliente = new javax.swing.JLabel();
        campoCodCliente = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        campoNomeCliente = new javax.swing.JTextField();
        labelEnd = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        labelTel = new javax.swing.JLabel();
        campoTel = new javax.swing.JFormattedTextField();
        ButtonPesquisarCliente = new javax.swing.JButton();
        ButtonNovoCliente = new javax.swing.JButton();
        PanelCarrinhoDeCompras = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Excluir = new javax.swing.JButton();
        PanelResumoDaCompra = new javax.swing.JPanel();
        labelSubtotal = new javax.swing.JLabel();
        campoSubtotal = new javax.swing.JFormattedTextField();
        ButtonPagamento = new javax.swing.JButton();
        ButtonPagamento1 = new javax.swing.JButton();
        PanelItemDeCompra = new javax.swing.JPanel();
        labelProduto = new javax.swing.JLabel();
        jComboBoxProduto = new javax.swing.JComboBox<>();
        labelQtd = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        qtdProduto = new javax.swing.JTextField();
        precoProduto = new javax.swing.JTextField();
        ButtonConfirmar = new javax.swing.JButton();
        Produtos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 400, 400));

        Header.setBackground(new java.awt.Color(70, 130, 180));
        Header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TituloPage.setBackground(new java.awt.Color(66, 59, 188));
        TituloPage.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        TituloPage.setForeground(new java.awt.Color(250, 250, 250));
        TituloPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPage.setText("Mercadinho");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TituloPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloPage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDadosDoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N
        PanelDadosDoCliente.setMaximumSize(new java.awt.Dimension(150, 150));

        LabelCodCliente.setText("Código do Cliente:");

        campoCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodClienteActionPerformed(evt);
            }
        });

        labelNome.setText("Nome do Cliente");

        labelEnd.setText("Endereço");

        labelTel.setText("Telefone");

        try {
            campoTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelActionPerformed(evt);
            }
        });

        ButtonPesquisarCliente.setText("Pesquisar");

        ButtonNovoCliente.setText("Cadastrar Novo Cliente");
        ButtonNovoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonNovoClienteMouseClicked(evt);
            }
        });
        ButtonNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDadosDoClienteLayout = new javax.swing.GroupLayout(PanelDadosDoCliente);
        PanelDadosDoCliente.setLayout(PanelDadosDoClienteLayout);
        PanelDadosDoClienteLayout.setHorizontalGroup(
            PanelDadosDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosDoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDadosDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeCliente)
                    .addComponent(campoEndereco)
                    .addComponent(campoTel)
                    .addGroup(PanelDadosDoClienteLayout.createSequentialGroup()
                        .addGroup(PanelDadosDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labelEnd)
                            .addComponent(labelTel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelDadosDoClienteLayout.createSequentialGroup()
                        .addComponent(LabelCodCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonPesquisarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ButtonNovoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelDadosDoClienteLayout.setVerticalGroup(
            PanelDadosDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosDoClienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelDadosDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCodCliente)
                    .addComponent(campoCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPesquisarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(ButtonNovoCliente)
                .addContainerGap())
        );

        PanelCarrinhoDeCompras.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho de Compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código Produto", "Nome do Produto", "Preço", "Quantidade", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        Excluir.setText("Excluir Item");

        javax.swing.GroupLayout PanelCarrinhoDeComprasLayout = new javax.swing.GroupLayout(PanelCarrinhoDeCompras);
        PanelCarrinhoDeCompras.setLayout(PanelCarrinhoDeComprasLayout);
        PanelCarrinhoDeComprasLayout.setHorizontalGroup(
            PanelCarrinhoDeComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCarrinhoDeComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCarrinhoDeComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCarrinhoDeComprasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Excluir)))
                .addContainerGap())
        );
        PanelCarrinhoDeComprasLayout.setVerticalGroup(
            PanelCarrinhoDeComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCarrinhoDeComprasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(Excluir)
                .addContainerGap())
        );

        PanelResumoDaCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total da Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        labelSubtotal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelSubtotal.setText("Subtotal:");

        campoSubtotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        ButtonPagamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonPagamento.setText("Realizar Pagamento");

        ButtonPagamento1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButtonPagamento1.setText("Cancelar Compra");

        javax.swing.GroupLayout PanelResumoDaCompraLayout = new javax.swing.GroupLayout(PanelResumoDaCompra);
        PanelResumoDaCompra.setLayout(PanelResumoDaCompraLayout);
        PanelResumoDaCompraLayout.setHorizontalGroup(
            PanelResumoDaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResumoDaCompraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelResumoDaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSubtotal)
                    .addComponent(ButtonPagamento))
                .addGroup(PanelResumoDaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelResumoDaCompraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelResumoDaCompraLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(ButtonPagamento1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        PanelResumoDaCompraLayout.setVerticalGroup(
            PanelResumoDaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResumoDaCompraLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PanelResumoDaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSubtotal)
                    .addComponent(campoSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(PanelResumoDaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonPagamento)
                    .addComponent(ButtonPagamento1))
                .addContainerGap())
        );

        PanelItemDeCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item de Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        PanelItemDeCompra.setMaximumSize(new java.awt.Dimension(200, 200));

        labelProduto.setText("Produto:");

        jComboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indaia", "Naturagua", "Santa Monica", "Limpida" }));

        labelQtd.setText("Quantidade:");

        labelPreco.setText("Preço:");

        ButtonConfirmar.setText("Incluir no Carrinho");
        ButtonConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonConfirmarMouseClicked(evt);
            }
        });

        Produtos.setText("Todos os produtos");
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelItemDeCompraLayout = new javax.swing.GroupLayout(PanelItemDeCompra);
        PanelItemDeCompra.setLayout(PanelItemDeCompraLayout);
        PanelItemDeCompraLayout.setHorizontalGroup(
            PanelItemDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelItemDeCompraLayout.createSequentialGroup()
                .addGroup(PanelItemDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelItemDeCompraLayout.createSequentialGroup()
                        .addGroup(PanelItemDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelItemDeCompraLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(PanelItemDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(PanelItemDeCompraLayout.createSequentialGroup()
                                        .addComponent(labelQtd)
                                        .addGap(4, 4, 4)
                                        .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelItemDeCompraLayout.createSequentialGroup()
                                        .addComponent(labelPreco)
                                        .addGap(33, 33, 33)
                                        .addComponent(precoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelItemDeCompraLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(ButtonConfirmar))
                            .addGroup(PanelItemDeCompraLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelItemDeCompraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Produtos)))
                .addContainerGap())
        );
        PanelItemDeCompraLayout.setVerticalGroup(
            PanelItemDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelItemDeCompraLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Produtos)
                .addGap(18, 18, 18)
                .addGroup(PanelItemDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProduto)
                    .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelItemDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtd)
                    .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelItemDeCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(precoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelItemDeCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDadosDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCarrinhoDeCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelResumoDaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelDadosDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelItemDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelCarrinhoDeCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelResumoDaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodClienteActionPerformed

    private void campoTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelActionPerformed

    private void ButtonNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonNovoClienteActionPerformed

    private void ButtonNovoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonNovoClienteMouseClicked
        String nomeCliente = campoNomeCliente.getText();
        String endCliente = campoEndereco.getText();
        String telCliente = campoTel.getText();
             
        
   
    }//GEN-LAST:event_ButtonNovoClienteMouseClicked

    private void ButtonConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonConfirmarMouseClicked
        Produto produto = new Produto();
        
        produto.setId(1);
        produto.setNomeProduto(jComboBoxProduto.getSelectedItem().toString());
        produto.setPrecoProduto(Double.parseDouble(precoProduto.getText()));
        produto.setQuantProduto(Integer.parseInt(qtdProduto.getText()));
        
        listaProduto.add(produto);
        listarProduto();
        
    }//GEN-LAST:event_ButtonConfirmarMouseClicked

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdutosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConfirmar;
    private javax.swing.JButton ButtonNovoCliente;
    private javax.swing.JButton ButtonPagamento;
    private javax.swing.JButton ButtonPagamento1;
    private javax.swing.JButton ButtonPesquisarCliente;
    private javax.swing.JButton Excluir;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LabelCodCliente;
    private javax.swing.JPanel PanelCarrinhoDeCompras;
    private javax.swing.JPanel PanelDadosDoCliente;
    private javax.swing.JPanel PanelItemDeCompra;
    private javax.swing.JPanel PanelResumoDaCompra;
    private javax.swing.JButton Produtos;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel TituloPage;
    private javax.swing.JTextField campoCodCliente;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JFormattedTextField campoSubtotal;
    private javax.swing.JFormattedTextField campoTel;
    private javax.swing.JComboBox<String> jComboBoxProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEnd;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel labelQtd;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTel;
    private javax.swing.JTextField precoProduto;
    private javax.swing.JTextField qtdProduto;
    // End of variables declaration//GEN-END:variables
}
