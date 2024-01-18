package archivosdetexto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class VentanaIngreso extends javax.swing.JFrame {

    File file;
    FileInputStream entrada;
    FileOutputStream salida;
    JFileChooser seleccionar = new JFileChooser();
    private MenuPrincipal ventanaMenuPrincipal;
    
    public VentanaIngreso() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_TXT = new javax.swing.JTextArea();
        btnCerrarTXT = new javax.swing.JButton();
        btnAbrirTXT = new javax.swing.JButton();
        btnGuardarTXT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        optCrearTXT = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        optBorrarTXT = new javax.swing.JMenuItem();
        optSalir = new javax.swing.JMenu();
        optRegresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea_TXT.setColumns(20);
        jTextArea_TXT.setRows(5);
        jScrollPane1.setViewportView(jTextArea_TXT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 480, 230));

        btnCerrarTXT.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarTXT.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnCerrarTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cross.png"))); // NOI18N
        btnCerrarTXT.setText("CERRAR");
        btnCerrarTXT.setToolTipText("Presione clic para cerrar el archivo..");
        btnCerrarTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrarTXT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarTXTActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 50));

        btnAbrirTXT.setBackground(new java.awt.Color(255, 255, 255));
        btnAbrirTXT.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnAbrirTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/data-in-folder.png"))); // NOI18N
        btnAbrirTXT.setText("ABRIR");
        btnAbrirTXT.setToolTipText("Presione clic para abrir o crear un archivo..");
        btnAbrirTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAbrirTXT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAbrirTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirTXTActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbrirTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 50));

        btnGuardarTXT.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarTXT.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnGuardarTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarTXT.setText("GUARDAR");
        btnGuardarTXT.setToolTipText("Presione clic para guardar el archivo..");
        btnGuardarTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarTXT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuardarTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTXTActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoMenu.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 410));

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N

        optCrearTXT.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        optCrearTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        optCrearTXT.setText("Crear");
        optCrearTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCrearTXTActionPerformed(evt);
            }
        });
        jMenu1.add(optCrearTXT);
        jMenu1.add(jSeparator1);

        optBorrarTXT.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        optBorrarTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ha-fallado.png"))); // NOI18N
        optBorrarTXT.setMnemonic('P');
        optBorrarTXT.setText("Eliminar ");
        optBorrarTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optBorrarTXTActionPerformed(evt);
            }
        });
        jMenu1.add(optBorrarTXT);

        jMenuBar1.add(jMenu1);

        optSalir.setText("Salir");
        optSalir.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N

        optRegresar.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        optRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ha-fallado.png"))); // NOI18N
        optRegresar.setMnemonic('P');
        optRegresar.setText("Cerrar Ventana");
        optRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optRegresarActionPerformed(evt);
            }
        });
        optSalir.add(optRegresar);

        jMenuBar1.add(optSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTXTActionPerformed

        //Si el archivo no existe, lo crea despues de guardar
        if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            file = seleccionar.getSelectedFile();
            if (file.getName().endsWith("txt")) {
                String Documento = jTextArea_TXT.getText();
                String mensaje = guardarArchivo(file, Documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar Documento de Texto");
            }
        }
    }//GEN-LAST:event_btnGuardarTXTActionPerformed

    public String AbrirArchivo(File archivo) {
        String documento = "";
        try {
            entrada = new FileInputStream(file);
            int ascii;
            while ((ascii = entrada.read()) != -1) {
                char caracter = (char) ascii;
                documento += caracter;
            }

        } catch (Exception e) {
        }
        return documento;
    }

    //Este metodo permite guardar el archivo
    public String guardarArchivo(File archivo, String documento) {
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "Archivo guardado";
        } catch (Exception e) {
        }
        return mensaje;
    }

    private void btnAbrirTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirTXTActionPerformed
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            file = seleccionar.getSelectedFile();
            if (file.canRead()) {
                if (file.getName().endsWith("txt")) {
                    String documento = AbrirArchivo(file);
                    jTextArea_TXT.setText("");
                    jTextArea_TXT.setText(documento);
                    JOptionPane.showMessageDialog(null, "Archivo abierto con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        }
    }//GEN-LAST:event_btnAbrirTXTActionPerformed
    public void cerrarArchivoTXT() {
        try {
            if (entrada != null) {
                entrada.close();
            }
            if (salida != null) {
                salida.close();
            }
            entrada = null;
            salida = null;
        } catch (IOException ex) {
            System.err.println("Error al cerrar archivo: " + ex.getMessage());
        }
    }

    private void btnCerrarTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarTXTActionPerformed
        // TODO add your handling code here:
        jTextArea_TXT.setText(null);
        cerrarArchivoTXT();
    }//GEN-LAST:event_btnCerrarTXTActionPerformed

    public void eliminarArchivoTXT() throws IOException {
        cerrarArchivoTXT();
        seleccionar.showOpenDialog(null);
        file = seleccionar.getSelectedFile();
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro de que desea eliminar el archivo actual?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            if (file != null) {
                if (file.delete()) {                  
                    JOptionPane.showMessageDialog(null, "Archivo Eliminado con éxito!");
                    System.out.println("Archivo Eliminado!");
                    jTextArea_TXT.setText("");
                } else {
                    System.out.println("error");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un archivo válido para eliminar");
            }
        }
    }

    private void optBorrarTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optBorrarTXTActionPerformed
        try {
            this.eliminarArchivoTXT();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar el archivo: " + ex.getMessage());
        }
    }//GEN-LAST:event_optBorrarTXTActionPerformed

    private void optRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ventanaMenuPrincipal = new MenuPrincipal();
        ventanaMenuPrincipal.setVisible(true);
        ventanaMenuPrincipal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_optRegresarActionPerformed

    private void optCrearTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCrearTXTActionPerformed
          
        seleccionar.setApproveButtonText("Crear");
        seleccionar.showSaveDialog(null); //Permite abrir la ventana de dialogo para facilitar la ubicación de creación
        file = new File(seleccionar.getSelectedFile() + ".txt"); //Permite crear un archivo concatenando "txt"
        try{      
            BufferedWriter nuevoArchivo = new BufferedWriter(new FileWriter(file)); //Permite escribir el archivo
            nuevoArchivo.close(); //Cierre del archivo
            JOptionPane.showMessageDialog(null, "Archivo creado con éxito");
        
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo: " + ex.getMessage());
        }    
    }//GEN-LAST:event_optCrearTXTActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirTXT;
    private javax.swing.JButton btnCerrarTXT;
    private javax.swing.JButton btnGuardarTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea_TXT;
    private javax.swing.JMenuItem optBorrarTXT;
    private javax.swing.JMenuItem optCrearTXT;
    private javax.swing.JMenuItem optRegresar;
    private javax.swing.JMenu optSalir;
    // End of variables declaration//GEN-END:variables
}
