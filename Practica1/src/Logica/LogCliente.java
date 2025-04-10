/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.BDCliente;
import Clases.Cliente;
import java.sql.SQLException;

/**
 *
 * @author djaramillo
 */
public class LogCliente {
    BDCliente objBDCliente = new BDCliente();
    public boolean ValidarCedula(Cliente objCliente) {
        if (objCliente.getCedula().length() == 4)
            return true; 
        return false;
        //return objCliente.getCedula().length();
    }
    public void Insertar(Cliente objCliente) 
            throws ClassNotFoundException, SQLException {
        objBDCliente.Insertar(objCliente);
    } 
}
