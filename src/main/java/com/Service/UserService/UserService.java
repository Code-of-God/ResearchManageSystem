package com.Service.UserService;

import com.ORM.model.userModel.TblUser;

/**
 * author 07087 uniview.co
 * description userService
 */
public interface UserService {

    /**
     * 根据id查询用户信息
     * @param userId 用户id
     * @return UserBean
     */
    TblUser getUserInfo(Integer userId);

    /**
     * 登陆
     * @paraxim tblUser 用户信息
     * @return 登陆成功与否
     */
    String isLogin(TblUser tblUser);
}
