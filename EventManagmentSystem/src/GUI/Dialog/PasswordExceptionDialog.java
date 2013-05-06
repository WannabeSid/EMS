/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Dialog;

/**
 *
 * @author Sid
 */
public class PasswordExceptionDialog extends javax.swing.JDialog {
    private Exception e;
    /**
     * Creates new form PasswordExceptionDialog
     */
    public PasswordExceptionDialog(java.awt.Frame parent, boolean modal, Exception e) {
        super(parent, modal);
        initComponents();
        this.e = e;
        errorLabel.setText(e.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLabel1 = new javax.swing.JLabel();
        headerLabel2 = new javax.swing.JLabel();
        headerLabel3 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        headerLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerLabel1.setForeground(new java.awt.Color(255, 0, 0));
        headerLabel1.setText("Warning:");

        headerLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        headerLabel2.setText("Incorrect email address");

        headerLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        headerLabel3.setText("or password.");

        errorLabel.setText("Error Message");

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(headerLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(headerLabel3)
                            .addComponent(headerLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(errorLabel)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headerLabel1)
                    .addComponent(headerLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerLabel3)
                .addGap(26, 26, 26)
                .addComponent(errorLabel)
                .addGap(11, 11, 11)
                .addComponent(closeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
    this.dispose();
}//GEN-LAST:event_closeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel headerLabel1;
    private javax.swing.JLabel headerLabel2;
    private javax.swing.JLabel headerLabel3;
    // End of variables declaration//GEN-END:variables
}
