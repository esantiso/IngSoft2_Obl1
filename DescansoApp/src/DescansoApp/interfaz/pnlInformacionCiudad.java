package descansoApp.interfaz;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import descansoApp.dominio.Sistema;
import static descansoApp.herramientas.TipoCA.*;

class pnlInformacionCiudad extends javax.swing.JPanel {

    private final Sistema modelo;
    private final descansoApp.dominio.Ciudad ciudad;
    private final JFrame padre;
    private int contador = 0;
    private final ArrayList<ImageIcon> listaImagenes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnterior;
    private javax.swing.JLabel lblDondeComer;
    private javax.swing.JLabel lblDondeDorimir;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGaleria;
    private javax.swing.JLabel lblNombreCiudad;
    private javax.swing.JLabel lblQueEstaCerca;
    private javax.swing.JLabel lblQueHacer;
    private javax.swing.JLabel lblRepercusiones;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JTextArea txtInfoGral;
    private javax.swing.JTextArea txtIntroduccion;

    pnlInformacionCiudad(final Sistema unModelo,final descansoApp.dominio.Ciudad unaCiudad,final JFrame unPadre) {
        initComponents();
        modelo = unModelo;
        ciudad = unaCiudad;
        padre = unPadre;
        listaImagenes = unaCiudad.getImagenes();
        if (listaImagenes.size() > 0) {
            lblGaleria.setIcon(listaImagenes.get(0));
        }
        txtIntroduccion.setOpaque(false);
        scroll1.setOpaque(false);
        scroll1.getViewport().setOpaque(false);
        scroll1.setBorder(null);

        txtInfoGral.setOpaque(false);
        scroll2.setOpaque(false);
        scroll2.getViewport().setOpaque(false);
        scroll2.setBorder(null);

        cargar();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnl = new javax.swing.JPanel();
        lblVolver = new javax.swing.JLabel();
        lblNombreCiudad = new javax.swing.JLabel();
        lblDondeDorimir = new javax.swing.JLabel();
        lblDondeComer = new javax.swing.JLabel();
        lblQueHacer = new javax.swing.JLabel();
        lblQueEstaCerca = new javax.swing.JLabel();
        pnlContenedor = new javax.swing.JPanel();
        lblSiguiente = new javax.swing.JLabel();
        lblAnterior = new javax.swing.JLabel();
        lblGaleria = new javax.swing.JLabel();
        scroll1 = new javax.swing.JScrollPane();
        txtIntroduccion = new javax.swing.JTextArea();
        scroll2 = new javax.swing.JScrollPane();
        txtInfoGral = new javax.swing.JTextArea();
        lblRepercusiones = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png"))); // NOI18N
        lblVolver.setToolTipText("Inicio");
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked();
            }
        });
        pnl.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 38, 30, 30));

        lblNombreCiudad.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        lblNombreCiudad.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCiudad.setText("Nombre de la Ciudad");
        pnl.add(lblNombreCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 36, -1, -1));

        lblDondeDorimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnDondeDormir.png"))); // NOI18N
        lblDondeDorimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDondeDorimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDondeDorimirMouseClicked();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDondeDorimirMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDondeDorimirMouseExited();
            }
        });
        pnl.add(lblDondeDorimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, -1, -1));

        lblDondeComer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnDondeComer.png"))); // NOI18N
        lblDondeComer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDondeComer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDondeComerMouseClicked();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDondeComerMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDondeComerMouseExited();
            }
        });
        pnl.add(lblDondeComer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 87, 150, 30));

        lblQueHacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnQueHacer.png"))); // NOI18N
        lblQueHacer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQueHacer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQueHacerMouseClicked();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQueHacerMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQueHacerMouseExited();
            }
        });
        pnl.add(lblQueHacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 87, -1, -1));

        lblQueEstaCerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnQueEstaCerca.png"))); // NOI18N
        lblQueEstaCerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQueEstaCerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQueEstaCercaMouseClicked();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQueEstaCercaMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQueEstaCercaMouseExited();
            }
        });
        pnl.add(lblQueEstaCerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 87, 150, -1));

        pnlContenedor.setOpaque(false);
        pnlContenedor.setLayout(null);

        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGaleriader.png"))); // NOI18N
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked();
            }
        });
        pnlContenedor.add(lblSiguiente);
        lblSiguiente.setBounds(430, 260, 26, 20);

        lblAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGaleriaIzq.png"))); // NOI18N
        lblAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnteriorMouseClicked();
            }
        });
        pnlContenedor.add(lblAnterior);
        lblAnterior.setBounds(20, 260, 26, 21);

        lblGaleria.setText(" ");
        lblGaleria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblGaleria.setMinimumSize(new java.awt.Dimension(450, 280));
        lblGaleria.setPreferredSize(new java.awt.Dimension(450, 280));
        pnlContenedor.add(lblGaleria);
        lblGaleria.setBounds(10, 140, 450, 280);

        scroll1.setMaximumSize(new java.awt.Dimension(162, 80));
        scroll1.setMinimumSize(new java.awt.Dimension(162, 80));
        scroll1.setPreferredSize(new java.awt.Dimension(162, 80));

        txtIntroduccion.setEditable(false);
        txtIntroduccion.setColumns(20);
        txtIntroduccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtIntroduccion.setForeground(new java.awt.Color(255, 255, 255));
        txtIntroduccion.setLineWrap(true);
        txtIntroduccion.setRows(5);
        txtIntroduccion.setToolTipText("");
        txtIntroduccion.setWrapStyleWord(true);
        txtIntroduccion.setAutoscrolls(false);
        txtIntroduccion.setBorder(null);
        txtIntroduccion.setHighlighter(null);
        scroll1.setViewportView(txtIntroduccion);

        pnlContenedor.add(scroll1);
        scroll1.setBounds(0, 0, 780, 80);

        txtInfoGral.setEditable(false);
        txtInfoGral.setColumns(20);
        txtInfoGral.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtInfoGral.setForeground(new java.awt.Color(255, 255, 255));
        txtInfoGral.setLineWrap(true);
        txtInfoGral.setRows(5);
        txtInfoGral.setWrapStyleWord(true);
        txtInfoGral.setHighlighter(null);
        txtInfoGral.setInheritsPopupMenu(true);
        scroll2.setViewportView(txtInfoGral);

        pnlContenedor.add(scroll2);
        scroll2.setBounds(10, 440, 450, 250);

        lblRepercusiones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRepercusiones.setForeground(new java.awt.Color(255, 255, 255));
        lblRepercusiones.setText("Repercusiones");
        pnlContenedor.add(lblRepercusiones);
        lblRepercusiones.setBounds(480, 90, 107, 17);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Repercusiones.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlContenedor.add(jLabel3);
        jLabel3.setBounds(470, 70, 310, 760);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1985");
        pnlContenedor.add(jLabel2);
        jLabel2.setBounds(640, 90, 32, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("875");
        pnlContenedor.add(jLabel4);
        jLabel4.setBounds(720, 90, 24, 17);

        pnl.add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 780, 840));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/InformacionCiudad.png"))); // NOI18N
        pnl.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setViewportView(pnl);

        final javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    } // </editor-fold>//GEN-END:initComponents

    private void lblAnteriorMouseClicked() { //GEN-FIRST:event_lblAnteriorMouseClicked
        if (contador == 0) {
            contador = listaImagenes.size() - 1;
        } else {
            contador--;
        }
        lblGaleria.setIcon(listaImagenes.get(contador));
    } //GEN-LAST:event_lblAnteriorMouseClicked

    private void lblSiguienteMouseClicked() { //GEN-FIRST:event_lblSiguienteMouseClicked
        if (contador == listaImagenes.size() - 1) {
            contador = 0;
        } else {
            contador++;
        }

        lblGaleria.setIcon(listaImagenes.get(contador));
    } //GEN-LAST:event_lblSiguienteMouseClicked

    private void lblDondeDorimirMouseEntered() { //GEN-FIRST:event_lblDondeDorimirMouseEntered
    } //GEN-LAST:event_lblDondeDorimirMouseEntered

    private void lblDondeDorimirMouseExited() { //GEN-FIRST:event_lblDondeDorimirMouseExited
        lblDondeDorimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnDondeDormir.png")));
    } //GEN-LAST:event_lblDondeDorimirMouseExited

    private void lblDondeComerMouseEntered() { //GEN-FIRST:event_lblDondeComerMouseEntered
    } //GEN-LAST:event_lblDondeComerMouseEntered

    private void lblDondeComerMouseExited() { //GEN-FIRST:event_lblDondeComerMouseExited
        lblDondeComer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnDondeComer.png")));
    } //GEN-LAST:event_lblDondeComerMouseExited

    private void lblQueHacerMouseEntered() { //GEN-FIRST:event_lblQueHacerMouseEntered
    } //GEN-LAST:event_lblQueHacerMouseEntered

    private void lblQueHacerMouseExited() { //GEN-FIRST:event_lblQueHacerMouseExited
        lblQueHacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnQueHacer.png")));
    } //GEN-LAST:event_lblQueHacerMouseExited

    private void lblQueEstaCercaMouseEntered() { //GEN-FIRST:event_lblQueEstaCercaMouseEntered
    } //GEN-LAST:event_lblQueEstaCercaMouseEntered

    private void lblQueEstaCercaMouseExited() { //GEN-FIRST:event_lblQueEstaCercaMouseExited
        lblQueEstaCerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnQueEstaCerca.png")));
    } //GEN-LAST:event_lblQueEstaCercaMouseExited

    private void lblDondeDorimirMouseClicked() { //GEN-FIRST:event_lblDondeDorimirMouseClicked
        padre.remove(this);
        padre.add(new pnlDondeQue(modelo, ciudad, padre, alojamiento));
        padre.pack();
    } //GEN-LAST:event_lblDondeDorimirMouseClicked

    private void lblDondeComerMouseClicked() { //GEN-FIRST:event_lblDondeComerMouseClicked
        padre.remove(this);
        padre.add(new pnlDondeQue(modelo, ciudad, padre, estGastronomico));
        padre.pack();
    } //GEN-LAST:event_lblDondeComerMouseClicked

    private void lblQueHacerMouseClicked() { //GEN-FIRST:event_lblQueHacerMouseClicked
        padre.remove(this);
        padre.add(new pnlDondeQue(modelo, ciudad, padre, actividad));
        padre.pack();
    } //GEN-LAST:event_lblQueHacerMouseClicked

    private void lblVolverMouseClicked() { //GEN-FIRST:event_lblVolverMouseClicked
        padre.remove(this);
        padre.add(new pnlInicio(modelo, padre));
        padre.pack();
    } //GEN-LAST:event_lblVolverMouseClicked

    private void lblQueEstaCercaMouseClicked() { //GEN-FIRST:event_lblQueEstaCercaMouseClicked
        padre.remove(this);
        padre.add(new pnlMapas(modelo, ciudad, padre));
        padre.pack();
    } //GEN-LAST:event_lblQueEstaCercaMouseClicked

    private void cargar() {
        lblNombreCiudad.setText(ciudad.getNombre());
        txtIntroduccion.setText(ciudad.getDescripcion());
        txtInfoGral.setText(ciudad.getInfoGral());
    }
}
