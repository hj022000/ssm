package com.taomee.bigdata.ssm.Test;

import com.alibaba.fastjson.JSON;
import com.taomee.bigdata.ssm.entity.ServerInfo;
import com.taomee.bigdata.ssm.service.ServerInfoService;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author looper.
 * Company  TaoMee.Inc, ShangHai.
 * Date  2017/7/14.
 */

public class TestMyBatis {

    //private static Logger logger = Logger.getLogger(TestMyBatis.class);
    private static org.slf4j.Logger LOG = LoggerFactory.getLogger(TestMyBatis.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        ServerInfoService serverInfoService = (ServerInfoService) context.getBean("serverInfoService");
        System.out.println(serverInfoService);
        ServerInfo serverInfo = serverInfoService.getServerInfoByServerId(1);
        System.out.println(JSON.toJSON(serverInfo));
        LOG.info(JSON.toJSON(serverInfo).toString());


    }
}