package com.taomee.bigdata.ssm.service;

import com.taomee.bigdata.ssm.entity.ServerInfo;

/**
 * Author looper.
 * Company  TaoMee.Inc, ShangHai.
 * Date  2017/7/14.
 */
public interface ServerInfoService {

    public ServerInfo getServerInfoByServerId(Integer serverId);
}
