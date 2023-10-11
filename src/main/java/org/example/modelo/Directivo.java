package org.example.modelo;



public class Directivo extends Empleado {
    int codigoDespacho;

    public Directivo(String nombre, String apellidos, String DNI, String direccion, String telefono, int codigoDespacho) {
        super(nombre, apellidos, DNI, direccion, telefono);
        this.codigoDespacho = codigoDespacho;
    }


}
