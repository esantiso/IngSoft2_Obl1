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

    public Evento(final String unNombre, final Calendar unaFechaHoraI, final Calendar unaFechaHoraF, final String unaDescripcion, final String unaUbicacion, final Ciudad unaCiudad) {
        this.nombre = unNombre;
        this.fechaHoraI = unaFechaHoraI;
        this.fechaHoraF = unaFechaHoraF;
        this.descripcion = unaDescripcion;
        this.ubicacion = unaUbicacion;
        this.ciudad = unaCiudad;
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

    public void setNombre(final String unNombre) {
        this.nombre = unNombre;
    }

    public Calendar getFechaHoraI() {
        return fechaHoraI;
    }

    public void setFechaHoraI(final Calendar unaFechaHoraI) throws Exception {
        Calendar aux = (Calendar) unaFechaHoraI.clone();
        Calendar calendar = soloFecha(Calendar.getInstance());
        aux = soloFecha(aux);
        if (aux.compareTo(calendar) >= 0) {
            calendar = Calendar.getInstance();
            if (unaFechaHoraI.compareTo(calendar) >= 0) {
                this.fechaHoraI = unaFechaHoraI;


            } else {
                throw new Exception("El evento esta programado para hoy, entonces la hora de inicio debe ser mayor a la actual.");
            }
        } else {
            throw new Exception("La fecha de inicio del evento debe ser la actual o una futura.");
        }
    }

    public Calendar getFechaHoraF() {
        return fechaHoraF;
    }

    public void setFechaHoraF(final Calendar unaFechaHoraI, final Calendar unaFechaHoraF) throws Exception {
        Calendar auxFInicio = (Calendar) unaFechaHoraI.clone();
        Calendar auxFFin = (Calendar) unaFechaHoraF.clone();

        auxFInicio = soloFecha(auxFInicio);
        auxFFin = soloFecha(auxFFin);

        if (auxFInicio.compareTo(auxFFin) <= 0) {

            if (unaFechaHoraI.compareTo(unaFechaHoraF) <= 0) {
                this.fechaHoraF = unaFechaHoraF;
            } else throw new Exception("La hora de finalización debe ser mayor a la hora de inicio del evento.");
        } else throw new Exception("La fecha final debe ser mayor a la fecha de inicio.");
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(final String unaDescripcion) {
        this.descripcion = unaDescripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(final String unaUbicacion) {
        this.ubicacion = unaUbicacion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(final Ciudad unaCiudad) {
        this.ciudad = unaCiudad;
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
    public int compareTo(final Evento evento) {
        return fechaHoraI.compareTo(evento.getFechaHoraI());
    }
}