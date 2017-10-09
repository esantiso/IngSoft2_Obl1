package descansoApp.dominio;

import descansoApp.herramientas.TipoCA;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Ciudad implements Serializable {
    private String nombre;
    private String descripcion;
    private String infoGral;
    private ImageIcon mapa;
    private final ArrayList<ImageIcon> imagenes;
    private final ArrayList<ComercioActividad> actividades;
    private final ArrayList<ComercioActividad> estGastronomicos;
    private final ArrayList<ComercioActividad> alojamientos;
    public ImageIcon getMapa() {
        return mapa;
    }

    public void setMapa(final String  unMapa) {
        this.mapa = new ImageIcon(getClass().getResource(unMapa));
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String unNombre) {
        this.nombre = unNombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(final String unaDescripcion) {
        this.descripcion = unaDescripcion;
    }

    public String getInfoGral() {
        return infoGral;
    }

    public void setInfoGral(final String unaInfoGral) {
        this.infoGral = unaInfoGral;
    }
    public ArrayList<ComercioActividad> getActividades() {
        return actividades;
    }

    public ArrayList<ComercioActividad> getEstGastronomicos() {
        return estGastronomicos;
    }

    public ArrayList<ComercioActividad> getAlojamientos() {
        return alojamientos;
    }
    public boolean perteneceComercioActividad(final TipoCA tipo, final ComercioActividad comercioActividad) {
        switch (tipo) {
            case alojamiento:
                return alojamientos.contains(comercioActividad);
            case estGastronomico:
                return estGastronomicos.contains(comercioActividad);
            case actividad:
                return alojamientos.contains(comercioActividad);
            default :
                return false;
        }
    }
    public void agregarComercioActividad(final TipoCA tipo, final ComercioActividad comercioActividad) {
        switch (tipo) {
            case alojamiento:
                alojamientos.add(comercioActividad);
            break;
            case estGastronomico:
                estGastronomicos.add(comercioActividad);
            break;
            case actividad:
                actividades.add(comercioActividad);
            break;
            default:
        }
    }
    public Ciudad() {
        nombre = "";
        infoGral = "";
        imagenes = new ArrayList<>();
        actividades = new ArrayList<>();
        estGastronomicos = new ArrayList<>();
        alojamientos = new ArrayList<>();
    }
    public Ciudad(final String unNombre) {
        nombre = unNombre;
        infoGral = "";
        imagenes = new ArrayList<>();
        actividades = new ArrayList<>();
        estGastronomicos = new ArrayList<>();
        alojamientos = new ArrayList<>();
    }
    @Override
    public boolean equals(final Object obj) {
        boolean valido = false;
        final Ciudad ciudad = (Ciudad) obj;
        if (ciudad.getNombre().equalsIgnoreCase(this.getNombre())) {
            valido = true;
        }
        return valido;
    }
    public void agregarImagen(final String ruta) {
        imagenes.add(new ImageIcon(getClass().getResource(ruta)));
    }

    public ArrayList<ImageIcon> getImagenes() {
        return imagenes;
    }
}
