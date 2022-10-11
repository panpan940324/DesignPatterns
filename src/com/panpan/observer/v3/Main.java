package com.panpan.observer.v3;

/**
 * @className: Main
 * @Decsription: 使用观察者模式来完成用户注册以及成功之后发送短信和邮件功能
 * @Author: 盼盼学Java
 * @Date: 2022/10/11 23:12
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        UserControllerObservable userControllerObservable = new UserControllerObservable();
        userControllerObservable.addObserver(new EmailObserver());
        userControllerObservable.addObserver(new SMSObserver());
        userControllerObservable.register("jack", "123456");
    }
}
