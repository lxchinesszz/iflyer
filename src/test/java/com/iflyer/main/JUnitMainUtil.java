package com.iflyer.main;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by liuxin
 * 测试类集成此类，用于测试环境下使用注入
 */

@WebAppConfiguration
@ContextConfiguration(locations = {  "classpath*:spring-context.xml" ,"classpath*:mvc-servlet.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class JUnitMainUtil {
}
