package descansoApp.interfaz;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import descansoApp.dominio.ComercioActividad;
import descansoApp.dominio.Sistema;
import descansoApp.herramientas.TipoCA;

class pnlDondeQue extends javax.swing.JPanel {

    private final Sistema modelo;
    private final descansoApp.dominio.Ciudad ciudad;
    private final JFrame padre;
    private ArrayList<ComercioActividad> lista;
    private final ArrayList<String> filtros;

    public pnlDondeQue(Sistema unModelo, descansoApp.dominio.Ciudad unaCiudad, JFrame unPadre, TipoCA unTipo) {
        initComponents();
        pnlResultados.setOpaque(false);
        pnlResultados.setLayout(new BoxLayout(pnlResultados, BoxLayout.PAGE_AXIS));

        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);

        scroll2.setOpaque(false);
        scroll2.getViewport().setOpaque(false);
        scroll2.setBorder(null);
        ((javax.swing.DefaultListCellRenderer) lstFiltros.getCellRenderer()).setOpaque(false);

        modelo = unModelo;
        ciudad = unaCiudad;
        padre = unPadre;
        filtros = new ArrayList<>();

        switch (unTipo) {
            case alojamiento:
                lista = ciudad.getAlojamientos();
                lblTitulo.setText("¿Dónde Dormir?");
                break;
            case estGastronomico:
                lista = ciudad.getEstGastronomicos();
                lblTitulo.setText("¿Dónde Comer?");
                break;
            case actividad:
                lista = ciudad.getActividades();
                lblTitulo.setText("¿Qué hacer?");
                break;
        }

        Collections.sort(lista);

        cargar();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        lstFiltros = new javax.swing.JList();
        scroll = new javax.swing.JScrollPane();
        pnlResultados = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblVolver1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        jLabel1.setToolTipText("Volver");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked();
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 38, 30, 30));

        scroll2.setHorizontalScrollBar(null);

        lstFiltros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lstFiltros.setForeground(new java.awt.Color(255, 255, 255));
        lstFiltros.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstFiltros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstFiltros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstFiltros.setOpaque(false);
        lstFiltros.setSelectionBackground(new java.awt.Color(51, 255, 0));
        lstFiltros.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFiltrosValueChanged();
            }
        });
        scroll2.setViewportView(lstFiltros);

        add(scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 140, 370));

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        scroll.setViewportView(pnlResultados);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 620, 370));

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("TITULO");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 36, 240, 30));

        lblVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png"))); // NOI18N
        lblVolver1.setToolTipText("Inicio");
        lblVolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblVolver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolver1MouseClicked();
            }
        });
        add(lblVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 38, 30, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Fondo2.1.jpg.png"))); // NOI18N
        lblFondo.setPreferredSize(new java.awt.Dimension(840, 500));
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lstFiltrosValueChanged() {//GEN-FIRST:event_lstFiltrosValueChanged
        pnlResultados.removeAll();
        pnlResultados.repaint();

        for (ComercioActividad actual : lista) {
            if (filtros.get(lstFiltros.getSelectedIndex()).equals(actual.getCategoria())) {
                pResultadoDondeQue p = new pResultadoDondeQue(modelo, actual, padre, this, ciudad);
                pnlResultados.add(p);
            }
        }

        pnlResultados.setVisible(true);
        pnlResultados.revalidate();
        pnlResultados.repaint();
    }//GEN-LAST:event_lstFiltrosValueChanged

    private void jLabel1MouseClicked() {//GEN-FIRST:event_jLabel1MouseClicked
        padre.remove(this);
        padre.add(new pnlInformacionCiudad(modelo, ciudad, padre));
        padre.pack();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblVolver1MouseClicked() {//GEN-FIRST:event_lblVolver1MouseClicked
        padre.remove(this);
        padre.add(new pnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblVolver1MouseClicked

    private void cargar() {

        int cantResultados = lista.size();
        if (cantResultados > 0) {
            for (ComercioActividad aLista : lista) {
                if (!filtros.contains(aLista.getCategoria())) {
                    filtros.add(aLista.getCategoria());
                }
            }
        } 

        Collections.sort(filtros);
        lstFiltros.setListData(filtros.toArray());
        lstFiltros.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVolver1;
    private javax.swing.JList lstFiltros;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll2;
    // End of variables declaration//GEN-END:variables
}
