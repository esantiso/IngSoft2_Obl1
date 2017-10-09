package descansoApp.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;

class pResultadoMisViajes extends javax.swing.JPanel {

    private final Sistema modelo;
    private final Viaje viaje;
    private final JFrame miVentana;
    private final JPanel miPanel;
    
    public pResultadoMisViajes(Sistema unModelo, Viaje unViaje, JFrame unContenedorPrincipal, JPanel miContenedor) {
        initComponents();
        modelo = unModelo;
        viaje = unViaje;
        miVentana = unContenedorPrincipal;
        miPanel = miContenedor;
        
        lblNombre.setText(viaje.getNombre());
        lblFecha.setText(viaje.fechaToString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblVisualizar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();

        setOpaque(false);

        lblNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNombre.setText("Nombre Viaje");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblFecha.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblFecha.setText("Fecha");

        lblVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Lupa.png"))); // NOI18N
        lblVisualizar.setToolTipText("Ver");
        lblVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVisualizarMouseClicked();
            }
        });

        lblEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Editar.png"))); // NOI18N
        lblEditar.setToolTipText("Editar");
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addGap(5, 5, 5)
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblEditar))
            .addComponent(lblVisualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblVisualizarMouseClicked() {//GEN-FIRST:event_lblVisualizarMouseClicked
        miVentana.remove(miPanel);
        miVentana.add(new pnlItinerario(modelo, viaje, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblVisualizarMouseClicked

    private void lblEditarMouseClicked() {//GEN-FIRST:event_lblEditarMouseClicked
        miVentana.remove(miPanel);
        miVentana.add(new pnlNuevoViaje(modelo, miVentana, viaje));
        miVentana.pack(); // TODO add your handling code here:
    }//GEN-LAST:event_lblEditarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblVisualizar;
    // End of variables declaration//GEN-END:variables
}
