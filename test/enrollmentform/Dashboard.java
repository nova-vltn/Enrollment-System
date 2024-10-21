package enrollmentform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class Dashboard extends javax.swing.JFrame {

    private Connection con;
    PreparedStatement pst;

    

    public Dashboard() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        createConnection();
    }

       
    void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/enrollment";
            String username = "root";
            String password = "akolangztoh";
            
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Enrollment.class.getName()).log(Level.SEVERE, "JDBC Driver not found", ex);
        } catch (SQLException ex) {
            Logger.getLogger(Enrollment.class.getName()).log(Level.SEVERE, "Error connecting to the database", ex);
        }
    }
    private void openFrame3(String studentNumber) {
        desktopPaneControl.removeAll();
        Frame3 frame3 = new Frame3(studentNumber, con, desktopPaneControl); // Pass the student number and connection
        desktopPaneControl.add(frame3).setVisible(true);
        desktopPaneControl.revalidate(); // Refresh the desktop pane
        desktopPaneControl.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPaneControl = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        studprof = new javax.swing.JButton();
        enrollment = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Studentno = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPaneControl.setBackground(new java.awt.Color(255, 255, 255));
        desktopPaneControl.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktopPaneControlLayout = new javax.swing.GroupLayout(desktopPaneControl);
        desktopPaneControl.setLayout(desktopPaneControlLayout);
        desktopPaneControlLayout.setHorizontalGroup(
            desktopPaneControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1244, Short.MAX_VALUE)
        );
        desktopPaneControlLayout.setVerticalGroup(
            desktopPaneControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(699, 500));

        studprof.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        studprof.setForeground(new java.awt.Color(0, 0, 102));
        studprof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/studinfo.png"))); // NOI18N
        studprof.setText("Student Profile");
        studprof.setToolTipText("");
        studprof.setBorderPainted(false);
        studprof.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        studprof.setIconTextGap(25);
        studprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studprofActionPerformed(evt);
            }
        });

        enrollment.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        enrollment.setForeground(new java.awt.Color(0, 0, 102));
        enrollment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/enroll (2).png"))); // NOI18N
        enrollment.setText("Enrollment");
        enrollment.setBorderPainted(false);
        enrollment.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        enrollment.setIconTextGap(32);
        enrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollmentActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        logout.setText("Log Out");
        logout.setBorderPainted(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/db_logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel3.setText("Student No.:");

        Studentno.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        Studentno.setForeground(new java.awt.Color(204, 0, 0));
        Studentno.setText("STUDENT NO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enrollment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studprof, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(Studentno, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Studentno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studprof, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/441019900_26313391458260023_7927466384373265493_n.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("International State College of the Philippines");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 10)); // NOI18N
        jLabel6.setText("Corner Ayala Avenue  Gil J. Puyat Avenue, Makati, 1200 Metro Manila");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(desktopPaneControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)))
                .addComponent(desktopPaneControl)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studprofActionPerformed
    // Assuming Studentno is a JLabel in the Dashboard
    String studentNum = Studentno.getText();
    String query = "SELECT * FROM enrollmentsystem WHERE StudentNumber = ?";

    try {
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, studentNum);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Student found, directly open Frame2
            desktopPaneControl.removeAll();
            Frame2 frame2 = new Frame2(studentNum, con); // Pass the student number and connection
            desktopPaneControl.add(frame2).setVisible(true);
            desktopPaneControl.revalidate(); // Refresh the desktop pane
            desktopPaneControl.repaint();
        } else {
            // Student not found
            JOptionPane.showMessageDialog(null, "Student not found!");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_studprofActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // Logout Button
        boolean shouldRedirectToLandingPage = getUserConfirmation();
    
    if (shouldRedirectToLandingPage) {
        this.setVisible(false);
        this.dispose();
        landingpan landingpan = new landingpan();
        landingpan.setVisible(true);
        landingpan.pack();
        landingpan.setLocationRelativeTo(null);
    } else {
    }
}
    // Simulate a method to get user confirmation
    private boolean getUserConfirmation() {
    // This could be a dialog box or some other logic
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Confirm", JOptionPane.YES_NO_OPTION);
    return response == JOptionPane.YES_OPTION;
         
    }//GEN-LAST:event_logoutActionPerformed

    private void enrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollmentActionPerformed
    String studentNum = Studentno.getText();
    String query = "SELECT * FROM enrollmentsystem WHERE StudentNumber = ?";

    try {
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, studentNum);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Student found, directly open Frame3
            openFrame3(studentNum);
        } else {
            // Student not found
            JOptionPane.showMessageDialog(null, "Student not found!");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_enrollmentActionPerformed
       
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
  
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Studentno;
    private javax.swing.JDesktopPane desktopPaneControl;
    private javax.swing.JButton enrollment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton studprof;
    // End of variables declaration//GEN-END:variables

}
