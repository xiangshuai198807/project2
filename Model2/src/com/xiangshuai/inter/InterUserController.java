package com.xiangshuai.inter;


import com.xiangshuai.pojo.User;

import java.util.List;

/**
 *
 *
 * @author 刘期香
 * @create 2018-11-04 19:55
 */
public interface InterUserController {
    public List<User> getAllUser();
    public User gerTById(int id);
}
