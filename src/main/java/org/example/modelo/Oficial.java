package org.example.modelo;

public class Oficial extends Operario{
    String categoria;

    public Oficial(String nombre, String apellidos, String DNI, String direccion, String telefono, Integer codigoTaller, String categoria) {
        super(nombre, apellidos, DNI, direccion, telefono, codigoTaller);
        this.categoria = categoria;
    }
}

