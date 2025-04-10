/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
         * @author djaramillo danilo
         */

public class BDCliente {

    Conexiones BLcon = new Conexiones();

    public int Insertar(Cliente objCliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO CLIENTE (Cedula, Nombres, Apellidos)"
                + " VALUES (?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objCliente.getCedula());
        ps.setString(2, objCliente.getNombres());
        ps.setString(3, objCliente.getApellidos());
        return ps.executeUpdate();
    }

    public ResultSet BuscarClienteCedula(Cliente objCliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "Select * from CLIENTE where cedula = ?";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objCliente.getCedula());
        return ps.executeQuery();
    }

    public ResultSet RecuperarMaximo() throws SQLException, ClassNotFoundException {
    
    String sentencia = "SELECT MAX(IdCliente) FROM CLIENTE";
    
    PreparedStatement ps = BLcon.getConnection().prepareStatement(sentencia);

    return ps.executeQuery();
}

}
