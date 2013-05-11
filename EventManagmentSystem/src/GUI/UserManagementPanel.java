/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI; 

import BackEnd.ManagerSystem.MainManager;
import BackEnd.ManagerSystem.PrivilegeInsufficientException;
import BackEnd.UserSystem.Address;
import BackEnd.UserSystem.PhoneNumber;
import BackEnd.UserSystem.User;
import EMS_Database.DoesNotExistException;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Karina
 */
public class UserManagementPanel extends javax.swing.JPanel {
    private MainManager manager;
    private JList userList;
    /**
     * Creates new form UserManagementPanel
     */
    public UserManagementPanel() {
        initComponents();
        ChangeUserPanel.setLayout(new BorderLayout());
        manager = MainManager.getInstance();
        updateLabels();
        initUserList();
    }
    
    public void initUserList()
    {
        Object[] tempUserList = new Object[manager.getUserManager().getUserList().size()];
        for (int i = 0; i < tempUserList.length; i++)
            tempUserList[i] = manager.getUserManager().getUserList().get(i);
        
        userList = new JList(tempUserList);
        
        userList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        userList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        userList.setVisibleRowCount(-1);
        userList.addListSelectionListener(new UserListSelectionListener());
        JScrollPane listScroller = new JScrollPane(userList);
        listScroller.setPreferredSize(new Dimension(250, 80));
        ChangeUserPanel.add(listScroller, BorderLayout.CENTER);
    }
    
    public void updateLabels()
    {
        currentUserLabel.setText("Currently Editing User: < " + manager.getUserManager().getSelectedUser().getFirstName() + " " + manager.getUserManager().getSelectedUser().getLastName() + " >");
        firstNameField.setText(manager.getUserManager().getSelectedUser().getFirstName());
        lastNameField.setText(manager.getUserManager().getSelectedUser().getLastName());
        emailField.setText(manager.getUserManager().getSelectedUser().getEmailAddress());
        phoneNumberField.setText(manager.getUserManager().getSelectedUser().getPhoneNumber().toString());
        streetField.setText(manager.getUserManager().getSelectedUser().getAddress().getStreet());
        stateField.setText(manager.getUserManager().getSelectedUser().getAddress().getState());
        cityField.setText(manager.getUserManager().getSelectedUser().getAddress().getCity());
        zipcodeField.setText(manager.getUserManager().getSelectedUser().getAddress().getZipCode());
        countryField.setText(manager.getUserManager().getSelectedUser().getAddress().getCountry());
    }

    public void setNonAdminView() {
        changeInfoButton.setVisible(false);
        changeUserButton.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserInfoPanelHolder = new javax.swing.JPanel();
        ChangeInfoPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        streetField = new javax.swing.JTextField();
        firstNameButton = new javax.swing.JButton();
        lastNameButton = new javax.swing.JButton();
        phoneNumberButton = new javax.swing.JButton();
        emailButton = new javax.swing.JButton();
        addressButton = new javax.swing.JButton();
        passwordButton = new javax.swing.JButton();
        cityField = new javax.swing.JTextField();
        stateField = new javax.swing.JTextField();
        zipcodeField = new javax.swing.JTextField();
        countryField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ChangeUserPanel = new javax.swing.JPanel();
        changeInfoButton = new javax.swing.JButton();
        changeUserButton = new javax.swing.JButton();
        currentUserLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setPreferredSize(new java.awt.Dimension(640, 480));

        UserInfoPanelHolder.setBackground(new java.awt.Color(255, 255, 255));
        UserInfoPanelHolder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        UserInfoPanelHolder.setLayout(new java.awt.CardLayout());

        ChangeInfoPanel.setBackground(new java.awt.Color(255, 255, 255));

        firstNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        firstNameLabel.setText("First name: ");

        lastNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lastNameLabel.setText("Last name: ");

        emailLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emailLabel.setText("Email:");

        phoneNumberLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneNumberLabel.setText("Phone #:");

        addressLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addressLabel.setText("Address:");

        firstNameField.setText("First Name");

        lastNameField.setText("Last Name");

        emailField.setText("Email");

        phoneNumberField.setText("Phone Number");

        streetField.setText("Street");

        firstNameButton.setText("Change");
        firstNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameButtonActionPerformed(evt);
            }
        });

        lastNameButton.setText("Change");
        lastNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameButtonActionPerformed(evt);
            }
        });

        phoneNumberButton.setText("Change");
        phoneNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberButtonActionPerformed(evt);
            }
        });

        emailButton.setText("Change");
        emailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailButtonActionPerformed(evt);
            }
        });

        addressButton.setText("Change");
        addressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressButtonActionPerformed(evt);
            }
        });

        passwordButton.setText("Change Password");
        passwordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordButtonActionPerformed(evt);
            }
        });

        cityField.setText("City");

        stateField.setText("State");

        zipcodeField.setText("Zipcode");

        countryField.setText("Country");

        jButton1.setText("Save Changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChangeInfoPanelLayout = new javax.swing.GroupLayout(ChangeInfoPanel);
        ChangeInfoPanel.setLayout(ChangeInfoPanelLayout);
        ChangeInfoPanelLayout.setHorizontalGroup(
            ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ChangeInfoPanelLayout.createSequentialGroup()
                        .addGroup(ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel)
                            .addComponent(emailLabel)
                            .addComponent(firstNameLabel)
                            .addComponent(phoneNumberLabel)
                            .addComponent(addressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ChangeInfoPanelLayout.createSequentialGroup()
                                .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(phoneNumberButton))
                            .addGroup(ChangeInfoPanelLayout.createSequentialGroup()
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(firstNameButton))
                            .addGroup(ChangeInfoPanelLayout.createSequentialGroup()
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(emailButton))
                            .addGroup(ChangeInfoPanelLayout.createSequentialGroup()
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lastNameButton))
                            .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ChangeInfoPanelLayout.createSequentialGroup()
                                .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addressButton))))
                    .addGroup(ChangeInfoPanelLayout.createSequentialGroup()
                        .addComponent(passwordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        ChangeInfoPanelLayout.setVerticalGroup(
            ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChangeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordButton)
                    .addComponent(jButton1))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        UserInfoPanelHolder.add(ChangeInfoPanel, "changeInfo");

        javax.swing.GroupLayout ChangeUserPanelLayout = new javax.swing.GroupLayout(ChangeUserPanel);
        ChangeUserPanel.setLayout(ChangeUserPanelLayout);
        ChangeUserPanelLayout.setHorizontalGroup(
            ChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );
        ChangeUserPanelLayout.setVerticalGroup(
            ChangeUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        UserInfoPanelHolder.add(ChangeUserPanel, "changeUser");

        changeInfoButton.setText("Edit Account Info");
        changeInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeInfoButtonActionPerformed(evt);
            }
        });

        changeUserButton.setText("Select Another User");
        changeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeUserButtonActionPerformed(evt);
            }
        });

        currentUserLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        currentUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentUserLabel.setText("Current User: <UserName>");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserInfoPanelHolder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(changeInfoButton)
                        .addGap(18, 18, 18)
                        .addComponent(changeUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentUserLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeInfoButton)
                    .addComponent(changeUserButton)
                    .addComponent(currentUserLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserInfoPanelHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordButtonActionPerformed
        JOptionPane.showInputDialog("Please enter your new password:");
    }//GEN-LAST:event_passwordButtonActionPerformed

    private void changeInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeInfoButtonActionPerformed
        CardLayout cl = (CardLayout)(UserInfoPanelHolder.getLayout());
        cl.show(UserInfoPanelHolder, "changeInfo");
    }//GEN-LAST:event_changeInfoButtonActionPerformed

    private void changeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUserButtonActionPerformed
        CardLayout cl = (CardLayout)(UserInfoPanelHolder.getLayout());
        cl.show(UserInfoPanelHolder, "changeUser");
    }//GEN-LAST:event_changeUserButtonActionPerformed

    private void firstNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to change the first name to " + firstNameField.getText() + "?");
        if (choice == JOptionPane.YES_OPTION)
        {
            try 
            {
                manager.getUserManager().editFirstName(firstNameField.getText(), manager.getLogInManager().getLoggedInUser());
            } 
            catch (PrivilegeInsufficientException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (DoesNotExistException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            updateLabels();
        }
    }//GEN-LAST:event_firstNameButtonActionPerformed

    private void lastNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to change the last name to " + lastNameField.getText() + "?");
        if (choice == JOptionPane.YES_OPTION)
        {
            try 
            {
                manager.getUserManager().editLastName(lastNameField.getText(), manager.getLogInManager().getLoggedInUser());
            } 
            catch (PrivilegeInsufficientException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (DoesNotExistException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            updateLabels();
        }
    }//GEN-LAST:event_lastNameButtonActionPerformed

    private void emailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to change the email to " + emailField.getText() + "?");
        if (choice == JOptionPane.YES_OPTION)
        {
            try 
            {
                manager.getUserManager().editEmailAddress(emailField.getText(), manager.getLogInManager().getLoggedInUser());
            } 
            catch (PrivilegeInsufficientException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (DoesNotExistException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            updateLabels();
        }
    }//GEN-LAST:event_emailButtonActionPerformed

    private void phoneNumberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to change the phone number to " + phoneNumberField.getText() + "?");
        if (choice == JOptionPane.YES_OPTION)
        {
            PhoneNumber tempPhoneNumber = new PhoneNumber(phoneNumberField.getText());
            try 
            {
                manager.getUserManager().editPhoneNumber(tempPhoneNumber, manager.getLogInManager().getLoggedInUser());
            } 
            catch (PrivilegeInsufficientException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (DoesNotExistException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            updateLabels();
        }
    }//GEN-LAST:event_phoneNumberButtonActionPerformed

    private void addressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressButtonActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to change the address to " + streetField.getText() + ", " + cityField.getText() + ", " + stateField.getText() + ", " + zipcodeField.getText() + ", " + countryField.getText() + "?");
        if (choice == JOptionPane.YES_OPTION)
        {
            Address tempAddress = new Address(streetField.getText(), cityField.getText(), stateField.getText(), zipcodeField.getText(), countryField.getText());
            try 
            {
                manager.getUserManager().editAddress(tempAddress, manager.getLogInManager().getLoggedInUser());
            } 
            catch (PrivilegeInsufficientException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (DoesNotExistException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            updateLabels();
        }
    }//GEN-LAST:event_addressButtonActionPerformed

    private void saveChangesButtonPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to save these changes?");
        if(choice == JOptionPane.YES_OPTION)
        {
            PhoneNumber tempPhoneNumber = new PhoneNumber(phoneNumberField.getText());
            Address tempAddress = new Address(streetField.getText(), cityField.getText(), stateField.getText(), zipcodeField.getText(), countryField.getText());
            try 
            {
                manager.getUserManager().editFirstName(firstNameField.getText(), manager.getLogInManager().getLoggedInUser());
                manager.getUserManager().editLastName(lastNameField.getText(), manager.getLogInManager().getLoggedInUser());
                manager.getUserManager().editEmailAddress(emailField.getText(), manager.getLogInManager().getLoggedInUser());
                manager.getUserManager().editPhoneNumber(tempPhoneNumber, manager.getLogInManager().getLoggedInUser());
                manager.getUserManager().editAddress(tempAddress, manager.getLogInManager().getLoggedInUser());
            } 
            catch (PrivilegeInsufficientException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (DoesNotExistException ex) 
            {
                Logger.getLogger(UserManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            updateLabels();
        }
    }//GEN-LAST:event_saveChangesButtonPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChangeInfoPanel;
    private javax.swing.JPanel ChangeUserPanel;
    private javax.swing.JPanel UserInfoPanelHolder;
    private javax.swing.JButton addressButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton changeInfoButton;
    private javax.swing.JButton changeUserButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField countryField;
    private javax.swing.JLabel currentUserLabel;
    private javax.swing.JButton emailButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton firstNameButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton lastNameButton;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton passwordButton;
    private javax.swing.JButton phoneNumberButton;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField stateField;
    private javax.swing.JTextField streetField;
    private javax.swing.JTextField zipcodeField;
    // End of variables declaration//GEN-END:variables

    class UserListSelectionListener implements ListSelectionListener {
    public void valueChanged(ListSelectionEvent e) {
        manager.getUserManager().setSelectedUser((User)userList.getSelectedValue());
        updateLabels();
    }
    }
}
