/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descansoApp.dominio;


import descansoApp.herramientas.TipoCA;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author usuario
 */
public class XMLReader {
    public static ArrayList<Ciudad> cargarCiudades() {
        final ArrayList<Ciudad> ciudadList = new ArrayList<>();
        final String filePath = "./src/resources/XMLPrueba.xml";
        final File xmlFile = new File(filePath);
        final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            final Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            final NodeList nodeList = doc.getElementsByTagName("Ciudad");
            for (int i = 0; i < nodeList.getLength(); i++) {
                ciudadList.add(getCiudad(nodeList.item(i)));
            }
        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }
        return ciudadList;
    }


    private static Ciudad getCiudad(final Node node) {
        final Ciudad ciudad = new Ciudad();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            final Element element = (Element) node;
            ciudad.setNombre(getTagValue("Nombre", element));
            ciudad.setDescripcion(getTagValue("Descripcion", element));
            ciudad.setInfoGral(getTagValue("InfoGral", element));
            ciudad.setMapa(getTagValue("Mapa", element));
            final Node imagenes = element.getElementsByTagName("Imagenes").item(0);
            final Element imagenesElement = (Element) imagenes;//.item(l);
            final NodeList imagenNodo = imagenesElement.getElementsByTagName("Imagen");
                for (int m = 0; m < imagenNodo.getLength(); ++m) 
                   {
                       final Element imagenElement = (Element) imagenNodo.item(m);
                        ciudad.agregarImagen(getTagValue("Ruta", imagenElement));
                   }

            final NodeList activades = element.getElementsByTagName("Actividades");
            cargarActividades(activades, ciudad);

            final NodeList estGastronomicos = element.getElementsByTagName("EstGastronomicos");
            cargarEstGastronomicos(estGastronomicos, ciudad);

            final NodeList alojamientos = element.getElementsByTagName("Alojamientos");
            cargarAlojamientos(alojamientos, ciudad);
           
        }

        return ciudad;
    }

        private static void cargarActividades(final NodeList activades,final  Ciudad ciudad) {
        for (int j = 0; j < activades.getLength(); ++j)
        {
            final Element actividadesElement = (Element) activades.item(j);
            final NodeList actividadNodo = actividadesElement.getElementsByTagName("Actividad");
            for (int k = 0; k < actividadNodo.getLength(); ++k)
            {
                final Element actividadElement = (Element) actividadNodo.item(k);
                final ComercioActividad actividad = new ComercioActividad();
                actividad.setNombre(getTagValue("Nombre", actividadElement));
                actividad.setDetalles(getTagValue("Detalles", actividadElement));
                actividad.setTipo(TipoCA.valueOf(getTagValue("Tipo", actividadElement)));
                actividad.setCategoria(getTagValue("Categoria", actividadElement));
                actividad.setHorario(getTagValue("Horario", actividadElement));
                actividad.setUbicacion(getTagValue("Ubicacion", actividadElement));
                actividad.setTelefono(getTagValue("Telefono", actividadElement));
                actividad.setWeb(getTagValue("Web", actividadElement));
                actividad.setPrecio(getTagValue("Precio", actividadElement));

                final NodeList imagenes = actividadElement.getElementsByTagName("Imagenes");
                for (int l= 0; l < imagenes.getLength(); ++l)
                {
                    final Element imagenesElement = (Element) imagenes.item(l);
                    final NodeList imagenNodo = imagenesElement.getElementsByTagName("Imagen");
                    for (int m = 0; m < imagenNodo.getLength(); ++m)
                    {
                        final Element imagenElement = (Element) imagenNodo.item(m);
                        actividad.agregarImagen(getTagValue("Ruta", imagenElement));
                    }
                }
                
                ciudad.agregarComercioActividad(TipoCA.actividad, actividad);
            }
            
        }
    }

    private static void cargarEstGastronomicos(final NodeList estGastronomicos, final Ciudad ciudad) {
        for (int j = 0; j < estGastronomicos.getLength(); ++j)
        {
            final Element estGastronomicosElement = (Element) estGastronomicos.item(j);
            final NodeList estGastronomicoNodo = estGastronomicosElement.getElementsByTagName("EstGastronomico");
            for (int k = 0; k < estGastronomicoNodo.getLength(); ++k)
            {
                final Element estGastronomicoElement = (Element) estGastronomicoNodo.item(k);
                final ComercioActividad estGastronomico = new ComercioActividad();
                estGastronomico.setNombre(getTagValue("Nombre", estGastronomicoElement));
                estGastronomico.setDetalles(getTagValue("Detalles", estGastronomicoElement));
                estGastronomico.setTipo(TipoCA.valueOf(getTagValue("Tipo", estGastronomicoElement)));
                estGastronomico.setCategoria(getTagValue("Categoria", estGastronomicoElement));
                estGastronomico.setHorario(getTagValue("Horario", estGastronomicoElement));
                estGastronomico.setUbicacion(getTagValue("Ubicacion", estGastronomicoElement));
                estGastronomico.setTelefono(getTagValue("Telefono", estGastronomicoElement));
                estGastronomico.setWeb(getTagValue("Web", estGastronomicoElement));
                estGastronomico.setPrecio(getTagValue("Precio", estGastronomicoElement));

                final NodeList imagenes = estGastronomicoElement.getElementsByTagName("Imagenes");
                for (int l= 0; l < imagenes.getLength(); ++l)
                {
                    final Element imagenesElement = (Element) imagenes.item(l);
                    final NodeList imagenNodo = imagenesElement.getElementsByTagName("Imagen");
                    for (int m = 0; m < imagenNodo.getLength(); ++m)
                    {
                        final Element imagenElement = (Element) imagenNodo.item(m);
                        estGastronomico.agregarImagen(getTagValue("Ruta", imagenElement));
                    }
                }
                
                ciudad.agregarComercioActividad(TipoCA.estGastronomico, estGastronomico);
            }
            
        }
    }

 private static void cargarAlojamientos(final NodeList alojamientos,final Ciudad ciudad) {
        for (int j = 0; j < alojamientos.getLength(); ++j)
        {
            final Element alojamientosElement = (Element) alojamientos.item(j);
            final NodeList alojamientoNodo = alojamientosElement.getElementsByTagName("Alojamiento");
            for (int k = 0; k < alojamientoNodo.getLength(); ++k)
            {
                final Element alojamientoElement = (Element) alojamientoNodo.item(k);
                final ComercioActividad alojamiento = new ComercioActividad();
                alojamiento.setNombre(getTagValue("Nombre", alojamientoElement));
                alojamiento.setDetalles(getTagValue("Detalles", alojamientoElement));
                alojamiento.setTipo(TipoCA.valueOf(getTagValue("Tipo", alojamientoElement)));
                alojamiento.setCategoria(getTagValue("Categoria", alojamientoElement));
                alojamiento.setHorario(getTagValue("Horario", alojamientoElement));
                alojamiento.setUbicacion(getTagValue("Ubicacion", alojamientoElement));
                alojamiento.setTelefono(getTagValue("Telefono", alojamientoElement));
                alojamiento.setWeb(getTagValue("Web", alojamientoElement));
                alojamiento.setPrecio(getTagValue("Precio", alojamientoElement));


                final NodeList imagenes = alojamientoElement.getElementsByTagName("Imagenes");
                for (int l= 0; l < imagenes.getLength(); ++l)
                {
                    final Element imagenesElement = (Element) imagenes.item(l);
                    final NodeList imagenNodo = imagenesElement.getElementsByTagName("Imagen");
                    for (int m = 0; m < imagenNodo.getLength(); ++m)
                    {
                        final Element imagenElement = (Element) imagenNodo.item(m);
                        alojamiento.agregarImagen(getTagValue("Ruta", imagenElement));
                    }
                }
                
                ciudad.agregarComercioActividad(TipoCA.alojamiento, alojamiento);
            }
            
        }
    }

    private static String getTagValue(final String tag, final Element element) {
        final NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        final Node node = nodeList.item(0);
        return node.getNodeValue();
    }

}
