package descansoApp.interfaz;

import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;

class pnlMisViajes extends javax.swing.JPanel {

    private final Sistema modelo;
    private final JFrame miVentana;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNoHay;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JScrollPane scroll;

    public pnlMisViajes(Sistema unModelo, JFrame unContenedor) {
        initComponents();
        pnlResultados.setOpaque(false);
        pnlResultados.setLayout(new BoxLayout(pnlResultados, BoxLayout.PAGE_AXIS));
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);

        modelo = unModelo;
        miVentana = unContenedor;

        cargarViajes();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        pnlResultados = new javax.swing.JPanel();
        lblNoHay = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setAutoscrolls(true);
        scroll.setHorizontalScrollBar(null);
        scroll.setMaximumSize(new java.awt.Dimension(440, 195));
        scroll.setMinimumSize(new java.awt.Dimension(440, 195));
        scroll.setPreferredSize(new java.awt.Dimension(440, 195));

        final javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        scroll.setViewportView(pnlResultados);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lblNoHay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNoHay.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHay.setText("No hay viajes guardados!");
        add(lblNoHay, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 90, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/MisViajes.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void cargarViajes() {
        pnlResultados.removeAll();
        pnlResultados.repaint();

        final ArrayList<Viaje> resultados = modelo.getListaViajes();

        final int cantResultados = resultados.size();
        if (cantResultados > 0) {
            lblNoHay.setVisible(false);

            for (final Viaje resultado : resultados) {
                final pResultadoMisViajes pResultadoMisViajes = new pResultadoMisViajes(modelo, resultado, miVentana, this);

                pnlResultados.add(pResultadoMisViajes);
            }

            pnlResultados.setVisible(true);
            pnlResultados.revalidate();
            pnlResultados.repaint();
        } else {
            lblNoHay.setVisible(true);
        }
    }
}
