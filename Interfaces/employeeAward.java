/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import project_distributers.DBConnection;

/**
 *
 * @author Nilfa.RS
 */
public class employeeAward extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst=null;
    
    
    /**
     * Creates new form customerAward
     */
    public employeeAward() {
        initComponents();
        
                        con=DBConnection.connect();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        appYear = new javax.swing.JTextField();
        serviceYears = new javax.swing.JTextField();
        view = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        empid = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Best Employee");
        setMinimumSize(new java.awt.Dimension(1380, 775));
        setResizable(false);
        getContentPane().setLayout(null);

        jToolBar1.setBackground(new java.awt.Color(102, 102, 102));
        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton14.setBackground(new java.awt.Color(51, 0, 0));
        jButton14.setForeground(new java.awt.Color(51, 0, 51));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setFocusable(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton14);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_blue.png"))); // NOI18N
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setFocusable(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setOpaque(false);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton16);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 270, 530, 70);

        jLabel12.setBackground(new java.awt.Color(0, 0, 102));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("B I S C U I T  M A N U F A C T U R E R S");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(140, 100, 270, 40);

        jLabel21.setBackground(new java.awt.Color(0, 0, 102));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("           L U C K Y L A N D");
        jLabel21.setOpaque(true);
        getContentPane().add(jLabel21);
        jLabel21.setBounds(90, 40, 300, 60);

        jLabel11.setBackground(new java.awt.Color(0, 0, 102));
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 20, 510, 160);

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 530, 760);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("            Employee Award Application");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(780, 30, 380, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Employee ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(740, 170, 130, 23);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Appointed Year");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(740, 260, 150, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("No of Service Years");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(740, 430, 180, 23);

        appYear.setBackground(new java.awt.Color(204, 204, 255));
        appYear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        appYear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        appYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appYearActionPerformed(evt);
            }
        });
        getContentPane().add(appYear);
        appYear.setBounds(960, 260, 260, 30);

        serviceYears.setBackground(new java.awt.Color(204, 204, 255));
        serviceYears.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        serviceYears.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(serviceYears);
        serviceYears.setBounds(960, 430, 260, 30);

        view.setBackground(new java.awt.Color(153, 153, 255));
        view.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/savelll.png"))); // NOI18N
        view.setMnemonic('S');
        view.setText("SAVE");
        view.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view);
        view.setBounds(1070, 530, 90, 50);

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/h.png"))); // NOI18N
        jButton3.setText("RESET");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1170, 530, 90, 50);

        empid.setBackground(new java.awt.Color(204, 204, 255));
        empid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        empid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(empid);
        empid.setBounds(960, 170, 260, 30);

        year.setBackground(new java.awt.Color(204, 204, 255));
        year.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        year.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        getContentPane().add(year);
        year.setBounds(960, 350, 260, 30);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Current Year");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(740, 350, 140, 30);

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        jButton4.setMnemonic('S');
        jButton4.setText("VIEW");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(960, 530, 100, 50);

        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton6.setText("DemoInvalid Entries");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setPreferredSize(new java.awt.Dimension(131, 25));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(810, 530, 140, 50);

        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setText("DemoValid Entries");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(670, 530, 130, 50);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(660, 50, 610, 640);

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1700, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        MainHomeUI mh=new MainHomeUI();
        mh.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

      AdminmenuUI mh=new AdminmenuUI();
        mh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed

        String syears=serviceYears.getText();
        String appyear=appYear.getText();
        String curryear=year.getText();
        String vempid=empid.getText();

       

        String empidpat="^[0-9]{1,30}$";
        Pattern pat1=Pattern.compile(empidpat);
        Matcher regexMatcher1=pat1.matcher(vempid);

        String syearspat="^[0-9]{1,31}$";
        Pattern pat2=Pattern.compile(syearspat);
        Matcher regexMatcher2=pat2.matcher(syears);
        
        
        String appyearpat="^[0-9]{1,31}$";
        Pattern pat3=Pattern.compile(appyearpat);
        Matcher regexMatcher3=pat3.matcher(appyear);
        
        
        String curryearpat="^[0-9]{1,31}$";
        Pattern pat4=Pattern.compile(curryearpat);
        Matcher regexMatcher4=pat4.matcher(curryear);

        if((vempid.trim().isEmpty() )||( appyear.trim().isEmpty() )||( curryear.trim().isEmpty() )||( syears.trim().isEmpty() )){

            JOptionPane.showMessageDialog(null,"Text Fields can not be empty!");

        }

        else if(!regexMatcher1.matches()){

            JOptionPane.showMessageDialog(null,"Invalid Employee ID Format.Should be in Numeric!");

        }

        else if(!regexMatcher3.matches()){

            JOptionPane.showMessageDialog(null,"Appointed Year should be Numeric!");

        }
        
         else if(!regexMatcher4.matches()){

            JOptionPane.showMessageDialog(null,"Current Year should be Numeric!");

        }
         
          else if(!regexMatcher2.matches()){

            JOptionPane.showMessageDialog(null,"No of Service Years should be Numeric!");

        }

        else{

            try{
                String q="INSERT INTO award_employee (empid,year,no_Of_serviceYears,appYear) values ('"+vempid+"','"+curryear+"','"+syears+"','"+appyear+"')";
                pst=con.prepareStatement(q);
                pst.execute();

                AlertBox.infoBox("Service List Inserted Successfully", "Successful");
                serviceYears.setText("");
                appYear.setText("");
                empid.setText("");
                year.setText("");
            }

            catch (Exception e){
                AlertBox.infoBox("Something went wrong! Please check the Data", "Error");

                appYear.setText("");
                serviceYears.setText("");
                empid.setText("");
                year.setText("");
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_viewActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        serviceYears.setText("");
        appYear.setText("");
        empid.setText("");
        year.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void appYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appYearActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        viewAwardList vw=new viewAwardList();
        vw.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        appYear.setText("2008");

        serviceYears.setText("9");

        year.setText("2017");

        // dob.setCalendar(null);
        //  appdate.setCalendar(null);

        

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        appYear.setText("hello");

        serviceYears.setText("5");

        year.setText("Good");

    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(employeeAward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeAward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeAward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeAward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeAward().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField appYear;
    private javax.swing.JTextField empid;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField serviceYears;
    private javax.swing.JButton view;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}