package LinkAndTest;
public class Question0 extends javax.swing.JFrame {
    int age;
    public Question0() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        age15 = new javax.swing.JRadioButton();
        age21 = new javax.swing.JRadioButton();
        age41 = new javax.swing.JRadioButton();
        age60 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("To which age group do you belong?");

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

        jToggleButton1.setText("Next");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age21)
                            .addComponent(age15)
                            .addComponent(age41)
                            .addComponent(age60))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
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
                .addComponent(jToggleButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.setVisible(false);
        Question1 q1 = new Question1(this.age);
        q1.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void age60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age60ActionPerformed
       if (this.age60.isSelected()) {
            this.age = 60;
            this.age21.setSelected(false);
            this.age41.setSelected(false);
            this.age15.setSelected(false);
        }
    }//GEN-LAST:event_age60ActionPerformed

    private void age15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age15ActionPerformed
        if (this.age15.isSelected()) {
            this.age = 15;
            this.age21.setSelected(false);
            this.age41.setSelected(false);
            this.age60.setSelected(false);
        }
    }//GEN-LAST:event_age15ActionPerformed

    private void age21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age21ActionPerformed
        if (this.age21.isSelected()) {
            this.age = 21;
            this.age15.setSelected(false);
            this.age41.setSelected(false);
            this.age60.setSelected(false);
        }
    }//GEN-LAST:event_age21ActionPerformed

    private void age41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age41ActionPerformed
        if (this.age41.isSelected()) {
            this.age = 41;
            this.age21.setSelected(false);
            this.age15.setSelected(false);
            this.age60.setSelected(false);
        }
    }//GEN-LAST:event_age41ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton age15;
    private javax.swing.JRadioButton age21;
    private javax.swing.JRadioButton age41;
    private javax.swing.JRadioButton age60;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
