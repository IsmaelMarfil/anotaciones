package org.example.modelo;

public class Tecnico extends Operario{
    String perfil;
    public Tecnico(String nombre, String apellidos, String DNI, String direccion, String telefono, Integer codigoTaller, String perfil) {
        super(nombre, apellidos, DNI, direccion, telefono, codigoTaller);
        this.perfil = perfil;
    }
}

