package enrollmentform;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminPanel extends javax.swing.JFrame {

    Connection con;

    public AdminPanel() {
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        StudNo = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        MI = new javax.swing.JTextField();
        Course = new javax.swing.JTextField();
        YearLevel = new javax.swing.JTextField();
        BNo = new javax.swing.JTextField();
        EmailAdd = new javax.swing.JTextField();
        AccUsername = new javax.swing.JTextField();
        AccPassword = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1925, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1604, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(238, 238, 253));

        Add.setBackground(new java.awt.Color(0, 102, 204));
        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(0, 102, 204));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT MANAGEMENT");

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMIN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(732, 732, 732)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(jLabel1)))
                .addContainerGap(4246, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12))
        );

        Logout.setBackground(new java.awt.Color(221, 221, 235));
        Logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        Logout.setText("Log Out");
        Logout.setBorderPainted(false);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(0, 102, 204));
        Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel4.setText("Student Number:");

        jLabel5.setText("Last Name:");

        jLabel6.setText("First Name:");

        jLabel7.setText("M.I:");

        jLabel10.setText("Course:");

        jLabel11.setText("Year Level: ");

        jLabel12.setText("Block No.:");

        jLabel9.setText("Email Address: ");

        jLabel13.setText("Account Username:");

        jLabel14.setText("Account Password:");

        StudNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudNoActionPerformed(evt);
            }
        });

        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });

        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIActionPerformed(evt);
            }
        });

        Course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseActionPerformed(evt);
            }
        });

        YearLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearLevelActionPerformed(evt);
            }
        });

        BNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNoActionPerformed(evt);
            }
        });

        EmailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddActionPerformed(evt);
            }
        });

        AccUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccUsernameActionPerformed(evt);
            }
        });

        AccPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccPasswordActionPerformed(evt);
            }
        });

        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });

        jLabel15.setText("Status:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StudNo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MI, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BNo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(StudNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        show.setBackground(new java.awt.Color(0, 102, 204));
        show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setText("View");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(252, 252, 226));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setForeground(new java.awt.Color(0, 0, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student No.", "Lastname", "Firstname", "Middle Initial", "Email Address", "Course", "Year Level", "Block No.", "Acc Username", "Acc Password", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Logout)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(366, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2166, 2166, 2166)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            String studentNumber = jTable1.getValueAt(selectedRow, 0).toString();
            try {
                PreparedStatement pst = con.prepareStatement("SELECT * FROM enrollmentsystem WHERE StudentNumber = ?");
                pst.setString(1, studentNumber);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    StudNo.setText(rs.getString("studentNumber"));
                    LastName.setText(rs.getString("lastname"));
                    FirstName.setText(rs.getString("firstname"));
                    MI.setText(rs.getString("middleInitial"));
                    EmailAdd.setText(rs.getString("emailaddress"));
                    Course.setText(rs.getString("course"));
                    YearLevel.setText(rs.getString("yearLevel"));
                    BNo.setText(rs.getString("blocknumber"));
                    AccUsername.setText(rs.getString("AccUsername"));
                    AccPassword.setText(rs.getString("AccPassword"));
                    Status.setText(rs.getString("Status"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void AccPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccPasswordActionPerformed

    private void AccUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccUsernameActionPerformed

    private void EmailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddActionPerformed

    private void BNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BNoActionPerformed

    private void YearLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearLevelActionPerformed

    private void CourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseActionPerformed

    private void MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MIActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void StudNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudNoActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String studentNumber, lname, fname, middleInitial, course, email, yearLevel, bookNumber, accun, accpw, stat;

        studentNumber = StudNo.getText();
        lname = LastName.getText();
        fname = FirstName.getText();
        middleInitial = MI.getText();
        course = Course.getText();
        email = EmailAdd.getText();
        yearLevel = YearLevel.getText();
        bookNumber = BNo.getText();
        accun = AccUsername.getText();
        accpw = AccPassword.getText();
        stat = Status.getText();

        if (studentNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter student number");
        } else if (lname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter last name");
        } else if (fname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter first name");
        } else if (middleInitial.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter middle initial");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter email address");
        } else if (course.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter course");
        } else if (yearLevel.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter year level");
        } else if (bookNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter book number");
        } else {
            try {
                PreparedStatement pst = con.prepareStatement("UPDATE enrollmentsystem SET LastName = ?, FirstName = ?, MiddleInitial = ?, EmailAddress = ?, Course = ?, YearLevel = ?, BlockNumber = ?, AccUsername=?, AccPassword=?, Status = ? WHERE StudentNumber = ?");
                pst.setString(1, lname);
                pst.setString(2, fname);
                pst.setString(3, middleInitial);
                pst.setString(4, email);
                pst.setString(5, course);
                pst.setString(6, yearLevel);
                pst.setString(7, bookNumber);
                pst.setString(8, accun);
                pst.setString(9, accpw);
                pst.setString(10, stat);
                pst.setString(11, studentNumber);
                

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Data updated successfully");
                    showTable();
                } else {
                    JOptionPane.showMessageDialog(null, "No record found to update");
                }

                StudNo.setText("");
                LastName.setText("");
                FirstName.setText("");
                MI.setText("");
                EmailAdd.setText("");
                Course.setText("");
                YearLevel.setText("");
                BNo.setText("");
                AccUsername.setText("");
                AccPassword.setText("");
                Status.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
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

        private boolean getUserConfirmation() {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Confirm", JOptionPane.YES_NO_OPTION);
            return response == JOptionPane.YES_OPTION;
    }//GEN-LAST:event_LogoutActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete", "No row selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        String studentNo = tableModel.getValueAt(selectedRow, 0).toString();

        String url = "jdbc:mysql://localhost:3306/enrollment";
        String username = "root";
        String password = "akolangztoh";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully!!!");

            String sql = "DELETE FROM ENROLLMENTSYSTEM WHERE StudentNumber = ?";

            var pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentNo);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                tableModel.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Record deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete the record", "Error", JOptionPane.ERROR_MESSAGE);
            }

            pstmt.close();
            con.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error occurred while deleting the record", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String studentNumber, lname, fname, middleInitial, email, course, yearLevel, bookNumber, accun, accpw, stat;

        studentNumber = StudNo.getText();
        lname = LastName.getText();
        fname = FirstName.getText();
        middleInitial = MI.getText();
        email = EmailAdd.getText();
        course = Course.getText();
        yearLevel = YearLevel.getText();
        bookNumber = BNo.getText();
        accun = AccUsername.getText();
        accpw = AccPassword.getText();
        stat = Status.getText();

        if (studentNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter student number");
        } else if (lname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter last name");
        } else if (fname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter first name");
        } else if (middleInitial.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter middle initial");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter email address");
        } else if (course.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter course");
        } else if (yearLevel.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter year level");
        } else if (bookNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter book number");
        } else {
            try {
                String url = "jdbc:mysql://localhost:3306/enrollment";
                String username = "root";
                String password = "akolangztoh";

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, username, password);
                System.out.println("Database Connected Successfully!!!");

                PreparedStatement pst = con.prepareStatement("INSERT INTO enrollmentsystem (StudentNumber, LastName, FirstName, MiddleInitial, EmailAddress, Course, YearLevel, BlockNumber, AccUsername, AccPassword, Status) VALUES (?, ?,?,?, ?, ?, ?, ?, ?, ?, ?)");
                pst.setString(1, studentNumber);
                pst.setString(2, lname);
                pst.setString(3, fname);
                pst.setString(4, middleInitial);
                pst.setString(5, email);
                pst.setString(6, course);
                pst.setString(7, yearLevel);
                pst.setString(8, bookNumber);
                pst.setString(9, accun);
                pst.setString(10, accpw);
                pst.setString(11, stat);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student Added Successfully");
                showTable();

                StudNo.setText("");
                LastName.setText("");
                FirstName.setText("");
                MI.setText("");
                EmailAdd.setText("");
                Course.setText("");
                YearLevel.setText("");
                BNo.setText("");
                AccUsername.setText("");
                AccPassword.setText("");
                Status.setText("");

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_AddActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // Show Button
        showTable();
    }//GEN-LAST:event_showActionPerformed

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    public void showTable() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0); // Clear existing data

        try {
            try (java.sql.Statement stmt = con.createStatement()) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM ENROLLMENTSYSTEM");
                while (rs.next()) {
                    String studentNumber = rs.getString("StudentNumber");
                    String lname = rs.getString("LastName");
                    String fname = rs.getString("FirstName");
                    String middleInitial = rs.getString("MiddleInitial");
                    String email = rs.getString("EmailAddress");
                    String course = rs.getString("Course");
                    String yearLevel = rs.getString("YearLevel");
                    String blockNumber = rs.getString("BlockNumber");
                    String accun = rs.getString("AccUsername");
                    String accpw = rs.getString("AccPassword");
                    String stat = rs.getString("Status");
                    tableModel.addRow(new Object[]{studentNumber, lname, fname, middleInitial, email, course, yearLevel, blockNumber, accun, accpw, stat});
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, e);
        }
    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccPassword;
    private javax.swing.JTextField AccUsername;
    private javax.swing.JButton Add;
    private javax.swing.JTextField BNo;
    private javax.swing.JTextField Course;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField EmailAdd;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JButton Logout;
    private javax.swing.JTextField MI;
    private javax.swing.JTextField Status;
    private javax.swing.JTextField StudNo;
    private javax.swing.JButton Update;
    private javax.swing.JTextField YearLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}
