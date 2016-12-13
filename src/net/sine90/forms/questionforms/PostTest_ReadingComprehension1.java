/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sine90.forms.questionforms;

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
import javax.swing.ButtonGroup;
import javax.swing.Timer;
import net.sine90.forms.ListeningTestParameters;
import net.sine90.forms.ReadingTestParameters;

/**
 *
 * @author rohini
 */
public class PostTest_ReadingComprehension1 extends javax.swing.JFrame {

    /**
     * Creates new form TrainingForm2_Listening
     */
  
    ButtonGroup group1=new ButtonGroup();
    ButtonGroup group2=new ButtonGroup();
    ButtonGroup group3=new ButtonGroup();
    ButtonGroup group4=new ButtonGroup();
    ButtonGroup group5=new ButtonGroup();
    ButtonGroup group6=new ButtonGroup();
    ButtonGroup group7=new ButtonGroup();
    
    public PostTest_ReadingComprehension1() {
        initComponents();
        addButtonGroups();
    }
    public void submitForm()
    {
        String fileName = ListeningTestParameters.student_name+"PostTest_Reading_Comprehension"+new SimpleDateFormat("yyyyMMddhhmm'.txt'").format(new Date());
        String correctAnswer="Correct Answer :";
        String wrongAnswer="Wrong Answer :";
        StringBuilder reading_com_answer=new StringBuilder();
        int marks_obtained=0;
        int total=7;
        BufferedWriter bw;
        FileWriter fw;
        File file=new File("C:\\Results\\Reading\\"+fileName);
        if(!file.exists())
            try {
                file.createNewFile();
                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
        if(jRadioButton3.isSelected())
        {
            reading_com_answer.append("1."+correctAnswer+jRadioButton3.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            reading_com_answer.append("1."+correctAnswer+jRadioButton3.getText().trim()+System.getProperty("line.separator")+wrongAnswer+Utilities.getSelectedObject(group1)+System.getProperty("line.separator"));
        if(jRadioButton13.isSelected())
        {
            reading_com_answer.append("2."+correctAnswer+jRadioButton13.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            reading_com_answer.append("2."+correctAnswer+jRadioButton13.getText().trim()+System.getProperty("line.separator")+wrongAnswer+Utilities.getSelectedObject(group2)+System.getProperty("line.separator"));
        if(jRadioButton5.isSelected())
        {
            reading_com_answer.append("3."+correctAnswer+jRadioButton5.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            reading_com_answer.append("3."+correctAnswer+jRadioButton5.getText().trim()+System.getProperty("line.separator")+wrongAnswer+Utilities.getSelectedObject(group3)+System.getProperty("line.separator"));
        if(jRadioButton9.isSelected())
        {
            reading_com_answer.append("4."+correctAnswer+jRadioButton9.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            reading_com_answer.append("4."+correctAnswer+jRadioButton9.getText().trim()+System.getProperty("line.separator")+wrongAnswer+Utilities.getSelectedObject(group4)+System.getProperty("line.separator"));
        if(jRadioButton20.isSelected())
        {
            reading_com_answer.append("5."+correctAnswer+jRadioButton20.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            reading_com_answer.append("5."+correctAnswer+jRadioButton20.getText().trim()+System.getProperty("line.separator")+wrongAnswer+Utilities.getSelectedObject(group5)+System.getProperty("line.separator"));
        if(jRadioButton23.isSelected())
        {
            reading_com_answer.append("6."+correctAnswer+jRadioButton23.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            reading_com_answer.append("6."+correctAnswer+jRadioButton23.getText().trim()+System.getProperty("line.separator")+wrongAnswer+Utilities.getSelectedObject(group6)+System.getProperty("line.separator"));
        if(jRadioButton28.isSelected())
        {
            reading_com_answer.append("7."+correctAnswer+jRadioButton28.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            reading_com_answer.append("7."+correctAnswer+jRadioButton28.getText().trim()+System.getProperty("line.separator")+wrongAnswer+Utilities.getSelectedObject(group7)+System.getProperty("line.separator"));
        
        reading_com_answer.append("Score for this Test : "+marks_obtained+" / "+total);
        ReadingTestParameters.marks_obtained_reading+=marks_obtained;
        bw.write(reading_com_answer.toString());
        bw.flush();
        fw.close();
        bw.close();
        } catch (IOException ex) {
            Logger.getLogger(PostTest_ReadingComprehension1.class.getName()).log(Level.SEVERE, null, ex);
        }    
        super.dispose();

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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setText("Choose the right answer :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("1. According to the passage, how do plants protect their leaves? ");

        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton1.setText("By reaching the sunlight");

        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton2.setText("By growing taller");

        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton3.setText("By growing thorns");

        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton4.setText("By growing shorter");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("3. What are Biomes?");

        jRadioButton5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton5.setText("Ecological areas");

        jRadioButton6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton6.setText("Bio-system");

        jRadioButton7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton7.setText("Study of Environment");

        jRadioButton8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton8.setText("Adaptations");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("4. The Monkeys’ long tails enables them to do all of the following except:");

        jRadioButton9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton9.setText("Allow them to eat");

        jRadioButton10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton10.setText("Use it like any other hand");

        jRadioButton11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton11.setText("Swing quickly ");

        jRadioButton12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton12.setText("Move through the tops of trees");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("2. The writer feels “adaptation” means all of the following except:");

        jRadioButton13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton13.setText("Developing a behavior that makes it likely to survive");

        jRadioButton14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton14.setText("Refusing  to develop  their behavior");

        jRadioButton15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton15.setText("Finding it difficult to change their physical characteristics");

        jRadioButton16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton16.setText("Changing the environment ");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("5. The term “Skunks” refers to :");

        jRadioButton17.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton17.setText("A reptile");

        jRadioButton18.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton18.setText("A bird");

        jRadioButton19.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton19.setText("A plant");

        jRadioButton20.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton20.setText("A small animal");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel12.setText("6. There are many variety adaptations the author mentions. Which one is that?");

        jRadioButton21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton21.setText("Tree growing fruits");

        jRadioButton22.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton22.setText("Monkeys releasing horrible smell");

        jRadioButton23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton23.setText("Skunks releasing horrible smell");

        jRadioButton24.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton24.setText("Skunks releasing horrible smell");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel13.setText("7. Which idea is correct?");

        jRadioButton25.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton25.setText("Only monkeys have tails");

        jRadioButton26.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton26.setText("Only  taller trees can receive sunlight");

        jRadioButton27.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton27.setText("Only giraffes have long necks");

        jRadioButton28.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton28.setText("Only plants can grow thorns");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jRadioButton6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton9)
                                    .addComponent(jRadioButton11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton12)
                                    .addComponent(jRadioButton10)))
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton4)))
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton18)
                                    .addComponent(jRadioButton19))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton20)
                                    .addComponent(jRadioButton17)))
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton22)
                                    .addComponent(jRadioButton23))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton24)
                                    .addComponent(jRadioButton21)))
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton26)
                                    .addComponent(jRadioButton27))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton28)
                                    .addComponent(jRadioButton25)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton14)
                                    .addComponent(jRadioButton15))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton16)
                                    .addComponent(jRadioButton13))))
                        .addContainerGap(272, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(35, 877, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(98, 98, 98))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(248, 248, 248))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PostTest_ReadingComprehension1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostTest_ReadingComprehension1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostTest_ReadingComprehension1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostTest_ReadingComprehension1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PostTest_ReadingComprehension1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables

    private void addButtonGroups() {
        
                group1.add(jRadioButton1);
                group1.add(jRadioButton2);
                group1.add(jRadioButton3);
                group1.add(jRadioButton4);
        
                group2.add(jRadioButton13);
                group2.add(jRadioButton14);
                group2.add(jRadioButton15);
                group2.add(jRadioButton16);
        
                group3.add(jRadioButton5);
                group3.add(jRadioButton6);
                group3.add(jRadioButton7);
                group3.add(jRadioButton8);
        
                group4.add(jRadioButton9);
                group4.add(jRadioButton10);
                group4.add(jRadioButton11);
                group4.add(jRadioButton12);
        
                group5.add(jRadioButton17);
                group5.add(jRadioButton18);
                group5.add(jRadioButton19);
                group5.add(jRadioButton20);
        
                group6.add(jRadioButton21);
                group6.add(jRadioButton22);
                group6.add(jRadioButton23);
                group6.add(jRadioButton24);
        
                group7.add(jRadioButton25);
                group7.add(jRadioButton26);
                group7.add(jRadioButton27);
                group7.add(jRadioButton28);
    
    }
}
