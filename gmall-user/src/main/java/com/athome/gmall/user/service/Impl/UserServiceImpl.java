package com.athome.gmall.user.service.Impl;

import com.athome.gmall.user.dao.UmsMember;
import com.athome.gmall.user.mapper.UserMapper;
import com.athome.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = userMapper.selectAllUser();

        return umsMemberList;
    }
}
