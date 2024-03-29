/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a3_wangrocky;

/**
 *
 * @author 342428158
 */
public class IntegerSums extends javax.swing.JFrame {

    /**
     * Creates new form IntegerSums
     */
    public IntegerSums() {
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

        titleLabel = new javax.swing.JLabel();
        inputLabel = new javax.swing.JLabel();
        inputField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        sumAllButton = new javax.swing.JButton();
        sumEvenButton = new javax.swing.JButton();
        sumOddButton = new javax.swing.JButton();
        outputField = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Integer Sums");

        titleLabel.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        titleLabel.setText("Integer Sums");

        inputLabel.setText("Please enter An Integer: ");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        sumAllButton.setText("Sum All");
        sumAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumAllButtonActionPerformed(evt);
            }
        });

        sumEvenButton.setText("Sum Even");
        sumEvenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumEvenButtonActionPerformed(evt);
            }
        });

        sumOddButton.setText("Sum Odd");
        sumOddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOddButtonActionPerformed(evt);
            }
        });

        outputField.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        displayArea.setColumns(20);
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(inputLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(removeButton))
                                    .addComponent(sumAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sumOddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sumEvenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(outputField)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addButton)
                        .addComponent(removeButton))
                    .addComponent(inputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sumAllButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sumEvenButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sumOddButton)
                        .addGap(18, 18, 18)
                        .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    int[] numList = new int[20];
    int[] newNumList = new int[20];
    int nListLength = 0;
    String display = "";
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String input = inputField.getText();
        
        try{
            int inputInt = Integer.parseInt(input);
            if (inputInt < 0){
                outputField.setText("Input is not a positive Integer: "+inputInt);
            }else{
                if (nListLength < 20){
                    numList[nListLength] = inputInt;
                    nListLength += 1;
                    display = "";
                    for(int i=0; i<nListLength; i++){
                        
                        display += Integer.toString(numList[i]);
                        display += "\n";
                    }
                    displayArea.setText(display);
                    
                }else{
                    outputField.setText("Max number of Integers has been reached");
                }
            }
        }catch(NumberFormatException e){
            outputField.setText("Input is not an Integer: "+input);
            
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
       String input = inputField.getText();
       
       try{
            int inputInt = Integer.parseInt(input);
            if (inputInt < 0){
                outputField.setText("Input is not a positive Integer: "+inputInt);
            }else{ 
                for(int i=0; i<nListLength; i++){
                    
                    if(numList[i] != inputInt){
                        newNumList[i]=numList[i];
                    }else{
                        nListLength -=1;
                        for(int k=i;k<nListLength; k++){
                            newNumList[k]=numList[k+1];
                        }
                        
                        break;
                    }
                }
                for(int i=0; i<nListLength; i++){

                    numList[i]=newNumList[i];
                }
                display = "";
                for(int i=0; i<nListLength; i++){

                    display += Integer.toString(numList[i]);
                    display += "\n";
                }
                displayArea.setText(display);
            }
        }catch(NumberFormatException e){
            outputField.setText("Input is not an Integer: "+input);
            
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void sumAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumAllButtonActionPerformed
        int sumAll = 0;
        for(int i=0; i<nListLength; i++){
            sumAll += numList[i];

        }
        outputField.setText("The sum of all the integers is "+sumAll);
    }//GEN-LAST:event_sumAllButtonActionPerformed

    private void sumEvenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumEvenButtonActionPerformed
        int sumEven = 0;
        for(int i=0; i<nListLength; i++){
            if(numList[i] % 2 == 0){
                sumEven += numList[i];
            }
        }
        outputField.setText("The sum of all the even integers is "+sumEven);
    }//GEN-LAST:event_sumEvenButtonActionPerformed

    private void sumOddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOddButtonActionPerformed
        int sumOdd = 0;
        for(int i=0; i<nListLength; i++){
            if(numList[i] % 2 == 1){
                sumOdd += numList[i];
            }
        }
        outputField.setText("The sum of all the even integers is "+sumOdd);
    }//GEN-LAST:event_sumOddButtonActionPerformed

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
            java.util.logging.Logger.getLogger(IntegerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntegerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntegerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntegerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntegerSums().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField outputField;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton sumAllButton;
    private javax.swing.JButton sumEvenButton;
    private javax.swing.JButton sumOddButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
