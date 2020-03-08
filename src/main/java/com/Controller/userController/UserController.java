package com.Controller.userController;

import com.Controller.entity.Result;
import com.ORM.model.userModel.TblUser;
import com.Service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * author 07087 uniview.co
 * description user info controller
 * time 2020.03.07
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登陆
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody String login(@RequestParam String userName, @RequestParam String password)
    {
        Result result = new Result();
        TblUser user = new TblUser();
        user.setUserName(userName);
        user.setPassword(password);
        return userService.isLogin(user);
    }


    /**
     * 根据id查询用户信息
     * @return UserBean 用户信息对象
     */
    @RequestMapping(value = "/findUserInfo", method = RequestMethod.GET)
    public @ResponseBody TblUser getUserInfo(@RequestParam Integer userId)
    {
        System.out.println("getUserInfo");
        return userService.getUserInfo(userId);
    }


    /**
     * 添加用户
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public @ResponseBody String addUser(@RequestBody TblUser tblUser)
    {

        return null;
    }
}
