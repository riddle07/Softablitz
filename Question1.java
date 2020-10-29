package Independent;
public class Question1 extends javax.swing.JFrame{

    
    int sum = 0, age;
    public Question1(int age) {
        initComponents();
        this.age = age;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Next1 = new javax.swing.JButton();
        fever = new javax.swing.JCheckBox();
        Cough = new javax.swing.JCheckBox();
        difficulty = new javax.swing.JCheckBox();
        none = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Are you experiencing any of the following?");

        Next1.setText("Next");
        Next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next1ActionPerformed(evt);
            }
        });

        fever.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fever.setText("Fever");
        fever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feverActionPerformed(evt);
            }
        });

        Cough.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cough.setText("Cough");
        Cough.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoughActionPerformed(evt);
            }
        });

        difficulty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        difficulty.setText("Difficulty in breathing");
        difficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyActionPerformed(evt);
            }
        });

        none.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        none.setText("None");
        none.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Next1)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(none, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cough, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fever, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(difficulty))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fever)
                .addGap(18, 18, 18)
                .addComponent(Cough)
                .addGap(18, 18, 18)
                .addComponent(difficulty)
                .addGap(18, 18, 18)
                .addComponent(none)
                .addGap(26, 26, 26)
                .addComponent(Next1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Question3 q3 = new Question3(sum,age);
        q3.setVisible(true);
        
    }//GEN-LAST:event_Next1ActionPerformed

    private void feverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feverActionPerformed

        if(fever.isSelected()){
            sum+=10;
        }
    }//GEN-LAST:event_feverActionPerformed

    private void CoughActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoughActionPerformed
        if(Cough.isSelected()){
            sum+=10;
        }
    }//GEN-LAST:event_CoughActionPerformed

    private void difficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyActionPerformed
        // TODO add your handling code here:
        if(difficulty.isSelected()){
            sum+=10;
        }
    }//GEN-LAST:event_difficultyActionPerformed

    private void noneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noneActionPerformed
        // TODO add your handling code here:
        if(none.isSelected()){
            sum+=0;
        }
    }//GEN-LAST:event_noneActionPerformed
    
     
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Cough;
    private javax.swing.JButton Next1;
    private javax.swing.JCheckBox difficulty;
    private javax.swing.JCheckBox fever;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox none;
    // End of variables declaration//GEN-END:variables
}
