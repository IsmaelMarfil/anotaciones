package org.example.modelo;

import org.example.anotaciones.EmpleadoAnot;

import java.util.HashSet;
import java.util.Set;

@EmpleadoAnot(nombre = "Ismael", apellidos = "Marfil", DNI = "12345678A", direccion = "Calle Goya 33", telefono = "666666666")
@EmpleadoAnot(nombre = "Jose", apellidos = "Lopez", DNI = "12345678B", direccion = "Calle Goya 34", telefono = "777666666")
public class Empresa {
    private Set<Empleado> empleadoSet = new HashSet<>();

    public Empresa(){

    }

    public Set<Empleado> getEmpleadoSet() {
        return empleadoSet;
    }

    public void setEmpleadoSet(Set<Empleado> empledoSet) {
        this.empleadoSet = empledoSet;
    }

}


