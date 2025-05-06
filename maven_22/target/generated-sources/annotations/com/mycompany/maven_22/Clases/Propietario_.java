package com.mycompany.maven_22.Clases;

import com.mycompany.maven_22.Clases.Vehiculo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-05T23:30:24", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Propietario.class)
public class Propietario_ { 

    public static volatile SingularAttribute<Propietario, String> apellidos;
    public static volatile SingularAttribute<Propietario, Vehiculo> vehiculo_1;
    public static volatile SingularAttribute<Propietario, Integer> id_propietario;
    public static volatile SingularAttribute<Propietario, String> cedula;
    public static volatile SingularAttribute<Propietario, String> nombres;

}