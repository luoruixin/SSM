package com.luoxiaohei.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luoxiaohei.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {

}
