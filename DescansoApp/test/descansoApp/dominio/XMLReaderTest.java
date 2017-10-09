package descansoApp.dominio;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class XMLReaderTest {
    @Test
    public void testCargarCiudades() {
        final ArrayList<Ciudad> ciudadList = XMLReader.cargarCiudades();
        final String expResult = "Montevideo";
        final String result = ciudadList.get(0).getNombre();
        assertEquals("testGetNombre",expResult, result);
    }
}
