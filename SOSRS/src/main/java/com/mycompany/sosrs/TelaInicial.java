
package com.mycompany.sosrs;

public class TelaInicial extends javax.swing.JFrame {


    public TelaInicial() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        JMenuCadastro = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemDoencas = new javax.swing.JMenuItem();
        jMenuItemSintomas = new javax.swing.JMenuItem();
        jMenuVinculos = new javax.swing.JMenu();
        jMenuVincularDoencas = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuPesquisarSintomas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuIdentificar = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemDoencas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemDoencas.setText("Doenças");
        jMenuItemDoencas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDoencasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemDoencas);

        jMenuItemSintomas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItemSintomas.setText("Sintomas");
        jMenuItemSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSintomasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSintomas);

        JMenuCadastro.add(jMenu1);

        jMenuVinculos.setText("Vinculos");

        jMenuVincularDoencas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuVincularDoencas.setText("Vincular Doenças");
        jMenuVincularDoencas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVincularDoencasActionPerformed(evt);
            }
        });
        jMenuVinculos.add(jMenuVincularDoencas);

        JMenuCadastro.add(jMenuVinculos);

        jMenuCadastro.setText("Pesquisa");
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });

        jMenuPesquisarSintomas.setText("Pesquisar Sintomas");
        jMenuPesquisarSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPesquisarSintomasActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuPesquisarSintomas);

        jMenuItem1.setText("Pesquisar Doenças");
        jMenuCadastro.add(jMenuItem1);

        JMenuCadastro.add(jMenuCadastro);

        jMenuIdentificar.setText("Identificar");
        jMenuIdentificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIdentificarActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Doenças");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuIdentificar.add(jMenuItem2);

        JMenuCadastro.add(jMenuIdentificar);

        setJMenuBar(JMenuCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                                                                                                                                                                                                                                                                                                                                                                                            
    private void jMenuItemDoencasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDoencasActionPerformed
        TelaCadastroDoenca CadastroD = new TelaCadastroDoenca();
        jDesktopPane1.add(CadastroD);
        CadastroD.setVisible(true);
    }//GEN-LAST:event_jMenuItemDoencasActionPerformed

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSintomasActionPerformed
        TelaCadastroSintoma CadastroS = new TelaCadastroSintoma();
         jDesktopPane1.add(CadastroS);
        CadastroS.setVisible(true); 
    }//GEN-LAST:event_jMenuItemSintomasActionPerformed

    private void jMenuVincularDoencasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVincularDoencasActionPerformed
        TelaCadastroSintoma CadastroS = new TelaCadastroSintoma();
         jDesktopPane1.add(CadastroS);
        CadastroS.setVisible(true); 
    }//GEN-LAST:event_jMenuVincularDoencasActionPerformed

    private void jMenuPesquisarSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPesquisarSintomasActionPerformed
         TelaPesquisaSintoma pesquisaS = new TelaPesquisaSintoma ();
         jDesktopPane1.add(pesquisaS);
        pesquisaS.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuPesquisarSintomasActionPerformed

    private void jMenuIdentificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIdentificarActionPerformed
         TelaIdentificacao identificar = new TelaIdentificacao ();
         jDesktopPane1.add(identificar);
        identificar.setVisible(true); 
    }//GEN-LAST:event_jMenuIdentificarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaIdentificacao identificar = new TelaIdentificacao ();
         jDesktopPane1.add(identificar);
        identificar.setVisible(true); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenuCadastro;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuIdentificar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemDoencas;
    private javax.swing.JMenuItem jMenuItemSintomas;
    private javax.swing.JMenuItem jMenuPesquisarSintomas;
    private javax.swing.JMenuItem jMenuVincularDoencas;
    private javax.swing.JMenu jMenuVinculos;
    // End of variables declaration//GEN-END:variables
}
