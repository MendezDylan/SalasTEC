/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Dylan Mendez
 */
public class Participante {
  private String nombre;
  private String correo;

  public Participante(String nombre, String correo) {
    this.nombre = nombre;
    this.correo = correo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCorreo() {
    return correo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  @Override
  public String toString() {
    return "Participante{" + "nombre=" + nombre + ", correo=" + correo + '}';
  }
  
}
