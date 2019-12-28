
package modelo;

import java.util.ArrayList;

/**
 * @author Dylan Mendez
 *
 */
public class Sala {
  private static int cantidadSalas=0;
  private int idSala;
  private String ubicacion;
  private int capacidadMaxima;
  private int capacidadMinima;
  private int calificacion;
  private int numTelefono;
  private ArrayList<Recurso> listaRecursos;
  private ArrayList<Horario> listaHorarios;
  private ArrayList<HorarioExcepcion> listaExcepciones;

  public Sala(String ubicacion, int capacidadMaxima, int capacidadMinima, int calificacion, int numTelefono) {
    this.ubicacion = ubicacion;
    this.capacidadMaxima = capacidadMaxima;
    this.capacidadMinima = capacidadMinima;
    this.calificacion = calificacion;
    this.numTelefono = numTelefono;
  }

  public static int getCantidadSalas() {
    return cantidadSalas;
  }

  public int getIdSala() {
    return idSala;
  }

  public String getUbicacion() {
    return ubicacion;
  }

  public int getCapacidadMaxima() {
    return capacidadMaxima;
  }

  public int getCapacidadMinima() {
    return capacidadMinima;
  }

  public int getCalificacion() {
    return calificacion;
  }

  public int getNumTelefono() {
    return numTelefono;
  }

  public ArrayList<Recurso> getListaRecursos() {
    return listaRecursos;
  }

  public ArrayList<Horario> getListaHorarios() {
    return listaHorarios;
  }

  public ArrayList<HorarioExcepcion> getListaExcepciones() {
    return listaExcepciones;
  }

  public static void setCantidadSalas(int cantidadSalas) {
    Sala.cantidadSalas = cantidadSalas;
  }

  public void setIdSala(int idSala) {
    this.idSala = idSala;
  }

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }

  public void setCapacidadMaxima(int capacidadMaxima) {
    this.capacidadMaxima = capacidadMaxima;
  }

  public void setCapacidadMinima(int capacidadMinima) {
    this.capacidadMinima = capacidadMinima;
  }

  public void setCalificacion(int calificacion) {
    this.calificacion = calificacion;
  }

  public void setNumTelefono(int numTelefono) {
    this.numTelefono = numTelefono;
  }
  
  

  @Override
  public String toString() {
    return "Sala{" + "idSala=" + idSala + ", ubicacion=" + ubicacion + ", capacidadMaxima=" + capacidadMaxima + ", capacidadMinima=" + capacidadMinima + ", calificacion=" + calificacion + ", numTelefono=" + numTelefono + ", listaRecursos=" + listaRecursos + ", listaHorarios=" + listaHorarios + ", listaExcepciones=" + listaExcepciones + '}';
  }

  
  
}
