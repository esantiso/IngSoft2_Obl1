package descansoApp;

import java.util.ArrayList;
import java.util.Iterator;
import descansoApp.dominio.Ciudad;
import descansoApp.dominio.ComercioActividad;
import descansoApp.herramientas.TipoCA;

public class Informacion {

    public static ArrayList<Ciudad> ciudades() {
        ArrayList<String> cdades = BaseDatos.ciudades();
        int parte = -1;
        String nombre;
        String des;
        String info;
        ArrayList<String> listaImg = new ArrayList<>();

        ArrayList<Ciudad> ret = new ArrayList<>();

        for (String cdade : cdades) {
            nombre = "";
            des = "";
            info = "";

            String ciudad = cdade;
            String[] txtCiudad = ciudad.split("\n");

            for (String linea : txtCiudad) {
                if (averiguarParte(linea) == -2) {
                    if (!linea.equals("")) {
                        switch (parte) {
                            case 0:
                                nombre = linea;
                                break;
                            case 1:
                                if (linea.equals("-/")) des += "\n";
                                else des += linea;
                                break;
                            case 2:
                                info += linea;
                                break;
                            case 3:
                                listaImg.add(linea);
                                break;
                        }
                    }
                } else {
                    parte = averiguarParte(linea);
                }
            }

            Ciudad c = new Ciudad();
            c.setNombre(nombre);
            c.setDescripcion(des);
            c.setInfoGral(info);

            for (String aListaImg : listaImg) {
                c.agregarImagen(aListaImg);
            }


            agregarCAs(c);
            ret.add(c);
        }

        return ret;
    }

    private static int averiguarParte(String linea) {
        int parte = -2;

        switch (linea) {
            case "#nombre":
                parte = 0;
                break;
            case "#des":
                parte = 1;
                break;
            case "#info":
                parte = 2;
                break;
            case "#rutas":
                parte = 0;
                break;
        }

        return parte;
    }

    private static void agregarCAs(Ciudad c) {
        int parte = -1;
        String[] comerciosA = BaseDatos.comerciosActividades().split("#end");

        //Itero entre los comercios y actividades
        for (String aComerciosA : comerciosA) {
            String[] datos = {"", "", "", "", "", "", "", "", ""};
            ArrayList<String> listaImg = new ArrayList<>();

            String[] txtCA = aComerciosA.split("\n");
            //Itero dentro del texto del comercio-actividad
            for (String linea : txtCA) {
                if (averiguarParte2(linea) == -2) {
                    if (linea.length() > 1) {
                        if (parte == 9) {
                            listaImg.add(linea);
                        } else {
                            datos[parte] += linea;
                        }
                    }
                } else {
                    parte = averiguarParte2(linea);
                }
            }

            ComercioActividad cA = new ComercioActividad();
            cA.setNombre(datos[0]);
            cA.setDetalles(datos[1]);
            switch (datos[2]) {
                case "alojamiento":
                    cA.setTipo(TipoCA.alojamiento);
                    break;
                case "actividad":
                    cA.setTipo(TipoCA.actividad);
                    break;
                case "estGastronomico":
                    cA.setTipo(TipoCA.estGastronomico);
                    break;
            }

            cA.setCategoria(datos[3]);
            cA.setHorario(datos[4]);
            cA.setUbicacion(datos[5]);
            cA.setTelefono(datos[6]);
            cA.setWeb(datos[7]);
            cA.setPrecio(datos[8]);

            for (String aListaImg : listaImg) {
                cA.agregarImagen(aListaImg);
            }

            c.agregarComercioActividad(cA.getTipo(), cA);
        }
    }

    private static int averiguarParte2(String linea) {
        int parte = -2;

        switch (linea) {
            case "#nombre":
                parte = 0;
                break;
            case "#detalles":
                parte = 1;
                break;
            case "#tipo":
                parte = 2;
                break;
            case "#categoria":
                parte = 3;
                break;
            case "#horario":
                parte = 4;
                break;
            case "#ubicacion":
                parte = 5;
                break;
            case "#telefono ":
                parte = 6;
                break;
            case "#web":
                parte = 7;
                break;
            case "#precio":
                parte = 8;
                break;
            case "#rutas":
                parte = 0;
                break;
        }

        return parte;
    }
}
