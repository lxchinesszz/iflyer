package com.iflyer.testMongodb;
import com.mongodb.DB;
import com.mongodb.Mongo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

/**
 * Created by liuxin on 16/12/7.
 * 测试连接Mongodb数据库
 */
public class ConnMongodb {
    private static final Log log = LogFactory.getLog(ConnMongodb.class);

    @Test
    public void testMongodb() {
        try {
            //测试连接mongodb数据库
            Mongo mongo = new Mongo("127.0.0.1", 27017);
            //根据mongodb数据库的名称获取mongodb对象 ,
            DB db = mongo.getDB("iflyer");
            Set<String> collectionNames = db.getCollectionNames();
            log.info("数据库名称" + db);
            // 打印出test中的集合
            for (String name : collectionNames) {
                log.info("collectionName===" + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
