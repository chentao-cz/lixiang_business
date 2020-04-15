package com.lixiang.bs.service.impl;

import com.lixiang.bs.mapper.UserMapper;
import com.lixiang.bs.entity.UserEntity;
import com.lixiang.bs.service.UserService;
import com.lixiang.bs.common.base.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author chentao
 * @date 2020/4/15 15:12
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<UserEntity> implements UserService {
    @Resource
    private UserMapper userMapper;

}
