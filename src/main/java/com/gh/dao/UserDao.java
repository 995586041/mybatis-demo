package com.gh.dao;

import com.gh.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created on 2018-1-12.
 */
@Mapper
public interface UserDao {

    public User queryById( Integer id);

}
