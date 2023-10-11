package org.example.modelo;

import org.example.anotaciones.EmpleadoAnot;
import org.example.anotaciones.EmpleadosAnot;

public class UtilContexto {
    public UtilContexto() {
    }

    public static void cargadorDeContexto(Empresa empresa) {
        EmpleadosAnot empleadoAnotPadre = empresa.getClass().getAnnotation(EmpleadosAnot.class);
        EmpleadoAnot[] empleadoAnotHijos = empleadoAnotPadre.value();
        for (EmpleadoAnot empleadoAnotHijo : empleadoAnotHijos) {
            String nombre = empleadoAnotHijo.nombre();
            String apellidos = empleadoAnotHijo.apellidos();
            String DNI = empleadoAnotHijo.DNI();
            String direccion = empleadoAnotHijo.direccion();
            String telefono = empleadoAnotHijo.telefono();
            if (empleadoAnotHijo.clase().equals("Operario")) {
                empresa.getEmpleadoSet().add(new Operario(nombre, apellidos, DNI, direccion, telefono, 1));
            } else if (empleadoAnotHijo.clase().equals("Directivo")) {
                empresa.getEmpleadoSet().add(new Directivo(nombre, apellidos, DNI, direccion, telefono,1));
            } else {
                empresa.getEmpleadoSet().add(new Empleado(nombre, apellidos, DNI, direccion, telefono));
            }
        }
    }
}
