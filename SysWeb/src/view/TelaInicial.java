/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Windows
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public TelaInicial() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenCad = new javax.swing.JMenu();
        MenCadCli = new javax.swing.JMenuItem();
        MenCadImo = new javax.swing.JMenuItem();
        MenCadUso = new javax.swing.JMenuItem();
        MenRel = new javax.swing.JMenu();
        MenRelAge = new javax.swing.JMenuItem();
        MenRelCom = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        MenAju = new javax.swing.JMenu();
        MenAjuSob = new javax.swing.JMenuItem();
        MenOpc = new javax.swing.JMenu();
        MenOpcSai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Web Imóveis - Inicio");
        setResizable(false);

        Desktop.setName(""); // NOI18N

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imovel.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblData.setText("Data");

        MenCad.setText("Cadastro");

        MenCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        MenCadCli.setText("Cliente");
        MenCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadCliActionPerformed(evt);
            }
        });
        MenCad.add(MenCadCli);

        MenCadImo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        MenCadImo.setText("Imóvel");
        MenCad.add(MenCadImo);

        MenCadUso.setText("Usuário");
        MenCad.add(MenCadUso);

        Menu.add(MenCad);

        MenRel.setText("Relatório");

        MenRelAge.setText("Agendamento");
        MenRel.add(MenRelAge);

        MenRelCom.setText("Compra");
        MenRel.add(MenRelCom);

        Menu.add(MenRel);

        jMenu5.setText("Locação");
        Menu.add(jMenu5);

        jMenu6.setText("Venda");
        Menu.add(jMenu6);

        jMenu7.setText("Contato");
        Menu.add(jMenu7);

        MenAju.setText("Ajuda");

        MenAjuSob.setText("Sobre");
        MenAju.add(MenAjuSob);

        Menu.add(MenAju);

        MenOpc.setText("Opções");

        MenOpcSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenOpcSai.setText("Sair");
        MenOpc.add(MenOpcSai);

        Menu.add(MenOpc);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsuario)
                            .addComponent(lblData))
                        .addGap(114, 114, 114))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Desktop))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblUsuario)
                        .addGap(37, 37, 37)
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(923, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenCadCliActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu MenAju;
    private javax.swing.JMenuItem MenAjuSob;
    private javax.swing.JMenu MenCad;
    private javax.swing.JMenuItem MenCadCli;
    private javax.swing.JMenuItem MenCadImo;
    private javax.swing.JMenuItem MenCadUso;
    private javax.swing.JMenu MenOpc;
    private javax.swing.JMenuItem MenOpcSai;
    private javax.swing.JMenu MenRel;
    private javax.swing.JMenuItem MenRelAge;
    private javax.swing.JMenuItem MenRelCom;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}