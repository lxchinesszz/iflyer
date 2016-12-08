package com.iflyer.rest;

import com.iflyer.domain.User;
import com.iflyer.service.UserBiz;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户控制层
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private static final Log log = LogFactory.getLog(UserController.class);
    @Autowired
    UserBiz userBiz;
    @RequestMapping(value = "/findByName",method = RequestMethod.GET)
    @ResponseBody
    public User findByName(String name){
        return userBiz.findByName(name);
    }
    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User findById(@PathVariable(value = "id") String id){
        return userBiz.findById(id);
    }
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAll(){
        return userBiz.findAllUser();
    }
}
