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

public class LoginForm extends javax.swing.JFrame {
    
    private String password, loginID;
    public static String loginIDSuccess = "";
    private Client clientObj;
    
    public LoginForm() {
        initComponents();
        clientObj = new Client();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginFormPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        loginFormTitleLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        loginIdLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        loginIdTxtFld = new javax.swing.JTextField();
        passwordTxtLbl = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(510, 418));

        loginFormPanel.setBackground(new java.awt.Color(0, 51, 102));

        titlePanel.setBackground(new java.awt.Color(255, 153, 0));
        titlePanel.setForeground(new java.awt.Color(255, 153, 0));

        loginFormTitleLbl.setBackground(new java.awt.Color(255, 153, 0));
        loginFormTitleLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        loginFormTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginFormTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginFormTitleLbl.setText("Login Form");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginFormTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        passwordLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLbl.setText("Password");

        loginIdLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        loginIdLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginIdLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginIdLbl.setText("Login ID");

        loginBtn.setBackground(new java.awt.Color(0, 204, 204));
        loginBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setActionCommand("");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
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

        javax.swing.GroupLayout loginFormPanelLayout = new javax.swing.GroupLayout(loginFormPanel);
        loginFormPanel.setLayout(loginFormPanelLayout);
        loginFormPanelLayout.setHorizontalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(loginFormPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginIdTxtFld, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(passwordTxtLbl))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        loginFormPanelLayout.setVerticalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginIdTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
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

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        this.dispose();
        new RegistrationForm().setVisible(true);
    }//GEN-LAST:event_registerBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        loginValidation();
    }//GEN-LAST:event_loginBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginFormPanel;
    private javax.swing.JLabel loginFormTitleLbl;
    private javax.swing.JLabel loginIdLbl;
    private javax.swing.JTextField loginIdTxtFld;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxtLbl;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

    private void loginValidation() {
        loginID = loginIdTxtFld.getText();
        password = passwordTxtLbl.getText();
        
        if (validateFields()) {
                boolean succesfullLogin = clientObj.loginClient(loginID, password);
                if (succesfullLogin) {
                    loginIDSuccess = loginIdTxtFld.getText();
                    this.dispose();
                    new GroupChatForm().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid username or password!");
                }
            }
        

    }

    public boolean validateFields() {
        if (!validateField(loginIdTxtFld, "Please enter a Login ID")) {
            return false;
        } else if (!validateField(passwordTxtLbl, "Please enter a Password")) {
            return false;
        }
        else {
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
