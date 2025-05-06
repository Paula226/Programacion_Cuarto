package com.mycompany.maven_22.Clases;

import com.mycompany.maven_22.Clases.Propietario;
import com.mycompany.maven_22.Clases.Vehiculo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-05T23:30:24", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, String> marca;
    public static volatile SingularAttribute<Vehiculo, String> estado;
    public static volatile SingularAttribute<Vehiculo, Propietario> propietario;
    public static volatile SingularAttribute<Vehiculo, Integer> id_vehiculo;
    public static volatile ListAttribute<Vehiculo, Vehiculo> listaVehiculos;
    public static volatile SingularAttribute<Vehiculo, String> placa;

}