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

    public ComercioActividad(final String nombre, final String detalles,TipoCA tipo, final String categoria,final String horario, final String ubicacion,final String telefono,final String web,final String precio) {
        this.nombre = nombre;
        this.detalles = detalles;
        this.tipo = tipo;
        this.categoria = categoria;
        this.horario = horario;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.web = web;
        this.precio = precio;
        this.imagenes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(final String detalles) {
        this.detalles = detalles;
    }

    public TipoCA getTipo() {
        return tipo;
    }

    public void setTipo(final TipoCA tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(final String categoria) {
        this.categoria = categoria;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(final String horario) {
        this.horario = horario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(final String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(final String telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(final String web) {
        this.web = web;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(final String precio) {
        this.precio = precio;
    }

    public ArrayList<ImageIcon> getImagenes() {
        return imagenes;
    }

    public void agregarImagen(final String ruta){
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
    public int compareTo(final ComercioActividad comercioActividad){
        return nombre.compareTo(comercioActividad.getNombre());
    }
}
