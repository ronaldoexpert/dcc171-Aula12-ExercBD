package dcc171.aula16.exerciciobd;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class frmPrincipal extends javax.swing.JFrame {
    VisitanteDAO dao;
    
    public frmPrincipal() throws Exception {
        this.dao = new VisitaDAOJDBC();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEntrada = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        btnSaida = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdDados = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnEntrada.setText("Entrada");
        btnEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntradaMouseClicked(evt);
            }
        });
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        lblIdade.setText("Idade");

        btnSaida.setText("Saida");
        btnSaida.setEnabled(false);
        btnSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaidaMouseClicked(evt);
            }
        });

        grdDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Entrada", "Saida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grdDados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        grdDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdDadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(grdDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(edtNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdade)
                            .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaida)
                    .addComponent(btnEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            exibeNaGrid();
        } catch (Exception ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }//GEN-LAST:event_formWindowActivated

    private void btnEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseClicked
        if ((!edtNome.getText().isEmpty()) || (!edtIdade.getText().isEmpty())) {
            try {
                Visitante v = new Visitante();
                v.setNome(edtNome.getText());
                v.setIdade(Integer.parseInt(edtIdade.getText()));
                dao.criar(v);                
            } catch (Exception ex) {
                Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                exibeNaGrid();
            } catch (Exception ex) {
                Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            edtIdade.setText("");
            edtNome.setText("");
        }
    }//GEN-LAST:event_btnEntradaMouseClicked

    private void grdDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdDadosMouseClicked
        btnSaida.setEnabled(true);
        int linhaSelecionada = grdDados.getSelectedRow();
        edtIdade.setText(grdDados.getValueAt(linhaSelecionada, 2).toString());
        edtNome.setText(grdDados.getValueAt(linhaSelecionada, 1).toString());
    }//GEN-LAST:event_grdDadosMouseClicked

    private void btnSaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaidaMouseClicked
        int linhaSelecionada = grdDados.getSelectedRow();  
        int idSelecionado = Integer.parseInt(grdDados.getValueAt(linhaSelecionada, 0).toString());
        
        try {            
            dao.saida(idSelecionado);                
            exibeNaGrid();
        } catch (Exception ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        edtIdade.setText("");
        edtNome.setText("");
        btnSaida.setEnabled(false);

    }//GEN-LAST:event_btnSaidaMouseClicked

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntradaActionPerformed
    
    private void exibeNaGrid() throws Exception{
        
        DefaultTableModel model =(DefaultTableModel) grdDados.getModel();
        model.setNumRows(0);

        List<Visitante> visit = dao.listarTodos();
        for(Visitante v : visit){
            SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy"); 
            String dataEntrada = fmt.format(v.getEntrada());
            
            model.addRow(new Object[]{
                "",
                v.getNome(),
                v.getIdade(),
                dataEntrada,
                v.getSaida()
            });
        }

        /*while(results.next()){

           model.addRow(new Object[]{ 
                //retorna os dados da tabela do BD, cada campo e um coluna.
               results.getString("id"), 
               results.getString("nome"),
               results.getInt("idade"),
               dataEntradaformatada,
               results.getTimestamp("saida")
            });
        }*/  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnSaida;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTable grdDados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
