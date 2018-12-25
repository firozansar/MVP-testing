package com.fhi.sampledimvc.mvp.view;

import com.fhi.sampledimvc.data.entity.users.User;

import java.util.List;


public interface UserView extends View {
    void displayLoadingScreen();

    void hideLoadingScreen();

    void updateUSerResult(List<User> userList);

    void fetchDataError();
}
