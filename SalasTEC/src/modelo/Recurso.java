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
public class Recurso {
  private static int cantidadRecursos=0;
  private int idRecurso;
  private String nombre;

  public Recurso(int idRecurso, String nombre) {
    this.idRecurso = cantidadRecursos;
    this.nombre = nombre;
    cantidadRecursos++;
  }

  public static int getCantidadRecursos() {
    return cantidadRecursos;
  }

  public int getIdRecurso() {
    return idRecurso;
  }

  public String getNombre() {
    return nombre;
  }

  public void setIdRecurso(int idRecurso) {
    this.idRecurso = idRecurso;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Recurso{" + "nombre=" + nombre + '}';
  }


  
  
}
