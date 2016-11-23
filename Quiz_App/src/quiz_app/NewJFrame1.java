package quiz_app;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import DB_handling.dbtype;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import quiz_app.db_util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class NewJFrame1 extends javax.swing.JFrame {
    int num =0;
    int marks=0;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame1() {
        initComponents();
        String SQL ="SELECT * FROM quizques";
        ResultSet rs;

        try(        Connection conn = (Connection) db_util.getconnection(dbtype.MYSQL);//using enum
                    PreparedStatement stmt =(PreparedStatement) conn.prepareStatement(SQL,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    
        ) {
            //TODO: ADD SOME MORE CODE ABOUT QUESTIONS
            
            rs = stmt.executeQuery();
            rs.absolute(2);
            String ques = rs.getObject("QUES", String.class);
            text_ques.setText(ques);
            String c1 = rs.getObject("A", String.class);
            btn_opt1.setText(c1);
            String c2 = rs.getObject("B", String.class);
            btn_opt2.setText(c2);
            String c3 = rs.getObject("C", String.class);
            btn_opt3.setText(c3);
            String c4 = rs.getObject("D", String.class);
            btn_opt4.setText(c4);
            String c5 = rs.getObject("ANS", String.class);
            if(c5.equals(c1)){
                num=1;
            }
            else if(c5.equals(c2)){
                num=2;
            }
            else if(c5.equals(c3)){
                num=3;
            }
            else if(c5.equals(c4)){
                num=4;
            }

        } catch (Exception e) {
            System.err.println(e);
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

        jLabel1 = new javax.swing.JLabel();
        btn_opt1 = new javax.swing.JRadioButton();
        btn_opt2 = new javax.swing.JRadioButton();
        btn_opt3 = new javax.swing.JRadioButton();
        btn_opt4 = new javax.swing.JRadioButton();
        btn_prev = new javax.swing.JButton();
        btn_hint = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        lblimage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_ques = new javax.swing.JTextPane();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 1000));
        setSize(new java.awt.Dimension(800, 1000));
        getContentPane().setLayout(null);

        btn_opt1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_opt1.setLabel("Option 1");
        btn_opt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_opt1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_opt1);
        btn_opt1.setBounds(170, 430, 450, 40);

        btn_opt2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_opt2.setLabel("Option 2");
        getContentPane().add(btn_opt2);
        btn_opt2.setBounds(170, 490, 450, 26);

        btn_opt3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_opt3.setLabel("Option 3");
        btn_opt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_opt3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_opt3);
        btn_opt3.setBounds(170, 530, 450, 50);

        btn_opt4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_opt4.setLabel("Option 4");
        getContentPane().add(btn_opt4);
        btn_opt4.setBounds(170, 590, 450, 50);

        btn_prev.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_prev.setText("Previous");
        btn_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevActionPerformed(evt);
            }
        });
        getContentPane().add(btn_prev);
        btn_prev.setBounds(220, 750, 82, 33);

        btn_hint.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_hint.setText("Hint");
        getContentPane().add(btn_hint);
        btn_hint.setBounds(380, 750, 58, 33);

        btn_next.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        getContentPane().add(btn_next);
        btn_next.setBounds(557, 750, 58, 33);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Submit");
        getContentPane().add(jButton2);
        jButton2.setBounds(541, 36, 75, 33);

        jButton3.setText("Question 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(49, 123, 99, 32);

        jButton4.setText("Question 1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(49, 36, 99, 32);

        jButton5.setText("Question 3");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(49, 161, 99, 32);

        jButton6.setText("Question 4");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(49, 199, 99, 32);

        jButton7.setText("Question 5");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(49, 237, 99, 32);

        jButton8.setText("Question 6");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(49, 275, 99, 32);

        jButton9.setText("Question 7");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(49, 313, 99, 32);

        jButton10.setText("Question 8");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(49, 351, 99, 32);

        jButton11.setText("Question 9");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(49, 389, 99, 32);

        jButton12.setText("Question 10");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(49, 427, 107, 32);

        lblimage.setToolTipText("");
        getContentPane().add(lblimage);
        lblimage.setBounds(90, 410, 590, 230);

        text_ques.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(text_ques);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(200, 140, 460, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_opt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_opt1ActionPerformed
        // TODO add your handling code here:
        ButtonGroup grp  = new ButtonGroup();
        grp.add(btn_opt1);
        grp.add(btn_opt2);
        grp.add(btn_opt3);
        grp.add(btn_opt4);
        switch(num){
            case 1:if(btn_opt1.isSelected()){
                marks = 1;
            }
                break;
            case 2:if(btn_opt2.isSelected()){
                marks = 1;
            }
                break;
            case 3:if(btn_opt3.isSelected()){
                marks = 1;
            }
                break;
            case 4:if(btn_opt4.isSelected()){
                marks = 1;
            }
                break;
            default:
        }
    }//GEN-LAST:event_btn_opt1ActionPerformed

    private void btn_opt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_opt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_opt3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        NewJFrame nj = new NewJFrame();
        nj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        NewJFrame2 nj = new NewJFrame2();
        nj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        NewJFrame3 nj = new NewJFrame3();
        nj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        NewJFrame4 nj = new NewJFrame4();
        nj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        NewJFrame5 nj = new NewJFrame5();
        nj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        NewJFrame6 nj = new NewJFrame6();
        nj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        NewJFrame7 nj = new NewJFrame7();
        nj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        NewJFrame8 nj = new NewJFrame8();
        nj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        NewJFrame9 nj = new NewJFrame9();
        nj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        NewJFrame2 nj = new NewJFrame2();
        nj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        // TODO add your handling code here:
        NewJFrame nj = new NewJFrame();
        nj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_prevActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFrame1 nj= new NewJFrame1();
                nj.setVisible(true);
                nj.setSize(800, 1000);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hint;
    private javax.swing.JButton btn_next;
    private javax.swing.JRadioButton btn_opt1;
    private javax.swing.JRadioButton btn_opt2;
    private javax.swing.JRadioButton btn_opt3;
    private javax.swing.JRadioButton btn_opt4;
    private javax.swing.JButton btn_prev;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTextPane text_ques;
    // End of variables declaration//GEN-END:variables
}
