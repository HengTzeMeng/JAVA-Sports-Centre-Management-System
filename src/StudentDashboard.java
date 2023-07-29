
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import models.CoachModel;
import models.ProfileModel;

public class StudentDashboard extends javax.swing.JFrame {

    private final String id;

    public StudentDashboard(String id) {
        this.id = id;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDataIfExists();
        fieldId.setText(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etLast = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        etDob = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        etFirst = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        etAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        etState = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        etPasscode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        etEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        etContact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        etEmergencyContact = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fieldId.setEnabled(false);
        fieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Student ID");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Birthday (DD/MM/YYYY)");

        jLabel5.setText("Gender");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel6.setText("Address");

        jLabel7.setText("State");

        jLabel8.setText("Passcode");

        jLabel9.setText("Email");

        jLabel10.setText("Contact number");

        jLabel11.setText("Emergency Contact");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton1.setText("My Sports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Register Sport");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(etEmergencyContact, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(31, 31, 31)
                                .addComponent(etContact, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(etDob, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(etFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(etLast, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(etState, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel8)
                                            .addGap(43, 43, 43)
                                            .addComponent(etPasscode, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(etEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(etLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(etFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(etDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(etAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(etState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(etPasscode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(etEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(etContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(etEmergencyContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String firstName = etFirst.getText().trim();
        String lastName = etLast.getText().trim();
        String dob = etDob.getText().trim();
        String address = etAddress.getText().trim();
        String state = etState.getText().trim();
        String passcode = etPasscode.getText().trim();
        String email = etEmail.getText().trim();
        String contact = etContact.getText().trim();
        String emergency = etEmergencyContact.getText().trim();

        if (firstName.isEmpty()
                || lastName.isEmpty()
                || dob.isEmpty()
                || address.isEmpty()
                || state.isEmpty()
                || passcode.isEmpty()
                || email.isEmpty()
                || contact.isEmpty()
                || emergency.isEmpty()) {
            showDialog("All Fields should be filled");
            return;
        }

        if (!isDateFormattedProperly(dob)) {
            showDialog("Date of Birth should be of format DD/MM/YYYY");
            return;
        }

        String gender = cbGender.getSelectedItem().toString();

        ArrayList<ProfileModel> list = new ArrayList<>();

        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("profiles.txt"));
            while ((line = br.readLine()) != null) {
                if (line.contains("|")) {
                    String[] info = line.split("\\|");
                    ProfileModel coach = new ProfileModel(
                            info[0],
                            info[1],
                            info[2],
                            info[3],
                            info[4],
                            info[5],
                            info[6],
                            info[7],
                            info[8],
                            info[9],
                            info[10]
                    );
                    list.add(coach);
                }

            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error reading profiles.txt");
        } catch (IOException ex) {
            System.err.println("Error reading profiles.txt");
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("profiles.txt", false));
            PrintWriter pw = new PrintWriter(bw);
            
            pw.println(
                            id + "|" +
                            firstName + "|" +
                            lastName + "|" +
                            dob + "|" +
                            gender + "|" +
                            address + "|" +
                            state + "|" +
                            passcode + "|" +
                            email + "|" +
                            contact + "|" +
                            emergency
                    );
            
            
                for (ProfileModel p : list) {
                if (p.getId().equals(id)) {
//                    pw.println(
//                            id + "|" +
//                            firstName + "|" +
//                            lastName + "|" +
//                            dob + "|" +
//                            gender + "|" +
//                            address + "|" +
//                            state + "|" +
//                            passcode + "|" +
//                            email + "|" +
//                            contact + "|" +
//                            emergency
//                    );
                } else {
                    pw.println(
                            p.getId() + "|" +
                            p.getFirstName() + "|" +
                            p.getLastName() + "|" +
                            p.getDob() + "|" +
                            p.getGender() + "|" +
                            p.getAddress() + "|" +
                            p.getState() + "|" +
                            p.getPasscode() + "|" +
                            p.getEmail() + "|" +
                            p.getContact() + "|" +
                            p.getEmergencyContact()
                    );
                }
            }
            
            
            
            bw.close();
            pw.close();
            showDialog("Profile Update Successfully");
        } catch (IOException ex) {
            System.err.println("Error reading profiles.txt");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new RegisterSport(id).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new MyRegisterSports(id).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIdActionPerformed

    private void setDataIfExists(){
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("profiles.txt"));
            while ((line = br.readLine()) != null) {
                if (line.contains("|")) {
                    String[] info = line.split("\\|");
                    ProfileModel profile = new ProfileModel(
                            info[0],
                            info[1],
                            info[2],
                            info[3],
                            info[4],
                            info[5],
                            info[6],
                            info[7],
                            info[8],
                            info[9],
                            info[10]
                    );
                    if(profile.getId().equals(id)){
                        etFirst.setText(profile.getFirstName());
                        etLast.setText(profile.getLastName());
                        etDob.setText(profile.getDob());
                        cbGender.setSelectedItem(profile.getGender());
                        etAddress.setText(profile.getAddress());
                        etState.setText(profile.getState());
                        etPasscode.setText(profile.getPasscode());
                        etEmail.setText(profile.getEmail());
                        etContact.setText(profile.getContact());
                        etEmergencyContact.setText(profile.getEmergencyContact());
                    }
                }

            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error reading profiles.txt");
        } catch (IOException ex) {
            System.err.println("Error reading profiles.txt");
        }
    }
    
    private void showDialog(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    private boolean isDateFormattedProperly(String date) {
        SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
        sdfrmt.setLenient(false);
        try {
            Date javaDate = sdfrmt.parse(date);
        } catch (ParseException e) {
            System.out.println(date + " is Invalid Date format");
            return false;
        }
        /* Return true if date format is valid */
        return true;
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
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDashboard("as").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JTextField etAddress;
    private javax.swing.JTextField etContact;
    private javax.swing.JTextField etDob;
    private javax.swing.JTextField etEmail;
    private javax.swing.JTextField etEmergencyContact;
    private javax.swing.JTextField etFirst;
    private javax.swing.JTextField etLast;
    private javax.swing.JTextField etPasscode;
    private javax.swing.JTextField etState;
    private javax.swing.JTextField fieldId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}