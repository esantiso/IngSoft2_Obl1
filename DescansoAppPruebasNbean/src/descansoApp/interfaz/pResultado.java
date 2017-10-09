package descansoApp.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import descansoApp.dominio.Sistema;

class pResultado extends javax.swing.JPanel {

    private final JFrame ventana;
    private final JPanel padre;
    private final Sistema modelo;
    private final descansoApp.dominio.Ciudad ciudad;
    
    public pResultado(final Sistema unModelo,final descansoApp.dominio.Ciudad unaCiudad,final JFrame unaVentana,final JPanel unPadre) {
        initComponents();
        modelo = unModelo;
        ciudad = unaCiudad;
        ventana = unaVentana;
        padre = unPadre;
        
        lblDes.setOpaque(false);
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);
        
        lblNombre.setText(ciudad.getNombre());
        lblDes.setText(ciudad.getDescripcion());
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        lblDes = new javax.swing.JTextArea();
        lblNombre = new javax.swing.JLabel();
        lblBuscar1 = new javax.swing.JLabel();

        setOpaque(false);

        lblDes.setEditable(false);
        lblDes.setColumns(20);
        lblDes.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblDes.setForeground(new java.awt.Color(255, 255, 255));
        lblDes.setLineWrap(true);
        lblDes.setRows(5);
        lblDes.setWrapStyleWord(true);
        lblDes.setAutoscrolls(false);
        lblDes.setBorder(null);
        lblDes.setHighlighter(null);
        lblDes.setOpaque(false);
        scroll.setViewportView(lblDes);

        lblNombre.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 204, 204));
        lblNombre.setText("Nombre Ciudad");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Lupa.png"))); // NOI18N
        lblBuscar1.setToolTipText("Ver");
        lblBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked() {
                lblBuscar1MouseClicked();
            }
        });

        final javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(lblBuscar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscar1))
                .addGap(4, 4, 4)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblBuscar1MouseClicked() {//GEN-FIRST:event_lblBuscar1MouseClicked
            ventana.remove(padre);
        ventana.add(new pnlInformacionCiudad(modelo, ciudad, ventana));
        ventana.pack();
    }//GEN-LAST:event_lblBuscar1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBuscar1;
    private javax.swing.JTextArea lblDes;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
