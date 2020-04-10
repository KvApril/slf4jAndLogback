package com.kv.demo.service;

import com.kv.demo.dao.UserInfoMapper;
import com.kv.demo.dto.UserInfoDTO;
import com.kv.demo.entity.UserInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kv
 * @date 2020/4/10
 **/
@Service
public class UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    /**
     * 创建用户信息
     * @param userInfoDTO
     */
    public void createUser(UserInfoDTO userInfoDTO){
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoDTO,userInfo);
        userInfoMapper.insert(userInfo);
    }
}
