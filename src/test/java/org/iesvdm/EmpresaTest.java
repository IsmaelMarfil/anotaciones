package org.iesvdm;
import org.example.modelo.Empresa;
import org.example.modelo.UtilContexto;
import org.junit.Assert;
import org.junit.Test;
import org.example.modelo.Empleado;

public class EmpresaTest {
    @Test
    public void testProcesador(){
        Empresa e = new Empresa();

        UtilContexto.cargadorDeContexto(e);

        for (Empleado empleado:
             e.getEmpleadoSet()) {
            String nombre = empleado.getNombre();
            if (empleado.getApellidos().equalsIgnoreCase("marfil")) {
                Assert.assertEquals("Ismael", nombre);
            }else{
                Assert.assertEquals("Jose", empleado.getNombre());
            }
        }


    }

}
