package com.taomee.bigdata.ssm.service.impl;

import com.taomee.bigdata.ssm.dao.ServerInfoDao;
import com.taomee.bigdata.ssm.entity.ServerInfo;
import com.taomee.bigdata.ssm.service.ServerInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author looper.
 * Company  TaoMee.Inc, ShangHai.
 * Date  2017/7/14.
 */
@Service("serverInfoService")
public class ServerInfoServiceImpl implements ServerInfoService{

    @Resource
    private ServerInfoDao dao;
    public ServerInfo getServerInfoByServerId(Integer serverId) {
        return dao.getServerInfo(serverId);
    }
}
