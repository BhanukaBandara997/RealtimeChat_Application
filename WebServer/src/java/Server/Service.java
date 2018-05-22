package Server;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebService;
import other.ClientChatDetails;
import other.ClientData;
import other.GroupInfo;
import other.SerializationDemo;

/**
 *
 * Name - W.R.B.V.Bandara 
 * IIT No - w1626630 
 * UOW No - 2016147
 */

@WebService(serviceName = "Service")
public class Service {

    public ArrayList<String> postedMsgList;
    public ArrayList<String> clientDetailList;
    public ArrayList<String> threadList;
    private boolean isUserRegistered = false;
    private static String temporaryThreadName;

    public Service() {
        postedMsgList = new ArrayList<>();
        clientDetailList = new ArrayList<>();
        threadList = new ArrayList<>();
    }

    @WebMethod(operationName = "registerClient")
    public boolean registerClient(String nickName, String loginId, String password) {
        String clientData = nickName + "-" + loginId + "-" + password;
        if (clientData != null) {
            for (String client : clientDetailList) {
                String[] clientLoginId = client.split("-");
                if (clientLoginId[1].equals(loginId)) {
                    isUserRegistered = true;
                    ClientData clientRegisterData = new ClientData();
                    clientRegisterData.setNickName(clientLoginId[0]);
                    clientRegisterData.setLoginId(clientLoginId[1]);
                    clientRegisterData.setPassword(clientLoginId[2]);
                    try {
                        SerializationDemo.serialization("C:\\Users\\Bhanuka Bandara\\Desktop\\WebServer\\registeredUsers.txt", clientRegisterData);
                        ClientData object = (ClientData) SerializationDemo.deSerialization("C:\\Users\\Bhanuka Bandara\\Desktop\\WebServer\\registeredUsers.txt");
                    } catch (IOException | ClassNotFoundException exp) {
                    }
                    break;
                }
            }
        }
        if (isUserRegistered) {
            isUserRegistered = false;
            return false;
        }
        clientDetailList.add(clientData);
        return true;
    }

    @WebMethod(operationName = "loginClient")
    public boolean loginClient(String loginId, String password) {
        for (String client : clientDetailList) {
            String[] clientData = client.split("-");
            if (clientData[1].equals(loginId) & clientData[2].equals(password)) {
                return true;
            }
        }
        return false;
    }

    @WebMethod(operationName = "createThread")
    public boolean createThread(String threadTitle, String lastEditedDate, String lastEditedClient) {
        String threadDetails = threadTitle + "-" + lastEditedDate + "-" + lastEditedClient;
        if (threadDetails != null) {
            threadList.add(threadDetails);
            String[] threadDetailsArray = threadDetails.split("-");
            GroupInfo groupInfo = new GroupInfo();
            groupInfo.setDate(threadDetailsArray[1]);
            groupInfo.setGroupTitle(threadDetailsArray[0]);
            groupInfo.setEditedClient(threadDetailsArray[2]);

            try {
                SerializationDemo.serialization("createdGroups.txt", groupInfo);
                GroupInfo object = (GroupInfo) SerializationDemo.deSerialization("createdGroups.txt");
                System.out.println(object.toString());
            } catch (IOException | ClassNotFoundException exp) {
            }
            return true;
        }
        return false;
    }

    @WebMethod(operationName = "sendMessage")
    public boolean sendMessage(String senderNickName, String message, String time, String threadName) {
        String messageDetails = senderNickName + "-" + message + "-" + time + "-" + threadName;
        if (messageDetails != null) {
            postedMsgList.add(messageDetails);
            String[] chatDetails = messageDetails.split("-");
            ClientChatDetails chatDetailsObj = new ClientChatDetails();
            chatDetailsObj.setDate(chatDetails[2]);
            chatDetailsObj.setGroupName(chatDetails[3]);
            chatDetailsObj.setSendersLoginId(chatDetails[0]);
            chatDetailsObj.setMessage(chatDetails[1]);
            try {
                SerializationDemo.serialization("test/chatLog.txt", chatDetailsObj);
                ClientChatDetails object = (ClientChatDetails) SerializationDemo.deSerialization("test/chatLog.txt");
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
        return false;
    }

    @WebMethod(operationName = "receiveMessage")
    public ArrayList<String> receiveMessage() {
        return postedMsgList;
    }

    @WebMethod(operationName = "editSingleThread")
    public boolean editSingleThread(String title, String date, String editedby) {
        return true;
    }

    @WebMethod(operationName = "getAllGroupsList")
    public ArrayList<String> getAllGroupsList() {
        return threadList;
    }

    @WebMethod(operationName = "editThreadName")
    public boolean updateThreadName(String previousThreadName, String newThreadName, String editedClientName) {
        temporaryThreadName = previousThreadName;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd/hh:mm:ss");
        String strDate = sdf.format(date);
        String newline = newThreadName + "-" + strDate + "-" + editedClientName;
        for (String threadData : threadList) {
            String[] threadName = threadData.split("-");
            GroupInfo editedGroupName = new GroupInfo();
            editedGroupName.setOldGroupName(threadName[0]);
            editedGroupName.setNewGroupName(threadName[1]);
            editedGroupName.setLoginIdOfClient(threadName[2]);
            if (threadName[0].equals(previousThreadName)) {
                int indexOfPreviousThread = threadList.indexOf(threadData);
                threadList.remove(indexOfPreviousThread);
                threadList.add(newline);
                                try {
                    SerializationDemo.serialization("editedGroupNames.txt", editedGroupName);
                    GroupInfo object = (GroupInfo) SerializationDemo.deSerialization("editedGroupNames.txt");
                    System.out.println(object.toString());
                } catch (IOException | ClassNotFoundException exp) {
                }
                readmsg:
                for (int j = 0; j < postedMsgList.size(); j++) {
                    String[] newNameForThread = postedMsgList.get(j).split("-");
                    if (newNameForThread[3].equals(temporaryThreadName)) {
                        String newMessageToSend = newNameForThread[0] + "-" + newNameForThread[1] + "-"
                                + newNameForThread[2] + "-" + newThreadName;
                        postedMsgList.add(newMessageToSend);
                    }
                }
                return true;
            }
        }
        return true;
    }
}

