package descansoApp.dominio;

import descansoApp.dominio.Sistema;
import descansoApp.dominio.Ciudad;
import descansoApp.dominio.Viaje;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {

    @Test
    public void testGetListaViajes() throws Exception {
        final Viaje viaje= new Viaje();
        viaje.setNombre("viaje");
        final Sistema instance = new Sistema();
        instance.agregarViaje(viaje);
        final ArrayList<Viaje> expResult= new ArrayList();
        expResult.add(viaje);
        final ArrayList<Viaje> result = instance.getListaViajes();
        assertEquals("testGetListaViajes",expResult, result);
    }

    @Test
    public void testGetListaCiudades() {
        final Sistema instance = new Sistema();
        final Ciudad ciudad= new Ciudad();
        instance.agregarCiudad(ciudad);
        final ArrayList<Ciudad> expResult = new ArrayList();
        expResult.add(ciudad);
        final ArrayList<Ciudad> result = instance.getListaCiudades();
        assertEquals("testGetListaCiudades",expResult, result);
    }
    
    @Test
    public void testAgregarViaje() throws Exception {
        final Viaje viaje = new Viaje();
        viaje.setNombre("Viaje");
        final Sistema instance = new Sistema();
        instance.agregarViaje(viaje);
        final ArrayList<Viaje> expResult= new ArrayList();
        expResult.add(viaje);
        final ArrayList<Viaje> result = instance.getListaViajes();
        assertEquals("testAgregarViaje",expResult, result);
    }

    @Test
    public void testAgregarViaje2() throws Exception {
        final Viaje viaje = new Viaje();
        viaje.setNombre("Viaje");
        final Viaje viaje2 = new Viaje();
        viaje2.setNombre("Viaje");
        final Sistema instance = new Sistema();
        Exception error= null;
        instance.agregarViaje(viaje);
        try {
            instance.agregarViaje(viaje2);
        } catch (Exception e) {
            error=e;
        }
        final String expResult="El nombre del viaje ya existe. Por favor ingrese uno nuevo.";
        final String result = error.getMessage();
        assertEquals("testAgregarViaje2",expResult, result);
    }

    @Test
    public void testEliminarViaje() throws Exception {
        final Viaje unViaje = new Viaje();
        unViaje.setNombre("Viaje");
        final Sistema instance = new Sistema();
        instance.agregarViaje(unViaje);
        final boolean expResult = true;
        final boolean result = instance.eliminarViaje(unViaje);
        assertEquals("testEliminarViaje",expResult, result);
    }
    
    
    @Test
    public void testEliminarViaje2() {
        final Viaje unViaje = new Viaje();
        unViaje.setNombre("Viaje");
        final Sistema instance = new Sistema();
        final boolean expResult = false;
        final boolean result = instance.eliminarViaje(unViaje);
        assertEquals("testEliminarViaje2",expResult, result);
    }

    @Test
    public void testPertenece() {
        final Viaje viaje = new Viaje();
        viaje.setNombre("Viaje");
        final Sistema instance = new Sistema();
        final boolean expResult = false;
        final boolean result = instance.pertenece(viaje);
        assertEquals("testPertenece",expResult, result);
    }
    
    @Test
    public void testPertenece2() throws Exception {
        final Viaje unViaje = new Viaje();
        unViaje.setNombre("Viaje");
        final Sistema instance = new Sistema();
        instance.agregarViaje(unViaje);
        final boolean expResult = true;
        final boolean result = instance.pertenece(unViaje);
        assertEquals("testPertenece2",expResult, result);
    }

    
    @Test
    public void testAgregarCiudad() {
        Ciudad ciudad = new Ciudad();
        ciudad.setNombre("Fray Bentos");
        final Sistema instance = new Sistema();
        instance.agregarCiudad(ciudad);
        final ArrayList<Ciudad> expResult= new ArrayList();
        expResult.add(ciudad);
        final ArrayList<Ciudad> result = instance.getListaCiudades();
        assertEquals("testAgregarCiudad",expResult, result);
    }
}