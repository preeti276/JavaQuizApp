/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_app;

/**
 *
 * @author dell pc
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.JFrame;
import quiz_app.NewJFrame;

public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        in_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        in_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        in_pwd = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        forgot_pwd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        change_pwd = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        test1 = new javax.swing.JTextPane();
        test = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(800, 1000));
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        title.setForeground(new java.awt.Color(153, 153, 255));
        title.setText("WELCOME TO QUIZTIME !");
        title.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(title);
        title.setBounds(30, 30, 590, 60);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(692, 157, 0, 0);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Fill in the details below to take the quiz:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 119, 357, 30);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Username");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 50, 70, 15);
        jPanel2.add(in_username);
        in_username.setBounds(130, 50, 100, 24);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Email ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 80, 60, 15);

        in_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_idActionPerformed(evt);
            }
        });
        jPanel2.add(in_id);
        in_id.setBounds(130, 80, 100, 24);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 110, 70, 15);
        jPanel2.add(in_pwd);
        in_pwd.setBounds(130, 110, 100, 22);

        login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 102));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login);
        login.setBounds(80, 140, 100, 33);

        forgot_pwd.setForeground(new java.awt.Color(204, 204, 0));
        forgot_pwd.setText("Forgot password");
        jPanel2.add(forgot_pwd);
        forgot_pwd.setBounds(10, 180, 135, 32);

        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(440, 100, 260, 660);

        change_pwd.setForeground(new java.awt.Color(0, 204, 153));
        change_pwd.setText("Change password");
        jPanel2.add(change_pwd);
        change_pwd.setBounds(130, 180, 160, 32);

        signup.setForeground(new java.awt.Color(255, 51, 0));
        signup.setText("Not an existing emember?- Sign Up!");
        jPanel2.add(signup);
        signup.setBounds(10, 210, 280, 32);

        jScrollPane1.setViewportView(test1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(320, 150, 170, 60);

        test.setViewportView(jTextPane1);

        jPanel2.add(test);
        test.setBounds(304, 60, 180, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 110, 480, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void in_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_idActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
this.setVisible(false);
signup.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_signupActionPerformed

    private void jLabel7PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel7PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7PropertyChange

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        //remove(login);
        /*NewJFrame nj = new NewJFrame();
        nj.setVisible(true);
        dispose();*/
        
        String SQL ="SELECT * FROM user3";
        ResultSet rs;


        try(        Connection conn = (Connection) db_util.getconnection(DB_handling.dbtype.MYSQL);//using enum
                    PreparedStatement stmt =(PreparedStatement) conn.prepareStatement(SQL,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    
        ) {
            rs = stmt.executeQuery();
            rs.absolute(1);
            String username = rs.getObject("username", String.class);
            String password = rs.getObject("password", String.class);
            char[] input={};
            for (int i = 0; i < password.length(); i++) {
                input[i]=password.charAt(i);
                
            }
            if(true){ 
                //in_username.getText().equals(username)){ && isPasswordCorrect(input)){
                NewJFrame nj = new NewJFrame();
                nj.setVisible(true);
                dispose();
                jTextPane1.setText("u passed");
            }
            else{
                jTextPane1.setText("You failed and password is "+ password + " u entered " + in_pwd.getPassword());
                test1.setText("Username is " + username + " " + in_username.getText());
                
            }

        } catch (Exception e) {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private static boolean isPasswordCorrect(char[] input) {
    boolean isCorrect = true;
    char[] correctPassword = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };

    if (input.length != correctPassword.length) {
        isCorrect = false;
    } else {
        isCorrect = Arrays.equals (input, correctPassword);
    }

    //Zero out the password.
    Arrays.fill(correctPassword,'0');

    return isCorrect;
    }
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login nj= new login();
                nj.setVisible(true);
                nj.setSize(800, 1000);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change_pwd;
    private javax.swing.JButton forgot_pwd;
    private javax.swing.JTextField in_id;
    private javax.swing.JPasswordField in_pwd;
    private javax.swing.JTextField in_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton login;
    private javax.swing.JButton signup;
    private javax.swing.JScrollPane test;
    private javax.swing.JTextPane test1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}