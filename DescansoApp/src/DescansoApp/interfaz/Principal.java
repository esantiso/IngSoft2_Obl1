package descansoApp.interfaz;

import java.io.IOException;
import descansoApp.Main;
import descansoApp.dominio.Sistema;

public class Principal extends javax.swing.JFrame {

    private final Sistema modelo;
    public Principal(final Sistema unModelo) {
        initComponents();
        modelo = unModelo;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("descansoApp");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing() {
                formWindowClosing();
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        pack();
        setLocationRelativeTo(null);
    }

    private void formWindowClosing() {
        try {
            Main.guardarModelo(modelo);
        } catch (IOException e) { }
    }
}
