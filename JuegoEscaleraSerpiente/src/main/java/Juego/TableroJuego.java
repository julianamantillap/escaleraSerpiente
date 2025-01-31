/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Juego;

import javax.swing.JOptionPane;

/**
 *
 * @author julimantilla
 */
public class TableroJuego extends javax.swing.JFrame {
    
    private JuegoEscaleraSerpiente game;
   private int turno;


    /**
     * Creates new form TableroJuego
     */
    public TableroJuego(JuegoEscaleraSerpiente game) {
        initComponents();
        this.game = game;
        pintarTablero();
        this.turno = 1;
    }
    
    private void pintarTablero(){
        this.txtablero.setText(game.getTablero().pintarTablero());
    }

    private TableroJuego() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtseguimiento = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtJugador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtturno = new javax.swing.JTextField();
        txtposactual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtposnueva = new javax.swing.JTextField();
        Jugar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cantescaleras = new javax.swing.JTextField();
        cantserpientes = new javax.swing.JTextField();
        agregarfichas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtablero = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        txtseguimiento.setColumns(20);
        txtseguimiento.setRows(5);
        jScrollPane2.setViewportView(txtseguimiento);

        jLabel1.setText("Jugador");

        jLabel2.setText("Turno");

        txtJugador.setEditable(false);

        jLabel3.setText("Posición Anterior");

        txtturno.setEditable(false);

        txtposactual.setEditable(false);

        jLabel4.setText("Posición Nueva");

        txtposnueva.setEditable(false);

        Jugar.setText("Jugar");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });

        jLabel5.setText("Escaleras");

        jLabel6.setText("Serpientes");

        agregarfichas.setText("Agregar");
        agregarfichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarfichasActionPerformed(evt);
            }
        });

        txtablero.setColumns(20);
        txtablero.setRows(5);
        jScrollPane3.setViewportView(txtablero);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(agregarfichas))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(Jugar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtposnueva, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtJugador)
                                                .addComponent(txtturno)
                                                .addComponent(txtposactual, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(85, 85, 85)
                                        .addComponent(cantescaleras))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(78, 78, 78)
                                        .addComponent(cantserpientes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtposactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtposnueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Jugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cantescaleras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cantserpientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarfichas)
                        .addGap(87, 87, 87)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarfichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarfichasActionPerformed

        int cantescaleras = Integer.parseInt(this.cantescaleras.getText());
        int cantserpientes = Integer.parseInt(this.cantserpientes.getText());
        
        for(int i=0;i<cantescaleras;i++){
            int posini = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion inicial de la escalera "+(i+1)));
            int posfin = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion final de la escalera "+(i+1)));
            game.agregarEscalera(posini, posfin);
        }
        
        for(int i=0;i<cantserpientes;i++){
            int posini = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion inicial de la serpiente "+(i+1)));
            int posfin = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion final de la serpiente "+(i+1)));
            game.agregarSerpiente(posini, posfin);
        }
        
        game.actualizarTablero();
        this.pintarTablero();

    }//GEN-LAST:event_agregarfichasActionPerformed

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed

        int tamañotablero = game.getTablero().getTablero().length;
        
        if (turno == 1) {
            this.txtseguimiento.setText(this.txtseguimiento.getText()+"Turno: "+turno+"\n");
            this.txtJugador.setText(this.game.getJugadores().get(0).getNombre());
            this.txtturno.setText(""+turno);
            this.txtposactual.setText(""+this.game.getJugadores().get(0).getPosicion());
            this.txtseguimiento.setText(this.txtseguimiento.getText()+this.game.jugarFicha(turno)+"\n");
            this.txtposnueva.setText(""+this.game.getJugadores().get(0).getPosicion());            
            this.turno = this.game.cambiarTurno(turno);     
                  
        } else if (turno == 2) {
            this.txtseguimiento.setText(this.txtseguimiento.getText()+"Turno: "+turno+"\n");
            this.txtJugador.setText(this.game.getJugadores().get(1).getNombre());
            this.txtturno.setText(""+turno);
            this.txtposactual.setText(""+this.game.getJugadores().get(1).getPosicion());
            this.txtseguimiento.setText(this.txtseguimiento.getText()+this.game.jugarFicha(turno)+"\n");
            this.txtposnueva.setText(""+this.game.getJugadores().get(1).getPosicion());            
            this.turno = this.game.cambiarTurno(turno);
            
        } else if (turno == 3) {
            this.txtseguimiento.setText(this.txtseguimiento.getText()+"Turno: "+turno+"\n");
            this.txtJugador.setText(this.game.getJugadores().get(2).getNombre());
            this.txtturno.setText(""+turno);
            this.txtposactual.setText(""+this.game.getJugadores().get(2).getPosicion());
            this.txtseguimiento.setText(this.txtseguimiento.getText()+this.game.jugarFicha(turno)+"\n");
            this.txtposnueva.setText(""+this.game.getJugadores().get(2).getPosicion());            
            this.turno = this.game.cambiarTurno(turno);  

        } else {
            this.txtseguimiento.setText(this.txtseguimiento.getText()+"Turno: "+turno+"\n");
            this.txtJugador.setText(this.game.getJugadores().get(3).getNombre());
            this.txtturno.setText(""+turno);
            this.txtposactual.setText(""+this.game.getJugadores().get(3).getPosicion());
            this.txtseguimiento.setText(this.txtseguimiento.getText()+this.game.jugarFicha(turno)+"\n");
            this.txtposnueva.setText(""+this.game.getJugadores().get(3).getPosicion());            
            this.turno = this.game.cambiarTurno(turno);  
        }
    }//GEN-LAST:event_JugarActionPerformed

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
            java.util.logging.Logger.getLogger(TableroJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jugar;
    private javax.swing.JButton agregarfichas;
    private javax.swing.JTextField cantescaleras;
    private javax.swing.JTextField cantserpientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtJugador;
    private javax.swing.JTextArea txtablero;
    private javax.swing.JTextField txtposactual;
    private javax.swing.JTextField txtposnueva;
    private javax.swing.JTextArea txtseguimiento;
    private javax.swing.JTextField txtturno;
    // End of variables declaration//GEN-END:variables
}
