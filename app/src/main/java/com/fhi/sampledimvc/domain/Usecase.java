package com.fhi.sampledimvc.domain;


import io.reactivex.Observable;

public abstract class Usecase<T> {
    public abstract Observable<T> buildObservable();

    public Observable<T> execute() {
        return buildObservable();
    }
}
