package descansoApp.interfaz;

class pResultadoIt2 extends javax.swing.JPanel {

    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblFecha;

    pResultadoIt2(final String unaFecha) {
        initComponents();
        lblFecha.setText(unaFecha);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lbl = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();

        setOpaque(false);

        lbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl.setText("Fecha:");

        lblFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFecha.setText("una fecha");
        lblFecha.setMaximumSize(new java.awt.Dimension(100, 18));

        final javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl)
                .addGap(10, 10, 10)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }
}
