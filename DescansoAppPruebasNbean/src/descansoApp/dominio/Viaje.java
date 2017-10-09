package descansoApp.dominio;

import java.io.Serializable;
import java.util.*;
import java.text.SimpleDateFormat;

import static descansoApp.herramientas.Utilidades.soloFecha;


public class Viaje implements Serializable {

    private String nombre;
    private Calendar fechaI;
    private Calendar fechaF;
    private final ArrayList<Evento> itinerario;

    public Viaje() {
        nombre = "";
        fechaI = new GregorianCalendar();
        fechaF = new GregorianCalendar();
        itinerario = new ArrayList<>();
    }

    public Viaje(final String unNombre, final Calendar unaFInicio,final Calendar unaFFinal) {
        nombre = unNombre;
        fechaI = unaFInicio;
        fechaF = unaFFinal;
        itinerario = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaI() {
        return fechaI;
    }

    public void setFechaI(final Calendar fechaI) throws Exception {
        final Calendar calendar = soloFecha(Calendar.getInstance());

        if (fechaI.compareTo(calendar) > 0) {
            this.fechaI = fechaI;

        } else {
            throw new Exception("La fecha de inicio del viaje debe ser la actual o una futura.");

        }
    }

    public Calendar getFechaF() {
        return fechaF;
    }

    public void setFechaF(final Calendar fechaI, final Calendar fechaF) throws Exception {
        final Calendar fechaInicio = soloFecha(fechaI);
        final Calendar fechaFin = soloFecha(fechaF);

        if (fechaInicio.compareTo(fechaFin) <= 0) {
            this.fechaF = fechaF;

        } else {
            throw new Exception("La fecha final debe ser mayor a la fecha de inicio.");

        }
    }

    public ArrayList<Evento> getItinerario() {
        return itinerario;
    }

    public void agregarEvento(final Evento unEvento) throws Exception {
        if (itinerario.contains(unEvento)) {
            throw new Exception("El nombre del evento ya existe. Por favor ingrese uno nuevo.");
        }
        itinerario.add(unEvento);

    }

    public boolean eliminarEvento(final Evento unEvento) {
        return itinerario.remove(unEvento);
    }

    public boolean pertenece(final Evento unEvento) {
        return itinerario.contains(unEvento);
    }

    @Override
    public String toString() {
        String ret = nombre;

        final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        final String fechaInicio = formatter.format(fechaI.getTime());
        final String fechaFin = formatter.format(fechaF.getTime());

        ret += " (" + fechaInicio + " - " + fechaFin + ")";

        return ret;
    }
    
    public String fechaToString() {
        String ret = "";

        final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        final String fechaInicio = formatter.format(fechaI.getTime());
        final String fechaFin = formatter.format(fechaF.getTime());

        ret += " (" + fechaInicio + " - " + fechaFin + ")";

        return ret;
    }

    @Override
    public boolean equals(final Object obj) {
        boolean ret = false;
        final Viaje viaje = (Viaje) obj;

        if (nombre.equalsIgnoreCase(viaje.getNombre())) {
            ret = true;
        }

        return ret;
    }
}
