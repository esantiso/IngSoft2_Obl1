package descansoApp.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import descansoApp.dominio.Evento;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;

class pResultadoIt3 extends javax.swing.JPanel {

    private final Evento evento;
    private final Viaje viaje;
    private final JFrame miVentana;
    private final JPanel miPanel;
    private final Sistema modelo;

    public pResultadoIt3(Sistema unModelo,Viaje unViaje, Evento unEvento, JFrame miContenedorPrincipal, JPanel miContenedor) {
        initComponents();
        modelo= unModelo;
        evento = unEvento;
        viaje = unViaje;
        miVentana = miContenedorPrincipal;
        miPanel = miContenedor;

        lblHora.setText(evento.horaInicioToString());
        lblNombre.setText(evento.getNombre());
        lblUbicacion.setText("(" + evento.getUbicacion() + ")");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHora = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblEditar1 = new javax.swing.JLabel();

        setOpaque(false);

        lblHora.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblHora.setText("18:00 hs");

        lblNombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblNombre.setText("Nombre del Evento");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblUbicacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblUbicacion.setText("(Ubicacion)");

        lblEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Editar.png"))); // NOI18N
        lblEditar.setToolTipText("Editar");
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
        });

        lblEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Lupa.png"))); // NOI18N
        lblEditar1.setToolTipText("Ver");
        lblEditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUbicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(lblEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHora)
                    .addComponent(lblNombre)
                    .addComponent(lblUbicacion)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        miVentana.remove(miPanel);
        miVentana.add(new pnlEvento(modelo, viaje, evento.getCiudad(),null, evento, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblEditarMouseClicked

    private void lblEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditar1MouseClicked
        miVentana.remove(miPanel);
        miVentana.add(new pnlInformacionEvento(modelo, viaje, evento, miVentana));
        miVentana.pack(); 
    }//GEN-LAST:event_lblEditar1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEditar1;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUbicacion;
    // End of variables declaration//GEN-END:variables
}
