package com.kv.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
* @author kv
* @date 2020/4/10
**/
@Data
@TableName(value = "user_info")
public class UserInfo {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 用户Code
     */
    @TableField(value = "user_code")
    private String userCode;

    /**
     * 用户年龄
     */
    @TableField(value = "user_age")
    private Integer userAge;
}