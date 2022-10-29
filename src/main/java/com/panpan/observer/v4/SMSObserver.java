package com.panpan.observer.v4;

import java.util.Observable;
import java.util.Observer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @className: SMSObserver
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/11 23:44
 * @version: 1.0
 */
public class SMSObserver implements Observer {

    private final ExecutorService executor = Executors.newFixedThreadPool(2);

    @Override
    public void update(Observable o, Object arg) {
        executor.execute(() -> {
            if (o instanceof UserControllerObservable) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(arg + "注册成功！发送短信~~~");
                System.out.println(1);
                executor.shutdown();
            }
        });
        System.out.println("结束");
        executor.shutdown();

    }
}
