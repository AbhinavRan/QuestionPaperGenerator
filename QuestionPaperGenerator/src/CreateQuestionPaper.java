
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhinav Ranjan
 */
public class CreateQuestionPaper extends javax.swing.JFrame {

    /**
     * Creates new form CreateQuestionPaper
     */
    public CreateQuestionPaper() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Semester = new javax.swing.JComboBox<>();
        Time = new javax.swing.JComboBox<>();
        Difficulty = new javax.swing.JComboBox<>();
        QPM = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Module = new javax.swing.JComboBox<>();
        Subject = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Marks = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Choice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Submit2 = new javax.swing.JButton();
        Submit1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Code = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        QPN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Branch = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        jPanel7.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        jLabel12.setText("CreateQuestionPaper");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(30, 20, 450, 40);

        Semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel7.add(Semester);
        Semester.setBounds(450, 160, 70, 20);

        Time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jPanel7.add(Time);
        Time.setBounds(450, 440, 90, 20);

        Difficulty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy", "Medium", "Hard" }));
        jPanel7.add(Difficulty);
        Difficulty.setBounds(450, 220, 70, 20);

        QPM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel7.add(QPM);
        QPM.setBounds(450, 280, 70, 20);

        jLabel4.setText("Time For Exam:");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(310, 440, 120, 14);

        Module.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Module 1", "Module 2", "Module 4" }));
        jPanel7.add(Module);
        Module.setBounds(450, 250, 70, 20);

        Subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  "Maths", "DATA STRUCTURE", "SOFT SKILLS", "OPERATING SYSYTEM", "PYTHON", "JAVA", "C++", "C", "BEEE", "PHYSICS", "BIOLOGY", "CHEMISTRY", "ED"  }));
        jPanel7.add(Subject);
        Subject.setBounds(450, 190, 70, 20);

        jLabel3.setText("Subject:");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(350, 190, 60, 14);
        jPanel7.add(Marks);
        Marks.setBounds(450, 380, 100, 20);

        jLabel2.setText("Semester:");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(340, 160, 60, 14);

        jLabel5.setText("Difficulty Of Paper:");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(300, 220, 110, 14);
        jPanel7.add(Choice);
        Choice.setBounds(450, 410, 100, 20);

        jLabel6.setText("Modules:");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(350, 250, 110, 14);

        jLabel7.setText("Questions Per Module:");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(290, 280, 110, 14);

        Submit2.setBackground(new java.awt.Color(51, 255, 255));
        Submit2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit2.setText("Reset");
        Submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit2ActionPerformed(evt);
            }
        });
        jPanel7.add(Submit2);
        Submit2.setBounds(480, 480, 120, 30);

        Submit1.setBackground(new java.awt.Color(51, 255, 255));
        Submit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit1.setText("Download");
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });
        jPanel7.add(Submit1);
        Submit1.setBounds(320, 480, 130, 30);

        jLabel8.setText("Questions Paper Name:");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(290, 320, 120, 14);

        jLabel9.setText("Questions Paper Code:");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(290, 350, 120, 14);

        jLabel10.setText("Marks Per Module:");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(310, 380, 120, 14);
        jPanel7.add(Code);
        Code.setBounds(450, 350, 100, 20);

        jLabel1.setText("Branch:");
        jPanel7.add(jLabel1);
        jLabel1.setBounds(350, 130, 40, 14);
        jPanel7.add(QPN);
        QPN.setBounds(450, 320, 100, 20);

        jLabel11.setText("Choice Per Module:");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(310, 410, 120, 14);

        Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  "BE-CSE", "BE-IT", "BE-CIVIL", "BE-MECHANICAL", "BE-CHEMICAL", "BE-PETROLEUM", "BA-LLB", "BBA-LLB", "MBA", "BJMC", "BSc ANIMATION", "BBA", "BCA", "MCA", "MTECH" }));
        jPanel7.add(Branch);
        Branch.setBounds(450, 130, 70, 20);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhinav Ranjan\\Desktop\\Desktop\\rayas-azules-en-el-fondo-blanco-81719187-001.jpg")); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel7.add(jLabel16);
        jLabel16.setBounds(0, 0, 970, 520);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 969, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
try{
    try (FileOutputStream fos = new FileOutputStream("QuestionPaper.docx")) {
        XWPFDocument doc = new XWPFDocument();
        XWPFParagraph paraTit = doc.createParagraph();
        XWPFRun tempRun =paraTit.createRun();
        
        tempRun.setText(QPN.getText());
        tempRun.setFontSize(20);
        doc.createParagraph().createRun().setText(Marks.getText());
        
        doc.write(fos);
        
    }
    
}catch(Exception e){
    }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_Submit1ActionPerformed

    private void Submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit2ActionPerformed

        QPN.setText(null);
        Difficulty.setSelectedItem(null);
        Module.setSelectedItem(null);
        Semester.setSelectedItem(null);
        Subject.setSelectedItem(null);
        Branch.setSelectedItem(null);
        Code.setText(null);
        Module.setSelectedItem(null);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_Submit2ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateQuestionPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateQuestionPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateQuestionPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateQuestionPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateQuestionPaper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Branch;
    private javax.swing.JTextField Choice;
    private javax.swing.JTextField Code;
    private javax.swing.JComboBox<String> Difficulty;
    private javax.swing.JTextField Marks;
    private javax.swing.JComboBox<String> Module;
    private javax.swing.JComboBox<String> QPM;
    private javax.swing.JTextField QPN;
    private javax.swing.JComboBox<String> Semester;
    private javax.swing.JComboBox<String> Subject;
    private javax.swing.JButton Submit1;
    private javax.swing.JButton Submit2;
    private javax.swing.JComboBox<String> Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
