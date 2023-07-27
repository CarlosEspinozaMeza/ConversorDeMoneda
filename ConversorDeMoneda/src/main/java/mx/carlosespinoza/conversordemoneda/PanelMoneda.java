/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.carlosespinoza.conversordemoneda;

/**
 *
 * @author charl
 */
public class PanelMoneda extends javax.swing.JFrame {

    /**
     * Creates new form PanelMoneda
     */
    public PanelMoneda() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        boxMoneda1 = new javax.swing.JComboBox<>();
        boxMoneda2 = new javax.swing.JComboBox<>();
        btnPrevius = new javax.swing.JButton();
        btnConversion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        checkCambio = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtMoneda1 = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        txtMoneda2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Conversor de Moneda ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        boxMoneda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso Mexicano MXN", "Dolar Estadunidiense USD", "Euro EUR", "Yen Japones JPY", "Won Korea del Sur KRW", "Libra Esterlina GBP" }));

        boxMoneda2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso Mexicano MXN", "Dolar Estadunidiense USD", "Euro EUR", "Yen Japones JPY", "Won Korea del Sur KRW", "Libra Esterlina GBP" }));

        btnPrevius.setText("Regresar");
        btnPrevius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviusActionPerformed(evt);
            }
        });

        btnConversion.setText("Convertir");
        btnConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversionActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        checkCambio.setText("Habilitar Tipo de Cambio");
        checkCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCambioActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de Cambio");

        txtMoneda1.setText("0");
        txtMoneda1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMoneda1KeyTyped(evt);
            }
        });

        txtCambio.setText("0");
        txtCambio.setEnabled(false);
        txtCambio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCambioKeyTyped(evt);
            }
        });

        txtMoneda2.setText("0");
        txtMoneda2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkCambio)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boxMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrevius)
                        .addGap(120, 120, 120)
                        .addComponent(btnConversion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(checkCambio))
                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevius)
                    .addComponent(btnConversion)
                    .addComponent(btnSalir))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMoneda1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMoneda1KeyTyped
        //Codigo para que solo acepte numeros
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros)
        {
        evt.consume();
        }
        if (txtMoneda1.getText().trim().length() == 10) {
        evt.consume();
        }
    }//GEN-LAST:event_txtMoneda1KeyTyped

    private void txtCambioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCambioKeyTyped
        //Codigo para que solo acepte numeros
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros)
        {
        evt.consume();
        }
        if (txtMoneda1.getText().trim().length() == 10) {
        evt.consume();
        }
    }//GEN-LAST:event_txtCambioKeyTyped

    private void checkCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCambioActionPerformed
        // Check box para habilitar el text box para colocar el tipo de cambio
	if (checkCambio.isSelected()) {
            txtCambio.setEnabled(true);
        }else{
            txtCambio.setEnabled(false);
        }
    }//GEN-LAST:event_checkCambioActionPerformed

    private void btnPreviusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviusActionPerformed
        // Regresamos a la ventana Principal
        PanelPrincipal jfNew = new PanelPrincipal();
        jfNew.show();
        dispose();
    }//GEN-LAST:event_btnPreviusActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Boton de salir
	PanelConfirmacion jfSalir = new PanelConfirmacion();
        jfSalir.show();
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversionActionPerformed
        /**
         * Peso Mexicano MXN            index 0
         * Dolar Estadunidiense USD     index 1
         * Euro EUR                     index 2
         * Yen Japones JPY              index 3
         * Won Korea del Sur KRW        index 4    
         * Libra Esterlina GBP          index 5
         */
        int box1 = boxMoneda1.getSelectedIndex();
        int box2 = boxMoneda2.getSelectedIndex();
        double cambio = Double.parseDouble(txtCambio.getText());
        double conversion = Double.parseDouble(txtMoneda1.getText());
        //Se crea matriz para el almacenamiento de los tipos de cambio
        double[][] cambios = {
            {1,.059,.054,8.32,75.54,.046},
            {16.84,1,0.9,139.8,1272.04,0.77},
            {18.69,1.11,1,155.16,1411.38,0.86},
            {0.12,0.0072,0.0064,1,9.09,0.0055},
            {0.013,0.00079,0.00071,0.11,1,0.0000061},
            {21.82,1.3,1.17,181.03,1648.09,1}            
        };       
//---------------------------------------------------------------------------
        //  Conversion de MXN a MXN
        if (box1 == 0 && box2 == 0) {            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[box1][box2]));
            }   
        }
        // Conversion de MXN a USD
        if (box1 == 0 && box2 == 1) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[box1][box2];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[box1][box2]));
            } 
        }
        // Conversion de MXN a EUR
        if (box1 == 0 && box2 == 2) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[box1][box2];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[box1][box2]));
            }    
        }
        // Conversion de MXN a JPY
        if (box1 == 0 && box2 == 3) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[box1][box2];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[box1][box2]));
            }  
        }
        // Conversion de MXN a KRW
        if (box1 == 0 && box2 == 4) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[box1][box2];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[box1][box2]));
            }   
        }
        // Conversion de MXN a GBP
        if (box1 == 0 && box2 == 5) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[box1][box2];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[box1][box2]));
            } 
        }
//---------------------------------------------------------------------------
        //  Conversion de USD a USD
        if (box1 == 1 && box2 == 1) {
            
           if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[1][1];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[1][1]));
            }
        }
        // Conversion de USD a MXN
        if (box1 == 1 && box2 == 0) {
            
           if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[1][0];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[1][0]));
            }
        }
        // Conversion de USD a EUR
        if (box1 == 1 && box2 == 2) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[1][2];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[1][2]));
            }    
        }
        // Conversion de USD a JPY
        if (box1 == 1 && box2 == 3) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[1][3];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[1][3]));
            }   
        }
        // Conversion de USD a KRW
        if (box1 == 1 && box2 == 4) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[1][4];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[1][4]));
            }     
        }
        // Conversion de USD a GBP
        if (box1 == 1 && box2 == 5) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[1][5];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[1][5]));
            }    
        }
//---------------------------------------------------------------------------
        //  Conversion de EUR a EUR
        if (box1 == 2 && box2 == 2) {
            
           if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[2][2];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[2][2]));
            }
            
        }
        // Conversion de EUR a MXN
        if (box1 == 2 && box2 == 0) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[2][0];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[2][0]));
            }    
        }
        // Conversion de EUR a USD
        if (box1 == 2 && box2 == 1) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[2][1];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[2][1]));
            }  
        }
        // Conversion de EUR a JPY
        if (box1 == 2 && box2 == 3) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[2][3];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[2][3]));
            }
        }
        // Conversion de EUR a KRW
        if (box1 == 2 && box2 == 4) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[2][4];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[2][4]));
            }
        }
        // Conversion de EUR a GBP
        if (box1 == 2 && box2 == 5) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[2][5];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[2][5]));
            }
        }
//---------------------------------------------------------------------------
        //  Conversion de JPY a JPY
        if (box1 == 3 && box2 == 3) {
            
           if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[3][3];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[3][3]));
            }
        }
        // Conversion de JPY a MXN
        if (box1 == 3 && box2 == 0) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[3][0];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[3][0]));
            }
        }
        // Conversion de JPY a USD
        if (box1 == 3 && box2 == 1) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[3][1];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[3][1]));
            }
        }
        // Conversion de JPY a EUR
        if (box1 == 3 && box2 == 2) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[3][2];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[3][2]));
            }
        }
        // Conversion de JPY a KRW
        if (box1 == 3 && box2 == 4) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[3][4];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[3][4]));
            }
        }
        // Conversion de JPY a GBP
        if (box1 == 3 && box2 == 5) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[3][5];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[3][5]));
            }
        }
//---------------------------------------------------------------------------
        //  Conversion de KRW a KRW
        if (box1 == 4 && box2 == 4) {
            
           if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[4][4];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[4][4]));
            }  
        }
        // Conversion de KRW a MXN
        if (box1 == 4 && box2 == 0) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[4][0];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[4][0]));
            }   
        }
        // Conversion de KRW a USD
        if (box1 == 4 && box2 == 1) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[4][1];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[4][1]));
            }
        }
        // Conversion de KRW a EUR
        if (box1 == 4 && box2 == 2) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[4][2];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[4][2]));
            }
        }
        // Conversion de KRW a JPY
        if (box1 == 4 && box2 == 3) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[4][3];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[4][3]));
            }
        }
        // Conversion de KRW a GBP
        if (box1 == 4 && box2 == 5) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[4][5];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[4][5]));
            }
        }
//---------------------------------------------------------------------------
        //  Conversion de GPB a GPB
        if (box1 == 5 && box2 == 5) {
            
           if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[5][5];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[5][5]));
            } 
        }
        // Conversion de GPB a MXN
        if (box1 == 5 && box2 == 0) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[5][0];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[5][0]));
            }
        }
        // Conversion de GPB a USD
        if (box1 == 5 && box2 == 1) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[5][1];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[5][1]));
            }
        }
        // Conversion de GBP a EUR
        if (box1 == 5 && box2 == 2) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[5][2];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[5][2]));
            }
        }
        // Conversion de GBP a JPY
        if (box1 == 5 && box2 == 3) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{
                conversion *= cambios[5][3];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[5][3]));
            }
        }
        // Conversion de GPB a KRW
        if (box1 == 5 && box2 == 4) {
            
            if (checkCambio.isSelected()) {
                conversion *= cambio;
                txtMoneda2.setText(String.valueOf(conversion));
            }else{            
                conversion *= cambios[5][4];
                txtMoneda2.setText(String.valueOf(conversion));
                txtCambio.setText(String.valueOf(cambios[5][4]));
            }
        }    
    }//GEN-LAST:event_btnConversionActionPerformed

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
            java.util.logging.Logger.getLogger(PanelMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelMoneda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxMoneda1;
    private javax.swing.JComboBox<String> boxMoneda2;
    private javax.swing.JButton btnConversion;
    private javax.swing.JButton btnPrevius;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox checkCambio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtMoneda1;
    private javax.swing.JTextField txtMoneda2;
    // End of variables declaration//GEN-END:variables
}
