package com.mmall.common;

/**
 * Created by s on 2017/5/10.
 */
public class Const {

    //当前用户
    public static final String CURRENT_USER = "currentUser";

    //用户名和email校验
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    //用枚举太重，所以使用这种方式
    public interface Role{
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;//管理员
    }



}
