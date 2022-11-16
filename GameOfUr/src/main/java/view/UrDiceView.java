/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Alvaro Miranda
 */
public class UrDiceView extends javax.swing.JPanel {
    /*
    ImageIcon diceState1 = new ImageIcon("/images/result_0_1.png");
    ImageIcon diceState2 = new ImageIcon("/images/result_1_1.png");
    JLabel diceLabelsArray[] = new JLabel[4];
    */
    
    private ImageIcon diceState1;
    private ImageIcon diceState2;
    private JLabel diceLabelArray[];
    
    /**
     * Creates new form UrDiceViewPanel
     */
    public UrDiceView() throws IOException{
        initComponents();
        //this.setLocationRelativeTo(null);
        
        //diceState1 = new ImageIcon("/images/result_0_1.png");
        //diceState2 = new ImageIcon("/images/result_1_1.png");
        diceLabelArray = new JLabel[4];
        
        
        BufferedImage diceState1Image = ImageIO.read(getClass().getResourceAsStream("/images/result_0_1.png"));
        BufferedImage diceState2Image = ImageIO.read(getClass().getResourceAsStream("/images/result_1_1.png"));
        diceState1 = resizeImage(diceState1Image);
        diceState2 = resizeImage(diceState2Image);
    
        diceLabelArray[0] = dice1;
        diceLabelArray[1] = dice2;
        diceLabelArray[2] = dice3;
        diceLabelArray[3] = dice4;
        dice1.setIcon(diceState1);
        dice2.setIcon(diceState1);
        dice3.setIcon(diceState1);
        dice4.setIcon(diceState1);
    }

    private ImageIcon resizeImage(BufferedImage diceState){
        ImageIcon diceStateIcon = new ImageIcon(diceState);
        Image temporalImage = diceStateIcon.getImage();
        Image resizedImage = temporalImage.getScaledInstance(77, 77,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
    
    public void showThrow(int rollResult)
    {
        for(int index = 0; index < rollResult; index++){
            diceLabelArray[index].setIcon(diceState2);
        }
    }
    
    public void cleanDice()
    {
         dice1.setIcon(diceState1);
         dice2.setIcon(diceState1);
         dice3.setIcon(diceState1);
         dice4.setIcon(diceState1);
    }
    
    public void setMoves(int rollResult)
    {
        String movesResult = String.valueOf(rollResult);
        moves.setText(movesResult);
    }
    
    public void addDiceListener(ActionListener listenForThrowDice)
    {
        throwDiceButton.addActionListener(listenForThrowDice); 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dice4 = new javax.swing.JLabel();
        dice3 = new javax.swing.JLabel();
        dice2 = new javax.swing.JLabel();
        dice1 = new javax.swing.JLabel();
        throwDiceButton = new javax.swing.JButton();
        moves = new javax.swing.JLabel();

        dice4.setText("dice4");

        dice3.setText("dice3");

        dice2.setText("dice2");

        dice1.setText("dice1");

        throwDiceButton.setBackground(new java.awt.Color(44, 37, 37));
        throwDiceButton.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        throwDiceButton.setForeground(new java.awt.Color(255, 255, 255));
        throwDiceButton.setText("THROW DICE");
        throwDiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                throwDiceButtonActionPerformed(evt);
            }
        });

        moves.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        moves.setText("Number of moves");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dice1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dice2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dice3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dice4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(throwDiceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moves)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dice1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dice2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dice3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dice4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(throwDiceButton)
                    .addComponent(moves))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void throwDiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_throwDiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_throwDiceButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dice1;
    private javax.swing.JLabel dice2;
    private javax.swing.JLabel dice3;
    private javax.swing.JLabel dice4;
    private javax.swing.JLabel moves;
    private javax.swing.JButton throwDiceButton;
    // End of variables declaration//GEN-END:variables
}
