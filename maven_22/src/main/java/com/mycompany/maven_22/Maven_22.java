/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maven_22;

import com.mycompany.maven_22.Persistencia.PropietarioJpaController;
import com.mycompany.maven_22.Persistencia.TurnoJpaController;
import com.mycompany.maven_22.Persistencia.VehiculoJpaController;


/**
 *
 * @author Paula Lopez
 */
public class Maven_22 {

 public static void main(String[] args) {
           try {
            
            VehiculoJpaController vehiculoJpa = new VehiculoJpaController(emf);
            PropietarioJpaController propietarioJpa = new PropietarioJpaController();
            TurnoJpaController turnoJpa = new TurnoJpaController();

            System.out.println("Tablas creadas correctamente.");
        } catch (Exception e) {
            System.out.println("Error al crear las tablas: " + e.getMessage());
            e.printStackTrace();
        }
    }
}