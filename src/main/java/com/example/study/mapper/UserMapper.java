package com.example.study.mapper;

import com.example.study.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

     User getUserById(@Param("id") String id);

}
