package view;

import client.Client;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * Name - W.R.B.V.Bandara IIT No - w1626630 UOW No - 2016147
 */
public class GroupChatForm extends javax.swing.JFrame {

    public Client clientObj;
    public static int previousThreadSize = 0;
    private boolean isGroupSelected = false;
    private DefaultTableModel defaultTableModel;
    public static String GroupTitle = "";
    public Thread writeDataToTable;

    public GroupChatForm() {
        initComponents();
        clientObj = new Client();
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        defaultTableModel = (DefaultTableModel) groupChatTable.getModel();
        isGroupSelected = true;
        generateTableData();
        previousThreadSize = 0;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupChatForm = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        groupChatTitileLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        groupChatPanel = new javax.swing.JPanel();
        groupChatScrollPane = new javax.swing.JScrollPane();
        groupChatTable = new javax.swing.JTable();
        editSelectedBtn = new javax.swing.JButton();
        createNewBtn = new javax.swing.JButton();
        editGroupNameBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(780, 585));
        setPreferredSize(new java.awt.Dimension(669, 470));

        groupChatForm.setBackground(new java.awt.Color(0, 51, 102));
        groupChatForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));

        titlePanel.setBackground(new java.awt.Color(255, 153, 0));
        titlePanel.setForeground(new java.awt.Color(255, 153, 0));

        groupChatTitileLbl.setBackground(new java.awt.Color(255, 153, 0));
        groupChatTitileLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        groupChatTitileLbl.setForeground(new java.awt.Color(255, 255, 255));
        groupChatTitileLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupChatTitileLbl.setText("Group Chats");

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
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupChatTitileLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(groupChatTitileLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        groupChatPanel.setBackground(new java.awt.Color(255, 255, 255));
        groupChatPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        groupChatTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        groupChatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Last Edited", "By"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        groupChatScrollPane.setViewportView(groupChatTable);

        javax.swing.GroupLayout groupChatPanelLayout = new javax.swing.GroupLayout(groupChatPanel);
        groupChatPanel.setLayout(groupChatPanelLayout);
        groupChatPanelLayout.setHorizontalGroup(
            groupChatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupChatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(groupChatScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                .addContainerGap())
        );
        groupChatPanelLayout.setVerticalGroup(
            groupChatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupChatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(groupChatScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        editSelectedBtn.setBackground(new java.awt.Color(0, 204, 204));
        editSelectedBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        editSelectedBtn.setText("Chat Selected");
        editSelectedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectedBtnActionPerformed(evt);
            }
        });

        createNewBtn.setBackground(new java.awt.Color(0, 204, 204));
        createNewBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        createNewBtn.setText("Create New");
        createNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewBtnActionPerformed(evt);
            }
        });

        editGroupNameBtn.setBackground(new java.awt.Color(0, 204, 204));
        editGroupNameBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        editGroupNameBtn.setText("Edit Group Name");
        editGroupNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editGroupNameBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout groupChatFormLayout = new javax.swing.GroupLayout(groupChatForm);
        groupChatForm.setLayout(groupChatFormLayout);
        groupChatFormLayout.setHorizontalGroup(
            groupChatFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(groupChatFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(groupChatFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupChatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(groupChatFormLayout.createSequentialGroup()
                        .addComponent(editSelectedBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(createNewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(groupChatFormLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(editGroupNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        groupChatFormLayout.setVerticalGroup(
            groupChatFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupChatFormLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(groupChatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(editGroupNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(groupChatFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editSelectedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(groupChatForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(groupChatForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewBtnActionPerformed

        try {
            isGroupSelected = false;
            writeDataToTable.join();
            this.dispose();
            new CreateNewGroupForm().setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(GroupChatForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createNewBtnActionPerformed

    private void editSelectedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectedBtnActionPerformed
        int row = groupChatTable.getSelectedRow();
        int col = groupChatTable.getSelectedColumn();
        if (row != -1 && col != -1) {
            GroupTitle = defaultTableModel.getValueAt(row, col).toString();
            if (!GroupTitle.equals("")) {
                isGroupSelected = false;
                this.setVisible(false);
                new ChatWindowForm().setVisible(true);
            }
        }
    }//GEN-LAST:event_editSelectedBtnActionPerformed

    private void editGroupNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editGroupNameBtnActionPerformed
        int col = 0;
        int row = groupChatTable.getSelectedRow();
        System.out.println(row);
        if (row != -1) {
            try {
                isGroupSelected = false;
                writeDataToTable.join();
                GroupTitle = defaultTableModel.getValueAt(row, col).toString();
                new EditGroupNameForm().setVisible(true);
                this.setVisible(false);
            } catch (InterruptedException ex) {
                Logger.getLogger(GroupChatForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            String errorMsg = "Select a group before editing";
            JOptionPane.showMessageDialog(null, errorMsg);
        }
    }//GEN-LAST:event_editGroupNameBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        try {
            isGroupSelected = false;
            writeDataToTable.join();
            this.dispose();
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(ChatWindowForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupChatForm().setVisible(true);
            }
        });
    }

    public void generateTableData() {
        writeDataToTable = new Thread(new Runnable() {
            @Override
            public void run() {
                while (isGroupSelected) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GroupChatForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    writeDataToTable();
                }
            }
        });
        writeDataToTable.start();
    }

    public void writeDataToTable() {

        ArrayList<String> allGroupDetailsList = (ArrayList<String>) clientObj.getAllGroupsList();
        int currentGroupSize = allGroupDetailsList.size();
        if (allGroupDetailsList.size() > 0) {
            if (previousThreadSize != currentGroupSize) {
                defaultTableModel.setRowCount(0);
                int row = 0;
                for (String groupDetails : allGroupDetailsList) {
                    String[] groupData = groupDetails.split("-");
                    defaultTableModel.insertRow(row++, groupData);
                }
                previousThreadSize = currentGroupSize;
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createNewBtn;
    private javax.swing.JButton editGroupNameBtn;
    private javax.swing.JButton editSelectedBtn;
    private javax.swing.JPanel groupChatForm;
    private javax.swing.JPanel groupChatPanel;
    private javax.swing.JScrollPane groupChatScrollPane;
    private javax.swing.JTable groupChatTable;
    private javax.swing.JLabel groupChatTitileLbl;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
