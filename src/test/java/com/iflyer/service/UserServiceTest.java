package com.iflyer.service;

import com.iflyer.dao.UserDaoTest;
import com.iflyer.main.JUnitMainUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by liuxin on 16/12/7.
 * 测试service层
 */

public class UserServiceTest extends JUnitMainUtil {
    private static final Log log = LogFactory.getLog(UserServiceTest.class);
    @Autowired
    UserBiz userBiz;

    @Test
    public void saveUser()throws Exception{
        log.info(userBiz.findByName("05"));
    }
}
