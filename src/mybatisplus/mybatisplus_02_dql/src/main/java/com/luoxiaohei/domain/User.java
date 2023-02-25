package com.luoxiaohei.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tbl_user")  //此时因为User对应的表user在数据库中不存在，所以要对应
public class User {
    private Long id;
    private String name;
    @TableField(value = "pwd" ,select = false)  //映射并将pwd隐藏起来(密码是敏感信息)
    private String password;
    private Integer age;
    private String tel;

    @TableField(exist = false)
    private Integer online;//因为online字段在表中不存在
}
