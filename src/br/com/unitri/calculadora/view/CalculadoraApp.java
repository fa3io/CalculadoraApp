
package br.com.unitri.calculadora.view;

import java.awt.event.ActionListener;

public class CalculadoraApp extends javax.swing.JFrame {

  
    public CalculadoraApp() {
        initComponents();
    }
    
    public void addNumero1Listener(ActionListener listener){
        btn1.addActionListener(listener);
    }public void addNumero2Listener(ActionListener listener){
        btn2.addActionListener(listener);
    }public void addNumero3Listener(ActionListener listener){
        btn3.addActionListener(listener);
    }public void addNumero4Listener(ActionListener listener){
        btn4.addActionListener(listener);
    }public void addNumero5Listener(ActionListener listener){
        btn5.addActionListener(listener);
    }public void addNumero6Listener(ActionListener listener){
        btn6.addActionListener(listener);
    }public void addNumero7Listener(ActionListener listener){
        btn7.addActionListener(listener);
    }public void addNumero8Listener(ActionListener listener){
        btn8.addActionListener(listener);
    }public void addNumero9Listener(ActionListener listener){
        btn9.addActionListener(listener);
    }public void addNumero0Listener(ActionListener listener){
        btn0.addActionListener(listener);
    }
    
    public void addPontoListener(ActionListener listener){
        btnponto.addActionListener(listener);
    }public void addIgualListener(ActionListener listener){
        btnigual.addActionListener(listener);
    }public void addDividirListener(ActionListener listener){
        btndividir.addActionListener(listener);
    }public void addMultiplicarListener(ActionListener listener){
        btnMultiplicar.addActionListener(listener);
    }public void addSubtrairListener(ActionListener listener){
        btnsubtrair.addActionListener(listener);
    }public void addSomarListener(ActionListener listener){
        btnSomar.addActionListener(listener);
    }
    public String getVisor(){
        return txtVisor.getText();
    }
    public void setVisor(String visor){
        txtVisor.setText(visor);
    }
    
    
    
    
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        panelCalculadora = new javax.swing.JPanel();
        txtVisor = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btnponto = new javax.swing.JButton();
        btndividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnsubtrair = new javax.swing.JButton();
        btnSomar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        panelCalculadora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtVisor.setEditable(false);
        txtVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btn1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn1.setText("1");

        btn2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn2.setText("2");

        btn3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn3.setText("3");

        btn4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn4.setText("4");

        btn5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn5.setText("5");

        btn6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn6.setText("6");

        btn7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn7.setText("7");

        btn8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn8.setText("8");

        btn9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn9.setText("9");

        btn0.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn0.setText("0");

        btnigual.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnigual.setText("=");

        btnponto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnponto.setText(".");

        btndividir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btndividir.setText("/");

        btnMultiplicar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMultiplicar.setText("X");

        btnsubtrair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnsubtrair.setText("-");

        btnSomar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSomar.setText("+");

        javax.swing.GroupLayout panelCalculadoraLayout = new javax.swing.GroupLayout(panelCalculadora);
        panelCalculadora.setLayout(panelCalculadoraLayout);
        panelCalculadoraLayout.setHorizontalGroup(
            panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVisor)
                    .addGroup(panelCalculadoraLayout.createSequentialGroup()
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn1)
                                    .addComponent(btn7)
                                    .addComponent(btn4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn2)
                                    .addComponent(btn8)
                                    .addComponent(btn5)))
                            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                                .addComponent(btn0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnponto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn3)
                                    .addComponent(btn9)
                                    .addComponent(btn6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCalculadoraLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnigual)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSomar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCalculadoraLayout.setVerticalGroup(
            panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCalculadoraLayout.createSequentialGroup()
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnponto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelCalculadoraLayout.createSequentialGroup()
                        .addComponent(btndividir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btndividir;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnponto;
    private javax.swing.JButton btnsubtrair;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelCalculadora;
    private javax.swing.JTextField txtVisor;
    // End of variables declaration//GEN-END:variables
}
