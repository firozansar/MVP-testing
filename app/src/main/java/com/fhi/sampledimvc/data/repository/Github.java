package com.fhi.sampledimvc.data.repository;

import com.fhi.sampledimvc.data.entity.repos.GitHubUserRepos;
import com.fhi.sampledimvc.data.entity.starred.GitHubRepoStarred;
import com.fhi.sampledimvc.data.entity.users.User;

import java.util.List;

import io.reactivex.Observable;

public interface Github {

    Observable<List<GitHubRepoStarred>> getStarredRepositories(String userName);

    Observable<List<GitHubUserRepos>> getGithubRepos(String username);

    Observable<List<User>> getGithubUsers();
}
