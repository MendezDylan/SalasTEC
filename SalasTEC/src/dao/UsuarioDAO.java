/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package dao;

import java.util.ArrayList;
import modelo.Usuario;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Dylan Mendez Jeremy Jimenez
 */
public class UsuarioDAO {
  public UsuarioDAO(){
    
  }
  public Usuario iniciarSesion(Usuario usuario){
    System.out.println("ENTRA AL LOGEO");
    SQLServerDataSource des = new SQLServerDataSource();
    des.setServerName("localhost");
    des.setDatabaseName("lab8");
    des.setUser("sa");
    des.setPassword("1234");
    des.setPortNumber(1433);
    
    try {
      Connection on = des.getConnection();
      PreparedStatement ps = on.prepareStatement("select * from usuario where nombreUsuario = ? and contraseña = ?");
      ps.setObject(1, usuario.getNombre());
      ps.setObject(2, usuario.getContrasena());
      ResultSet rs = ps.executeQuery();
      
      if (rs.next()){
        System.out.println("El usuario esta registrado");
      }else{
        System.out.println("El usuario no esta registrado");
        return null;
      }
    } catch (SQLServerException ex) {
      Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
      Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return usuario;
    
  }
  
  public boolean restaurarContraseña(String nombreUsuario){
    return false;
  }
  
  public ArrayList<Usuario> cargarListaUsuarios(){
    return null;
  }
  
  public boolean cambiarContraseña(String nombreUsuario, String contraseña, String contraseñaNueva){
    return false;
  }
  
  public boolean registrarUsuario(Usuario usuario){
    
    return false;
  }
}
