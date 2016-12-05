/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sine90.forms.questionforms;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.util.TimerTask;
import net.sine90.forms.ListeningTestParameters;
import net.sine90.forms.ReadingTestParameters;

/**
 *
 * @author rohini
 */
public class PostTest_Reading extends javax.swing.JFrame {

    /**
     * Creates new form PostTest_Reading
     */
     Timer timer;
    public PostTest_Reading() {
        initComponents();
        jTextArea1.setText(ReadingTestParameters.post_test);
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        };    
        timer = new Timer(420000,taskPerformer);
        timer.start();       
    }

    private void submitForm() {
        timer.stop();
        String fileName = ListeningTestParameters.student_name+"PostTest"+new SimpleDateFormat("yyyyMMddhhmm'.txt'").format(new Date());
        String correctAnswer="Correct Answer :";
        String wrongAnswer="Wrong Answer :";
        int marks_obtained=0;
        int total=10;
        StringBuilder posttest_answer=new StringBuilder();
        BufferedWriter bw;
        FileWriter fw;
        File file=new File("C:\\Results\\Reading\\"+fileName);
        if(!file.exists())
            try {
                file.createNewFile();
                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
        
        if("about".equalsIgnoreCase(jTextField1.getText().trim()))
        {
            posttest_answer.append("1."+correctAnswer+jTextField1.getText().trim()+System.getProperty("line.separator"));
            marks_obtained++;
        }
        else
            posttest_answer.append("1."+correctAnswer+"about"+System.getProperty("line.separator")+wrongAnswer+jTextField1.getText().trim()+System.getProperty("line.separator"));
        if("was".equalsIgnoreCase(jTextField2.getText().trim()))
        {
            posttest_answer.append("2."+correctAnswer+jTextField2.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            posttest_answer.append("2."+correctAnswer+"was"+System.getProperty("line.separator")+wrongAnswer+jTextField2.getText().trim()+System.getProperty("line.separator"));
        if(jTextField3.getText().trim().toLowerCase().contains("as")||jTextField3.getText().trim().toLowerCase().contains("when"))
        {
            posttest_answer.append("3."+correctAnswer+jTextField3.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            posttest_answer.append("3."+correctAnswer+"As/when "+System.getProperty("line.separator")+wrongAnswer+jTextField3.getText().trim()+System.getProperty("line.separator"));
        if("tell".equalsIgnoreCase(jTextField4.getText().trim()))
        {
            posttest_answer.append("4."+correctAnswer+jTextField4.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            posttest_answer.append("4."+correctAnswer+"tell"+System.getProperty("line.separator")+wrongAnswer+jTextField4.getText().trim()+System.getProperty("line.separator"));
        if("well".equalsIgnoreCase(jTextField5.getText().trim()))
        {
            posttest_answer.append("5."+correctAnswer+jTextField5.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            posttest_answer.append("5."+correctAnswer+"well"+System.getProperty("line.separator")+wrongAnswer+jTextField5.getText().trim()+System.getProperty("line.separator"));
        if("dishonest".equalsIgnoreCase(jTextField6.getText().trim()))
        {
            posttest_answer.append("6."+correctAnswer+jTextField6.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            posttest_answer.append("6."+correctAnswer+"dishonest"+System.getProperty("line.separator")+wrongAnswer+jTextField6.getText().trim()+System.getProperty("line.separator"));
        if("I".equalsIgnoreCase(jTextField7.getText().trim()))
        {
            posttest_answer.append("7."+correctAnswer+jTextField7.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            posttest_answer.append("7."+correctAnswer+"I "+System.getProperty("line.separator")+wrongAnswer+jTextField7.getText().trim()+System.getProperty("line.separator"));
        if("heart".equalsIgnoreCase(jTextField8.getText().trim()))
        {
            posttest_answer.append("8."+correctAnswer+jTextField8.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            posttest_answer.append("8."+correctAnswer+"heart"+System.getProperty("line.separator")+wrongAnswer+jTextField8.getText().trim()+System.getProperty("line.separator"));
        if("would".equalsIgnoreCase(jTextField9.getText().trim()))
        {
            posttest_answer.append("9."+correctAnswer+jTextField9.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            posttest_answer.append("9."+correctAnswer+"would"+System.getProperty("line.separator")+wrongAnswer+jTextField9.getText().trim()+System.getProperty("line.separator"));
        if("A".equalsIgnoreCase(jTextField10.getText().trim()))
        {
            posttest_answer.append("10."+correctAnswer+jTextField10.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            posttest_answer.append("10."+correctAnswer+"A"+System.getProperty("line.separator")+wrongAnswer+jTextField10.getText().trim()+System.getProperty("line.separator"));
        posttest_answer.append("Score for this test : "+marks_obtained+" / " +total);
        bw.write(posttest_answer.toString());
        bw.flush();
            } catch (IOException ex) {
            Logger.getLogger(PreTest_Reading.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        super.dispose();
        ReadingTestMain.main(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Reading");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Post-test");

        jLabel3.setText("Cloze Passage");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setText("1");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClickedOnText1(evt);
            }
        });

        jTextField2.setText("2");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClickedOnText2(evt);
            }
        });

        jTextField3.setText("3");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClickedOnText3(evt);
            }
        });

        jTextField4.setText("4");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClickedOnText3(evt);
            }
        });

        jTextField5.setText("5");
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClickedOnText1(evt);
            }
        });

        jTextField6.setText("6");
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClickedOnText1(evt);
            }
        });

        jTextField7.setText("7");
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClickedOnText1(evt);
            }
        });

        jTextField8.setText("8");
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClickedOnText1(evt);
            }
        });

        jTextField9.setText("9");
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClickedOnText1(evt);
            }
        });

        jTextField10.setText("10");
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClickedOnText1(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("07 : 00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(59, 59, 59))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 399, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(291, 291, 291))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClickedOnText1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClickedOnText1
        ((JTextField)evt.getComponent()).setText("");
    }//GEN-LAST:event_jTextField1MouseClickedOnText1

    private void jTextField2MouseClickedOnText2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClickedOnText2
        ((JTextField)evt.getComponent()).setText("");
    }//GEN-LAST:event_jTextField2MouseClickedOnText2

    private void jTextField3MouseClickedOnText3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClickedOnText3
        ((JTextField)evt.getComponent()).setText("");
    }//GEN-LAST:event_jTextField3MouseClickedOnText3

    private void jTextField4MouseClickedOnText3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClickedOnText3
        ((JTextField)evt.getComponent()).setText("");
    }//GEN-LAST:event_jTextField4MouseClickedOnText3

    private void jTextField5MouseClickedOnText1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClickedOnText1
        ((JTextField)evt.getComponent()).setText("");
    }//GEN-LAST:event_jTextField5MouseClickedOnText1

    private void jTextField6MouseClickedOnText1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClickedOnText1
        ((JTextField)evt.getComponent()).setText("");
    }//GEN-LAST:event_jTextField6MouseClickedOnText1

    private void jTextField7MouseClickedOnText1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClickedOnText1
        ((JTextField)evt.getComponent()).setText("");
    }//GEN-LAST:event_jTextField7MouseClickedOnText1

    private void jTextField8MouseClickedOnText1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClickedOnText1
        ((JTextField)evt.getComponent()).setText("");
    }//GEN-LAST:event_jTextField8MouseClickedOnText1

    private void jTextField9MouseClickedOnText1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClickedOnText1
        ((JTextField)evt.getComponent()).setText("");
    }//GEN-LAST:event_jTextField9MouseClickedOnText1

    private void jTextField10MouseClickedOnText1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClickedOnText1
        ((JTextField)evt.getComponent()).setText("");
    }//GEN-LAST:event_jTextField10MouseClickedOnText1

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        submitForm();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PostTest_Reading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostTest_Reading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostTest_Reading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostTest_Reading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostTest_Reading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
