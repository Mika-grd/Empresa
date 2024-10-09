/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EmpleadoFreelance;
import co.edu.uniquindio.poo.model.EmpleadoPorHora;
import co.edu.uniquindio.poo.model.EmpleadoTiempoCompleto;
import co.edu.uniquindio.poo.model.Empresa;

/**
 * Unit test for simple App.
 */
public class EmpresaTest {
    private static final Logger LOG = Logger.getLogger(EmpresaTest.class.getName());


    private static Empresa empresa;
    private static EmpleadoPorHora emph1;
    private static EmpleadoTiempoCompleto emptp1;
    private static EmpleadoFreelance empfl1;


    @BeforeAll
    public static void setUp(){
        empresa = new Empresa("emp");
        emph1 = new EmpleadoPorHora("jairo", "123", 100, 20000);
        emptp1 = new EmpleadoTiempoCompleto("Maicol", "1234", 3456789);
        empfl1 = new EmpleadoFreelance("Robinson", "12", 3, 12000000);
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void calcularSalarioEmpleadoTiempoCompleto() {
        LOG.info("Iniciado test calcularSalarioEmpleadoTiempoCompleto");
        empresa.añadirEmpleado(emptp1);

        assertEquals(3456789, emptp1.calcularSalario());
        LOG.info("Finalizando test calcularSalarioEmpleadoTiempoCompleto");
    }

    @Test
    public void calcularSalarioEmpleadoPorHora() {
        LOG.info("Iniciado test calcularSalarioEmpleadoPorHora");
        empresa.añadirEmpleado(emph1);

        assertEquals(100*20000, emph1.calcularSalario());
        LOG.info("Finalizando test calcularSalarioEmpleadoPorHora");
    }

    @Test
    public void calcularSalarioEmpleadoFreelance() {
        LOG.info("Iniciado test calcularSalarioEmpleadoFreelance");
        empresa.añadirEmpleado(empfl1);

        assertEquals(12000000 * 3, empfl1.calcularSalario());
        LOG.info("Finalizando test calcularSalarioEmpleadoFreelance");
    }

}
