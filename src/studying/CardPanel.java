/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CardPanel.java
 *
 * Created on Apr 2, 2013, 5:53:57 PM
 */
package studying;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class CardPanel extends javax.swing.JFrame {

    public CardPanel() {
        initComponents();
    }
    public CardPanel(String fileName, int[] reviewArray) throws FileNotFoundException{
        initComponents();
        this.problemList = importQuestions(fileName);
        this.reviewList = reviewArray;
        this.currentProblem = 0;
        
    }
    public ArrayList<Problem> problemList;
    public int[] reviewList;
    public int currentProblem;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Again");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                again(evt);
            }
        });

        jButton2.setText("Next");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton3.setText("Question");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showQuestion(evt);
            }
        });

        jButton4.setText("Answer");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showAnswer(evt);
            }
        });

        jButton5.setText("Done");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneWithProblem(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void again(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_again
        problemList.get(currentProblem).setReviewAgain(true);
    }//GEN-LAST:event_again

    private void next(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next
        if(problemList.size() != (currentProblem+1)){
            currentProblem = currentProblem+1;
        }
        else jTextArea2.setText("No more questions!");
    }//GEN-LAST:event_next

    private void showQuestion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showQuestion
        jTextArea2.setText(problemList.get(currentProblem).getQuestion());
    }//GEN-LAST:event_showQuestion
    
    private void showAnswer(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showAnswer
        jTextArea2.setText(problemList.get(currentProblem).getAnswer());
    }//GEN-LAST:event_showAnswer

    private void doneWithProblem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneWithProblem
        problemList.get(currentProblem).setReviewAgain(false);
    }//GEN-LAST:event_doneWithProblem

    public static void main(String args[]) throws FileNotFoundException {
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
            java.util.logging.Logger.getLogger(CardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        final Scanner keyboard = new Scanner(System.in);
        final ArrayList<Problem> problemList = importQuestions(getFileName(keyboard));
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new CardPanel(getFileName(keyboard), new int[problemList.size()]).setVisible(true);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        
    }
    public static String getFileName(Scanner keyboard){
        System.out.print("Filename: ");
        return keyboard.next();
    }
    public static ArrayList<Problem> importQuestions(String fileName) throws FileNotFoundException{
        
        ArrayList<Problem> array = new ArrayList<>();
        
        File myFile = new File(fileName);
        if (!myFile.exists())
        {
            System.out.println("Unable to open " + fileName);
            System.exit(0);
        }
        Scanner inputFile = new Scanner(myFile);
        
        int count = 0;
        ArrayList<String[]> stringArray = new ArrayList<>();
        String string1;
        String string2 = "";
        
        while(inputFile.hasNext()){
            string1 = inputFile.nextLine();
            String answer = "";
            String question = "";
            int lower = 0;
            int upper = string1.length();
            boolean check = false;
            for(int i = lower; i < upper; i++ ){
                if(string1.charAt(i) == '|'){
                    check = true;
                    i++;
                }
                else if(check == false){
                    question = question + string1.charAt(i);
                }
                else answer = answer + string1.charAt(i);
            }
            array.add(new Problem(question,answer));
        }
        
        inputFile.close();
        
        return array;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
