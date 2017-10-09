package descansoApp.dominio;

import java.util.ArrayList;
import descansoApp.herramientas.Buscador;
import descansoApp.herramientas.EsNumero;
import org.junit.Test;

import static org.junit.Assert.*;

public class HerramientasTest {

    @Test
    public void testBuscarNombre() {
        final Ciudad ciudad = new Ciudad();
        ciudad.setNombre("unNombre");
        ciudad.setDescripcion("unaDescripcion");
        ciudad.setInfoGral("unaInfoGral");
        final ArrayList<Ciudad> listaCiudades = new ArrayList<>();
        listaCiudades.add(ciudad);
        final Buscador buscador = new Buscador(listaCiudades);
        final ArrayList<Ciudad> expResult = listaCiudades;
        final ArrayList<Ciudad> result = buscador.buscar("unNombre");
        assertEquals("testBuscarNombre", expResult, result);
    }

    @Test
    public void testBuscarDescripcion() {
        final Ciudad ciudad = new Ciudad();
        ciudad.setNombre("unNombre");
        ciudad.setDescripcion("unaDescripcion");
        ciudad.setInfoGral("unaInfoGral");
        final ArrayList<Ciudad> listaCiudades = new ArrayList<>();
        listaCiudades.add(ciudad);
        final Buscador buscador = new Buscador(listaCiudades);
        final ArrayList<Ciudad> expResult = listaCiudades;
        final ArrayList<Ciudad> result = buscador.buscar("unaDescripcion");
        assertEquals("testBuscarDescripcion", expResult, result);
    }

    @Test
    public void testBuscarInfoGral() {
        final Ciudad ciudad = new Ciudad();
        ciudad.setNombre("unNombre");
        ciudad.setDescripcion("unaDescripcion");
        ciudad.setInfoGral("unaInfoGral");
        final ArrayList<Ciudad> listaCiudades = new ArrayList<>();
        listaCiudades.add(ciudad);
        final Buscador buscador = new Buscador(listaCiudades);
        final ArrayList<Ciudad> expResult = listaCiudades;
        final ArrayList<Ciudad> result = buscador.buscar("unaInfoGral");
        assertEquals("testBuscarInfoGral", expResult, result);
    }

    @Test
    public void testEsNumeroSi() {
        final EsNumero esNumero = new EsNumero();
        final boolean expResult = true;
        final boolean result = EsNumero.esNumero("1");
        assertEquals("testEsNumeroSi", expResult, result);
    }

    @Test
    public void testEsNumeroNo() {
        final EsNumero esNumero = new EsNumero();
        final boolean expResult = false;
        final boolean result = EsNumero.esNumero("UNO");
        assertEquals("testEsNumeroNo", expResult, result);
    }
}
