package com.hnu.elvis.service.impl;

import com.hnu.elvis.entity.User;
import com.hnu.elvis.mapper.UserMapper;
import com.hnu.elvis.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Created by Elvis on 2020/6/1.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
