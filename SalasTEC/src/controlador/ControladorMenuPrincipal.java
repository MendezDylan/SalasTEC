/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionListener;
import vista.MenuPrincipalAdmin;
import dao.UsuarioDAO;
import java.awt.event.*;
import vista.*;
import modelo.Usuario;
import javax.swing.JOptionPane;
/**
 *
 * @author Jeremy
 */
public class ControladorMenuPrincipal implements ActionListener {
  public MenuPrincipalAdmin vista;
  MenuPrincipalAdmin vista1 = new MenuPrincipalAdmin();
  
    public ControladorMenuPrincipal(){
    this.vista1.setVisible(true);
    
    
    this.vista1.botonGestionarSalas.addActionListener( this);
    this.vista1.botonGestionarEstudiantes.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()) {
      case "Gestionar Salas":
        
        break;
      case "Gestionar Estudiantes":
        
        break;
      default:
        break;
    }
  }
}
