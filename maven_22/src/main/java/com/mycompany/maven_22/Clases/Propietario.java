/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maven_22.Clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Paula Lopez
 */
@Entity
public class Propietario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_propietario;
    String cedula;
    String nombres;
    String apellidos;
    @OneToOne
    Vehiculo vehiculo_1;
    
    public Propietario() {
    }

    public Propietario(int id_propietario, String cedula, String nombres, String apellidos) {
        this.id_propietario = id_propietario;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Vehiculo getVehiculo_1() {
        return vehiculo_1;
    }

    public void setVehiculo_1(Vehiculo vehiculo_1) {
        this.vehiculo_1 = vehiculo_1;
    }

    @Override
    public String toString() {
        return "Propietario{" + "id_propietario=" + id_propietario + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }

  
}
