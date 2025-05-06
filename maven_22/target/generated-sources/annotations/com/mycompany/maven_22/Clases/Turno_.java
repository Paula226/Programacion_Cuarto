package com.mycompany.maven_22.Clases;

import com.mycompany.maven_22.Clases.Turno;
import com.mycompany.maven_22.Clases.Vehiculo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-05T23:30:24", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, Vehiculo> vehiculo_1;
    public static volatile SingularAttribute<Turno, String> hora;
    public static volatile SingularAttribute<Turno, String> anden;
    public static volatile SingularAttribute<Turno, String> dia;
    public static volatile SingularAttribute<Turno, Integer> id_turno;
    public static volatile ListAttribute<Turno, Turno> listaTurnos;

}