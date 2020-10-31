
package Package1;

import java.net.URI;
import java.awt.Desktop;
import LinkAndTest.Test;
import java.util.Calendar;


public class MainFrame extends javax.swing.JFrame {
    API api;
    Calendar calendar = Calendar.getInstance();
    
    public MainFrame() {
       
        initComponents();
    }
    public void setaTextField(String s){
        aTextField.setText(s);
    }
    public void setcTextField(String s){
        cTextField.setText(s);
    }
    public void setdTextField(String s){
        dTextField.setText(s);
    }
    public void setrTextField(String s){
        rTextField.setText(s);
    }
    public void setTime(){
        
    jLabel7.setText("LAST FETCHED AT  :   "+calendar.getTime());
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rTextField = new javax.swing.JTextField();
        cTextField = new javax.swing.JTextField();
        dTextField = new javax.swing.JTextField();
        aTextField = new javax.swing.JTextField();
        stateSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        districtSearch = new javax.swing.JButton();
        contactSearch = new javax.swing.JButton();
        newsSearch = new javax.swing.JButton();
        test = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRACK A COV");

        jLabel2.setText("NATIONAL DATA");

        jLabel3.setText("CONFIRMED CASES");

        jLabel4.setText("RECOVERED CASES");

        jLabel5.setText("DEATH CASES");

        jLabel6.setText("ACTIVE CASES");

        rTextField.setEditable(false);

        cTextField.setEditable(false);

        dTextField.setEditable(false);

        aTextField.setEditable(false);

        stateSearch.setText("SEARCH FOR STATE");
        stateSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateSearchActionPerformed(evt);
            }
        });

        districtSearch.setText("SEARCH FOR DISTRICT");
        districtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtSearchActionPerformed(evt);
            }
        });

        contactSearch.setText("CONTACTS AND HELPLINES");
        contactSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactSearchActionPerformed(evt);
            }
        });

        newsSearch.setText("COVID RELATED NEWS");
        newsSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsSearchActionPerformed(evt);
            }
        });

        test.setText("SYMPTOM ANALYSER");
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel2)))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(test, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newsSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contactSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(districtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stateSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(aTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(stateSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(districtSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newsSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(test)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stateSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateSearchActionPerformed
        StateSearch stateSearch = new StateSearch(api);
        stateSearch.setDefaultCloseOperation(StateSearch.DISPOSE_ON_CLOSE);
        stateSearch.setVisible(true);
    }//GEN-LAST:event_stateSearchActionPerformed

    private void districtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtSearchActionPerformed
        SearchDistrict searchDistrict = new SearchDistrict();
        searchDistrict.setDefaultCloseOperation(SearchDistrict.DISPOSE_ON_CLOSE);
        searchDistrict.setVisible(true);
    }//GEN-LAST:event_districtSearchActionPerformed

    private void contactSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactSearchActionPerformed
        CandH candh = new CandH();
        candh.setDefaultCloseOperation(CandH.DISPOSE_ON_CLOSE);
        candh.setVisible(true);
    }//GEN-LAST:event_contactSearchActionPerformed

    private void newsSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsSearchActionPerformed

        String s = "https://www.who.int/";
        try {
            Desktop d = Desktop.getDesktop();
            d.browse(new URI(s));
        }
        catch (Exception e) {
            System.out.println("Exception occured:"+e.getMessage());
        }
    }//GEN-LAST:event_newsSearchActionPerformed

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
      final Test t = new Test();
      t.setDefaultCloseOperation(Test.DISPOSE_ON_CLOSE);
        t.setVisible(true);
    }//GEN-LAST:event_testActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aTextField;
    private javax.swing.JTextField cTextField;
    private javax.swing.JButton contactSearch;
    private javax.swing.JTextField dTextField;
    private javax.swing.JButton districtSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton newsSearch;
    private javax.swing.JTextField rTextField;
    private javax.swing.JButton stateSearch;
    private javax.swing.JButton test;
    // End of variables declaration//GEN-END:variables
}
