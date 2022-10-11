package com.panpan.observer.v2;

/**
 * @className: Main
 * @Decsription: 注册用户，成功之后，发送邮件
 * @Author: 盼盼学Java
 * @Date: 2022/10/11 23:09
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        String userName = "jack";
        String passWord = "123456";
        userController.register(userName, passWord);
    }
}
