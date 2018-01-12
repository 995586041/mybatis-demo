package com.gh.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created on 2018-1-12.
 */
@RequestMapping("user")
public interface UserRest {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    Object queryById(Integer id);

}
