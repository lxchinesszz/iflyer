package com.iflyer.testMongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import java.util.Set;

/**
 * Created by liuxin on 16/12/7.
 */
public class TestMongodb {
    private static final Log log = LogFactory.getLog(TestMongodb.class);

    @Test
    public void testMongodb() {
        try {
            //测试连接mongodb数据库
            Mongo mongo = new Mongo("127.0.0.1", 27017);
            //根据mongodb数据库的名称获取mongodb对象 ,

            DB db = mongo.getDB("mymongodb");

            //第三：操作具体的表
            //在mongodb中没有表的概念，而是指集合
            //其中参数是数据库中表，若不存在，会自动创建
            DBCollection collection = db.getCollection("user");

            //添加操作
            //在mongodb中没有行的概念，而是指文档
            BasicDBObject document = new BasicDBObject();

            document.put("id", 1);
            document.put("name", "小明");
            document.put("age",20);

            BasicDBObject document2 = new BasicDBObject();

            document2.put("id", 1);
            document2.put("name", "小明");
            document2.put("age",200);



//          //然后保存到集合中
            collection.insert(document);
            collection.insert(document2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

