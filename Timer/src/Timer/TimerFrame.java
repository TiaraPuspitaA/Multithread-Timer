package Timer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerFrame extends javax.swing.JFrame {
    int min, min1;
    int sec, sec1;
    Timer timer;
    boolean flag = true;
    boolean ifStop = false;
    
    public TimerFrame() {
        initComponents();
        for(int i=0; i<24; i++){
            if(i<24){
                cboxMin.addItem(""+i);
            }else{
                cboxMin.addItem("");
            }
        }
        for(int i=0; i<60; i++){
            if(i<60){
                cboxSec.addItem(""+i);
            }else{
                cboxSec.addItem("");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSec = new javax.swing.JLabel();
        cboxMin = new javax.swing.JComboBox<>();
        cboxSec = new javax.swing.JComboBox<>();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIMER");

        lblMin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMin.setText("00");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" : ");

        lblSec.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSec.setText("00");

        cboxMin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboxMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMinActionPerformed(evt);
            }
        });

        cboxSec.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboxSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxSecActionPerformed(evt);
            }
        });

        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("STOP");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMin)
                            .addComponent(btnStart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSec)
                            .addComponent(cboxSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStop))
                        .addGap(0, 108, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMin)
                    .addComponent(jLabel5)
                    .addComponent(lblSec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnStop))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMinActionPerformed
        // TODO add your handling code here:
        lblMin.setText(""+cboxMin.getSelectedItem());
        min = Integer.parseInt(lblMin.getText());
    }//GEN-LAST:event_cboxMinActionPerformed

    private void cboxSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxSecActionPerformed
        // TODO add your handling code here:
        lblSec.setText(""+cboxSec.getSelectedItem());
        sec = Integer.parseInt(lblSec.getText());
    }//GEN-LAST:event_cboxSecActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        timer = new Timer(1000, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                lblMin.setForeground(Color.BLACK);
                lblSec.setForeground(Color.BLACK);
                
                if(ifStop){
                    min = min1;
                    sec = sec1;
                    ifStop = false;
                }
                
                if(sec == 0){
                    sec = 60;
                    min--;
                }
                
                if(min == 0){
                    lblMin.setForeground(Color.RED);
                    lblSec.setForeground(Color.RED);
                }
                
                if(min<0){
                    JOptionPane.showMessageDialog(rootPane, "Time's Up", "Stopped", 0);
                    min = 0;
                    sec = 0;
                    timer.stop();
                }else{
                    sec--;
                    if(sec<10){
                        lblSec.setText("0"+sec);
                        flag = false;
                    }
                    if(min<10){
                        lblMin.setText("0"+min);
                        if(sec<10){
                            lblSec.setText("0"+sec);
                        }else{
                            lblSec.setText(""+sec);
                        }
                        flag = false;
                    }
                    lblMin.setText(""+min);
                    lblSec.setText(""+sec);
                }
            }
        });
        timer.start();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
        min1 = min;
        sec1 = sec;
        ifStop = true;
        timer.stop();
    }//GEN-LAST:event_btnStopActionPerformed

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
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JComboBox<String> cboxMin;
    private javax.swing.JComboBox<String> cboxSec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSec;
    // End of variables declaration//GEN-END:variables
}
