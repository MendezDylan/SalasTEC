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
public class Incidente {
  private static int cantIncidentes=0;
  private int idIncidente;
  private String descripcion;

  public Incidente(String descripcion) {
    this.descripcion = descripcion;
    this.idIncidente=cantIncidentes;
    cantIncidentes++;
  }

  public static int getCantIncidentes() {
    return cantIncidentes;
  }

  public int getIdIncidente() {
    return idIncidente;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setIdIncidente(int idIncidente) {
    this.idIncidente = idIncidente;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public String toString() {
    return "Incidente{" + "idIncidente=" + idIncidente + ", descripcion=" + descripcion + '}';
  }
  
  
  
}
