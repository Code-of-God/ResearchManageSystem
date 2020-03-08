package com.Service.UserService;


import com.ORM.mapper.userMapper.TblUserMapper;
import com.ORM.model.userModel.TblUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Transactional
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private TblUserMapper tblUserMapper;

    @Override
    public TblUser getUserInfo(Integer userId) {
        TblUser userBean = new TblUser();
        userBean = tblUserMapper.selectByPrimaryKey(userId);
        return userBean;
    }

    @Override
    public String isLogin(TblUser tblUser) {
        TblUser userBean = new TblUser();
        userBean = tblUserMapper.selectByUserName(tblUser.getUserName());
        if(userBean != null && tblUser.getPassword().equals(userBean.getPassword()))
        {
            return "Login Success";
        }else {
            return "Login Failed";
        }

    }
}
