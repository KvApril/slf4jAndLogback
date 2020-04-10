package com.kv.demo.controller;

import com.alibaba.fastjson.JSON;
import com.kv.demo.dto.UserInfoDTO;
import com.kv.demo.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author kv
 * @date 2020/4/10
 **/
@RestController
@RequestMapping("/userInfo")
@Api(value = "/userInfo", tags = {"用户接口"})
@Slf4j
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @GetMapping("/index")
    @ApiOperation(value = "index页面")
    public String index() {
        log.info("Hola~~~测试一下日志打印");
        return "Hola~~~测试一下日志打印";
    }

    @PostMapping("/createUser")
    @ApiOperation(value = "新增用户接口")
    public void createUser(@RequestBody UserInfoDTO userInfoDTO) {
        log.info("新增用户接口,请求参数:{}", JSON.toJSONString(userInfoDTO));
        userInfoService.createUser(userInfoDTO);
    }
}
