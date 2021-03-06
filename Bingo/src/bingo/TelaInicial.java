/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import bingo.network.ClientManager;
import bingo.responses.ConnectResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author 14023691
 */
public class TelaInicial extends bingo.MyJFrame implements Tela{

    /**
     * Creates new form TelaInicial
     */
    private ClientManager clientManager;

    public TelaInicial(ClientManager clientManager) {  
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon iconImage = new ImageIcon("src/assets/Clover.png");
        LBL_Image.setIcon(iconImage);
        this.clientManager = clientManager;
    }

    public void showRaAlreadyUsed() {
        JOptionPane.showMessageDialog(null, "RA já está em uso, tente novamente");
        this.hideLoaders();
    }

    public void showInvalidRa() {
        JOptionPane.showMessageDialog(null, "Digite um RA válido!");
        this.hideLoaders();
    }

    public String getRa() {
        return TXT_Ra.getText();
    }

    @Override
    public void showGenericError() {
        JOptionPane.showMessageDialog(null, "Algo muito errado deu errado!");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BUT_Prox = new bingo.ButtonWithLoader();
        TXT_Ra = new javax.swing.JTextField();
        LBL_Nome = new javax.swing.JLabel();
        LBL_Image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        BUT_Prox.setActionCommand("Entrar");
        BUT_Prox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BUT_Prox.setLabel("Entrar");
        BUT_Prox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_ProxActionPerformed(evt);
            }
        });

        TXT_Ra.setName(""); // NOI18N

        LBL_Nome.setText("RA");

        LBL_Image.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("BingoGame");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(BUT_Prox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_Nome)
                            .addComponent(TXT_Ra, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(LBL_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBL_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LBL_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_Ra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BUT_Prox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUT_ProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_ProxActionPerformed
        String ra = this.getRa();
        if(!ra.isEmpty()){
            ConnectResponse response = new ConnectResponse(ra);
            this.clientManager.sendMessage(response);
            BUT_Prox.showLoader();
        }
        else {
            this.showInvalidRa();
        }
    }//GEN-LAST:event_BUT_ProxActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private bingo.ButtonWithLoader BUT_Prox;
    private javax.swing.JLabel LBL_Image;
    private javax.swing.JLabel LBL_Nome;
    private javax.swing.JTextField TXT_Ra;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
