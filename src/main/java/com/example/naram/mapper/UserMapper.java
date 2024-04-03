package com.example.naram.mapper;

import com.example.naram.domain.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    //로그인
    public UserDto login(@Param("userId")String userId, @Param("userPassword")String userPassword);

}