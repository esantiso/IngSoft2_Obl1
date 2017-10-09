package descansoApp.interfaz;

import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;

class pnlNuevoViaje extends javax.swing.JPanel {

    private final Sistema modelo;
    private final JFrame miVentana;
    private final Viaje modViaje;

    public pnlNuevoViaje(Sistema unModelo, JFrame unContenedor, Viaje modificarViaje) {
        initComponents();
        modelo = unModelo;
        miVentana = unContenedor;
        modViaje = modificarViaje;
        lblBoton.setVisible(true);
        dChooserFechaI.getDateEditor().setEnabled(false);
        dChooserFechaF.getDateEditor().setEnabled(false);
        
        if (modViaje == null) {      
            lblVolver.setVisible(false);
            lblEliminar.setVisible(false);
            //lblBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardarONN.png")));
        } else {
            //lblCancelar.setVisible(false);
            lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/ModificarViaje.png")));
            txtNombre.setText(modViaje.getNombre());
            dChooserFechaI.setCalendar(modViaje.getFechaI());
            dChooserFechaF.setCalendar(modViaje.getFechaF());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        lblCancelar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        dChooserFechaI = new com.toedter.calendar.JDateChooser();
        dChooserFechaF = new com.toedter.calendar.JDateChooser();
        lblBoton = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 200, 20));

        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnCancelarUnclicked.png"))); // NOI18N
        lblCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCancelarMouseExited(evt);
            }
        });
        add(lblCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, 30));

        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnEliminarUnclicked2.png"))); // NOI18N
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEliminarMouseExited(evt);
            }
        });
        add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 120, 30));
        add(dChooserFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 138, 200, -1));
        add(dChooserFechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 168, 200, -1));

        lblBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png"))); // NOI18N
        lblBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBotonMouseExited(evt);
            }
        });
        add(lblBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 130, 30));

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png"))); // NOI18N
        lblVolver.setToolTipText("Volver");
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 35, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/NuevoViaje.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void lblEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseEntered
        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnEliminarClicked2.png")));
    }//GEN-LAST:event_lblEliminarMouseEntered

    private void lblEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseExited
        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnEliminarUnclicked2.png")));
    }//GEN-LAST:event_lblEliminarMouseExited

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el viaje?", "Eliminar Viaje", JOptionPane.OK_CANCEL_OPTION);
        if (respuesta == JOptionPane.OK_OPTION) {
            modelo.eliminarViaje(modViaje);
            JOptionPane.showMessageDialog(null, "El viaje se eliminó correctamente","Eliminar Viaje", WIDTH);
            miVentana.dispose();
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void lblBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseClicked
        if (txtNombre.getText().length() > 0 && dChooserFechaI != null && dChooserFechaF != null) {
            Viaje viaje;
            int respuesta;
                    
            if (modViaje == null) {
                respuesta = JOptionPane.showConfirmDialog(null, "¿Desea guardar el viaje?", "Guardar Viaje", JOptionPane.OK_CANCEL_OPTION);
                viaje = new Viaje();
            } else {
                respuesta = JOptionPane.showConfirmDialog(null, "¿Desea modificar el viaje?", "Modificar Viaje", JOptionPane.OK_CANCEL_OPTION);
                viaje = modViaje;
            }

            if (respuesta == JOptionPane.OK_OPTION){
         
                viaje.setNombre(txtNombre.getText());
                Calendar c = dChooserFechaI.getCalendar();

                try {
                    viaje.setFechaI(c);
                    viaje.setFechaF(dChooserFechaI.getCalendar(), dChooserFechaF.getCalendar());

                    if (modViaje == null) {
                        modelo.agregarViaje(viaje);
                        JOptionPane.showMessageDialog(null, "El viaje se guardó correctamente","Guardar Viaje", WIDTH);
                        miVentana.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "El viaje se modificó correctamente","Modificar Viaje", WIDTH);
                                miVentana.remove(this);
                                miVentana.add(new pnlMisViajes(modelo, miVentana));
                                miVentana.pack();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_lblBotonMouseClicked

    private void lblBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseEntered
        lblBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardarONN.png")));
    }//GEN-LAST:event_lblBotonMouseEntered

    private void lblBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseExited
        lblBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png")));
    }//GEN-LAST:event_lblBotonMouseExited

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        miVentana.remove(this);
        miVentana.add(new pnlMisViajes(modelo, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        if (modViaje == null) {
                miVentana.dispose();
            } else {
               miVentana.remove(this);
               miVentana.add(new pnlMisViajes(modelo, miVentana));
               miVentana.pack();
            }
    }//GEN-LAST:event_lblCancelarMouseClicked

    private void lblCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseEntered
        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnCancelarClicked.png")));
    }//GEN-LAST:event_lblCancelarMouseEntered

    private void lblCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseExited
        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnCancelarUnclicked.png")));
    }//GEN-LAST:event_lblCancelarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dChooserFechaF;
    private com.toedter.calendar.JDateChooser dChooserFechaI;
    private javax.swing.JLabel lblBoton;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
