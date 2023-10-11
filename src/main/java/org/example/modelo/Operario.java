package org.example.modelo;

import org.example.anotaciones.EmpleadoAnot;

public class Operario extends Empleado  {
    protected Integer codigoTaller;

    public Operario(String nombre, String apellidos, String DNI, String direccion, String telefono, Integer codigoTaller) {
        super(nombre, apellidos, DNI, direccion, telefono);
        this.codigoTaller = codigoTaller;
    }
}

