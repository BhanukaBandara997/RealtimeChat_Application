package view;

import client.Client;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Name - W.R.B.V.Bandara 
 * IIT No - w1626630 
 * UOW No - 2016147
 */
public class ChatWindowForm extends javax.swing.JFrame {

    public static int postMsgCount = 0;
    public Client clientObj;
    Thread updateChatThread;
    public boolean threadIsRunning = false;

    public ChatWindowForm() {
        initComponents();
        postMsgCount = 0;
        threadIsRunning = true;
        clientObj = new Client();
        updateChatWindow();
        usernameLbl.setText(LoginForm.loginIDSuccess);
        this.setTitle(GroupChatForm.GroupTitle);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        chatWindowPanel = new javax.swing.JPanel();
        btnsend = new javax.swing.JButton();
        clientChatWindowPane = new javax.swing.JScrollPane();
        msgTxtFld = new javax.swing.JTextArea();
        chatDisplayPane = new javax.swing.JScrollPane();
        postedMsgPanel = new javax.swing.JTextArea();
        titlePanel = new javax.swing.JPanel();
        chatWindowTitleLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        userDetailPanel = new javax.swing.JPanel();
        usernameLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(677, 541));

        mainPanel.setBackground(new java.awt.Color(0, 51, 102));
        mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));
        mainPanel.setToolTipText("");

        chatWindowPanel.setBackground(new java.awt.Color(0, 51, 102));

        btnsend.setBackground(new java.awt.Color(0, 204, 204));
        btnsend.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnsend.setForeground(new java.awt.Color(255, 255, 255));
        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });

        msgTxtFld.setColumns(20);
        msgTxtFld.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        msgTxtFld.setRows(5);
        clientChatWindowPane.setViewportView(msgTxtFld);

        postedMsgPanel.setColumns(20);
        postedMsgPanel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        postedMsgPanel.setRows(5);
        chatDisplayPane.setViewportView(postedMsgPanel);

        javax.swing.GroupLayout chatWindowPanelLayout = new javax.swing.GroupLayout(chatWindowPanel);
        chatWindowPanel.setLayout(chatWindowPanelLayout);
        chatWindowPanelLayout.setHorizontalGroup(
            chatWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chatWindowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chatWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chatDisplayPane, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                    .addGroup(chatWindowPanelLayout.createSequentialGroup()
                        .addComponent(clientChatWindowPane, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsend, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        chatWindowPanelLayout.setVerticalGroup(
            chatWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chatWindowPanelLayout.createSequentialGroup()
                .addComponent(chatDisplayPane, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(chatWindowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chatWindowPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(clientChatWindowPane, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chatWindowPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnsend, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titlePanel.setBackground(new java.awt.Color(255, 153, 0));
        titlePanel.setForeground(new java.awt.Color(255, 153, 0));

        chatWindowTitleLbl.setBackground(new java.awt.Color(255, 153, 0));
        chatWindowTitleLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        chatWindowTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        chatWindowTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chatWindowTitleLbl.setText("Chat Window");

        backBtn.setBackground(new java.awt.Color(0, 204, 204));
        backBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(0, 204, 204));
        logoutBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(chatWindowTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chatWindowTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)))
                .addGap(82, 82, 82))
        );

        userDetailPanel.setBackground(new java.awt.Color(0, 51, 102));
        userDetailPanel.setForeground(new java.awt.Color(255, 255, 255));

        usernameLbl.setBackground(new java.awt.Color(0, 51, 102));
        usernameLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        usernameLbl.setForeground(new java.awt.Color(255, 255, 255));
        usernameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLbl.setText("User Name");

        javax.swing.GroupLayout userDetailPanelLayout = new javax.swing.GroupLayout(userDetailPanel);
        userDetailPanel.setLayout(userDetailPanelLayout);
        userDetailPanelLayout.setHorizontalGroup(
            userDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userDetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        userDetailPanelLayout.setVerticalGroup(
            userDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userDetailPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chatWindowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(userDetailPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userDetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chatWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd/hh:mm:ss");
        String loginId = LoginForm.loginIDSuccess;
        String strDate = sdf.format(date);
        String clientMessage = msgTxtFld.getText();

        if (!(loginId.equals("") & strDate.equals(""))) {
            boolean isSuccessfulMessage = clientObj.sendMessage(loginId, clientMessage, strDate, GroupChatForm.GroupTitle);
            if (isSuccessfulMessage) {
                msgTxtFld.setText("");
            }
        }
    }//GEN-LAST:event_btnsendActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        try {
            threadIsRunning = false;
            updateChatThread.join();
            this.dispose();
            GroupChatForm groupChatForm = new GroupChatForm();
            groupChatForm.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(ChatWindowForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_backBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed

        this.setVisible(false);
        new LoginForm().setVisible(true);


    }//GEN-LAST:event_logoutBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatWindowForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnsend;
    private javax.swing.JScrollPane chatDisplayPane;
    private javax.swing.JPanel chatWindowPanel;
    private javax.swing.JLabel chatWindowTitleLbl;
    private javax.swing.JScrollPane clientChatWindowPane;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextArea msgTxtFld;
    private javax.swing.JTextArea postedMsgPanel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JPanel userDetailPanel;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables

    public void updateChatWindow() {
        updateChatThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (threadIsRunning) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ChatWindowForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    loadchat();
                }
            }

        });
        updateChatThread.start();
    }

    public void loadchat() {
        ArrayList<String> postedMsgList = (ArrayList<String>) clientObj.receiveMessage();
        int msgCount = postedMsgList.size();

        if (postMsgCount != msgCount) {
            postedMsgPanel.setText("");
            for (String postedMsg : postedMsgList) {
                String[] postedMsgDetails = postedMsg.split("-");
                String threadName = postedMsgDetails[3];

                if (threadName.equals(GroupChatForm.GroupTitle)) {
                    if (postedMsgDetails[0].equals(LoginForm.loginIDSuccess)) {
                        postedMsgPanel.append("Send by " + postedMsgDetails[0] + " at " + postedMsgDetails[2] + "\n");
                        postedMsgPanel.append(postedMsgDetails[1] + "\n\n");
                    } else {
                        postedMsgPanel.append("Send by " + postedMsgDetails[0] + " at " + postedMsgDetails[2] + "\n");
                        postedMsgPanel.append(postedMsgDetails[1] + "\n\n");
                    }
                }
            }
            postMsgCount = msgCount;
        }
    }
}
