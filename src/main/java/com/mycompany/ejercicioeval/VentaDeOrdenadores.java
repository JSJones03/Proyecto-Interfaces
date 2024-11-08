/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejercicioeval;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class VentaDeOrdenadores extends javax.swing.JFrame {

    public Vector<Venta> vector = new Vector<>();
    public Vector v = new Vector();

    /**
     * Creates new form VentaDeOrdenadores
     */
    public VentaDeOrdenadores() {
        initComponents();
        this.setLocationRelativeTo(null);
        deshabilitaBotones();
        textNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && !(textNombre.getText().isEmpty())) {
                    habilitaBotones();
                    configuracionStandar();
                    bAñadir.setEnabled(true);
                    bBuscar.setEnabled(true);
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
                if (textNombre.getText().length() >= 15) {
                    e.consume();
                }
                int key = e.getKeyChar();

                boolean mayusculas = key >= 65 && key <= 90;
                boolean minusculas = key >= 97 && key <= 122;
                boolean espacio = key == 32;

                if (!(minusculas || mayusculas || espacio)) {
                    e.consume();
                }
            }

        });

        ListaClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            @Override
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                if (!evt.getValueIsAdjusting()) {
                    bEliminar.setEnabled(!ListaClientes.isSelectionEmpty());
                }
            }
        });

        activarActionCommand();
    }

    private void habilitaBotones() {
        boxLocalidad.setEnabled(true);
        habilitaProcesador();
        habilitaMemoria();
        habilitaMonitor();
        habilitaDisco();
        habilitaOpciones();
    }

    private void deshabilitaBotones() {
        boxLocalidad.setEnabled(false);
        deshabilitaProcesador();
        deshabilitaMemoria();
        deshabilitaMonitor();
        deshabilitaDisco();
        deshabilitaOpciones();
        bAñadir.setEnabled(false);
        bBuscar.setEnabled(false);
        bEliminar.setEnabled(false);
    }

    private void deshabilitaProcesador() {
        procesador1.setEnabled(false);
        procesador2.setEnabled(false);
        procesador3.setEnabled(false);
        procesador4.setEnabled(false);
    }

    private void habilitaProcesador() {
        procesador1.setEnabled(true);
        procesador2.setEnabled(true);
        procesador3.setEnabled(true);
        procesador4.setEnabled(true);
    }

    private void deshabilitaMemoria() {
        memoria1.setEnabled(false);
        memoria2.setEnabled(false);
        memoria3.setEnabled(false);
        memoria4.setEnabled(false);
    }

    private void habilitaMemoria() {
        memoria1.setEnabled(true);
        memoria2.setEnabled(true);
        memoria3.setEnabled(true);
        memoria4.setEnabled(true);
    }

    private void deshabilitaMonitor() {
        monitor1.setEnabled(false);
        monitor2.setEnabled(false);
        monitor3.setEnabled(false);
        monitor4.setEnabled(false);
    }

    private void habilitaMonitor() {
        monitor1.setEnabled(true);
        monitor2.setEnabled(true);
        monitor3.setEnabled(true);
        monitor4.setEnabled(true);
    }

    private void deshabilitaDisco() {
        discoDuro1.setEnabled(false);
        discoDuro2.setEnabled(false);
        discoDuro3.setEnabled(false);
        discoDuro4.setEnabled(false);
    }

    private void habilitaDisco() {
        discoDuro1.setEnabled(true);
        discoDuro2.setEnabled(true);
        discoDuro3.setEnabled(true);
        discoDuro4.setEnabled(true);
    }

    private void deshabilitaOpciones() {
        opcion1.setEnabled(false);
        opcion2.setEnabled(false);
        opcion3.setEnabled(false);
        opcion4.setEnabled(false);
    }

    private void habilitaOpciones() {
        opcion1.setEnabled(true);
        opcion2.setEnabled(true);
        opcion3.setEnabled(true);
        opcion4.setEnabled(true);
    }

    private void configuracionStandar() {
        procesador2.setSelected(true);
        memoria4.setSelected(true);
        monitor4.setSelected(true);
        discoDuro4.setSelected(true);
        opcion1.setSelected(true);
        opcion2.setSelected(true);
        opcion3.setSelected(false);
        opcion4.setSelected(false);
    }

    private List<String> opciones() {
        List<String> listaOpciones;
        listaOpciones = new ArrayList<>();
        if (this.opcion1.isSelected()) {
            listaOpciones.add(opcion1.getText());
        }
        if (this.opcion2.isSelected()) {
            listaOpciones.add(opcion2.getText());
        }
        if (this.opcion3.isSelected()) {
            listaOpciones.add(opcion3.getText());
        }
        if (this.opcion4.isSelected()) {
            listaOpciones.add(this.opcion4.getText());
        }
        return listaOpciones;
    }

    private void activarActionCommand() {
        procesador1.setActionCommand(procesador1.getText());
        procesador2.setActionCommand(procesador2.getText());
        procesador3.setActionCommand(procesador3.getText());
        procesador4.setActionCommand(procesador4.getText());

        memoria1.setActionCommand(memoria1.getText());
        memoria2.setActionCommand(memoria2.getText());
        memoria3.setActionCommand(memoria3.getText());
        memoria4.setActionCommand(memoria4.getText());

        monitor1.setActionCommand(monitor1.getText());
        monitor2.setActionCommand(monitor2.getText());
        monitor3.setActionCommand(monitor3.getText());
        monitor4.setActionCommand(monitor4.getText());

        discoDuro1.setActionCommand(discoDuro1.getText());
        discoDuro2.setActionCommand(discoDuro2.getText());
        discoDuro3.setActionCommand(discoDuro3.getText());
        discoDuro4.setActionCommand(discoDuro4.getText());
    }

    private void eliminaCliente(int indice) {

        vector.remove(indice);

        //ListaClientes.setListData(vector); 
        //ListaClientes.updateUI();
        actualizarListaClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoProcesador = new javax.swing.ButtonGroup();
        GrupoMemoria = new javax.swing.ButtonGroup();
        GrupoMonitor = new javax.swing.ButtonGroup();
        GrupoDiscoDuro = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boxLocalidad = new javax.swing.JComboBox<>();
        textNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaClientes = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        procesador1 = new javax.swing.JRadioButton();
        procesador2 = new javax.swing.JRadioButton();
        procesador3 = new javax.swing.JRadioButton();
        procesador4 = new javax.swing.JRadioButton();
        memoria1 = new javax.swing.JRadioButton();
        memoria2 = new javax.swing.JRadioButton();
        memoria3 = new javax.swing.JRadioButton();
        memoria4 = new javax.swing.JRadioButton();
        monitor1 = new javax.swing.JRadioButton();
        monitor2 = new javax.swing.JRadioButton();
        monitor3 = new javax.swing.JRadioButton();
        monitor4 = new javax.swing.JRadioButton();
        discoDuro3 = new javax.swing.JRadioButton();
        discoDuro4 = new javax.swing.JRadioButton();
        discoDuro1 = new javax.swing.JRadioButton();
        discoDuro2 = new javax.swing.JRadioButton();
        opcion1 = new javax.swing.JCheckBox();
        opcion2 = new javax.swing.JCheckBox();
        opcion3 = new javax.swing.JCheckBox();
        opcion4 = new javax.swing.JCheckBox();
        bAñadir = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Lista de clientes");

        jLabel2.setText("Localidad");

        jLabel3.setText("Nombre del cliente");

        jLabel4.setText("Procesador");

        boxLocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Villalba", "Alpedrete", "Galapagar", "Guadarrama", "Moralzarzal" }));
        boxLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLocalidadActionPerformed(evt);
            }
        });

        textNombre.setMinimumSize(new java.awt.Dimension(150, 22));
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });

        jLabel5.setText("Memoria");

        jLabel7.setText("Monitor");

        jLabel8.setText("Disco Duro");

        jScrollPane2.setViewportView(ListaClientes);
        ListaClientes.getAccessibleContext().setAccessibleParent(textNombre);

        jLabel9.setText("Opciones");

        GrupoProcesador.add(procesador1);
        procesador1.setText("P4 3.0 Gb");
        procesador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesador1ActionPerformed(evt);
            }
        });

        GrupoProcesador.add(procesador2);
        procesador2.setText("P4 3.2 Gb");
        procesador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesador2ActionPerformed(evt);
            }
        });

        GrupoProcesador.add(procesador3);
        procesador3.setText("P4 Celeron");
        procesador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesador3ActionPerformed(evt);
            }
        });

        GrupoProcesador.add(procesador4);
        procesador4.setText("AMD 650");
        procesador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesador4ActionPerformed(evt);
            }
        });

        GrupoMemoria.add(memoria1);
        memoria1.setText("128 Mb");
        memoria1.setToolTipText("");
        memoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoria1ActionPerformed(evt);
            }
        });

        GrupoMemoria.add(memoria2);
        memoria2.setText("256 Mb");
        memoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoria2ActionPerformed(evt);
            }
        });

        GrupoMemoria.add(memoria3);
        memoria3.setText("512 Mb");
        memoria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoria3ActionPerformed(evt);
            }
        });

        GrupoMemoria.add(memoria4);
        memoria4.setText("1024 Mb");
        memoria4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoria4ActionPerformed(evt);
            }
        });

        GrupoMonitor.add(monitor1);
        monitor1.setText("15º");
        monitor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitor1ActionPerformed(evt);
            }
        });

        GrupoMonitor.add(monitor2);
        monitor2.setText("17º");
        monitor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitor2ActionPerformed(evt);
            }
        });

        GrupoMonitor.add(monitor3);
        monitor3.setText("TFT 15\"");
        monitor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitor3ActionPerformed(evt);
            }
        });

        GrupoMonitor.add(monitor4);
        monitor4.setText("TFT 17\"");
        monitor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitor4ActionPerformed(evt);
            }
        });

        GrupoDiscoDuro.add(discoDuro3);
        discoDuro3.setText("120 Gb");
        discoDuro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discoDuro3ActionPerformed(evt);
            }
        });

        GrupoDiscoDuro.add(discoDuro4);
        discoDuro4.setText("200 Gb");
        discoDuro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discoDuro4ActionPerformed(evt);
            }
        });

        GrupoDiscoDuro.add(discoDuro1);
        discoDuro1.setText("16 Gb");
        discoDuro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discoDuro1ActionPerformed(evt);
            }
        });

        GrupoDiscoDuro.add(discoDuro2);
        discoDuro2.setText("80 Gb");
        discoDuro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discoDuro2ActionPerformed(evt);
            }
        });

        opcion1.setText("Grabadora DVD");
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        opcion2.setText("Wifi");

        opcion3.setText("Sintonizador TV");

        opcion4.setText("Backup/Restore");
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });

        bAñadir.setText("Añadir");
        bAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadirActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monitor4)
                                    .addComponent(monitor3)
                                    .addComponent(monitor2)
                                    .addComponent(monitor1)
                                    .addComponent(jLabel7))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(discoDuro4)
                                    .addComponent(discoDuro3)
                                    .addComponent(discoDuro2)
                                    .addComponent(discoDuro1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bAñadir)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(procesador4)
                                        .addComponent(procesador3)
                                        .addComponent(procesador2)
                                        .addComponent(procesador1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(memoria4)
                                            .addComponent(memoria3)
                                            .addComponent(memoria2)
                                            .addComponent(memoria1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bBuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bEliminar)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opcion1)
                                    .addComponent(opcion2)
                                    .addComponent(opcion3)
                                    .addComponent(opcion4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bCancelar)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(textNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(boxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8))
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(procesador1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(procesador2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(procesador3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(procesador4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(memoria1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memoria2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memoria3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memoria4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(discoDuro1)
                                    .addComponent(opcion1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(discoDuro2)
                                    .addComponent(opcion2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(discoDuro3)
                                    .addComponent(opcion3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(discoDuro4)
                                    .addComponent(opcion4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(monitor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monitor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monitor3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monitor4)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bAñadir)
                        .addComponent(bBuscar)
                        .addComponent(bEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procesador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procesador1ActionPerformed

    private void procesador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesador2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procesador2ActionPerformed

    private void procesador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesador3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procesador3ActionPerformed

    private void procesador4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesador4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procesador4ActionPerformed

    private void memoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memoria1ActionPerformed

    private void memoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memoria2ActionPerformed

    private void memoria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoria3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memoria3ActionPerformed

    private void memoria4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoria4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memoria4ActionPerformed

    private void monitor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monitor1ActionPerformed

    private void monitor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monitor2ActionPerformed

    private void monitor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monitor3ActionPerformed

    private void monitor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monitor4ActionPerformed

    private void discoDuro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discoDuro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discoDuro3ActionPerformed

    private void discoDuro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discoDuro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discoDuro4ActionPerformed

    private void discoDuro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discoDuro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discoDuro1ActionPerformed

    private void discoDuro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discoDuro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discoDuro2ActionPerformed

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion4ActionPerformed

    private void bAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadirActionPerformed
        // TODO add your handling code here:
        deshabilitaBotones();
        Venta venta = new Venta(textNombre.getText(), boxLocalidad.getSelectedItem().toString(), GrupoProcesador.getSelection().getActionCommand(), GrupoMemoria.getSelection().getActionCommand(), GrupoDiscoDuro.getSelection().getActionCommand(), GrupoMonitor.getSelection().getActionCommand(), opciones());
        //venta.setProcesador(procesador);
        vector.add(venta);
        v.addElement(textNombre.getText());
        ListaClientes.setListData(v);
        jScrollPane2.getViewport().setView(ListaClientes);
        textNombre.setText("");
    }//GEN-LAST:event_bAñadirActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        deshabilitaBotones();

        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Estás seguro de que deseas eliminar el cliente seleccionado?",
                "Confirmación de Eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            eliminaCliente(ListaClientes.getSelectedIndex());

            JOptionPane.showMessageDialog(this, "Cliente eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Operación cancelada");
        }

    }//GEN-LAST:event_bEliminarActionPerformed
    private void actualizarListaClientes() {
        v.clear();
        for (Venta venta : vector) {
            v.addElement(venta.getNombre());
        }
        ListaClientes.setListData(v);
        jScrollPane2.setViewportView(ListaClientes);
        textNombre.setText("");
    }
    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        textNombre.setText("");
        deshabilitaBotones();
        textNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && !(textNombre.getText().isEmpty())) {
                    habilitaBotones();
                    configuracionStandar();
                    bAñadir.setEnabled(true);
                    bBuscar.setEnabled(true);
                }
            }
        });

    }//GEN-LAST:event_bCancelarActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_textNombreActionPerformed

    private void boxLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxLocalidadActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        deshabilitaBotones();
        //1 cuentaNombre();
        Vector<Venta> listaClientesIguales = new Vector();
        for (Venta venta : vector) {
            if (textNombre.getText().equals(venta.getNombre())) {
                listaClientesIguales.add(venta);
            }
        }

        boolean salir = false;
        if (!(listaClientesIguales.isEmpty())) {
            int cont = 0;

            while (!salir && cont < listaClientesIguales.size()) {
                salir = JOptionPane.showConfirmDialog(null, listaClientesIguales.get(cont) + "\n\n¿Desea ver más ventas del cliente?", "Cliente:" + textNombre.getText(), HEIGHT) == JOptionPane.CANCEL_OPTION;
                cont++;
                if (cont == listaClientesIguales.size()) {
                    JOptionPane.showMessageDialog(null, "Se han mostrado todas las ventas de " + textNombre.getText());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no registrado.", "Cliente", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreKeyTyped

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
            java.util.logging.Logger.getLogger(VentaDeOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaDeOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaDeOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaDeOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaDeOrdenadores().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoDiscoDuro;
    private javax.swing.ButtonGroup GrupoMemoria;
    private javax.swing.ButtonGroup GrupoMonitor;
    private javax.swing.ButtonGroup GrupoProcesador;
    private javax.swing.JList<String> ListaClientes;
    private javax.swing.JButton bAñadir;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JComboBox<String> boxLocalidad;
    private javax.swing.JRadioButton discoDuro1;
    private javax.swing.JRadioButton discoDuro2;
    private javax.swing.JRadioButton discoDuro3;
    private javax.swing.JRadioButton discoDuro4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton memoria1;
    private javax.swing.JRadioButton memoria2;
    private javax.swing.JRadioButton memoria3;
    private javax.swing.JRadioButton memoria4;
    private javax.swing.JRadioButton monitor1;
    private javax.swing.JRadioButton monitor2;
    private javax.swing.JRadioButton monitor3;
    private javax.swing.JRadioButton monitor4;
    private javax.swing.JCheckBox opcion1;
    private javax.swing.JCheckBox opcion2;
    private javax.swing.JCheckBox opcion3;
    private javax.swing.JCheckBox opcion4;
    private javax.swing.JRadioButton procesador1;
    private javax.swing.JRadioButton procesador2;
    private javax.swing.JRadioButton procesador3;
    private javax.swing.JRadioButton procesador4;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables

}
