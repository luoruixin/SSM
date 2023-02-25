package com.luoxiaohei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luoxiaohei.domain.User;
import org.apache.ibatis.annotations.Mapper;

//这和以往不同，只需要继承BaseMapper
@Mapper
public interface UserDao extends BaseMapper<User> {
}
