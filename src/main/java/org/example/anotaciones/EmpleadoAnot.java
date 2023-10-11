package org.example.anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(EmpleadosAnot.class)
@Target(ElementType.TYPE)
public @interface EmpleadoAnot {

    String nombre() default  "VOID";
    String apellidos();

    String DNI();
    String direccion();
    String telefono();
    public  String  clase() default "Empleado";



}
