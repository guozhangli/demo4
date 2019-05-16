package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from t1")
    List<User> findAllUser();
}
