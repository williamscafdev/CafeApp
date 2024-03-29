/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControladorCrudAperturaContrato;
import Controlador.ControladorCrudCompraContrato;
import Controlador.ControladorCrudDocutraza;
import Controlador.ControladorCrudEmpresa;
import Controlador.ControladorCrudPersonaUsuario;
import Controlador.ControladorCrudSucursal;
import Controlador.ControladorTracking;
import Controlador.ControladorTrackingDocumento;
import dao.AperturaContratoDao;
import dao.CompraContratoDao;
import dao.DocutrazaDao;
import dao.EmpresaDao;
import dao.PersonaDao;
import dao.SucursalDao;
import dao.TrackingDao;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author MustainE
 */
public class TraIni extends javax.swing.JFrame {

    String idempresa;

    /**
     * Creates new form TraIni
     */
    public TraIni() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskPrincipal = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmEmpresa = new javax.swing.JMenuItem();
        jmEmpresa2 = new javax.swing.JMenuItem();
        jmPersona = new javax.swing.JMenuItem();
        jmEmpresa4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMApC = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Trazabilidad");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1620, 900));

        dskPrincipal.setBackground(new java.awt.Color(255, 102, 102));
        dskPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));
        dskPrincipal.setPreferredSize(new java.awt.Dimension(1610, 880));

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LIMA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 490, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Empresa:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lblSucursal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSucursal.setForeground(new java.awt.Color(255, 255, 255));
        lblSucursal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSucursal.setText("1");
        jPanel1.add(lblSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, -1));

        lblEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresa.setText("1");
        jPanel1.add(lblEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WIMDATAPE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 490, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sucursal:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, 16));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LIMA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 490, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, -1));

        dskPrincipal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dskPrincipalLayout = new javax.swing.GroupLayout(dskPrincipal);
        dskPrincipal.setLayout(dskPrincipalLayout);
        dskPrincipalLayout.setHorizontalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dskPrincipalLayout.setVerticalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(58, 32769));
        jMenuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseDragged(evt);
            }
        });
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBar1MousePressed(evt);
            }
        });

        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Save_25px.png")); // NOI18N
        jMenu1.setText("Archivo");

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(51, 0, 153));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Shutdown_25px.png")); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Engineering_20px.png")); // NOI18N
        jMenu2.setText("Mantenimiento");

        jmEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        jmEmpresa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmEmpresa.setForeground(new java.awt.Color(51, 0, 153));
        jmEmpresa.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Skyscrapers_20px.png")); // NOI18N
        jmEmpresa.setText("Empresas");
        jmEmpresa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jmEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEmpresaActionPerformed(evt);
            }
        });
        jMenu2.add(jmEmpresa);

        jmEmpresa2.setBackground(new java.awt.Color(255, 255, 255));
        jmEmpresa2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmEmpresa2.setForeground(new java.awt.Color(51, 0, 153));
        jmEmpresa2.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Estimate_25px.png")); // NOI18N
        jmEmpresa2.setText("Estimados");
        jmEmpresa2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jmEmpresa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEmpresa2ActionPerformed(evt);
            }
        });
        jMenu2.add(jmEmpresa2);

        jmPersona.setBackground(new java.awt.Color(255, 255, 255));
        jmPersona.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmPersona.setForeground(new java.awt.Color(51, 0, 153));
        jmPersona.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Estimate_25px.png")); // NOI18N
        jmPersona.setText("Persona");
        jmPersona.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jmPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPersonaActionPerformed(evt);
            }
        });
        jMenu2.add(jmPersona);

        jmEmpresa4.setBackground(new java.awt.Color(255, 255, 255));
        jmEmpresa4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmEmpresa4.setForeground(new java.awt.Color(51, 0, 153));
        jmEmpresa4.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Skyscrapers_20px.png")); // NOI18N
        jmEmpresa4.setText("Sucursal");
        jmEmpresa4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jmEmpresa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEmpresa4ActionPerformed(evt);
            }
        });
        jMenu2.add(jmEmpresa4);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Survey_25px.png")); // NOI18N
        jMenu3.setText("Auditoria");

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(51, 0, 153));
        jMenuItem4.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Track_Order_25px.png")); // NOI18N
        jMenuItem4.setText("Tracking Estimado");
        jMenuItem4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(51, 0, 153));
        jMenuItem5.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Track_Order_25px.png")); // NOI18N
        jMenuItem5.setText("Tracking Documento");
        jMenuItem5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMApC.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Survey_25px.png")); // NOI18N
        jMApC.setText("Aperturas");

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(51, 0, 153));
        jMenuItem6.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Order_History_25px.png")); // NOI18N
        jMenuItem6.setText("Apertura Contrato");
        jMenuItem6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMApC.add(jMenuItem6);

        jMenuItem7.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(51, 0, 153));
        jMenuItem7.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Order_History_25px.png")); // NOI18N
        jMenuItem7.setText("Compra Contrato");
        jMenuItem7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMApC.add(jMenuItem7);

        jMenuItem8.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(51, 0, 153));
        jMenuItem8.setIcon(new javax.swing.ImageIcon("D:\\Sistema\\Imagenes\\icons8_Order_History_25px.png")); // NOI18N
        jMenuItem8.setText("Reg Doc.Trazabilidad");
        jMenuItem8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMApC.add(jMenuItem8);

        jMenuBar1.add(jMApC);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dskPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEmpresaActionPerformed
        REmpresa ventana1 = new REmpresa();
        EmpresaDao modeloC = new EmpresaDao();
        ControladorCrudEmpresa controlaC = new ControladorCrudEmpresa(ventana1, modeloC);
        controlaC.construirTabla();
        dskPrincipal.add(ventana1);
        ventana1.setVisible(true);
    }//GEN-LAST:event_jmEmpresaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        int idempresa = Integer.valueOf(TraIni.lblEmpresa.getText());
        int idsucursal = Integer.valueOf(TraIni.lblSucursal.getText());
        
        TrackingCafe ventanac = new TrackingCafe();
        TrackingDao modeloC2 = new TrackingDao();
        ControladorTracking controlaC3 = new ControladorTracking(ventanac, modeloC2);
        controlaC3.construirTabla(idempresa,idsucursal);
        dskPrincipal.add(ventanac);
        ventanac.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jmEmpresa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEmpresa2ActionPerformed

    }//GEN-LAST:event_jmEmpresa2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        int idempresa = Integer.valueOf(TraIni.lblEmpresa.getText());
        int idsucursal = Integer.valueOf(TraIni.lblSucursal.getText());
        
        TrackingCafeDocumentos ventanac = new TrackingCafeDocumentos();
        TrackingDao modeloC2 = new TrackingDao();
        ControladorTrackingDocumento controlaC3 = new ControladorTrackingDocumento(ventanac, modeloC2);
        controlaC3.construirTabla(idempresa,idsucursal);
        dskPrincipal.add(ventanac);
        ventanac.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    int xx, xy;
    private void jMenuBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jMenuBar1MousePressed

    private void jMenuBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jMenuBar1MouseDragged

    private void jmPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPersonaActionPerformed
   RPersonaUsuario ventana2 = new RPersonaUsuario();
        PersonaDao modeloC2 = new PersonaDao();
        ControladorCrudPersonaUsuario controlaC = new ControladorCrudPersonaUsuario(ventana2, modeloC2);
        int empresa = Integer.valueOf(lblEmpresa.getText().toString());
        //int idscursal = Integer.valueOf(lblSucursal.getText().toString());
        controlaC.construirTabla(empresa);
        dskPrincipal.add(ventana2);
        ventana2.setVisible(true);
    }//GEN-LAST:event_jmPersonaActionPerformed

    private void jmEmpresa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEmpresa4ActionPerformed
        RSucursal ventana2 = new RSucursal();
        SucursalDao modeloC2 = new SucursalDao();
        ControladorCrudSucursal controlaC = new ControladorCrudSucursal(ventana2, modeloC2);
        int empresa = Integer.valueOf(lblEmpresa.getText().toString());
        controlaC.construirTabla(empresa);
        dskPrincipal.add(ventana2);
        ventana2.setVisible(true);
    }//GEN-LAST:event_jmEmpresa4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        RAperturaContrato ventana2 = new RAperturaContrato();
        AperturaContratoDao modeloC2 = new AperturaContratoDao();
        ControladorCrudAperturaContrato controlaC = new ControladorCrudAperturaContrato(ventana2, modeloC2);
        int empresa = Integer.valueOf(lblEmpresa.getText().toString());
        int idsucursal = Integer.valueOf(lblSucursal.getText().toString());
        controlaC.construirTabla(empresa, idsucursal);
        dskPrincipal.add(ventana2);
        ventana2.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        RCompraContrato ventana2 = new RCompraContrato();
        CompraContratoDao modeloC2 = new CompraContratoDao();
        ControladorCrudCompraContrato controlaC = new ControladorCrudCompraContrato(ventana2, modeloC2);
        int empresa = Integer.valueOf(lblEmpresa.getText().toString());
        int idsucursal = Integer.valueOf(lblSucursal.getText().toString());
        int apc = 0;
        controlaC.construirTablaCc(empresa, idsucursal, apc);
        controlaC.construirTablaApc(empresa, idsucursal);
        dskPrincipal.add(ventana2);
        ventana2.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        RDocutraza_Document ventana2 = new RDocutraza_Document();
        DocutrazaDao modeloC2 = new DocutrazaDao();
        ControladorCrudDocutraza controlaC = new ControladorCrudDocutraza(ventana2, modeloC2);
        int empresa = Integer.valueOf(lblEmpresa.getText().toString());
        int idsucursal = Integer.valueOf(lblSucursal.getText().toString());
        int apc = 0;
        controlaC.construirTablaCompraContrato(empresa, idsucursal);
        controlaC.construirTablaDocutraza(empresa, idsucursal);
        dskPrincipal.add(ventana2);
        ventana2.setVisible(true);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TraIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraIni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane dskPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMApC;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    public javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmEmpresa;
    private javax.swing.JMenuItem jmEmpresa2;
    private javax.swing.JMenuItem jmEmpresa4;
    private javax.swing.JMenuItem jmPersona;
    public static javax.swing.JLabel lblEmpresa;
    public static javax.swing.JLabel lblSucursal;
    // End of variables declaration//GEN-END:variables
}
