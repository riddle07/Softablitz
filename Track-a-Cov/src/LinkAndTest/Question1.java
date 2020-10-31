package LinkAndTest;
public class Question1 extends javax.swing.JFrame {
    int age, sum;
    public Question1(int age) {
        this.sum = 0;
        this.initComponents();
        this.age = age;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fever = new javax.swing.JCheckBox();
        Cough = new javax.swing.JCheckBox();
        difficulty = new javax.swing.JCheckBox();
        none = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Are you experiencing any of the following?");

        fever.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fever.setText("Fever");
        fever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feverActionPerformed(evt);
            }
        });

        Cough.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cough.setText("Cough");
        Cough.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoughActionPerformed(evt);
            }
        });

        difficulty.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        difficulty.setText("Difficulty in breathing");
        difficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyActionPerformed(evt);
            }
        });

        none.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        none.setText("None");
        none.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noneActionPerformed(evt);
            }
        });

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(none, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cough, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fever, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(difficulty))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fever)
                .addGap(18, 18, 18)
                .addComponent(Cough)
                .addGap(18, 18, 18)
                .addComponent(difficulty)
                .addGap(18, 18, 18)
                .addComponent(none)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Question3 q3 = new Question3(this.sum, this.age);
        q3.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void feverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feverActionPerformed
        if (this.fever.isSelected()) {
            this.sum += 10;
        }
    }//GEN-LAST:event_feverActionPerformed

    private void CoughActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoughActionPerformed
        if (this.Cough.isSelected()) {
            this.sum += 10;
        }
    }//GEN-LAST:event_CoughActionPerformed

    private void difficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyActionPerformed
        if (this.difficulty.isSelected()) {
            this.sum += 10;
        }
    }//GEN-LAST:event_difficultyActionPerformed

    private void noneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noneActionPerformed
        if (this.none.isSelected()) {
            this.sum += 0;
        }
    }//GEN-LAST:event_noneActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Cough;
    private javax.swing.JCheckBox difficulty;
    private javax.swing.JCheckBox fever;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox none;
    // End of variables declaration//GEN-END:variables
}
