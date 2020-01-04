package controlador;
import controlador.ControladorMenuPrincipal;
import dao.UsuarioDAO;
import java.awt.event.*;
import vista.*;
import modelo.Usuario;
import javax.swing.JOptionPane;
/**
 *
 * @author Dylan
 */
public class ControladorUsuario implements ActionListener {
  
  public LoginForm vista;
  public UsuarioDAO dao;
  public Usuario modelo;
  
  public ControladorUsuario(LoginForm pVista, Usuario pModelo){
    this.vista=pVista;
    this.modelo=pModelo;
    vista.setVisible(true);
    
    this.vista.btnIniciarLogin.addActionListener(this);
    this.vista.btnCancelarLogin.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()) {
      case "Iniciar logIn":
        logIn();
        break;
      case "Cancelar logIn":
        cerrarVentanaLogin();
        break;
      default:
        break;
    }
  }
  
  public void logIn(){
    System.out.println("Entra");
    if(this.vista.logInDatosCorrectos()==true){
      String nombreUsuario=vista.txtNombreUsuario.getText();
      String contrasena=vista.txtContrasena.getText();
      this.modelo=new Usuario(nombreUsuario, contrasena);
      UsuarioDAO dao = new UsuarioDAO();
      Usuario usuarioActual =(Usuario) dao.iniciarSesion(modelo);
      if(usuarioActual!=null){
        vista.setVisible(false);
        JOptionPane.showMessageDialog(vista, "Bienvenido: "+modelo.getNombre());
        ControladorMenuPrincipal controladorMenu = new ControladorMenuPrincipal();
      }else{
        JOptionPane.showMessageDialog(vista, "El usuario indicado no existe.");
      }
    }else{
      JOptionPane.showMessageDialog(vista, "Todos los datos son requeridos");
    }
  }
  
  public void cerrarVentanaLogin(){
    vista.cancelarInicioSesion();
  }
}
