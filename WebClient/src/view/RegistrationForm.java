package view;

import client.Client;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * Name - W.R.B.V.Bandara
 * IIT No - w1626630
 * UOW No - 2016147
 */

public class RegistrationForm extends javax.swing.JFrame {

    private String nickname, loginID, password, confirmPassword;
    private Client clientObj;

    public RegistrationForm() {
        initComponents();
        clientObj = new Client();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        registerTitleLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        loginIdLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        nicknameLbl = new javax.swing.JLabel();
        reEnterPasswordLbl = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        loginIdTxtFld = new javax.swing.JTextField();
        nicknameTxtFld = new javax.swing.JTextField();
        reEnterPasswordTxtLbl = new javax.swing.JPasswordField();
        passwordTxtLbl = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(565, 450));

        registerPanel.setBackground(new java.awt.Color(0, 51, 102));

        titlePanel.setBackground(new java.awt.Color(255, 153, 0));
        titlePanel.setForeground(new java.awt.Color(255, 153, 0));

        registerTitleLbl.setBackground(new java.awt.Color(255, 153, 0));
        registerTitleLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registerTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        registerTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerTitleLbl.setText("Register");

        backBtn.setBackground(new java.awt.Color(0, 204, 204));
        backBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(registerTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(registerTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        loginIdLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        loginIdLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginIdLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginIdLbl.setText("Login ID");

        passwordLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLbl.setText("Password");

        nicknameLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        nicknameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nicknameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nicknameLbl.setText("Nickname");

        reEnterPasswordLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        reEnterPasswordLbl.setForeground(new java.awt.Color(255, 255, 255));
        reEnterPasswordLbl.setText("Re Enter Password");

        cancelBtn.setBackground(new java.awt.Color(255, 0, 0));
        cancelBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.setActionCommand("");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        registerBtn.setBackground(new java.awt.Color(0, 204, 204));
        registerBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginIdTxtFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        nicknameTxtFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(loginIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nicknameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(reEnterPasswordLbl)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nicknameTxtFld)
                    .addComponent(loginIdTxtFld)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reEnterPasswordTxtLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(passwordTxtLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicknameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nicknameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginIdTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reEnterPasswordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reEnterPasswordTxtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        registerClient();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        LoginForm loginID = new LoginForm();
        loginID.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        LoginForm loginID = new LoginForm();
        loginID.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel loginIdLbl;
    private javax.swing.JTextField loginIdTxtFld;
    private javax.swing.JLabel nicknameLbl;
    private javax.swing.JTextField nicknameTxtFld;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxtLbl;
    private javax.swing.JLabel reEnterPasswordLbl;
    private javax.swing.JPasswordField reEnterPasswordTxtLbl;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel registerTitleLbl;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

    public void registerClient() {

        if (validateFields()) {
            nickname = nicknameTxtFld.getText();
            loginID = loginIdTxtFld.getText();
            password = passwordTxtLbl.getText();
            confirmPassword = reEnterPasswordTxtLbl.getText();

            if (password.equals(confirmPassword)) {
                boolean succesfullRegister = clientObj.registerClient(nickname, loginID, password);
                if (succesfullRegister) {
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Client succesfully registered");
                    new LoginForm().setVisible(true);
                } else {

                }
            } else {
                reEnterPasswordTxtLbl.setText("Password doesn't match!!!");
                reEnterPasswordTxtLbl.selectAll();
            }

        }

    }

    public boolean validateFields() {
        if (!validateField(nicknameTxtFld, "Please enter a Nickname")) {
            return false;
        } else if (!validateField(loginIdTxtFld, "Please enter a Login ID")) {
            return false;
        } else if (!validateField(passwordTxtLbl, "Please enter a Password")) {
            return false;
        }
        if (!validateField(reEnterPasswordTxtLbl, "Please enter a Password again")) {
            return false;
        } else {
            return true;
        }
    }

// test if field is empty
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
