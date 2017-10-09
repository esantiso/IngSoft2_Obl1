package descansoApp.dominio;

import descansoApp.dominio.ComercioActividad;
import descansoApp.herramientas.TipoCA;
import org.junit.Test;

import javax.swing.ImageIcon;
import static descansoApp.herramientas.TipoCA.*;
import static org.junit.Assert.*;


public class ComercioActividadTest {

    @Test
    public void testGetNombre() {
        final String nombre= "ComercioActividad";
        final ComercioActividad instance = new ComercioActividad(nombre,"",null,"","","","","","");
        final String expResult = "ComercioActividad";
        final String result = instance.getNombre();
        assertEquals("ComercioActividadTest",expResult, result);
    }
    
     @Test
    public void testSetNombre() {
         final String nombre= "ComercioActividad";
         final ComercioActividad instance = new ComercioActividad();
         instance.setNombre(nombre);
         final String expResult = "ComercioActividad";
         final String result = instance.getNombre();
         assertEquals("testSetNombre",expResult, result);
    }
    
    @Test
    public void testGetDetalles() {
        final String detalles= "Aqui va el detalle";
        final ComercioActividad instance = new ComercioActividad("",detalles,null,"","","","","","");
        final String expResult = "Aqui va el detalle";
        final String result = instance.getDetalles();
        assertEquals("testGetDetalles",expResult, result);
    }

    
    @Test
    public void testSetDetalles() {
        final String detalles= "Aqui va el detalle";
        final ComercioActividad instance = new ComercioActividad();
        instance.setDetalles(detalles);
        final String expResult = "Aqui va el detalle";
        final String result = instance.getDetalles();
        assertEquals("testSetDetalles",expResult, result);
    }

    @Test
    public void testGetTipo() {
        final ComercioActividad instance = new ComercioActividad("","",alojamiento,"","","","","","");
        final TipoCA expResult = alojamiento;
        final TipoCA result= instance.getTipo();
        assertEquals("testGetTipo",expResult, result);
    }
    
    @Test
    public void testSetTipo() {
        final TipoCA tipo = alojamiento;
        final ComercioActividad instance = new ComercioActividad();
        instance.setTipo(tipo);
        final TipoCA expResult = alojamiento;
        final TipoCA result= instance.getTipo();
        assertEquals("testSetTipo",expResult, result);
    }
    
    @Test
    public void testGetCategoria() {
        final String cat = "Hotel";
        final ComercioActividad instance = new ComercioActividad("","",null,cat,"","","","","");
        final String expResult = "Hotel";
        final String result= instance.getCategoria();
        assertEquals("testGetCategoria",expResult, result);
    }

     @Test
    public void testSetCategoria() {
         final String cat = "Hotel";
         final ComercioActividad instance = new ComercioActividad();
         instance.setCategoria(cat);
         final String expResult = "Hotel";
         final String result= instance.getCategoria();
         assertEquals("testSetCategoria",expResult, result);
    }

    @Test
    public void testGetHorario() {
        final String horario= "Lunes a Viernes de 06:00 a 22:00 ";
        final ComercioActividad instance = new ComercioActividad("","",null,"",horario,"","","","");
        final String expResult = "Lunes a Viernes de 06:00 a 22:00 ";
        final String result = instance.getHorario();
        assertEquals("testGetHorario",expResult, result);
    }
    
       @Test
    public void testSetHorario() {
           final String horario= "Lunes a Viernes de 06:00 a 22:00 ";
           final ComercioActividad instance = new ComercioActividad();
           instance.setHorario(horario);
           final String expResult = "Lunes a Viernes de 06:00 a 22:00 ";
           final String result = instance.getHorario();
           assertEquals("testSetHorario",expResult, result);
    }
    
    @Test
    public void testGetUbicacion() {
        final String ubicacion= "18 de julio c/ Ejido 1850";
        final ComercioActividad instance = new ComercioActividad("","",null,"","",ubicacion,"","","");
        final String expResult = "18 de julio c/ Ejido 1850";
        final String result = instance.getUbicacion();
        assertEquals("testGetUbicacion",expResult, result);
    }
    
    
     @Test
    public void testSetUbicacion() {
         final String ubicacion= "18 de julio c/ Ejido 1850";
         final ComercioActividad instance = new ComercioActividad();
         instance.setUbicacion(ubicacion);
         final String expResult = "18 de julio c/ Ejido 1850";
         final String result = instance.getUbicacion();
         assertEquals("testSetUbicacion",expResult, result);
    }
    
    @Test
    public void testGetTelefono() {
        final String tel= "555-589-874";
        final ComercioActividad instance = new ComercioActividad("","",null,"","","",tel,"","");
        final String expResult = "555-589-874";
        final String result = instance.getTelefono();
        assertEquals("testGetTelefono",expResult, result);
    }
    
    @Test
    public void testSetTelefono() {
        final String tel= "555-589-874";
        final ComercioActividad instance = new ComercioActividad();
        instance.setTelefono(tel);
        final String expResult = "555-589-874";
        final String result = instance.getTelefono();
        assertEquals("testSetTelefono",expResult, result);
    }

    @Test
    public void testGetWeb() {
        final String web = "www.alojamiento.com";
        final ComercioActividad instance = new ComercioActividad("","",null,"","","","",web,"");
        final String expResult="www.alojamiento.com";
        final String result= instance.getWeb();
        assertEquals("testGetWeb",expResult, result);
    }

    @Test
    public void testSetWeb() {
        final String web = "www.alojamiento.com";
        final ComercioActividad instance = new ComercioActividad();
        instance.setWeb(web);
        final String expResult="www.alojamiento.com";
        final String result= instance.getWeb();
        assertEquals("testSetWeb",expResult, result);
    }
    
    @Test
    public void testGetPrecio() {
        final String precio = "1000,5";
        final ComercioActividad instance = new ComercioActividad("","",null,"","","","","",precio);
        final String expResult = "1000,5";
        final String result = instance.getPrecio();
        assertEquals("testGetPrecio",expResult, result);
    }
    
    @Test
    public void testSetPrecio() {
        final String precio = "1000,5";
        final ComercioActividad instance = new ComercioActividad();
        instance.setPrecio(precio);
        final String expResult = "1000,5";
        final String result = instance.getPrecio();
        assertEquals("testSetPrecio",expResult, result);
    }
    
    @Test
    public void testGetImagenes() {
        final String ruta= "/descansoApp/baseDatos/fiesta1.jpg";
        final ComercioActividad instance = new ComercioActividad();
        instance.agregarImagen(ruta);
        final String expResult= "basedatos/fiesta1.jpg";
        final String aux = instance.getImagenes().get(0).getDescription();
        final String [] result= aux.toLowerCase().split("/turismoapp/");
        assertEquals("testGetImagenes",expResult, result[2]);
    }
    

    @Test
    public void testSetImagenes() {
        final String ruta= "/descansoApp/baseDatos/fiesta1.jpg";
        final ComercioActividad instance = new ComercioActividad();
        instance.agregarImagen(ruta);
        final String expResult= "basedatos/fiesta1.jpg";
        final String aux = instance.getImagenes().get(0).getDescription();
        final String [] result= aux.toLowerCase().split("/turismoapp/");
        assertEquals("testSetImagenes",expResult, result[2]);
    }

    @Test
    public void testEquals() {
        final ComercioActividad ca1= new ComercioActividad();
        ca1.setNombre("comercioActividad1");
        final ComercioActividad ca2= new ComercioActividad();
        ca2.setNombre("comercioActividad2");
        final boolean expResult = false;
        final boolean result = ca1.equals(ca2);
        assertEquals("testEquals",expResult, result);
    }
    
    public void testEquals2() {
        final ComercioActividad ca1= new ComercioActividad();
        ca1.setNombre("comercioActividad1");
        final ComercioActividad ca2= new ComercioActividad();
        ca2.setNombre("comercioActividad1");
        final boolean expResult = true;
        final boolean result = ca1.equals(ca2);
        assertEquals("testEquals2",expResult, result);
    }
    
    @Test
    public void testCompareTo() {
        final ComercioActividad ca1 = new ComercioActividad();
        ca1.setNombre("comercioActividad1");
        final ComercioActividad ca2 = new ComercioActividad();
        ca2.setNombre("comercioActividad2");
        final int expResult = -1;
        final int result = ca1.compareTo(ca2);
        assertEquals("testCompareTo",expResult, result);
    }
    
    @Test
    public void testCompareTo2() {
        final ComercioActividad ca1 = new ComercioActividad();
        ca1.setNombre("comercioActividad1");
        final ComercioActividad ca2 = new ComercioActividad();
        ca2.setNombre("comercioActividad2");
        final int expResult = 1;
        final int result = ca2.compareTo(ca1);
        assertEquals("testCompareTo2",expResult, result);
    }
    
    @Test
    public void testCompareTo3() {
        final ComercioActividad ca1 = new ComercioActividad();
        ca1.setNombre("comercioActividad1");
        final ComercioActividad ca2 = new ComercioActividad();
        ca2.setNombre("comercioActividad1");
        final int expResult = 0;
        final int result = ca1.compareTo(ca2);
        assertEquals("testCompareTo3",expResult, result);
    }
}
