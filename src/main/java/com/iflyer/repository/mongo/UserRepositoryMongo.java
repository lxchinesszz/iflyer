package com.iflyer.repository.mongo;

import com.iflyer.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.core.query.*;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuxin on 16/12/8.
 */
@Repository
public interface UserRepositoryMongo {
    /**
     * 根据用户名得到用户信息
     * @param name
     * @return
     */
    User findByName(String name);

    /**
     * 根据id得到用户
     * @param id
     * @return
     */
    User findById(String id);

    /**
     * 插入一条数据
     * @param user
     */
    public void saveUser(User user);

    /**
     * 通过条件进行分页查询
     *
     *
     * @param query
     *                     查询条件
     * @param start
     *                     查询起始值
     *                     <strong> 类似mysql查询中的 limit start, size 中的 start</strong>
     * @param size
     *                     查询大小
     *                     <strong> 类似mysql查询中的 limit start, size 中的 size</strong>
     * @return
     *                     满足条件的集合
     */
    public List<User> getPage(Query query, int start, int size);

    /**
     * 存在就修改，没有就创建
     * @param user
     */
    public void upsert(User user);

    /**
     * 获得数据个数
     * @return
     */
    public int getCount();

    /**
     * 删除用户
     * 查到就删除
     * @param user
     */
    public void delUser(User user);
}
