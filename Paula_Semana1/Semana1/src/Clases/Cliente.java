/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author djaramillo
 */
public class Cliente {
    int IdClie;
    String Cedula;
    String Nombres;
    String Apellidos;

    public Cliente() {
    }

    public Cliente(String Cedula, String Nombres, String Apellidos,  int IdClie) {
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.IdClie = IdClie;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }
    public int getIdClie() {
        return IdClie;
    }
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    public void setIdClie(int IdClie) {
        this.IdClie = IdClie;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Cedula=" + Cedula + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + '}';
    }
    
    
}


