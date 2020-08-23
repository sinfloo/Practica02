package vistas;

import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import config.Fecha;
import config.GenerarSerie;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modeloDAO.ClienteDAO;
import modelo.DetalleVentas;
import modelo.Producto;
import modeloDAO.ProductoDAO;
import modelo.Ventas;
import modeloDAO.VentasDAO;
import utils.Utils;

public class VentasForm extends javax.swing.JInternalFrame {

    VentasDAO vdao = new VentasDAO();
    ClienteDAO cdao = new ClienteDAO();
    ProductoDAO pdao = new ProductoDAO();

    Producto p = new Producto();
    Ventas v = new Ventas();
    DetalleVentas dv = new DetalleVentas();

    Cliente cliente = new Cliente();
    int item;
    DefaultTableModel modelo = new DefaultTableModel();
    int idp;
    int cant;
    double pre;
    double tpagar;

    String[] imagenPlato = {"default.png", "hamburguesa.png", "pierna.jpg", "alitas.jpg"};

    public VentasForm() {
        initComponents();
        generarSerie();
        fecha();
        txtCantidad.setValue(1);
        File file = new File("C:\\Users\\petuel\\Documents\\NetBeansProjects\\Practica02\\src\\Img\\logo.jpeg");
        ImageIcon icon = new ImageIcon(file.getAbsolutePath());
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(180, 140, Image.SCALE_REPLICATE));
        lblImagen.setIcon(icono);
        File file1 = new File("C:\\Users\\petuel\\Documents\\NetBeansProjects\\Practica02\\src\\Img\\productos\\" + imagenPlato[0]);
        ImageIcon icon1 = new ImageIcon(file1.getAbsolutePath());
        Icon icono1 = new ImageIcon(icon1.getImage().getScaledInstance(160, 140, Image.SCALE_REPLICATE));
        lblPlato.setIcon(icono1);

        cargarCombos();
    }

    private void cargarCombos() {
        List<Producto> productos = new ProductoDAO().listarProducto();
        productos.forEach(producto -> {
            cboProducto.addItem(producto);
        });
    }

    private void fecha() {
        Fecha fe = new Fecha();
        txtFecha.setText(fe.Fecha());
    }

    private void generarSerie() {
        String serie = vdao.NroSerieVentas();
        if (serie == null) {
            txtSerie.setText("000000001");
        } else {
            int increment = Integer.parseInt(serie);
            GenerarSerie gs = new GenerarSerie();
            serie = gs.NumeroSerie(increment);
            txtSerie.setText(serie);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        cboProducto = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        lblPlato = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtSerie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();

        jTextField7.setText("jTextField7");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Sistema de Ventas");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "COD", "PRODUCTO", "PRE UNI", "CANT", "TOTAL"
            }
        ));
        TablaDetalle.setRowHeight(25);
        jScrollPane1.setViewportView(TablaDetalle);
        if (TablaDetalle.getColumnModel().getColumnCount() > 0) {
            TablaDetalle.getColumnModel().getColumn(0).setMinWidth(50);
            TablaDetalle.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDetalle.getColumnModel().getColumn(0).setMaxWidth(50);
            TablaDetalle.getColumnModel().getColumn(1).setMinWidth(50);
            TablaDetalle.getColumnModel().getColumn(1).setPreferredWidth(50);
            TablaDetalle.getColumnModel().getColumn(1).setMaxWidth(50);
            TablaDetalle.getColumnModel().getColumn(3).setMinWidth(70);
            TablaDetalle.getColumnModel().getColumn(3).setPreferredWidth(70);
            TablaDetalle.getColumnModel().getColumn(3).setMaxWidth(70);
            TablaDetalle.getColumnModel().getColumn(4).setMinWidth(50);
            TablaDetalle.getColumnModel().getColumn(4).setPreferredWidth(50);
            TablaDetalle.getColumnModel().getColumn(4).setMaxWidth(50);
            TablaDetalle.getColumnModel().getColumn(5).setMinWidth(70);
            TablaDetalle.getColumnModel().getColumn(5).setPreferredWidth(70);
            TablaDetalle.getColumnModel().getColumn(5).setMaxWidth(70);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CELULAR:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("PLATO:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("PRECIO :");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("CANTIDAD :");

        txtCantidad.setAlignmentX(0.9F);
        txtCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cboProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProductoItemStateChanged(evt);
            }
        });

        lblPlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrecio)
                    .addComponent(txtCantidad)
                    .addComponent(txtCodCliente)
                    .addComponent(cboProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblImagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money.png"))); // NOI18N
        jLabel14.setText("TOTAL A PAGAR :");

        txtTotalPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calcular.png"))); // NOI18N
        btnGenerar.setText("GENERAR TICKET");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerar)
                .addGap(34, 34, 34)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPagar)
                    .addComponent(jLabel14)
                    .addComponent(btnGenerar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        txtSerie.setEditable(false);
        txtSerie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSerie.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NRO.TICKET:");

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 51, 255));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setCaretColor(new java.awt.Color(0, 51, 255));
        txtFecha.setDisabledTextColor(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String celular = txtCodCliente.getText();
        if (txtTotalPagar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar Datos");
            btnAgregar.requestFocus();
        } else if (!Utils.permitLength(celular) || !Utils.isNumeric(celular)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar Celular Válido");
            txtCodCliente.requestFocus();
        } else {
            imprimir(celular);
            Imprimir imprimir = new Imprimir(new File(celular + ".txt"));
            Principal.VentanaPrincipal.add(imprimir);
            imprimir.setVisible(true);
            Utils.utilJTablePrint(TablaDetalle, "CLIENTE :" + celular, "Total a Pagar: " + txtTotalPagar.getText(), true);//Colocar en true si quiere personalizar
            guardarVenta();
            guardarDetalle();
            JOptionPane.showMessageDialog(this, "La venta se Realizo con Exito...!!!");
            nuevo();
            generarSerie();
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarProducto();
        btnAgregar.setEnabled(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cboProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProductoItemStateChanged
        Producto pro = cboProducto.getItemAt(cboProducto.getSelectedIndex());
        String imagen = pro.getNom();
        for (String string : imagenPlato) {
            if (imagen.substring(0, 4).equalsIgnoreCase(string.substring(0, 4))) {
                File file1 = new File("C:\\Users\\petuel\\Documents\\NetBeansProjects\\Practica02\\src\\Img\\productos\\" + string);
                ImageIcon icon1 = new ImageIcon(file1.getAbsolutePath());
                Icon icono1 = new ImageIcon(icon1.getImage().getScaledInstance(130, 100, Image.SCALE_REPLICATE));
                lblPlato.setIcon(icono1);
            }
        }
        txtPrecio.setText("" + pro.getPre());
        btnAgregar.setEnabled(true);

    }//GEN-LAST:event_cboProductoItemStateChanged
    void nuevo() {
        limpiarTabla();
        txtCodCliente.setText("");
        txtCantidad.setValue(1);
        txtPrecio.setText("");
        cboProducto.setSelectedIndex(0);
        txtTotalPagar.setText("");
        txtCodCliente.requestFocus();
    }

    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void actualizarStock() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Producto pr = new Producto();
            idp = Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            cant = Integer.parseInt(TablaDetalle.getValueAt(i, 4).toString());
            pr = pdao.listarID(idp);
            int sa = pr.getStock() - cant;
            pdao.actualizarStock(sa, idp);
        }
    }

    private void guardarVenta() {
        int idv = 1;
        Cliente cli = cdao.listarCI(txtCodCliente.getText());
        String serie = txtSerie.getText();
        String fecha = Fecha.FechaBD();
        double monto = tpagar;
        String estado = "1";
        v.setIdCliente(cli.getId());
        v.setIdVendedor(idv);
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);
        v.setEstado(estado);
        vdao.GuardarVentas(v);
    }

    private void guardarDetalle() {
        String idv = vdao.IdVentas();
        int idve = Integer.parseInt(idv);
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            int idpro = Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            int canti = Integer.parseInt(TablaDetalle.getValueAt(i, 4).toString());
            double precio = Double.parseDouble(TablaDetalle.getValueAt(i, 3).toString());
            dv.setIdVentas(idve);
            dv.setIdProducto(idpro);
            dv.setCantidad(canti);
            dv.setPreVenta(precio);
            vdao.GuardarDetalleVentas(dv);
        }
    }

    void agregarProducto() {
        double total;
        modelo = (DefaultTableModel) TablaDetalle.getModel();
        item = item + 1;
        int idpr = cboProducto.getItemAt(cboProducto.getSelectedIndex()).getId();
        String nomp = cboProducto.getItemAt(cboProducto.getSelectedIndex()).getNom();
        pre = Double.parseDouble(txtPrecio.getText());
        cant = Integer.parseInt(txtCantidad.getValue().toString());
        total = cant * pre;
        ArrayList lista = new ArrayList();
        lista.add(item);
        lista.add(idpr);
        lista.add(nomp);
        lista.add(pre);
        lista.add(cant);
        lista.add(total);
        Object[] ob = new Object[6];
        ob[0] = lista.get(0);
        ob[1] = lista.get(1);
        ob[2] = lista.get(2);
        ob[3] = lista.get(3);
        ob[4] = lista.get(4);
        ob[5] = lista.get(5);
        modelo.addRow(ob);
        TablaDetalle.setModel(modelo);
        calculatTotal();
    }

    private void calculatTotal() {
        tpagar = 0;
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            cant = Integer.parseInt(TablaDetalle.getValueAt(i, 4).toString());
            pre = Double.parseDouble(TablaDetalle.getValueAt(i, 3).toString());
            tpagar = tpagar + (cant * pre);
        }
        txtTotalPagar.setText("" + tpagar + "0");
    }

    private void imprimir(String celular) {
        PrinterMatrix printer = new PrinterMatrix();

        Extenso e = new Extenso();

        e.setNumber(80);

        //Definir el tamanho del papel para la impresion  aca 25 lineas y 80 columnas
        printer.setOutSize(20, 60);
        //Imprimir * de la 2da linea a 25 en la columna 1;
        // printer.printCharAtLin(2, 25, 1, "*");
        //Imprimir * 1ra linea de la columa de 1 a 80
        printer.printCharAtCol(1, 1, 60, "=");
        //Imprimir Encabezado nombre del La EMpresa
        printer.printTextWrap(1, 2, 30, 60, "TICKET DE COMPRA");
        //printer.printTextWrap(linI, linE, colI, colE, null);
        printer.printTextWrap(2, 3, 1, 25, "Num. TICKET : " + txtSerie.getText().substring(4));
        printer.printTextWrap(2, 3, 25,55, "Fecha de Emision: " + txtFecha.getText());
        //printer.printTextWrap(2, 3, 60,80, "Hora: 12:22:51");
        printer.printTextWrap(3, 3, 1, 25, "Vendedor.  : SISTEMA");
        printer.printTextWrap(4, 4, 1, 25, "CLIENTE: " + txtCodCliente.getText());
        printer.printTextWrap(5, 5, 1, 25, "RUC/CI.: " + txtCodCliente.getText());
        printer.printTextWrap(6, 6, 1, 25, "DIRECCION: " + "");
        printer.printCharAtCol(7, 1, 60, "=");
        printer.printTextWrap(7, 8, 1, 10, "Codigo");
        printer.printTextWrap(7, 8, 10, 35, "Descripcion");
        printer.printTextWrap(7, 8, 35, 46, "P.Unit.");
        printer.printTextWrap(7, 8, 46, 53, "Cant.");
        printer.printTextWrap(7, 8, 53, 60, "P.Total");
        printer.printCharAtCol(9, 1, 60, "=");
        int filas = TablaDetalle.getRowCount();

        for (int i = 0; i < filas; i++) {
            printer.printTextWrap(9 + i, 9+i, 1, 10, TablaDetalle.getValueAt(i, 1).toString());
            printer.printTextWrap(9 + i, 9+i, 10, 40, TablaDetalle.getValueAt(i, 2).toString());
            printer.printTextWrap(9 + i, 9+i, 40, 47, TablaDetalle.getValueAt(i, 3).toString());
            printer.printTextWrap(9 + i, 9+i, 47, 54, TablaDetalle.getValueAt(i, 4).toString());
            printer.printTextWrap(9 + i, 9+i, 54, 60, TablaDetalle.getValueAt(i, 5).toString());
        }

        printer.printCharAtCol(15, 1, 60, "=");
        printer.printTextWrap(15, 1, 1, 60, "TOTAL A PAGAR " + txtTotalPagar.getText());
        printer.printCharAtCol(17, 1, 60, "=");
        printer.printTextWrap(17, 1, 1, 60, "Esta ticket no tiene valor fiscal solo uso interno");

        printer.toFile(celular + ".txt");

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(celular + ".txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        if (inputStream == null) {
            return;
        }

        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream, docFormat, null);

        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();

        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

        if (defaultPrintService != null) {
            DocPrintJob printJob = defaultPrintService.createPrintJob();
            try {
                printJob.print(document, attributeSet);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.err.println("No existen impresoras instaladas");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<Producto> cboProducto;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPlato;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
