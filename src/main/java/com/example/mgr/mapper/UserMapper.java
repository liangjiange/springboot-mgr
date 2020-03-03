package com.example.mgr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mgr.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user where code = #{code}")
    User getUserByCode(@Param("code") String code);

}
