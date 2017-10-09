package descansoApp.dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

public class ViajeTest {

    @Test
    public void testGetNombre() {
        final String nombre = "Viaje";
        final Viaje instance = new Viaje(nombre, null, null);
        final String expResult = "Viaje";
        final String result = instance.getNombre();
        assertEquals("testGetNombre",expResult, result);
    }

    @Test
    public void testSetNombre() {
        final String nombre = "Viaje";
        final Viaje instance = new Viaje();
        instance.setNombre(nombre);
        final String expResult = "Viaje";
        final String result = instance.getNombre();
        assertEquals("testSetNombre",expResult, result);
    }

    @Test
    public void testSetFechaI() throws Exception {
        final Calendar fechaI = new GregorianCalendar(2020, 11, 2);
        final Viaje instance = new Viaje();
        instance.setFechaI(fechaI);
        final Calendar expResult = new GregorianCalendar(2020, 11, 2);
        final Calendar result = instance.getFechaI();
        assertEquals("testSetFechaI",expResult, result);
    }

    @Test
    public void testSetFechaI2() {
        final Calendar fechaI = new GregorianCalendar(2012, 11, 2);
        final Viaje instance = new Viaje();
        Exception error = null;
        try {
            instance.setFechaI(fechaI);
        } catch (Exception e) {
                error=e;
        }
        final String expResult = "La fecha de inicio del viaje debe ser la actual o una futura.";
        final String result = error.getMessage();
        assertEquals("testSetFechaI2",expResult, result);
    }

    @Test
    public void testSetFechaF() throws Exception {
        final Calendar fechaI = new GregorianCalendar(2013, 11, 15);
        final Calendar fechaF = new GregorianCalendar(2013, 11, 17);
        final Viaje instance = new Viaje();
        instance.setFechaF(fechaI, fechaF);
        final Calendar expResult = new GregorianCalendar(2013, 11, 17);
        final Calendar result = instance.getFechaF();
        assertEquals("testSetFechaF",expResult, result);
    }

    @Test
    public void testFechaF2() throws Exception {
        final Calendar fechaI = new GregorianCalendar(2013, 11, 15);
        final Calendar fechaF = new GregorianCalendar(2013, 11, 15);
        final Viaje instance = new Viaje();
        instance.setFechaF(fechaI, fechaF);
        final Calendar expResult = new GregorianCalendar(2013, 11, 15);
        final Calendar result = instance.getFechaF();
        assertEquals("testFechaF2",expResult, result);
    }

    @Test
    public void testFechaF3() throws Exception {
        final Calendar fechaI = new GregorianCalendar(2013, 11, 15);
        final Calendar fechaF = new GregorianCalendar(2013, 11, 14);
        final Viaje instance = new Viaje();
        Exception error = null;
        try{
            instance.setFechaF(fechaI, fechaF);
        }catch (Exception e){
            error=e;
        }

        final String expResult= "La fecha final debe ser mayor a la fecha de inicio.";
        final String result = error.getMessage();
        assertEquals("testFechaF3",expResult, result);
    }

    @Test
    public void testGetItinerario() throws Exception {
        final Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        final Viaje instance = new Viaje();
        instance.agregarEvento(unEvento);
        final ArrayList<Evento> expResult = new ArrayList();
        expResult.add(unEvento);
        final ArrayList<Evento> result = instance.getItinerario();
        assertEquals("testGetItinerario",expResult, result);
    }

    @Test
    public void testAgregarEvento() throws Exception {
        final Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        final Viaje instance = new Viaje();
        instance.agregarEvento(unEvento);
        final ArrayList<Evento> expResult = new ArrayList();
        expResult.add(unEvento);
        final ArrayList<Evento> result = instance.getItinerario();
        assertEquals("testAgregarEvento",expResult, result);
    }

    @Test
    public void testAgregarEvento2() throws Exception {
        final Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        final Evento evento2 = new Evento();
        evento2.setNombre("evento");
        final Viaje instance = new Viaje();
        instance.agregarEvento(unEvento);
        Exception error = null;
        try {
            instance.agregarEvento(evento2);
        } catch (Exception e) {
            error = e;
        }
        final String expResult = "El nombre del evento ya existe. Por favor ingrese uno nuevo.";
        final String result = error.getMessage();
        assertEquals("testAgregarEvento2",expResult, result);
    }

    @Test
    public void testEliminarEvento() throws Exception {
        final Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        final Viaje instance = new Viaje();
        instance.agregarEvento(unEvento);
        final boolean expResult = true;
        final boolean result = instance.eliminarEvento(unEvento);
        assertEquals("testEliminarEvento",expResult, result);
    }

    @Test
    public void testEliminarEvento2() {
        final Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        final Viaje instance = new Viaje();
        final boolean expResult = false;
        final boolean result = instance.eliminarEvento(unEvento);
        assertEquals("testEliminarEvento2",expResult, result);
    }

    @Test
    public void testPertenece() throws Exception {
        final Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        final Viaje instance = new Viaje();
        instance.agregarEvento(unEvento);
        final boolean expResult = true;
        final boolean result = instance.pertenece(unEvento);
        assertEquals("testPertenece",expResult, result);
    }

    @Test
    public void testPertenece2() {
        final Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        final Viaje instance = new Viaje();
        final boolean expResult = false;
        final boolean result = instance.pertenece(unEvento);
        assertEquals("testPertenece2",expResult, result);
    }

    @Test
    public void testToString() throws Exception {
        final Viaje viaje = new Viaje();
        final Calendar calendar = new GregorianCalendar(2020, 11, 3);
        viaje.setFechaI(calendar);
        Calendar calendar1 = new GregorianCalendar(2020, 11, 5);
        viaje.setFechaF(calendar, calendar1);
        String expResult = " (03/12/2020 - 05/12/2020)";
        final String result = viaje.toString();
        assertEquals("testToString",expResult, result);
    }
    
    
    @Test
    public void  testFechaToString() throws Exception{
        final Viaje viaje = new Viaje();
        final Calendar calendar = new GregorianCalendar(2020, 5, 3);
        viaje.setFechaI(calendar);
        final Calendar calendar1 = new GregorianCalendar(2020, 8, 15);
        viaje.setFechaF(calendar, calendar1);
        final String expResult = " (03/06/2020 - 15/09/2020)";
        final String result = viaje.fechaToString();
        assertEquals("testFechaToString",expResult, result);
    }
    

    @Test
    public void testEquals() {
        final Viaje viaje = new Viaje();
        viaje.setNombre("viaje1");
        final Viaje viaje1 = new Viaje();
        viaje1.setNombre("viaje2");
        final boolean expResult = false;
        final boolean result = viaje.equals(viaje1);
        assertEquals("testEquals",expResult, result);
    }

    @Test
    public void testEquals2() {
        final Viaje viaje = new Viaje();
        viaje.setNombre("viaje1");
        final Viaje viaje1 = new Viaje();
        viaje1.setNombre("viaje1");
        final boolean expResult = true;
        final boolean result = viaje.equals(viaje1);
        assertEquals("testEquals2",expResult, result);
    }
}
