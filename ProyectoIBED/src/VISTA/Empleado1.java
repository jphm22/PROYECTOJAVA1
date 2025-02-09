
package VISTA;

import java.sql.*;
import CONTROL.Conexion;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Empleado1 extends javax.swing.JPanel {
        DefaultTableModel modelo1;
    
        Conexion enlace = new Conexion();
        Connection conect = enlace.conectar();
        
    public Empleado1() {
        initComponents();
        modelo1=new DefaultTableModel();
        this.modelo1.addColumn("Codigo");
        this.modelo1.addColumn("Nombre");
        this.modelo1.addColumn("Apellido");
        this.modelo1.addColumn("Cargo");
        this.modelo1.addColumn("Turno");
        this.modelo1.addColumn("DNI Huesped");
        this.tablaEMPLEADO.setModel(modelo1);
    }
    
    public void eliminarEmpleado(){
        int filaselec=tablaEMPLEADO.getSelectedRow();
        String valor = tablaEMPLEADO.getValueAt(filaselec, 0).toString();
        
        try {
            PreparedStatement eliminar = (PreparedStatement) conect.prepareStatement("DELETE FROM empleado WHERE codigo='"+valor+"'");
            eliminar.executeUpdate();
            modelo1.removeRow(filaselec);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se logro eliminar el registro");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoE = new javax.swing.JTextField();
        txtNombreE = new javax.swing.JTextField();
        txtApellidoE = new javax.swing.JTextField();
        txtFRH = new javax.swing.JTextField();
        cboCargo = new javax.swing.JComboBox<>();
        cboTurno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEMPLEADO = new javax.swing.JTable();
        btnInsertarE = new javax.swing.JButton();
        btnModificarE = new javax.swing.JButton();
        btnElminiarE = new javax.swing.JButton();
        btnGuardarE = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(1052, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-trabajo-permanente-96.png"))); // NOI18N
        jLabel1.setText("EMPLEADO ENCARGADO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("CODIGO");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDO");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("CARGO");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("DNI DEL HUESPED");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setText("TURNO");

        cboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Cargo", "GERENTE", "SUPERVISOR", "RECEPSIONISTA ", " " }));

        cboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Turno", "MAÑANA ", "TARDE ", "NOCHE", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cboTurno, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboCargo, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                    .addComponent(txtApellidoE, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreE, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoE, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFRH))
                .addGap(89, 89, 89))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFRH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tablaEMPLEADO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaEMPLEADO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEMPLEADOMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEMPLEADO);

        btnInsertarE.setBackground(new java.awt.Color(153, 255, 153));
        btnInsertarE.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnInsertarE.setText("INSERTAR");
        btnInsertarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarEActionPerformed(evt);
            }
        });

        btnModificarE.setBackground(new java.awt.Color(153, 255, 153));
        btnModificarE.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnModificarE.setText("MODIFICAR");
        btnModificarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEActionPerformed(evt);
            }
        });

        btnElminiarE.setBackground(new java.awt.Color(255, 0, 0));
        btnElminiarE.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnElminiarE.setText("ELIMINAR");
        btnElminiarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElminiarEActionPerformed(evt);
            }
        });

        btnGuardarE.setBackground(new java.awt.Color(153, 255, 153));
        btnGuardarE.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnGuardarE.setText("GUARDAR");
        btnGuardarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnElminiarE)
                .addGap(267, 267, 267))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnGuardarE, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertarE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarE, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertarE)
                            .addComponent(btnModificarE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnElminiarE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    int filas;
    private void tablaEMPLEADOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEMPLEADOMouseClicked
        int filaselec=tablaEMPLEADO.getSelectedRow();
        txtCodigoE.setText(tablaEMPLEADO.getValueAt(filaselec, 0).toString());
        txtNombreE.setText(tablaEMPLEADO.getValueAt(filaselec, 1).toString());
        txtApellidoE.setText(tablaEMPLEADO.getValueAt(filaselec, 2).toString());
        cboCargo.setSelectedItem(tablaEMPLEADO.getValueAt(filaselec, 3).toString());
        cboTurno.setSelectedItem(tablaEMPLEADO.getValueAt(filaselec, 4).toString());
        txtFRH.setText(tablaEMPLEADO.getValueAt(filaselec, 5).toString());
        filas=filaselec;
    }//GEN-LAST:event_tablaEMPLEADOMouseClicked

    private void btnInsertarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarEActionPerformed
        this.txtCodigoE.setText("");
        this.txtNombreE.setText("");
        this.txtApellidoE.setText("");
        this.cboCargo.setSelectedIndex(0);
        this.cboTurno.setSelectedIndex(0);
        this.txtFRH.setText("");
        txtCodigoE.grabFocus();
    }//GEN-LAST:event_btnInsertarEActionPerformed

    private void btnModificarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEActionPerformed
        String [] datos1=new String[6];
        datos1 [0]=txtCodigoE.getText();
        datos1 [1]=txtNombreE.getText();
        datos1 [2]=txtApellidoE.getText();
        datos1 [3]=this.cboCargo.getSelectedItem().toString();
        datos1 [4]=this.cboTurno.getSelectedItem().toString();
        datos1 [5]=txtFRH.getText();

        for(int i=0; i< tablaEMPLEADO.getColumnCount();i++)
        {
            modelo1.setValueAt(datos1[i],filas, i);
        }
    }//GEN-LAST:event_btnModificarEActionPerformed

    private void btnElminiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElminiarEActionPerformed
        
        eliminarEmpleado();
       
    }//GEN-LAST:event_btnElminiarEActionPerformed

    private void btnGuardarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEActionPerformed
        
        try {
            PreparedStatement guardar =  (PreparedStatement) conect.prepareStatement("INSERT INTO empleado (codigo,nombre,apellido,cargo,turno,dni_huesped) VALUE (?,?,?,?,?,?)");
            guardar.setString(1,txtCodigoE.getText());
            guardar.setString(2,txtNombreE.getText());
            guardar.setString(3,txtApellidoE.getText());
            guardar.setString(4,cboCargo.getSelectedItem().toString());
            guardar.setString(5,cboTurno.getSelectedItem().toString());
            guardar.setString(6,txtFRH.getText());
            
            this.modelo1.addRow(new Object[]{this.txtCodigoE.getText(),this.txtNombreE.getText(),this.txtApellidoE.getText(),this.cboCargo.getSelectedItem(),this.cboTurno.getSelectedItem(),this.txtFRH.getText()});
            this.txtCodigoE.setText("");
            this.txtNombreE.setText("");
            this.txtApellidoE.setText("");
            this.cboCargo.setSelectedIndex(0);
            this.cboTurno.setSelectedIndex(0);
            this.txtFRH.setText("");
            txtCodigoE.grabFocus();
            
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado registrado");
            
            // Limpiar los campos
            txtCodigoE.setText("");
            txtNombreE.setText("");
            txtApellidoE.setText("");           
            txtFRH.setText("");
            txtCodigoE.requestFocus();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " No se logro registrar el empleado");
        }
        
        

    }//GEN-LAST:event_btnGuardarEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElminiarE;
    private javax.swing.JButton btnGuardarE;
    private javax.swing.JButton btnInsertarE;
    private javax.swing.JButton btnModificarE;
    private javax.swing.JComboBox<String> cboCargo;
    private javax.swing.JComboBox<String> cboTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEMPLEADO;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextField txtCodigoE;
    private javax.swing.JTextField txtFRH;
    private javax.swing.JTextField txtNombreE;
    // End of variables declaration//GEN-END:variables
}
