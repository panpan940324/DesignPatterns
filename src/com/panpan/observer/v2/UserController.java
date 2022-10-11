package com.panpan.observer.v2;

/**
 * @className: UserController
 * @Decsription: 用户注册控制器
 * @Author: 盼盼学Java
 * @Date: 2022/10/11 23:01
 * @version: 1.0
 */
public class UserController {

    public void register(String userName, String passWord) {
        Long userId = save(userName, passWord);
        if (userId != null) {
            new Email().sendEmail(userId);
        }
    }

    public Long save(String userName, String passWord) {
        return 1L;
    }

}
