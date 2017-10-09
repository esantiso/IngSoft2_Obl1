package descansoApp.herramientas;

import java.util.ArrayList;
import descansoApp.dominio.Ciudad;

public class Buscador {

    private final ArrayList<Ciudad> ciudades;

    public Buscador(ArrayList<Ciudad> lista) {
        ciudades = lista;
    }

    public ArrayList<Ciudad> buscar(String palabra) {
        palabra = palabra.toLowerCase();
        palabra = palabra.trim();
        ArrayList<Ciudad> ret = new ArrayList<>();

        for (Ciudad c : ciudades) {
            String s = c.getNombre();
            s = s.toLowerCase();
            s = s.trim();
            if (s.contains(palabra)) {
                ret.add(c);
            } else {
                s = c.getDescripcion();
                s = s.toLowerCase();
                s = s.trim();
                if (s.contains(palabra)) {
                    ret.add(c);
                } else {
                    s = c.getInfoGral();
                    s = s.toLowerCase();
                    s = s.trim();
                    if (s.contains(palabra)) {
                        ret.add(c);
                    }
                }
            }
        }

        return ret;
    }
}
