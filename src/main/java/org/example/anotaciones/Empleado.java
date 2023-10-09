package org.example.anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Empleados.class)
@Target(ElementType.TYPE)
public @interface Empleado {

    String nombre ();
     String apellidos ();
     String DNI();
     String direccion();
     String telefono ();
     String clase();
     int codigoDespacho();

}
