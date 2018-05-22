
package view;

import client.Client;
import javax.swing.JOptionPane;

/**
 *
 * Name - W.R.B.V.Bandara
 * IIT No - w1626630
 * UOW No - 2016147
 */

public class EditGroupNameForm extends javax.swing.JFrame {

        String oldthreadname;
        Client client;

    public EditGroupNameForm() {
        initComponents();
        oldthreadname = GroupChatForm.GroupTitle;
        client = new Client();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        editGroupNameFormTitleLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        newGroupNameLbl = new javax.swing.JLabel();
        newGroupNameTxtFld = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        changeGroupNameBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titlePanel.setBackground(new java.awt.Color(255, 153, 0));
        titlePanel.setForeground(new java.awt.Color(255, 153, 0));

        editGroupNameFormTitleLbl.setBackground(new java.awt.Color(255, 153, 0));
        editGroupNameFormTitleLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        editGroupNameFormTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        editGroupNameFormTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editGroupNameFormTitleLbl.setText("Edit Group Name");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editGroupNameFormTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editGroupNameFormTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        newGroupNameLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        newGroupNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        newGroupNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newGroupNameLbl.setText("New Group Name");

        newGroupNameTxtFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        backBtn.setBackground(new java.awt.Color(0, 204, 204));
        backBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.setActionCommand("");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        changeGroupNameBtn.setBackground(new java.awt.Color(0, 204, 204));
        changeGroupNameBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        changeGroupNameBtn.setForeground(new java.awt.Color(255, 255, 255));
        changeGroupNameBtn.setText("Change Name");
        changeGroupNameBtn.setActionCommand("");
        changeGroupNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeGroupNameBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(newGroupNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(newGroupNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeGroupNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newGroupNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newGroupNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeGroupNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeGroupNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeGroupNameBtnActionPerformed
        String newThreadName = newGroupNameTxtFld.getText();
        String loginID = LoginForm.loginIDSuccess;
        if (newThreadName != "") {
            boolean isedited = client.editThreadName(oldthreadname, newThreadName, loginID);
            if (isedited) {
                new GroupChatForm().setVisible(true);
                this.dispose();
            } else {
                String errorMsg = "Error happend while editing group";
                JOptionPane.showMessageDialog(null, errorMsg); // give user feedback
            }
        }
    }//GEN-LAST:event_changeGroupNameBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        new GroupChatForm().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditGroupNameForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton changeGroupNameBtn;
    private javax.swing.JLabel editGroupNameFormTitleLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newGroupNameLbl;
    private javax.swing.JTextField newGroupNameTxtFld;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
