package descansoApp.herramientas;

import java.util.ArrayList;
import descansoApp.dominio.Ciudad;

public class Buscador {

    private final ArrayList<Ciudad> ciudades;

    public Buscador(final ArrayList<Ciudad> lista) {
        ciudades = lista;
    }

    public ArrayList<Ciudad> buscar(String palabra) {
        palabra = palabra.toLowerCase();
        palabra = palabra.trim();
        final ArrayList<Ciudad> ret = new ArrayList<>();

        for (final Ciudad ciudad : ciudades) {
            String nombre = ciudad.getNombre();
            nombre = nombre.toLowerCase();
            nombre = nombre.trim();
            if (nombre.contains(palabra)) {
                ret.add(ciudad);
            } else {
                nombre = ciudad.getDescripcion();
                nombre = nombre.toLowerCase();
                nombre = nombre.trim();
                if (nombre.contains(palabra)) {
                    ret.add(ciudad);
                } else {
                    nombre = ciudad.getInfoGral();
                    nombre = nombre.toLowerCase();
                    nombre = nombre.trim();
                    if (nombre.contains(palabra)) {
                        ret.add(ciudad);
                    }
                }
            }
        }

        return ret;
    }
}
