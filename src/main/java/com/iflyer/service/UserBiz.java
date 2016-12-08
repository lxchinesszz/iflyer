package com.iflyer.service;


import com.iflyer.domain.User;
import com.iflyer.repository.mongo.impl.UserRepositoryMongoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * Created by liuxin on 16/12/8.
 */
@Component
public class UserBiz {
    @Autowired
    private UserRepositoryMongoImpl userRepositoryMongo;


    public User findByName(String name){
        return userRepositoryMongo.findByName(name);
    }

    public User findById(String id){
        return userRepositoryMongo.findById(id);
    }

    public List<User> findAllUser(){
        Query query=new Query();
        return userRepositoryMongo.getPage(query,1,19);
    }
}
