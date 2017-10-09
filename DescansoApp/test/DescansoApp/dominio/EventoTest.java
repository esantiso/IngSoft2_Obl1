package descansoApp.dominio;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventoTest {

    @Test
    public void testGetNombre() {
        final String nombre = "Evento";
        final Evento instance = new Evento(nombre, null, null, "", "", null);
        final String expResult = "Evento";
        final String result = instance.getNombre();
        assertEquals("testGetNombre",expResult, result);
    }
    
    @Test
    public void testSetNombre() {
        final String nombre = "Evento";
        final Evento instance = new Evento();
        instance.setNombre(nombre);
        final String expResult = "Evento";
        final String result = instance.getNombre();
        assertEquals("testSetNombre",expResult, result);
    }

    @Test
    public void testSetFechaHoraI() throws Exception {
        final Calendar fechaHoraI= new GregorianCalendar(2020, 9, 20, 21, 30);
        final Evento instance = new Evento();
        instance.setFechaHoraI(fechaHoraI);
        final Calendar expResult = new GregorianCalendar(2020, 9, 20,21,30);
        final Calendar result = instance.getFechaHoraI();
        assertEquals("testSetFechaHoraI",expResult, result);
    }
    
    @Test
    public void testSetFechaHoraI2(){
        final Calendar fechaHoraI= new GregorianCalendar(2013, 8, 20, 20, 31);
        final Evento instance = new Evento();
        Exception error= null;
        try {
            instance.setFechaHoraI(fechaHoraI);
        } catch (Exception e) {
            error=e;
        }
        final String expResult = "La fecha de inicio del evento debe ser la actual o una futura.";
        final String result= error.getMessage();
        assertEquals("testSetFechaHoraI2",expResult, result);
    }
   
    @Test
    public void testSetFechaHoraI3(){
        final Calendar fechaHoraI= Calendar.getInstance();
        fechaHoraI.set(Calendar.HOUR_OF_DAY, 0);
        fechaHoraI.set(Calendar.MINUTE, 0);
        final Evento instance = new Evento();
        Exception error=null;
        try {
            instance.setFechaHoraI(fechaHoraI);
        } catch (Exception e) {
            error=e;
        }
        final String expResult= "El evento esta programado para hoy, entonces la hora de inicio debe ser mayor a la actual.";
        final String result = error.getMessage();
        assertEquals("testSetFechaHoraI3",expResult, result);
    }

    @Test
    public void testFechaHoraF() throws Exception {
        final Calendar fechaHoraF= new GregorianCalendar(2013, 11, 19, 16, 16);
        final Calendar fechaHoraI= new GregorianCalendar(2013, 11, 14 ,16, 16);
        final Evento instance = new Evento();
        instance.setFechaHoraF(fechaHoraI,fechaHoraF);
        final Calendar expResult = new GregorianCalendar(2013, 11, 19, 16, 16);
        final Calendar result = instance.getFechaHoraF();
        assertEquals("testFechaHoraF",expResult, result);
    }

    @Test
    public void testSetFechaHoraF2(){
        final Calendar fechaHoraI= new GregorianCalendar(2020 ,9, 20 ,10 ,10);
        final Calendar fechaHoraF= new GregorianCalendar(2020, 9, 15, 20, 20);
        final Evento instance = new Evento();
        Exception error= null;
        try {
            instance.setFechaHoraF(fechaHoraI, fechaHoraF);
        } catch (Exception e) {
            error=e;
        }
        final String expResult="La fecha final debe ser mayor a la fecha de inicio.";
        final String result= error.getMessage();
        assertEquals("testSetFechaHoraF2",expResult, result);
    }
    
    @Test 
    public void testSetFechaHoraF3(){
        final Calendar fechaHoraI= new GregorianCalendar(2020, 10, 10, 10, 20);
        final Calendar fechaHoraF= new GregorianCalendar(2020, 10, 10, 5, 10);
        final Evento instance = new Evento();
        Exception error= null;
        try {
            instance.setFechaHoraF(fechaHoraI, fechaHoraF);
        } catch (Exception e) {
            error=e;
        }
        final String expResult ="La hora de finalización debe ser mayor a la hora de inicio del evento.";
        final String result= error.getMessage();
        assertEquals("testSetFechaHoraF3",expResult, result);
    }
    
    @Test
    public void testGetDescripcion() {
        final String descripcion = "Aqui va la descripcion";
        final Evento instance = new Evento("", null, null, descripcion, "", null);
        final String expResult = "Aqui va la descripcion";
        final String result = instance.getDescripcion();
        assertEquals("testGetDescripcion",expResult, result);
    }

    @Test
    public void testSetDescripcion() {
        final String descripcion = "Aqui va la descripcion";
        final Evento instance = new Evento();
        instance.setDescripcion(descripcion);
        final String expResult = "Aqui va la descripcion";
        final String result = instance.getDescripcion();
        assertEquals("testSetDescripcion",expResult, result);
    }
    
    @Test
    public void testGetUbicacion() {
        final String ubicacion = "18 de julio 2080";
        final Evento instance = new Evento("", null, null,"", ubicacion, null);
        final String expResult = "18 de julio 2080";
        final String result = instance.getUbicacion();
        assertEquals("testGetUbicacion",expResult, result);
    }
    
    @Test
    public void testSetUbicacion() {
        final String ubicacion = "18 de julio 2080";
        final Evento instance = new Evento();
        instance.setUbicacion(ubicacion);
        final String expResult = "18 de julio 2080";
        final String result = instance.getUbicacion();
        assertEquals("testSetUbicacion",expResult, result);
    }

    @Test
    public void testGetCiudad() {
        final Ciudad ciudad= new Ciudad("Fray Bentos");
        final Evento instance = new Evento("", null, null,"", "", ciudad);
        final Ciudad expResult = ciudad;
        final Ciudad result = instance.getCiudad();
        assertEquals("testGetCiudad",expResult, result);
    }
    
     @Test
    public void testSetCiudad() {
         final Evento instance = new Evento();
         final Ciudad ciudad= new Ciudad();
         ciudad.setNombre("Fray Bentos");
         instance.setCiudad(ciudad);
         final Ciudad expResult = ciudad;
         final Ciudad result = instance.getCiudad();
         assertEquals("testSetCiudad",expResult, result);
     }

    @Test
    public void testToString() throws Exception {
        final Evento evento = new Evento();
        evento.setNombre("Evento");
        final Calendar calendar = new GregorianCalendar(2020, 11, 3, 10, 8);
        evento.setFechaHoraI(calendar);
        evento.setUbicacion("Ubicacion");
        final String expResult = "10:08 - Evento (Ubicacion)";
        final String result = evento.toString();
        assertEquals("testToString",expResult, result);
    }
    
    
    @Test
    public void testHoraInicioToString() throws Exception {
        final Evento evento = new Evento();
        final Calendar calendar = new GregorianCalendar(2020, 11, 3, 10, 8);
        evento.setFechaHoraI(calendar);
        final String expResult = "10:08";
        final String result = evento.horaInicioToString();
        assertEquals("testHoraInicioToString",expResult, result);
    }
    
    @Test 
    public void testHoraFinToString() throws Exception{
        final Evento evento = new Evento();
        final Calendar calendar = new GregorianCalendar(2015, 11, 3, 21, 32);
        final Calendar calendar1 = new GregorianCalendar(2015, 11, 10, 20, 30);
        evento.setFechaHoraF(calendar, calendar1);
        final String expResult= "20:30";
        final String result = evento.horaFinToString();
        assertEquals("testHoraFinToString",expResult, result);
    }
    
    @Test
    public void testFechaInicioToString() throws Exception{
        final Evento evento= new Evento();
        final Calendar calendar= new GregorianCalendar(2020, 10, 3, 2, 15);
        evento.setFechaHoraI(calendar);
        final String expResult= "03/11/2020";
        final String result= evento.fechaInicioToString();
        assertEquals("testFechaInicioToString",expResult, result);
    }
    
    @Test 
    public void testFechaFinToSTring() throws Exception{
        final Evento evento = new Evento();
        final Calendar calendar= new GregorianCalendar(2015,2,3,2,15);
        final Calendar calendar1= new GregorianCalendar(2015,5,15,20,10);
        evento.setFechaHoraF(calendar, calendar1);
        final String expResult = "15/06/2015";
        final String result = evento.fechaFinToString();
        assertEquals("testFechaFinToSTring",expResult, result);
    }
    
    @Test
    public void testEquals() {
        final Evento evento= new Evento();
        evento.setNombre("Evento1");
        final Evento evento1= new Evento();
        evento1.setNombre("Evento2");
        final boolean expResult = false;
        final boolean result = evento.equals(evento1);
        assertEquals("testEquals",expResult, result);
    }
    @Test
    public void testEquals2() {
        final Evento evento= new Evento();
        evento.setNombre("Evento1");
        final Evento evento1= new Evento();
        evento1.setNombre("Evento1");
        final boolean expResult = true;
        final boolean result = evento.equals(evento1);
        assertEquals("testEquals2",expResult, result);
    }
    @Test
    public void testCompareTo() throws Exception {
        final Evento evento= new Evento();
        final Calendar calendar= new GregorianCalendar(2020, 10, 3, 2, 15);
        evento.setFechaHoraI(calendar);
        final Evento evento1= new Evento();
        final Calendar calendar1= new GregorianCalendar(2020, 10, 3, 2, 15);
        evento1.setFechaHoraI(calendar1);
        final int expResult = 0;
        final int result = evento.compareTo(evento1);
        assertEquals("testCompareTo",expResult, result);
    }
    
     @Test
    public void testCompareTo2() throws Exception {
         final Evento evento= new Evento();
         final Calendar calendar= new GregorianCalendar(2020, 10, 3, 2, 15);
         evento.setFechaHoraI(calendar);
         final Evento evento1= new Evento();
         final Calendar calendar1= new GregorianCalendar(2020, 9, 4, 12, 34);
         evento1.setFechaHoraI(calendar1);
         final int expResult = 1;
         final int result = evento.compareTo(evento1);
         assertEquals("testCompareTo2",expResult, result);
     }
    
    @Test
    public void testCompareTo3() throws Exception {
        final Evento evento= new Evento();
        final Calendar calendar= new GregorianCalendar(2020, 9, 4, 12, 34);
        evento.setFechaHoraI(calendar);
        final Evento evento1= new Evento();
        final Calendar calendar1= new GregorianCalendar(2020, 10, 3, 2, 15);
        evento1.setFechaHoraI(calendar1);
        final int expResult = -1;
        final int result = evento.compareTo(evento1);
        assertEquals("testCompareTo3",expResult, result);
    }
}