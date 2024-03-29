/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControladorExcel;
import Modelo.ModeloExcel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author MustainE
 */
public class RAgriEstimado extends javax.swing.JInternalFrame {

    public RAgriEstimado() {
        initComponents();
        btnRefresh.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListProveedores = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnExcel = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtCertificado = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtSaco = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnImportar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtId4 = new javax.swing.JTextField();
        txtId5 = new javax.swing.JTextField();
        txtId6 = new javax.swing.JTextField();
        txtId7 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtMezcla = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdDocutraza = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 0, 51));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("..Registro Documento..");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 1, true), "Mantenimiento de Estimados Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(153, 0, 51))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(153, 0, 51));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtListProveedores.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtListProveedores.setForeground(new java.awt.Color(51, 51, 255));
        jtListProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtListProveedores.setGridColor(new java.awt.Color(0, 51, 153));
        jScrollPane1.setViewportView(jtListProveedores);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1090, 570));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 0, 51));
        jLabel22.setText("Total Tara:");
        jLabel22.setToolTipText("");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, -1, 20));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 0, 51));
        jLabel26.setText("Total K Bruto:");
        jLabel26.setToolTipText("");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 670, -1, 20));

        btnExcel.setBackground(new java.awt.Color(0, 102, 102));
        btnExcel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Save_20px.png")); // NOI18N
        btnExcel.setText("Excel");
        btnExcel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 100, 30));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 0, 51));
        jLabel33.setText("Parameros de Generación de lista.");
        jLabel33.setToolTipText("");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        txtPrecio.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 102));
        txtPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPrecio.setEnabled(false);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 60, 20));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 0, 51));
        jLabel36.setText("Peso:");
        jLabel36.setToolTipText("");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, 20));

        txtPeso.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(0, 0, 102));
        txtPeso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPeso.setEnabled(false);
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 100, 20));

        txtCertificado.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtCertificado.setForeground(new java.awt.Color(0, 0, 102));
        txtCertificado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCertificado.setEnabled(false);
        txtCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCertificadoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCertificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 80, 20));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(153, 0, 51));
        jLabel37.setText("Certificado:");
        jLabel37.setToolTipText("");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 20));

        txtSaco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtSaco.setForeground(new java.awt.Color(0, 0, 102));
        txtSaco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSaco.setEnabled(false);
        txtSaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSacoActionPerformed(evt);
            }
        });
        jPanel2.add(txtSaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 60, 20));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(153, 0, 51));
        jLabel38.setText("sacos:");
        jLabel38.setToolTipText("");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, 20));

        btnRegistrar.setBackground(new java.awt.Color(0, 102, 102));
        btnRegistrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Save_20px.png")); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 660, 100, 40));

        btnEditar.setBackground(new java.awt.Color(0, 102, 102));
        btnEditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Edit_Property_20px.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 100, 40));

        btnImportar.setBackground(new java.awt.Color(0, 102, 102));
        btnImportar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnImportar.setForeground(new java.awt.Color(255, 255, 255));
        btnImportar.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Save_20px.png")); // NOI18N
        btnImportar.setText("IMPORTAR DE EXCEL");
        btnImportar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });
        jPanel2.add(btnImportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 170, 30));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 0, 51));
        jLabel27.setText("Total Sacos:");
        jLabel27.setToolTipText("");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, -1, 20));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 0, 51));
        jLabel23.setText("Total K Neto:");
        jLabel23.setToolTipText("");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, -1, 20));

        txtId4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtId4.setForeground(new java.awt.Color(0, 0, 102));
        txtId4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtId4.setEnabled(false);
        txtId4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId4ActionPerformed(evt);
            }
        });
        jPanel2.add(txtId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, 70, 20));

        txtId5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtId5.setForeground(new java.awt.Color(0, 0, 102));
        txtId5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtId5.setEnabled(false);
        txtId5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId5ActionPerformed(evt);
            }
        });
        jPanel2.add(txtId5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 670, 70, 20));

        txtId6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtId6.setForeground(new java.awt.Color(0, 0, 102));
        txtId6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtId6.setEnabled(false);
        txtId6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId6ActionPerformed(evt);
            }
        });
        jPanel2.add(txtId6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 70, 20));

        txtId7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtId7.setForeground(new java.awt.Color(0, 0, 102));
        txtId7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtId7.setEnabled(false);
        txtId7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId7ActionPerformed(evt);
            }
        });
        jPanel2.add(txtId7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 670, 70, 20));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 0, 51));
        jLabel34.setText("Precio:");
        jLabel34.setToolTipText("");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        txtMezcla.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtMezcla.setForeground(new java.awt.Color(0, 0, 102));
        txtMezcla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtMezcla.setEnabled(false);
        txtMezcla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMezclaActionPerformed(evt);
            }
        });
        jPanel2.add(txtMezcla, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 60, 20));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(153, 0, 51));
        jLabel39.setText("Mezcla:");
        jLabel39.setToolTipText("");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, 20));

        btnProcesar.setBackground(new java.awt.Color(0, 102, 102));
        btnProcesar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnProcesar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcesar.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Save_20px.png")); // NOI18N
        btnProcesar.setText("Procesar");
        btnProcesar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        jPanel2.add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proceso Beta");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 160, -1));

        txtIdDocutraza.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtIdDocutraza.setForeground(new java.awt.Color(0, 0, 102));
        txtIdDocutraza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtIdDocutraza.setEnabled(false);
        txtIdDocutraza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDocutrazaActionPerformed(evt);
            }
        });
        jPanel2.add(txtIdDocutraza, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 60, 20));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 0, 51));
        jLabel35.setText("IdDocTraza:");
        jLabel35.setToolTipText("");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 20));

        btnRefresh.setText("R");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel2.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1120, 710));
        jPanel2.getAccessibleContext().setAccessibleName("Mantenimiento de Compra Contrato");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRO Y GENERACIÓN DE PROVEEDORES Y ESTIMADOS");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1140, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
      
    }//GEN-LAST:event_btnExcelActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCertificadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCertificadoActionPerformed

    private void txtSacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSacoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSacoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportarActionPerformed

    private void txtId4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId4ActionPerformed

    private void txtId5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId5ActionPerformed

    private void txtId6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId6ActionPerformed

    private void txtId7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId7ActionPerformed

    private void txtMezclaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMezclaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMezclaActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void txtIdDocutrazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDocutrazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDocutrazaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnExcel;
    public javax.swing.JButton btnImportar;
    public javax.swing.JButton btnProcesar;
    public static javax.swing.JButton btnRefresh;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtListProveedores;
    public javax.swing.JTextField txtCertificado;
    public javax.swing.JTextField txtId4;
    public javax.swing.JTextField txtId5;
    public javax.swing.JTextField txtId6;
    public javax.swing.JTextField txtId7;
    public javax.swing.JTextField txtIdDocutraza;
    public javax.swing.JTextField txtMezcla;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txtSaco;
    // End of variables declaration//GEN-END:variables
}
