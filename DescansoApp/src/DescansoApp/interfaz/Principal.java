package descansoApp.interfaz;

import java.io.IOException;
import descansoApp.Main;
import descansoApp.dominio.Sistema;

public class Principal extends javax.swing.JFrame {

    private final Sistema modelo;
    
    public Principal(Sistema unModelo) {
        initComponents();
        modelo = unModelo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("descansoApp");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing();
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing() {//GEN-FIRST:event_formWindowClosing
        try {
            Main.guardarModelo(modelo);
        } catch (IOException e) { }
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
