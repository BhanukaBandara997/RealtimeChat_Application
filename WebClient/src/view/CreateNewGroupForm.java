package view;

import client.Client;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * Name - W.R.B.V.Bandara
 * IIT No - w1626630
 * UOW No - 2016147
 */

public class CreateNewGroupForm extends javax.swing.JFrame {

    private Client clientObj;

    public CreateNewGroupForm() {
        initComponents();
        clientObj = new Client();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginFormPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        loginFormTitleLbl = new javax.swing.JLabel();
        groupNameLbl = new javax.swing.JLabel();
        createGroupBtn = new javax.swing.JButton();
        groupNameTxtFld = new javax.swing.JTextField();
        createdByLbl = new javax.swing.JLabel();
        createdByTxtFld = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(520, 400));

        loginFormPanel.setBackground(new java.awt.Color(0, 51, 102));

        titlePanel.setBackground(new java.awt.Color(255, 153, 0));
        titlePanel.setForeground(new java.awt.Color(255, 153, 0));

        loginFormTitleLbl.setBackground(new java.awt.Color(255, 153, 0));
        loginFormTitleLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        loginFormTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginFormTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginFormTitleLbl.setText("Create New Group");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginFormTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        groupNameLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        groupNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        groupNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupNameLbl.setText("Group Name");

        createGroupBtn.setBackground(new java.awt.Color(0, 204, 204));
        createGroupBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        createGroupBtn.setForeground(new java.awt.Color(255, 255, 255));
        createGroupBtn.setText("Create");
        createGroupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGroupBtnActionPerformed(evt);
            }
        });

        groupNameTxtFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        createdByLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        createdByLbl.setForeground(new java.awt.Color(255, 255, 255));
        createdByLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createdByLbl.setText("Created By");

        createdByTxtFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        backBtn.setBackground(new java.awt.Color(0, 204, 204));
        backBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginFormPanelLayout = new javax.swing.GroupLayout(loginFormPanel);
        loginFormPanel.setLayout(loginFormPanelLayout);
        loginFormPanelLayout.setHorizontalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginFormPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(createGroupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginFormPanelLayout.createSequentialGroup()
                        .addContainerGap(78, Short.MAX_VALUE)
                        .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(groupNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createdByLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(groupNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createdByTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        loginFormPanelLayout.setVerticalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createdByLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createdByTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createGroupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createGroupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGroupBtnActionPerformed
        if (validateFields()) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd/hh:mm:ss");
            String threadName = groupNameTxtFld.getText();
            String strDate = sdf.format(date);
            String clientName = createdByTxtFld.getText();
            boolean isSuccessfulGroupCreated = clientObj.createThread(threadName, strDate, clientName);
            if (isSuccessfulGroupCreated) {
                this.dispose();
                new GroupChatForm().setVisible(true);

            }
        }
    }//GEN-LAST:event_createGroupBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        new GroupChatForm().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewGroupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createGroupBtn;
    private javax.swing.JLabel createdByLbl;
    private javax.swing.JTextField createdByTxtFld;
    private javax.swing.JLabel groupNameLbl;
    private javax.swing.JTextField groupNameTxtFld;
    private javax.swing.JPanel loginFormPanel;
    private javax.swing.JLabel loginFormTitleLbl;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

    public boolean validateFields() {
        if (!validateField(groupNameTxtFld, "Please enter a group name")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateField(JTextField f, String errormsg) {
        if (f.getText().equals("")) {
            return failedMessage(f, errormsg);
        } else {
            return true; // validation successful
        }
    }

    public boolean failedMessage(JTextField f, String errormsg) {
        JOptionPane.showMessageDialog(null, errormsg); // give user feedback
        f.requestFocus(); // set focus on field, so user can change
        return false; // return false, as validation has failed
    }
}
