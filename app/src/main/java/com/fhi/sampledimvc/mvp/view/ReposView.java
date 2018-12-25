package com.fhi.sampledimvc.mvp.view;

import com.fhi.sampledimvc.data.entity.repos.GitHubUserRepos;

import java.util.List;


public interface ReposView extends View {
    void displayLoadingScreen();

    void hideLoadingScreen();

    void showTitleByUsername(List<GitHubUserRepos> reposList,String username,int currentPage,int totalPages);

    void updateReposResult(List<GitHubUserRepos> reposList);

    void fetchDataError();
}
