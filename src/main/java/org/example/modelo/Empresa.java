package org.example.modelo;

import org.example.anotaciones.Empleado;
import org.example.anotaciones.Empleados;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

@Empleado(nombre = "Ismael", apellidos = "", DNI = "", direccion = "", telefono = "", clase = "", codigoDespacho = 0)
public class Empresa {
    Set<org.example.modelo.Empleado> empleadoList;

    public Empresa(){

    }

    public static void cargadorcontexto(Empresa empresa) {
        empresa.getClass().getAnnotation(Empleados.class);
        Annotation[] anotaciones = empresa.getClass().getAnnotations();

        for (Annotation annotation:
            anotaciones ) {
            if(annotation instanceof org.example.anotaciones.Empleado){
                String nombre = ((org.example.anotaciones.Empleado) annotation).nombre();
                System.out.println(annotation);
            }
        }

    }
}
