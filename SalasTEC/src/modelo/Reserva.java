/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Dylan Mendez
 */
public class Reserva {
  private static int cantidadReservas=0;
  private String asunto;
  private Date fecha;
  private String horaInicio;
  private String horaFin;
  private int codigoCalificacion;
  private int calificacion;
  private int cantidadPersonas;
  private Estudiante organizador;
  private Sala salaAsignada;
  private ArrayList<Participante> listaparticipantes;
  private ArrayList<Incidente> listaIncidentes;

  public Reserva(String asunto, Date fecha, String horaInicio, String horaFin, int codigoCalificacion, int calificacion, Estudiante organizador, Sala salaAsignada) {
    this.asunto = asunto;
    this.fecha = fecha;
    this.horaInicio = horaInicio;
    this.horaFin = horaFin;
    this.codigoCalificacion = codigoCalificacion;
    this.calificacion = calificacion;
    this.organizador = organizador;
    this.salaAsignada = salaAsignada;
  }

  public static int getCantidadReservas() {
    return cantidadReservas;
  }

  public String getAsunto() {
    return asunto;
  }

  public Date getFecha() {
    return fecha;
  }

  public String getHoraInicio() {
    return horaInicio;
  }

  public String getHoraFin() {
    return horaFin;
  }

  public int getCodigoCalificacion() {
    return codigoCalificacion;
  }

  public int getCalificacion() {
    return calificacion;
  }

  public int getCantidadPersonas() {
    return cantidadPersonas;
  }

  public Estudiante getOrganizador() {
    return organizador;
  }

  public Sala getSalaAsignada() {
    return salaAsignada;
  }

  public ArrayList<Participante> getListaparticipantes() {
    return listaparticipantes;
  }

  public ArrayList<Incidente> getListaIncidentes() {
    return listaIncidentes;
  }

  public static void setCantidadReservas(int cantidadReservas) {
    Reserva.cantidadReservas = cantidadReservas;
  }

  public void setAsunto(String asunto) {
    this.asunto = asunto;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public void setHoraInicio(String horaInicio) {
    this.horaInicio = horaInicio;
  }

  public void setHoraFin(String horaFin) {
    this.horaFin = horaFin;
  }

  public void setCodigoCalificacion(int codigoCalificacion) {
    this.codigoCalificacion = codigoCalificacion;
  }

  public void setCalificacion(int calificacion) {
    this.calificacion = calificacion;
  }

  public void setCantidadPersonas(int cantidadPersonas) {
    this.cantidadPersonas = cantidadPersonas;
  }

  public void setOrganizador(Estudiante organizador) {
    this.organizador = organizador;
  }

  public void setSalaAsignada(Sala salaAsignada) {
    this.salaAsignada = salaAsignada;
  }

  @Override
  public String toString() {
    return "Reserva{" + "asunto=" + asunto + ", fecha=" + fecha + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", codigoCalificacion=" + codigoCalificacion + ", calificacion=" + calificacion + ", cantidadPersonas=" + cantidadPersonas + ", organizador=" + organizador + ", salaAsignada=" + salaAsignada + ", listaparticipantes=" + listaparticipantes + ", listaIncidentes=" + listaIncidentes + '}';
  }
  
  
}
