/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ayesh
 */
public class SubjectsRegister extends javax.swing.JFrame {
     databases dbsu =new databases();
    /**
     * Creates new form ubjectsRegister
     */
    public SubjectsRegister() {
        initComponents();
        Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
        int width=(int) screensize.getWidth();
        int height=(int) screensize.getHeight();
        setSize(width,height-10);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public SubjectsRegister(Subject sub1) {
         initComponents();
       subjectCodeText.setText(sub1.getSubjectCode()+"");
       courseCodeText.setText(sub1.getCourseCode()+"");
        SubjectNameText.setText(sub1.getSubjectName());
        feeText.setText(sub1.getFee()+"");
  //      isMandatoryText.setText(sub1.getMandatoryComboBox());
        assignedLecturersText.setText(sub1.getLecturers()+"");
        assignedInstructorsText.setText(sub1.getInstructors()+"");
        courseCodeText.setText(sub1.getCourseCode()+"");
        
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
        submitButton = new javax.swing.JToggleButton();
        homeButton = new javax.swing.JToggleButton();
        assignedInstructorsLabel = new javax.swing.JLabel();
        assignedInstructorsText = new javax.swing.JTextField();
        assignedLecturersLabel = new javax.swing.JLabel();
        assignedLecturersText = new javax.swing.JTextField();
        MandatoryLabel = new javax.swing.JLabel();
        MandatoryComboBox = new javax.swing.JComboBox();
        feeLabel = new javax.swing.JLabel();
        feeText = new javax.swing.JTextField();
        SubjectNameLabel = new javax.swing.JLabel();
        SubjectNameText = new javax.swing.JTextField();
        courseCodeLabel = new javax.swing.JLabel();
        courseCodeText = new javax.swing.JTextField();
        subjectCodeLabel = new javax.swing.JLabel();
        subjectCodeText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        homeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        assignedInstructorsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignedInstructorsLabel.setText("Assigned Instructor");

        assignedLecturersLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignedLecturersLabel.setText("Assigned Lecturer");

        MandatoryLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MandatoryLabel.setText("Is Mandatory");

        MandatoryComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MandatoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        MandatoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MandatoryComboBoxActionPerformed(evt);
            }
        });

        feeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        feeLabel.setText("Fee");

        SubjectNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SubjectNameLabel.setText("Subject Name");

        courseCodeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        courseCodeLabel.setText("Course Code");

        subjectCodeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subjectCodeLabel.setText("Subject Code");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Subjects Register");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nsbm 2.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/22qc7r28-1400667334.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SubjectNameLabel)
                                    .addComponent(feeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MandatoryLabel)
                                    .addComponent(submitButton)
                                    .addComponent(courseCodeLabel)
                                    .addComponent(subjectCodeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(courseCodeText, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                            .addComponent(subjectCodeText, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(SubjectNameText, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(MandatoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(assignedLecturersText)
                                            .addComponent(feeText)
                                            .addComponent(assignedInstructorsText)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(homeButton))))
                            .addComponent(assignedInstructorsLabel)
                            .addComponent(assignedLecturersLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 458, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectCodeLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(courseCodeLabel)
                            .addComponent(courseCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SubjectNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubjectNameLabel))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(feeText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(feeLabel))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MandatoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MandatoryLabel))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assignedLecturersLabel)
                            .addComponent(assignedLecturersText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assignedInstructorsLabel)
                            .addComponent(assignedInstructorsText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(homeButton))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
       MainFrame mf1=new MainFrame();
       mf1.setVisible(true);
       mf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();  
    }//GEN-LAST:event_homeButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        Subject sub1=new Subject();

        sub1.setSubjectCode(Integer.parseInt(subjectCodeText.getText()));
        sub1.setSubjectName(SubjectNameText.getText());
        sub1.setFee(Double.parseDouble(feeText.getText()));
        sub1.setCourseCode(Integer.parseInt(courseCodeText.getText()));
        String str=MandatoryComboBox.getSelectedItem().toString();
        if(str.equals("Yes")){
        sub1.setIsMandatory(true);
        }else{
            sub1.setIsMandatory(false);
        }
        sub1.setLecturers((assignedLecturersText.getText()));
        sub1.setInstructors(assignedInstructorsText.getText());

        boolean result2=dbsu.addSubject(sub1);
             if(result2==true){
            JOptionPane.showMessageDialog(this, "Successfully Inserted");
            //undergraduateClear();
            this.dispose();   //Jframe will dissapear after we click ok on the message
        }else{
            JOptionPane.showMessageDialog(this, "Sorry an error  occured while Inserteting");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void MandatoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MandatoryComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MandatoryComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(SubjectsRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectsRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectsRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectsRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectsRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox MandatoryComboBox;
    private javax.swing.JLabel MandatoryLabel;
    private javax.swing.JLabel SubjectNameLabel;
    private javax.swing.JTextField SubjectNameText;
    private javax.swing.JLabel assignedInstructorsLabel;
    private javax.swing.JTextField assignedInstructorsText;
    private javax.swing.JLabel assignedLecturersLabel;
    private javax.swing.JTextField assignedLecturersText;
    private javax.swing.JLabel courseCodeLabel;
    private javax.swing.JTextField courseCodeText;
    private javax.swing.JLabel feeLabel;
    private javax.swing.JTextField feeText;
    private javax.swing.JToggleButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel subjectCodeLabel;
    private javax.swing.JTextField subjectCodeText;
    private javax.swing.JToggleButton submitButton;
    // End of variables declaration//GEN-END:variables
}
