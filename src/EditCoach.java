
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.CoachModel;
import models.SportModel;


public class EditCoach extends javax.swing.JFrame {

    private ArrayList<SportModel> sportsList = new ArrayList<>();
    private ArrayList<String> sportsNamesList = new ArrayList<>();
    private final CoachModel coachModel;
    
    /**
     * Creates new form AddCoach
     */
    public EditCoach(CoachModel coachModel) {
        this.coachModel = coachModel;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        loadSports();
        populateFields();
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
        fieldCoachId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldCoachName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldSportCenter = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldHourlyRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldAddress = new javax.swing.JTextField();
        btnAddCoach = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbSports = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Coach ID");

        jLabel2.setText("Coach Name");

        jLabel3.setText("Date Joined (DD/MM/YYYY)");

        jLabel4.setText("Sports Center Name)");

        jLabel5.setText("Hourly Rate");

        jLabel6.setText("Phone Number");

        jLabel7.setText("Address");

        btnAddCoach.setText("Add");
        btnAddCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCoachActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Add Coach");

        jLabel9.setText("Sport");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(fieldCoachId, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(fieldCoachName)
                    .addComponent(fieldDate)
                    .addComponent(fieldSportCenter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(fieldHourlyRate, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(fieldPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addComponent(fieldAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(cbSports, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCoachId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCoachName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSportCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnAddCoach)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCoachActionPerformed
        // TODO add your handling code here:
        validateAndAddCoach();
    }//GEN-LAST:event_btnAddCoachActionPerformed

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
            java.util.logging.Logger.getLogger(AddCoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AddCoach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCoach;
    private javax.swing.JComboBox<String> cbSports;
    private javax.swing.JTextField fieldAddress;
    private javax.swing.JTextField fieldCoachId;
    private javax.swing.JTextField fieldCoachName;
    private javax.swing.JTextField fieldDate;
    private javax.swing.JTextField fieldHourlyRate;
    private javax.swing.JTextField fieldPhone;
    private javax.swing.JTextField fieldSportCenter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void validateAndAddCoach() {
        int selectedIndex = cbSports.getSelectedIndex();
//        String coachID = fieldCoachId.getText().trim();
        String coachName = fieldCoachName.getText().trim();
        String joinDate = fieldDate.getText().trim();
        String sportsCenter = fieldSportCenter.getText().trim();
        String hourlyRate = fieldHourlyRate.getText().trim();
        String phone = fieldPhone.getText().trim();
        String address = fieldAddress.getText().trim();
        
        if(selectedIndex < 0){
            showDialog("No Sports Found. Please Add a sport first");
            return;
        }
        
        SportModel sport = sportsList.get(selectedIndex);
        
//        if(coachID.isEmpty()){
//            showDialog("Coach ID is empty");
//            return;
//        }
        
//        if(coachID.contains(" ")){
//            showDialog("Coach ID should not have any spaces");
//            return;
//        }
//        
//        if(coachIdExists(coachID)){
//            showDialog("Coach ID already assigned to a coach. Enter a different ID");
//            return;
//        }
        
        if(coachName.isEmpty()){
            showDialog("Coach Name is empty");
            return;
        }
        
        if(joinDate.isEmpty()){
            showDialog("Join Date is empty");
            return;
        }
        
        if(!isDateFormattedProperly(joinDate)){
            showDialog(joinDate + " is not formatted properly. Please Enter Date Joined in DD/MM/YYYY format");
            return;
        }
        
        if(sportsCenter.isEmpty()){
            showDialog("Sports Center is empty");
            return;
        }
        
        if(!isNumber(hourlyRate)){
            showDialog(hourlyRate+" is not a valid number for Hourly Rate. Please Enter a valid number.");
            return;
        }
        
        if(Integer.parseInt(hourlyRate) <= 0){
            showDialog("Hourly Rate should not be 0 or less.");
            return;
        }
        
        if(phone.isEmpty()){
            showDialog("Phone Number is empty");
            return;
        }
        
        if(address.isEmpty()){
            showDialog("Address is empty");
            return;
        }
        
        ArrayList<CoachModel> list = new ArrayList<>();
        
        String line = "";
        try {
           BufferedReader br= new BufferedReader(new FileReader("coaches.txt"));
           while((line = br.readLine()) != null){
               if(line.contains("|")){
                       String[] info = line.split("\\|");
                       CoachModel coach = new CoachModel(
                           info[0],
                           info[1],
                           info[2],
                           info[3],
                           Integer.parseInt(info[4]),
                           info[5],
                           info[6],
                           info[7],
                           info[8]
                   );
                       list.add(coach);
               }
             
           }
           br.close();
        } catch (FileNotFoundException ex) {
           System.err.println("Error reading coaches.txt");
        } catch (IOException ex) {
            System.err.println("Error reading coaches.txt");
        }
                
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("coaches.txt", false));
            PrintWriter pw = new PrintWriter(bw);
            for(CoachModel c: list){
                if(c.getCoachID().equals(coachModel.getCoachID())){
                    pw.println(coachModel.getCoachID()+"|"+coachName+"|"+joinDate+"|"+sportsCenter+"|"+hourlyRate+"|"+phone+"|"+address
            +"|"+sport.getSportID()+"|"+sport.getSportName());
                } else {
                    pw.println(c.getCoachID()+"|"+c.getCoachName()+"|"+c.getJoinDate()+"|"+c.getSportsCenter()+"|"+c.getHourlyRate()+"|"+c.getPhone()+"|"+c.getAddress()
            +"|"+sport.getSportID()+"|"+sport.getSportName());
                }
            }
            bw.close();
            pw.close();
            showDialog("Coach Record Successfully Modified");
            new DisplayCoaches().setVisible(true);
            dispose();
        } catch (IOException ex) {
            System.err.println("Error reading coaches.txt");
        }
    }
    
    private boolean coachIdExists(String id){
        String line = "";
        try {
           BufferedReader br= new BufferedReader(new FileReader("coaches.txt"));
           while((line = br.readLine()) != null){
               if(line.contains("|")){
                       String[] data = line.split("\\|");
                       if(data[0].equals(id)){
                           return true;
                       }
               }
           }
           br.close();
           return false;
        } catch (FileNotFoundException ex) {
           System.err.println("Error reading coaches.txt");
           return false;
        } catch (IOException ex) {
            System.err.println("Error reading coaches.txt");
            return false;
        }
    }
    
    private boolean isNumber(String num){
        try{
            Integer.parseInt(num);
        } catch (NumberFormatException e){
            System.err.println(num+" is not a number");
            return false;
        }
        
        return true;
    }
    
    private boolean isDateFormattedProperly(String date){
        SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
	    sdfrmt.setLenient(false);
	    try{
	        Date javaDate = sdfrmt.parse(date); 
	    } catch (ParseException e){
	        System.out.println(date+" is Invalid Date format");
	        return false;
	    }
	    /* Return true if date format is valid */
	    return true;
    }
    
    private void showDialog(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }

    private void loadSports() {
        String line = "";
        try {
           BufferedReader br= new BufferedReader(new FileReader("sports.txt"));
           while((line = br.readLine()) != null){
               if(line.contains("|")){
                       String[] info = line.split("\\|");
                       System.out.println(line);
                   sportsList.add(new SportModel(info[0], info[1]));
                   sportsNamesList.add(info[1]);
               }
           }
           br.close();
           cbSports.setModel(new DefaultComboBoxModel(sportsNamesList.toArray()));
        } catch (FileNotFoundException ex) {
           System.err.println("Error reading sports.txt");
        } catch (IOException ex) {
            System.err.println("Error reading sports.txt");
        }
        
//        for(int i=0;i<sportsList.size();i++){
//            SportModel s = sportsList.get(i);
//            if(s.getSportID().equals(coachModel.getSportId())){
//                cbSports.setse
//            }
//        }
    }

    private void clearFields() {
        fieldCoachId.setText("");
        fieldCoachName.setText("");
        fieldDate.setText("");
        fieldSportCenter.setText("");
        fieldHourlyRate.setText("");
        fieldPhone.setText("");
        fieldAddress.setText("");
        loadSports();
    }

    private void populateFields() {
        fieldCoachId.setText(coachModel.getCoachID());
        fieldCoachId.setEditable(false);
        fieldCoachName.setText(coachModel.getCoachName());
        fieldDate.setText(coachModel.getJoinDate());
        fieldSportCenter.setText(coachModel.getSportsCenter());
        fieldHourlyRate.setText(coachModel.getHourlyRate() + "");
        fieldPhone.setText(coachModel.getPhone());
        fieldAddress.setText(coachModel.getAddress());
        cbSports.setSelectedItem(coachModel.getSportName());
    }
}