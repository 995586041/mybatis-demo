package com.gh.rest;

import com.gh.api.UserRest;
import com.gh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2018-1-12.
 */
@RestController
public class UserImpl implements UserRest {

    @Autowired
    private UserService userService;

    @Override
    public Object queryById(@PathVariable Integer id) {
        return userService.queryById(id);
    }

}
