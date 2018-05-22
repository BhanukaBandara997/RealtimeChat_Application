package other;

import java.io.Serializable;

public class GroupInfo implements Serializable{

    private String groupTitle;
    private String date;
    private String editedClient;
    private String oldGroupName;
    private String newGroupName;
    private String loginIdOfClient;

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEditedClient() {
        return editedClient;
    }

    public void setEditedClient(String editedClient) {
        this.editedClient = editedClient;
    }

    public String getOldGroupName() {
        return oldGroupName;
    }

    public void setOldGroupName(String oldGroupName) {
        this.oldGroupName = oldGroupName;
    }

    public String getNewGroupName() {
        return newGroupName;
    }

    public void setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
    }

    public String getLoginIdOfClient() {
        return loginIdOfClient;
    }

    public void setLoginIdOfClient(String loginIdOfClient) {
        this.loginIdOfClient = loginIdOfClient;
    }
}
