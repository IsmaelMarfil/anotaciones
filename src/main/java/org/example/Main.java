package org.example;

import org.example.anotaciones.EmpleadoAnot;
import org.example.modelo.Empleado;
import org.example.modelo.Empresa;
import org.example.modelo.UtilContexto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        UtilContexto.cargadorDeContexto(empresa);
        for (Empleado empleado:
             empresa.getEmpleadoSet()) {
            System.out.println(empleado.toString());
        }
    }
}