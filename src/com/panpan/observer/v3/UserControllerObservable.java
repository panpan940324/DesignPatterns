package com.panpan.observer.v3;

import com.panpan.observer.v2.Email;

import java.util.Observable;
import java.util.Observer;

/**
 * @className: UserControllerObservable
 * @Decsription: 具体的被观察者
 * @Author: 盼盼学Java
 * @Date: 2022/10/11 23:36
 * @version: 1.0
 */
public class UserControllerObservable extends Observable {

    public void register(String userName, String passWord) {
        Long userId = save(userName, passWord);
        if (userId != null) {
            super.setChanged();
            super.notifyObservers(userName);
        }
    }

    public Long save(String userName, String passWord) {
        return 1L;
    }
}
