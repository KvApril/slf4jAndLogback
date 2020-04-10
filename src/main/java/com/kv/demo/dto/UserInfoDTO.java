package com.kv.demo.dto;

import lombok.Data;

/**
 * @author kv
 * @date 2020/4/10
 **/
@Data
public class UserInfoDTO {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户Code
     */
    private String userCode;

    /**
     * 用户年龄
     */
    private Integer userAge;
}
