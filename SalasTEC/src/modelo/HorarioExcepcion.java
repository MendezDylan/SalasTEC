/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Dylan Mendez
 */
public class HorarioExcepcion {
  private static int cantidadExcepciones=0;
  private int idExcepcion;
  private String tipo;
  private Date fecha;

  public HorarioExcepcion(String pTipo, Date pFecha) {
    this.tipo = pTipo;
    this.fecha = pFecha;
    this.idExcepcion=cantidadExcepciones;
    cantidadExcepciones++;
    
  }

  public static int getCantidadExcepciones() {
    return cantidadExcepciones;
  }

  public int getIdExcepcion() {
    return idExcepcion;
  }

  public String getTipo() {
    return tipo;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setIdExcepcion(int idExcepcion) {
    this.idExcepcion = idExcepcion;
  }

  public void setTipo(String pTipo) {
    this.tipo = pTipo;
  }

  public void setFecha(Date pFecha) {
    this.fecha = pFecha;
  }

  @Override
  public String toString() {
    return "HorarioExcepcion{" + "idExcepcion=" + idExcepcion + ", tipo=" + tipo + ", fecha=" + fecha + '}';
  }
  
  
}
