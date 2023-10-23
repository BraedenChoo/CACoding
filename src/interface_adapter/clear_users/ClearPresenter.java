package interface_adapter.clear_users;

// TODO Complete me


import interface_adapter.signup.SignupState;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;


public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareView(ClearOutputData clearOutputData) {
        ClearState clearState = clearViewModel.getState();
        clearState.setDeletedUsers(clearOutputData.getDeletedUsers());
        clearViewModel.firePropertyChanged();
    }
}
