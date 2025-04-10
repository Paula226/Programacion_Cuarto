/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.BDCliente;
import Clases.Cliente;
import java.sql.SQLException;
import java.sql.ResultSet;

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

    public Cliente BuscarCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
      ResultSet rs =  objBDCliente.BuscarClienteCedula(objCliente);
       while(rs.next()) {
           objCliente.setNombres(rs.getString(2));
           objCliente.setApellidos(rs.getString(3));
       }
       rs.close();
       return objCliente;
    }

    public int BuscarMax() throws SQLException, ClassNotFoundException {
    int x = 0;  
    ResultSet rs = objBDCliente.RecuperarMaximo(); 
    while (rs.next()) {
        x = rs.getInt(1);  
    }
    rs.close(); 
    return x;  
}

   
}
