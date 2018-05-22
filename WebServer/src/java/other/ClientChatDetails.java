package other;

import java.io.Serializable;

public class ClientChatDetails implements Serializable {
    
    private String sendersLoginId;
    private String message;
    private String date;
    private String groupName;

    public String getSendersLoginId() {
        return sendersLoginId;
    }

    public void setSendersLoginId(String sendersLoginId) {
        this.sendersLoginId = sendersLoginId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

}
