package com.heima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.reggie.config.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
