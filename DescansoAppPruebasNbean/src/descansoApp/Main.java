package descansoApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import descansoApp.dominio.Ciudad;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.XMLReader;
import descansoApp.interfaz.Principal;
import descansoApp.interfaz.pnlInicio;

public class Main {

    private static Sistema modelo;

    public static void main(final String[] args) throws IOException, ClassNotFoundException {
        modelo = cargarModelo();

        final Principal principal = new Principal(modelo);
        principal.add(new pnlInicio(modelo, principal));
        principal.pack();
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }

    private static Sistema cargarModelo() throws IOException {
        Sistema unModelo;

        try {
            final FileInputStream archivo = new FileInputStream("Sistema");
            final ObjectInputStream leer = new ObjectInputStream(archivo);

            unModelo = (Sistema) leer.readObject();
            leer.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            unModelo = new Sistema();

            final ArrayList<Ciudad> cdads = XMLReader.cargarCiudades();
            for (final Ciudad cdad : cdads) {
                unModelo.agregarCiudad(cdad);
            }
        }

        return unModelo;
    }
    public static void guardarModelo(final Sistema unModelo) throws IOException {
        final FileOutputStream archivo = new FileOutputStream("Sistema");
        final ObjectOutputStream grab = new ObjectOutputStream(archivo);

        grab.writeObject(unModelo);
        grab.close();
    }
}
