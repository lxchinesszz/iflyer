package com.iflyer.dao;

import com.iflyer.main.JUnitMainUtil;
import com.iflyer.domain.User;
import com.iflyer.repository.mongo.UserRepositoryMongo;
import com.iflyer.repository.mongo.impl.UserRepositoryMongoImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liuxin on 16/12/7.
 */
public class UserDaoTest extends JUnitMainUtil {
    private static final Log log = LogFactory.getLog(UserDaoTest.class);
    @Autowired
    UserRepositoryMongoImpl userRepositoryMongo;

    @Test
    public void test() {
        log.info("SUCCESS");
    }

    @Test
    public void testFindByName() {
        log.info(userRepositoryMongo.findByName("05"));
    }
    @Test
    public void testFindById(){
        log.info(userRepositoryMongo.findById("7").getName());
    }


}
