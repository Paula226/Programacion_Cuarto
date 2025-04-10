package Presentacion;

import Clases.Cliente;
import Logica.LogCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Ventana extends JFrame{
    private JPanel JPanel1;
    private JTextArea textArea1;
    private JButton button1;

    public Ventana(){
        super("ejemplo");
        // Inicializar los componentes manualmente
        JPanel1 = new JPanel();           
        textArea1 = new JTextArea(0, 0); 
        button1 = new JButton("Insertar"); 

        // Añadir los componentes al panel
        JPanel1.add(textArea1);
        JPanel1.add(button1);
        
        setContentPane(JPanel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente objCliente = new Cliente();
                Cliente objCliente1 = new Cliente("1102","Juan","Perez");
                LogCliente objLogCliente = new LogCliente();
                objCliente.setCedula("1107");
                objCliente.setNombres("Guillermo ");
                objCliente.setApellidos("Lazzo ");
                if (objLogCliente.ValidarCedula(objCliente)) {
                    try {
                        objLogCliente.Insertar(objCliente);
                    } catch (ClassNotFoundException ex) {
                        throw new RuntimeException(ex);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                     if (objLogCliente.ValidarCedula(objCliente1)) {
                    try {
                        objLogCliente.Insertar(objCliente1);
                    } catch (ClassNotFoundException ex) {
                        throw new RuntimeException(ex);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }

                }
                textArea1.setText(objCliente1.toString());

            }
        });
    }
}
