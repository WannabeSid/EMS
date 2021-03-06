/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author sara
 */
public class CommitteeBudgetPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommitteeBudget
     */
    private CommitteeBudgetIncome income;
    private CommitteeBudgetExpense expense;
    
    public CommitteeBudgetPanel() {
        initComponents();
        
        income = new CommitteeBudgetIncome();
        expense = new CommitteeBudgetExpense();
        
        incomePanel.add(income);
        expensePanel.add(expense);
                
        incomePanel.setVisible(true);
        expensePanel.setVisible(true); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        budgetLabel = new javax.swing.JLabel();
        incomePanel = new javax.swing.JPanel();
        expensePanel = new javax.swing.JPanel();
        reportButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        budgetLabel.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        budgetLabel.setText("Budget");
        budgetLabel.setBounds(new java.awt.Rectangle(2, 2, 2, 2));

        incomePanel.setBackground(new java.awt.Color(255, 255, 255));
        incomePanel.setPreferredSize(new java.awt.Dimension(390, 500));

        expensePanel.setBackground(new java.awt.Color(255, 255, 255));
        expensePanel.setPreferredSize(new java.awt.Dimension(390, 500));

        reportButton.setText("Report");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(0, 2, Short.MAX_VALUE)
                        .add(incomePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(expensePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(budgetLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(reportButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(reportButton)
                    .add(budgetLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(expensePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .add(incomePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel budgetLabel;
    private javax.swing.JPanel expensePanel;
    private javax.swing.JPanel incomePanel;
    private javax.swing.JButton reportButton;
    // End of variables declaration//GEN-END:variables
}
