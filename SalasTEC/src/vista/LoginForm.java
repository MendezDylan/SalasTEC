/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Dylan
 */
public class LoginForm extends javax.swing.JFrame {

  /**
   * Creates new form LoginForm
   */
  public LoginForm() {
    initComponents();
  }
  
  public boolean logInDatosCorrectos(){
    return txtNombreUsuario.getText().length()!=0 && txtContrasena.getText().length()!=0;
  }
  
  public void abrirVentanaAnterior(LoginForm ventanaAnterior){
    ventanaAnterior.setVisible(true);
  }
  
  public void cancelarInicioSesion(){
    System.exit(0);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lbNombreUsuario = new javax.swing.JLabel();
    lbContrasena = new javax.swing.JLabel();
    txtContrasena = new javax.swing.JTextField();
    txtNombreUsuario = new javax.swing.JTextField();
    btnIniciarLogin = new javax.swing.JButton();
    btnCancelarLogin = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    lbNombreUsuario.setText("Usuario");

    lbContrasena.setText("Contraseña");

    btnIniciarLogin.setText("Iniciar logIn");
    btnIniciarLogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnIniciarLoginActionPerformed(evt);
      }
    });

    btnCancelarLogin.setText("Cancelar logIn");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(53, 53, 53)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnCancelarLogin)
            .addGap(18, 18, 18)
            .addComponent(btnIniciarLogin))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lbContrasena)
              .addComponent(lbNombreUsuario))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(txtContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
              .addComponent(txtNombreUsuario))))
        .addContainerGap(92, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(40, 40, 40)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lbNombreUsuario)
          .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(21, 21, 21)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lbContrasena)
          .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(52, 52, 52)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnIniciarLogin)
          .addComponent(btnCancelarLogin))
        .addContainerGap(118, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnIniciarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarLoginActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnIniciarLoginActionPerformed

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
      java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LoginForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton btnCancelarLogin;
  public javax.swing.JButton btnIniciarLogin;
  private javax.swing.JLabel lbContrasena;
  private javax.swing.JLabel lbNombreUsuario;
  public javax.swing.JTextField txtContrasena;
  public javax.swing.JTextField txtNombreUsuario;
  // End of variables declaration//GEN-END:variables
}