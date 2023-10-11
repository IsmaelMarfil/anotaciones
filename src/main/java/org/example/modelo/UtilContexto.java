package org.example.modelo;

import org.example.anotaciones.EmpleadoAnot;
import org.example.anotaciones.EmpleadosAnot;

public class UtilContexto {
    public  static void  cargadorDeContexto(Empresa empresa){
        EmpleadosAnot empleadoAnotPadre = empresa.getClass().getAnnotation(EmpleadosAnot.class);
        EmpleadoAnot[] empleadoAnotHijos = empleadoAnotPadre.value();

        for (EmpleadoAnot empleadoAnotHijo : empleadoAnotHijos) {
            String nombre = empleadoAnotHijo.nombre();
            String apellidos = empleadoAnotHijo.apellidos();
            String DNI = empleadoAnotHijo.DNI();
            String direccion = empleadoAnotHijo.direccion();
            String telefono = empleadoAnotHijo.telefono();
            if (empleadoAnotHijo.clase().equals("Operario")){

            }else if(empleadoAnotHijo.clase().equals("Oficial")){
            } else {

            }
        }
}
