package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.signup.SignupState;

public class ClearState extends SignupState {
    private String[] deletedUsers = null;
    public ClearState() {
    }
    public String[] getDeletedUsers() {
        return deletedUsers;
    }
    public void setDeletedUsers(String[] deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

}
