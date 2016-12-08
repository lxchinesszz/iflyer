package com.iflyer.repository.mongo.impl;

import com.iflyer.repository.mongo.UserRepositoryMongo;
import com.iflyer.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactory;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuxin on 16/12/8.
 * 底层实现层
 */
@Repository
public class UserRepositoryMongoImpl implements UserRepositoryMongo {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 根据用户名查询用户信息
     *
     * @param name
     * @return
     */
    public User findByName(String name) {
        Criteria criteria = new Criteria("name");
        Query query = new Query();
        query.addCriteria(criteria);
        criteria.is(name);
        User user = mongoTemplate.findOne(query, User.class);
        return user;
    }

    @Override
    public User findById(String id) {
        Query query = new Query();
        Criteria criteria = Criteria.where("id").is(id);
        query.addCriteria(criteria);
        return this.mongoTemplate.findOne(query, User.class);
    }

    @Override
    public void saveUser(User user) {
        this.mongoTemplate.save(user);
    }


    @Override
    public List<User> getPage(Query query, int start, int size) {
        query.skip(start);
        query.limit(size);
        List<User> lists = this.mongoTemplate.find(query, User.class);
        return lists;
    }

    @Override
    public void upsert(User user) {
        Update update = new Update();
        update.set("name", "测试修改");
        Query query = new Query();
        this.mongoTemplate.upsert(query, update, User.class);
    }

    @Override
    public int getCount() {
        Query query = new Query();
        return this.mongoTemplate.find(query, User.class).size();
    }

    @Override
    public void delUser(User user) {
        if(user!=null){
            this.mongoTemplate.findAndRemove(new Query(Criteria.where("id").is("3")),User.class);
        }
    }
}
