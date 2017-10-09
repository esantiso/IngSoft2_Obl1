package descansoApp.dominio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static descansoApp.herramientas.Utilidades.soloFecha;


public class Evento implements Serializable, Comparable<Evento> {

    private String nombre;
    private Calendar fechaHoraI;
    private Calendar fechaHoraF;
    private String descripcion;
    private String ubicacion;
    private Ciudad ciudad;

    public Evento(final String nombre, final Calendar fechaHoraI, final Calendar fechaHoraF, final String descripcion, final String ubicacion, final Ciudad ciudad) {
        this.nombre = nombre;
        this.fechaHoraI = fechaHoraI;
        this.fechaHoraF = fechaHoraF;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.ciudad = ciudad;
    }

    public Evento() {
        this.nombre = "";
        this.fechaHoraI = new GregorianCalendar();
        this.fechaHoraF = new GregorianCalendar();
        this.descripcion = "";
        this.ubicacion = "";
        this.ciudad = new Ciudad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaHoraI() {
        return fechaHoraI;
    }

    public void setFechaHoraI(final Calendar unaFechaHoraI) throws Exception{
        Calendar aux = (Calendar) unaFechaHoraI.clone();
        Calendar calendar = soloFecha(Calendar.getInstance());
        aux = soloFecha(aux);
        
        if (aux.compareTo(calendar) >= 0) {
            calendar = Calendar.getInstance();
            if (unaFechaHoraI.compareTo(calendar) >= 0) {
                this.fechaHoraI = unaFechaHoraI;


            } else {
                throw new Exception ("El evento esta programado para hoy, entonces la hora de inicio debe ser mayor a la actual.");
                
            }

        } else {
            throw new Exception ("La fecha de inicio del evento debe ser la actual o una futura.");
            
        }
    }

    public Calendar getFechaHoraF() {
        return fechaHoraF;
    }

    public void setFechaHoraF(final Calendar fechaHoraI, final Calendar fechaHoraF) throws Exception{
        Calendar auxFInicio = (Calendar) fechaHoraI.clone();
        Calendar auxFFin = (Calendar) fechaHoraF.clone();

        auxFInicio = soloFecha(auxFInicio);
        auxFFin = soloFecha(auxFFin);

        if (auxFInicio.compareTo(auxFFin) <= 0) {

            if (fechaHoraI.compareTo(fechaHoraF) <= 0) {
                this.fechaHoraF = fechaHoraF;
            } else {
                throw new Exception("La hora de inicio debe ser mayor a la hora de inicio del evento."); 
            }
        } else {
            throw new Exception("La fecha de inicio del evento debe ser la actual o una futura.");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(final String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(final Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        final String fechaInicio = formatter.format(fechaHoraI.getTime());

        return fechaInicio + " - " + nombre + " (" + ubicacion + ")";
    }
    
    public String horaInicioToString() {
        final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        final String horaInicio = formatter.format(fechaHoraI.getTime());

        return horaInicio;
    }
    
    public String fechaInicioToString() {
        final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        final String fechaInicio = formatter.format(fechaHoraI.getTime());

        return fechaInicio;
    }
    
    public String horaFinToString() {
        final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        final String horaFin = formatter.format(fechaHoraF.getTime());

        return horaFin;
    }
    
    public String fechaFinToString() {
        final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        final String fechaFin = formatter.format(fechaHoraF.getTime());

        return fechaFin;
    }

    @Override
    public boolean equals(final Object obj) {
        boolean valido = false;
        final Evento evento = (Evento) obj;
        if (evento.getNombre().equalsIgnoreCase(this.getNombre())) {
            valido = true;
        }
        
        return valido;
    }
    
    @Override
    public int compareTo(final Evento evento){
        return fechaHoraI.compareTo(evento.getFechaHoraI());
    }
}
