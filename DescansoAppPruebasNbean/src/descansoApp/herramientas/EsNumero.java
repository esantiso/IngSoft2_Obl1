package descansoApp.herramientas;

public class EsNumero {
    
    public static boolean esNumero(final String texto) {
        boolean correcto;

        try {
            Integer.parseInt(texto);
            correcto = true;
        } catch (NumberFormatException e) {
            correcto = false;
        }

        return correcto;
    }
}
