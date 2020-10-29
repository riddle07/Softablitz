
package Independent;

public class Question0 extends javax.swing.JFrame {
    
    public int age;
    public Question0() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        age15 = new javax.swing.JRadioButton();
        age21 = new javax.swing.JRadioButton();
        age41 = new javax.swing.JRadioButton();
        age60 = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        age15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        age15.setText("15-20 yrs");
        age15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age15ActionPerformed(evt);
            }
        });

        age21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        age21.setText("21-40 yrs");
        age21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age21ActionPerformed(evt);
            }
        });

        age41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        age41.setText("41-60 yrs");
        age41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age41ActionPerformed(evt);
            }
        });

        age60.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        age60.setText("60+ yrs");
        age60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age60ActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("To which age group do you belong?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age60)
                            .addComponent(age41)
                            .addComponent(age21)
                            .addComponent(age15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(age15)
                .addGap(18, 18, 18)
                .addComponent(age21)
                .addGap(18, 18, 18)
                .addComponent(age41)
                .addGap(18, 18, 18)
                .addComponent(age60)
                .addGap(18, 18, 18)
                .addComponent(next)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        this.setVisible(false);
        Question1 q1 = new Question1(age);
        q1.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

    private void age15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age15ActionPerformed
        if(age15.isSelected()){
            age = 15;
            age21.setSelected(false);
            age41.setSelected(false);
            age60.setSelected(false);
        }
    }//GEN-LAST:event_age15ActionPerformed

    private void age21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age21ActionPerformed
        if(age21.isSelected()){
            age = 21;
            age15.setSelected(false);
            age41.setSelected(false);
            age60.setSelected(false);
        }
    }//GEN-LAST:event_age21ActionPerformed

    private void age41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age41ActionPerformed
        if(age41.isSelected()){
            age = 41;
            age21.setSelected(false);
            age15.setSelected(false);
            age60.setSelected(false);
        }
    }//GEN-LAST:event_age41ActionPerformed

    private void age60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age60ActionPerformed
        if(age60.isSelected()){
            age = 60;
            age21.setSelected(false);
            age41.setSelected(false);
            age15.setSelected(false);
        }
    }//GEN-LAST:event_age60ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton age15;
    private javax.swing.JRadioButton age21;
    private javax.swing.JRadioButton age41;
    private javax.swing.JRadioButton age60;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
