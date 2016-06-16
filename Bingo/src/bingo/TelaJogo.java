/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import bingo.network.ClientManager;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import models.Card;

/**
 *
 * @author 14023691
 */
public class TelaJogo extends bingo.MyJFrame implements Tela{
    private final ButtonWithLoader[][] btns;
    private final List<Integer> marks = new ArrayList<>();
    private ClientManager clientManager;

    /**
     * Creates new form TelaJogo
     */
    public TelaJogo(ClientManager clientManagaer) {
        this.clientManager = clientManagaer;

        initComponents();
        btns = new ButtonWithLoader[][] {
            {BTN_0, BTN_1, BTN_2, BTN_3, BTN_4},
            {BTN_5,BTN_6,BTN_7,BTN_8,BTN_9},
            {BTN_10,BTN_11,null/*ou BTN_12_Null*/, BTN_13,BTN_14},
            {BTN_15,BTN_16,BTN_17,BTN_18,BTN_19},
            {BTN_20,BTN_21,BTN_22,BTN_23,BTN_24},
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_0 = new bingo.ButtonWithLoader();
        BTN_1 = new bingo.ButtonWithLoader();
        BTN_2 = new bingo.ButtonWithLoader();
        BTN_3 = new bingo.ButtonWithLoader();
        BTN_4 = new bingo.ButtonWithLoader();
        BTN_5 = new bingo.ButtonWithLoader();
        BTN_8 = new bingo.ButtonWithLoader();
        BTN_9 = new bingo.ButtonWithLoader();
        BTN_6 = new bingo.ButtonWithLoader();
        BTN_7 = new bingo.ButtonWithLoader();
        BTN_11 = new bingo.ButtonWithLoader();
        BTN_10 = new bingo.ButtonWithLoader();
        BTN_14 = new bingo.ButtonWithLoader();
        BTN_12_Null = new bingo.ButtonWithLoader();
        BTN_13 = new bingo.ButtonWithLoader();
        BTN_16 = new bingo.ButtonWithLoader();
        BTN_15 = new bingo.ButtonWithLoader();
        BTN_19 = new bingo.ButtonWithLoader();
        BTN_17 = new bingo.ButtonWithLoader();
        BTN_18 = new bingo.ButtonWithLoader();
        jButton26 = new bingo.ButtonWithLoader();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        BTN_20 = new bingo.ButtonWithLoader();
        BTN_21 = new bingo.ButtonWithLoader();
        BTN_22 = new bingo.ButtonWithLoader();
        BTN_23 = new bingo.ButtonWithLoader();
        BTN_24 = new bingo.ButtonWithLoader();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_0.setBackground(new java.awt.Color(245, 245, 245));
        BTN_0.setFocusPainted(false);
        BTN_0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_0.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_1.setBackground(new java.awt.Color(245, 245, 245));
        BTN_1.setFocusPainted(false);
        BTN_1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_1.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_2.setBackground(new java.awt.Color(245, 245, 245));
        BTN_2.setFocusPainted(false);
        BTN_2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_2.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_3.setBackground(new java.awt.Color(245, 245, 245));
        BTN_3.setFocusPainted(false);
        BTN_3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_3.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_4.setBackground(new java.awt.Color(245, 245, 245));
        BTN_4.setFocusPainted(false);
        BTN_4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_4.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_5.setBackground(new java.awt.Color(245, 245, 245));
        BTN_5.setFocusPainted(false);
        BTN_5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_5.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_8.setBackground(new java.awt.Color(245, 245, 245));
        BTN_8.setFocusPainted(false);
        BTN_8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_8.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_9.setBackground(new java.awt.Color(245, 245, 245));
        BTN_9.setFocusPainted(false);
        BTN_9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_9.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_6.setBackground(new java.awt.Color(245, 245, 245));
        BTN_6.setFocusPainted(false);
        BTN_6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_6.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_7.setBackground(new java.awt.Color(245, 245, 245));
        BTN_7.setFocusPainted(false);
        BTN_7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_7.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_11.setBackground(new java.awt.Color(245, 245, 245));
        BTN_11.setToolTipText("");
        BTN_11.setFocusPainted(false);
        BTN_11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_11.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_10.setBackground(new java.awt.Color(245, 245, 245));
        BTN_10.setToolTipText("");
        BTN_10.setFocusPainted(false);
        BTN_10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_10.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_14.setBackground(new java.awt.Color(245, 245, 245));
        BTN_14.setToolTipText("");
        BTN_14.setFocusPainted(false);
        BTN_14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_14.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_12_Null.setBackground(new java.awt.Color(245, 245, 245));
        BTN_12_Null.setBorder(null);
        BTN_12_Null.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bingo.png"))); // NOI18N
        BTN_12_Null.setToolTipText("");
        BTN_12_Null.setEnabled(false);
        BTN_12_Null.setFocusPainted(false);
        BTN_12_Null.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BTN_12_Null.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_13.setBackground(new java.awt.Color(245, 245, 245));
        BTN_13.setToolTipText("");
        BTN_13.setFocusPainted(false);
        BTN_13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_13.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_16.setBackground(new java.awt.Color(245, 245, 245));
        BTN_16.setFocusPainted(false);
        BTN_16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_16.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_15.setBackground(new java.awt.Color(245, 245, 245));
        BTN_15.setToolTipText("");
        BTN_15.setFocusPainted(false);
        BTN_15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_15.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_19.setBackground(new java.awt.Color(245, 245, 245));
        BTN_19.setFocusPainted(false);
        BTN_19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_19.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_17.setBackground(new java.awt.Color(245, 245, 245));
        BTN_17.setFocusPainted(false);
        BTN_17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_17.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_18.setBackground(new java.awt.Color(245, 245, 245));
        BTN_18.setFocusPainted(false);
        BTN_18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_18.setMinimumSize(new java.awt.Dimension(40, 40));

        jButton26.setText("BINGO!");
        jButton26.setFocusPainted(false);
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(2);
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BTN_20.setBackground(new java.awt.Color(245, 245, 245));
        BTN_20.setToolTipText("");
        BTN_20.setFocusPainted(false);
        BTN_20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_20.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_21.setBackground(new java.awt.Color(245, 245, 245));
        BTN_21.setFocusPainted(false);
        BTN_21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_21.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_22.setBackground(new java.awt.Color(245, 245, 245));
        BTN_22.setFocusPainted(false);
        BTN_22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_22.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_23.setBackground(new java.awt.Color(245, 245, 245));
        BTN_23.setFocusPainted(false);
        BTN_23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_23.setMinimumSize(new java.awt.Dimension(40, 40));

        BTN_24.setBackground(new java.awt.Color(245, 245, 245));
        BTN_24.setFocusPainted(false);
        BTN_24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN_24.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BTN_0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BTN_5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BTN_15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN_10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN_20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_12_Null, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 272, Short.MAX_VALUE)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_12_Null, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTN_19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        
        clientManager.sendMessage(new bingo.responses.Bingo(marks));
    }//GEN-LAST:event_jButton26ActionPerformed

    /**
     * @param args the command line arguments
     */
    @Override
    public void showGenericError() {
        JOptionPane.showMessageDialog(null, "Algo muito errado deu errado!");
    }

    public void setCard(Card card) {
        jTextArea1.setText("");
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if (btns[i][j] != null) {
                    final Integer n = card.getNumber(i, j);
                    btns[i][j].setText(n.toString());

                    btns[i][j].addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (marks.contains(n)) {
                                marks.remove(n);
                                Object ob = e.getSource();
                                if(ob instanceof JButton) {
                                    ((JButton)ob).setBackground(Color.decode("#f5f5f5"));
                                }
                            } else {
                                marks.add(n);
                                Object ob = e.getSource();
                                if(ob instanceof JButton) {
                                    ((JButton)ob).setBackground(Color.decode("#62BB46"));
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    public void addNextNumber(Integer n){
        String prev = jTextArea1.getText();

        if (prev.isEmpty()) {
            jTextArea1.setText(n.toString());
        } else {
            jTextArea1.setText(prev + ", " + n.toString());
        }
    }

    public void setTime(Integer time) {
        jLabel3.setText(time.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private bingo.ButtonWithLoader BTN_0;
    private bingo.ButtonWithLoader BTN_1;
    private bingo.ButtonWithLoader BTN_10;
    private bingo.ButtonWithLoader BTN_11;
    private bingo.ButtonWithLoader BTN_12_Null;
    private bingo.ButtonWithLoader BTN_13;
    private bingo.ButtonWithLoader BTN_14;
    private bingo.ButtonWithLoader BTN_15;
    private bingo.ButtonWithLoader BTN_16;
    private bingo.ButtonWithLoader BTN_17;
    private bingo.ButtonWithLoader BTN_18;
    private bingo.ButtonWithLoader BTN_19;
    private bingo.ButtonWithLoader BTN_2;
    private bingo.ButtonWithLoader BTN_20;
    private bingo.ButtonWithLoader BTN_21;
    private bingo.ButtonWithLoader BTN_22;
    private bingo.ButtonWithLoader BTN_23;
    private bingo.ButtonWithLoader BTN_24;
    private bingo.ButtonWithLoader BTN_3;
    private bingo.ButtonWithLoader BTN_4;
    private bingo.ButtonWithLoader BTN_5;
    private bingo.ButtonWithLoader BTN_6;
    private bingo.ButtonWithLoader BTN_7;
    private bingo.ButtonWithLoader BTN_8;
    private bingo.ButtonWithLoader BTN_9;
    private bingo.ButtonWithLoader jButton26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    public void warnInvalidBingo() {
        JOptionPane.showMessageDialog(null, "Fanfarrero!");
        this.hideLoaders();
    }
}
