package com.panpan.observer.v3;

import java.util.Observable;
import java.util.Observer;

/**
 * @className: SMSObserver
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/11 23:44
 * @version: 1.0
 */
public class SMSObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof UserControllerObservable) {
            System.out.println(arg + "注册成功！发送短信~~~");
        }
    }
}
