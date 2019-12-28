/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Dylan Mendez
 */
public class Estudiante {
  private String nombre;
  private int carne;
  private String carrera;
  private String correo;
  private int calificacion;
  private int telefono;
  private ArrayList<Incidente> listaIncidentes;
  private ArrayList<Reserva> listaReservas;
  private ArrayList<Estudiante> listaEstudiantes;

  public Estudiante(String nombre, int carne, String carrera, String correo, int calificacion, int telefono) {
    this.nombre = nombre;
    this.carne = carne;
    this.carrera = carrera;
    this.correo = correo;
    this.calificacion = calificacion;
    this.telefono = telefono;
  }

  public String getNombre() {
    return nombre;
  }

  public int getCarne() {
    return carne;
  }

  public String getCarrera() {
    return carrera;
  }

  public String getCorreo() {
    return correo;
  }

  public int getCalificacion() {
    return calificacion;
  }

  public int getTelefono() {
    return telefono;
  }

  public ArrayList<Incidente> getListaIncidentes() {
    return listaIncidentes;
  }

  public ArrayList<Reserva> getListaReservas() {
    return listaReservas;
  }

  public ArrayList<Estudiante> getListaEstudiantes() {
    return listaEstudiantes;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCarne(int carne) {
    this.carne = carne;
  }

  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public void setCalificacion(int calificacion) {
    this.calificacion = calificacion;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    return "Estudiante{" + "nombre=" + nombre + ", carne=" + carne + ", carrera=" + carrera + ", correo=" + correo + ", calificacion=" + calificacion + ", telefono=" + telefono + ", listaIncidentes=" + listaIncidentes + ", listaReservas=" + listaReservas + ", listaEstudiantes=" + listaEstudiantes + '}';
  }
  
  
}
