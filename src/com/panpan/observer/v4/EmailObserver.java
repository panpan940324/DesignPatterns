package com.panpan.observer.v4;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @className: EmailObserver
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/11 23:41
 * @version: 1.0
 */
public class EmailObserver implements Observer {

    private ExecutorService executor = Executors.newFixedThreadPool(2);
    @Override
    public void update(Observable o, Object arg) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                if (o instanceof UserControllerObservable) {
                    System.out.println(arg + "注册成功！发送邮件---");
                    System.out.println(2);
                }
            }
        });
        executor.shutdown();
    }
}
