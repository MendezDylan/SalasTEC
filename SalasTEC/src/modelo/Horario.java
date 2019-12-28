/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;


/**
 *
 * @author Dylan
 */
public class Horario {
  private EnumDiaSemana dia;
  private Date horaApertura;
  private Date horaCierre;

  public EnumDiaSemana getDia() {
    return dia;
  }

  public Date getHoraApertura() {
    return horaApertura;
  }

  public Date getHoraCierre() {
    return horaCierre;
  }

  public void setDia(EnumDiaSemana pDia) {
    this.dia = pDia;
  }

  public void setHoraApertura(Date pHoraApertura) {
    this.horaApertura = pHoraApertura;
  }

  public void setHoraCierre(Date pHoraCierre) {
    this.horaCierre = pHoraCierre;
  }

  @Override
  public String toString() {
    return "Horario{" + "dia=" + dia + ", horaApertura=" + horaApertura + ", horaCierre=" + horaCierre + '}';
  }
  
  
}
