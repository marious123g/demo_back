package com.example.demo_back.serviceImpl;

import com.example.demo_back.entity.UserExample;
import com.example.demo_back.mapper.UserMapper;
import com.example.demo_back.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService
{
    @Resource
    private UserMapper userMapper;
    @Override
    public boolean validateUser(String userName,String password)
    {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        criteria.andPasswordEqualTo(password);
        return userMapper.selectByExample(userExample)==null;
    }
}
