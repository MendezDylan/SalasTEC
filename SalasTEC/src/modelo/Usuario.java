/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Dylan
 */
public class Usuario {
  private String nombre;
  private String contrasena;

  public Usuario() {
  }
  
  public Usuario(String pNombre, String pContrasena){
    this.nombre=pNombre;
    this.contrasena=pContrasena;
  }

  public String getNombre() {
    return nombre;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }
  
  
}
