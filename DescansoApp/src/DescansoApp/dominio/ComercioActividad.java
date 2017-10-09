package descansoApp.dominio;

import descansoApp.herramientas.TipoCA;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class ComercioActividad implements Serializable, Comparable<ComercioActividad> {
    private String nombre;
    private String detalles;
    private TipoCA tipo;
    private String categoria;
    private String horario;
    private String ubicacion;
    private String telefono;
    private String web;
    private String precio;
    private final ArrayList<ImageIcon> imagenes;

    public ComercioActividad() {
        this.nombre = "";
        this.detalles = "";
        this.tipo = null;
        this.categoria = "";
        this.horario = "";
        this.ubicacion = "";
        this.telefono = "";
        this.web = "";
        this.precio = "";
        this.imagenes = new ArrayList<>();
    }

    public ComercioActividad(final String unNombre, final String unosDetalles, TipoCA unTipo, final String unaCategoria, final String unHorario, final String unaUbicacion, final String unTelefono, final String unaWeb, final String unPrecio) {
        this.nombre = unNombre;
        this.detalles = unosDetalles;
        this.tipo = unTipo;
        this.categoria = unaCategoria;
        this.horario = unHorario;
        this.ubicacion = unaUbicacion;
        this.telefono = unTelefono;
        this.web = unaWeb;
        this.precio = unPrecio;
        this.imagenes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String unNombre) {
        this.nombre = unNombre;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(final String unosDetalles) {
        this.detalles = unosDetalles;
    }

    public TipoCA getTipo() {
        return tipo;
    }

    public void setTipo(final TipoCA unTipo) {
        this.tipo = unTipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(final String unaCategoria) {
        this.categoria = unaCategoria;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(final String unHorario) {
        this.horario = unHorario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(final String unaUbicacion) {
        this.ubicacion = unaUbicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(final String unTelefono) {
        this.telefono = unTelefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(final String unaWeb) {
        this.web = unaWeb;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(final String unPrecio) {
        this.precio = unPrecio;
    }

    public ArrayList<ImageIcon> getImagenes() {
        return imagenes;
    }

    public void agregarImagen(final String ruta) {
        imagenes.add(new javax.swing.ImageIcon(getClass().getResource(ruta)));
    }
    @Override
    public boolean equals(final Object obj) {
        boolean valido = false;
        final ComercioActividad comercioActividad = (ComercioActividad) obj;
        if (comercioActividad.getNombre().equalsIgnoreCase(this.getNombre())) {
            valido = true;
        }
        return valido;
    }
    @Override
    public int compareTo(final ComercioActividad comercioActividad) {
        return nombre.compareTo(comercioActividad.getNombre());
    }
}
