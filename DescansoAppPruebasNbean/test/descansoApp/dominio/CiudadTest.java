package descansoApp.dominio;

import descansoApp.herramientas.TipoCA;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CiudadTest {
    
    @Test
    public void testGetNombre() {
        final String nombre = "Fray Bentos";
        final Ciudad instance = new Ciudad(nombre);

        final String expResult = "Fray Bentos";
        final String result = instance.getNombre();
        assertEquals("testGetNombre",result, expResult);
    }
    
    @Test
     public void testSetNombre() {
        final String nombre = "Fray Bentos";
        final Ciudad instance = new Ciudad();
        instance.setNombre(nombre);

        final String expResult = "Fray Bentos";
        final String result = instance.getNombre();
        assertEquals("testSetNombre",result, expResult);
    }
    @Test
    public void testGetDescripcion() {
        final String descripcion = "Des";
        final Ciudad instance = new Ciudad();
        instance.setDescripcion(descripcion);

        final String expResult = "Des";
        final String result = instance.getDescripcion();
        assertEquals("testGetDescripcion",result, expResult);
    }
     
    @Test
    public void testSetDescripcion() {
        final String descripcion = "Des";
        final Ciudad instance = new Ciudad();
        instance.setDescripcion(descripcion);
        final String expResult = "Des";
        final String result = instance.getDescripcion();
        assertEquals("testSetDescripcion",result, expResult);
    }
    
    @Test
    public void testGetInfoGral() {
        final Ciudad instance = new Ciudad("");
        final String expResult = "Informacion";
        final String result = instance.getInfoGral();
        assertEquals("testGetInfoGral",result, expResult);
    }
    
    @Test
    public void testSetInfoGral() {
        final String infoGral = "Informacion";
        final Ciudad instance = new Ciudad();
        instance.setInfoGral(infoGral);
        final String expResult = "Informacion";
        final String result = instance.getInfoGral();
        assertEquals("testSetInfoGral",result, expResult);
    }

    @Test
    public void testPerteneceComercioActividad() {
        final ComercioActividad comercioActividad = new ComercioActividad();
        comercioActividad.setNombre("alojamiento");
        final Ciudad instance = new Ciudad();
        final boolean expResult = false;
        final boolean result = instance.perteneceComercioActividad(TipoCA.alojamiento, comercioActividad);
        assertEquals("testPerteneceComercioActividad",result, expResult);
    }
    
    @Test
    public void testPerteneceComercioActividad2() {
        final ComercioActividad comercioActividad = new ComercioActividad();
        comercioActividad.setNombre("alojamiento");
        final Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.alojamiento, comercioActividad);
        final boolean expResult = true;
        final boolean result = instance.perteneceComercioActividad(TipoCA.alojamiento, comercioActividad);
        assertEquals("testPerteneceComercioActividad2",result, expResult);
    }
    
    @Test
    public void testAgregarComercioActividad() {
        final ComercioActividad comercioActividad = new ComercioActividad();
        comercioActividad.setNombre("actividad");
        final Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.actividad, comercioActividad);
        final ComercioActividad expResult= new ComercioActividad("actividad", null, TipoCA.actividad, null, null, null, null, null, null);
        final ComercioActividad result= instance.getActividades().get(0);
        assertEquals("testAgregarComercioActividad",result, expResult);
    }
    
       
    @Test
    public void testGetActividades() {
        final ComercioActividad comercioActividad = new ComercioActividad();
        comercioActividad.setNombre("actividad");
        final Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.actividad, comercioActividad);
        final ArrayList<ComercioActividad> expResult = new ArrayList();
        expResult.add(comercioActividad);
        final ArrayList<ComercioActividad> result = instance.getActividades();
        assertEquals("testGetActividades",result, expResult);
    }

    @Test
    public void testGetEstGastronomicos() {
        final ComercioActividad comercioActividad = new ComercioActividad();
        comercioActividad.setNombre("estGastronomico");
        final Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.estGastronomico, comercioActividad);
        final ArrayList<ComercioActividad> expResult = new ArrayList();
        expResult.add(comercioActividad);
        final ArrayList<ComercioActividad> result = instance.getEstGastronomicos();
        assertEquals("testGetEstGastronomicos",result, expResult);
    }

    @Test
    public void testGetAlojamientos() {
        final ComercioActividad comercioActividad = new ComercioActividad();
        comercioActividad.setNombre("alojamiento");
        final Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.alojamiento, comercioActividad);
        final ArrayList<ComercioActividad> expResult = new ArrayList();
        expResult.add(comercioActividad);
        final ArrayList<ComercioActividad> result = instance.getAlojamientos();
        assertEquals("testGetAlojamientos",result, expResult);
    }
    
    @Test
    public void testEquals() {
        final Ciudad ciudad= new Ciudad();
        ciudad.setNombre("Ciudad1");
        final Ciudad ciudad1 = new Ciudad();
        ciudad.setNombre("Ciudad2");
        final boolean expResult = false;
        final boolean result = ciudad.equals(ciudad1);
        assertEquals("testEquals",result, expResult);
    }
    @Test
    public void testEquals2() { ;
        final Ciudad ciudad= new Ciudad();
        ciudad.setNombre("Ciudad1");
        final Ciudad ciudad1 = new Ciudad();
        ciudad1.setNombre("Ciudad1");
        final boolean expResult = true;
        final boolean result = ciudad.equals(ciudad1);
        assertEquals("testEquals2",result, expResult);
    }
    @Test
    public void testAgregarImagen(){
        final String ruta= "/descansoApp/baseDatos/fraybentos1.jpg";
        final Ciudad instance = new Ciudad();
        instance.agregarImagen(ruta);
        final String expResult= "basedatos/fraybentos1.jpg";
        final String aux = instance.getImagenes().get(0).getDescription();
        final String [] result= aux.toLowerCase().split("/turismoapp/");
        assertEquals("testAgregarImagen",expResult, result[2]);
        
    
    }
    
    @Test
    public void testGetImagenes(){
        final String ruta= "/descansoApp/baseDatos/fraybentos2.jpg";
        final Ciudad instance = new Ciudad();
        instance.agregarImagen(ruta);
        final String expResult= "basedatos/fraybentos2.jpg";
        final String aux = instance.getImagenes().get(0).getDescription();
        final String [] result= aux.toLowerCase().split("/turismoapp/");
        assertEquals("testGetImagenes",expResult, result[2]);
        
    }
}
