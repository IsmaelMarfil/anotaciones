package org.example.modelo;

public class Empleado {
    protected String nombre;
    protected String apellidos;
    protected String DNI;
    protected String direccion;
    protected String telefono;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + this.nombre + '\'' +
                ", apellidos='" + this.apellidos + '\'' +
                '}';
    }
}
