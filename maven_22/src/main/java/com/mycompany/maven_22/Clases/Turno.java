/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maven_22.Clases;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Paula Lopez
 */
@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)        
    int id_turno;
    String anden;
    String dia;
    String hora;
    @OneToOne

    Vehiculo vehiculo_1;

    @OneToMany
   
    private ArrayList<Turno> listaTurnos = new ArrayList<>();

    public Turno() {
    }

    public Turno(int id_turno, String anden, String dia, String hora, Vehiculo vehiculo_1) {
        this.id_turno = id_turno;
        this.anden = anden;
        this.dia = dia;
        this.hora = hora;
        this.vehiculo_1 = vehiculo_1;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public String getAnden() {
        return anden;
    }

    public void setAnden(String anden) {
        this.anden = anden;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Vehiculo getVehiculo_1() {
        return vehiculo_1;
    }

    public void setVehiculo_1(Vehiculo vehiculo_1) {
        this.vehiculo_1 = vehiculo_1;
    }

    @Override
    public String toString() {
        return "Turno{" + "id_turno=" + id_turno + ", anden=" + anden + ", dia=" + dia + ", hora=" + hora + ", vehiculo_1=" + vehiculo_1 + '}';
    }

}
