package com.heima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.reggie.config.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
