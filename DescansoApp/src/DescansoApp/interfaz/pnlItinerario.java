package descansoApp.interfaz;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import descansoApp.dominio.Evento;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;


class pnlItinerario extends javax.swing.JPanel {

    private final Sistema modelo;
    private final Viaje viaje;
    private final JFrame miVentana;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNoHay;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JScrollPane scroll;

    pnlItinerario(final Sistema unModelo, final Viaje unViaje, final JFrame unContenedor) {
        initComponents();
        pnlResultados.setOpaque(false);
        pnlResultados.setLayout(new BoxLayout(pnlResultados, BoxLayout.PAGE_AXIS));
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);

        modelo = unModelo;
        viaje = unViaje;
        miVentana = unContenedor;

        lblNombre.setText(viaje.getNombre());

        cargarItinerario();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblVolver = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        pnlResultados = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblNoHay = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        lblVolver.setToolTipText("Volver");
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked();
            }
        });
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        final javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        scroll.setViewportView(pnlResultados);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 440, 190));

        lblNombre.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(51, 51, 51));
        lblNombre.setText("Nombre del Viaje");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 19, 410, 30));

        lblNoHay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNoHay.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHay.setText("No hay eventos guardados!");
        add(lblNoHay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Itinerario.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    } // </editor-fold>//GEN-END:initComponents

    private void lblVolverMouseClicked() { //GEN-FIRST:event_lblVolverMouseClicked
        miVentana.remove(this);
        miVentana.add(new pnlMisViajes(modelo, miVentana));
        miVentana.pack();
    } //GEN-LAST:event_lblVolverMouseClicked

    private void cargarItinerario() {
        int cantResultados;
        pnlResultados.removeAll();
        pnlResultados.repaint();

        final ArrayList<Evento> resultados = viaje.getItinerario();
        Collections.sort(resultados);
        cantResultados = resultados.size();
       
        if (cantResultados > 0) {
            lblNoHay.setVisible(false);
            descansoApp.dominio.Ciudad ciudad = null;
            Calendar fecha = null;

            for (int i = 0; i < cantResultados; i++) {

                final Evento actual = resultados.get(i);

                if (actual.getCiudad() != ciudad) {
                    ciudad = actual.getCiudad();
                    final pResultadoIt1 pResultadoIt1 = new pResultadoIt1(ciudad.getNombre());
                    pnlResultados.add(pResultadoIt1);
                }

                if (!fechasIguales(actual.getFechaHoraI(), fecha)) {
                    fecha = actual.getFechaHoraI();
                    final pResultadoIt2 pResultadoIt2 = new pResultadoIt2(actual.fechaInicioToString());
                    pnlResultados.add(pResultadoIt2);
                }

                final pResultadoIt3 pResultadoIt3 = new pResultadoIt3(modelo, viaje, actual, miVentana, this);
                pnlResultados.add(pResultadoIt3);

                pnlResultados.setVisible(true);
                pnlResultados.revalidate();
                pnlResultados.repaint();
            }
        } else {
            lblNoHay.setVisible(true);
        }
    }
    
     private boolean fechasIguales(final Calendar calendar1, final Calendar calendar2) {
         return ((calendar1 != null) || (calendar2 == null)) && ((calendar1 == null) || (calendar2 != null)) && (calendar1.get(Calendar.DAY_OF_MONTH) == calendar2.get(Calendar.DAY_OF_MONTH)) && (calendar1.get(Calendar.MONTH) == calendar2.get(Calendar.MONTH)) && (calendar1.get(Calendar.YEAR) == calendar1.get(Calendar.YEAR));
     }
}
