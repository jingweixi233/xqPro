package com.wang.repository;

import com.wang.model.User;

public interface UserMapper {

    User selectByPrimaryKey(long id);

}
