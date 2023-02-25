package com.luoxiaohei.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("tbl_user")
public class User {
    //配置id自增策略
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    @TableField(value = "pwd" ,select = false)
    private String password;
    private Integer age;
    private String tel;

    @TableField(exist = false)
    private Integer online;

    //逻辑删除字段，标记当前记录是否被删除
    @TableLogic(value = "0",delval = "1")  //0代表没有删，1代表已经删除
    private Integer deleted;

    //实现乐观锁（要开拦截器）--->应用于秒杀活动
    //相当于：update 表名 set abc=1,version=version+1 where version=1(version会自增)
    @Version
    private Integer version;
}
