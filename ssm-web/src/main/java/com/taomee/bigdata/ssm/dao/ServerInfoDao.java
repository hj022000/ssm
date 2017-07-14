package com.taomee.bigdata.ssm.dao;


/*注意：使用到事务时方法名前缀是有规定的，参考spring-mybatis.xml的transactionAdvice
 * */

import com.taomee.bigdata.ssm.entity.ServerInfo;


public interface ServerInfoDao {
    /*Integer insertServerInfo(ServerInfo serverInfo) throws DataAccessException;
    Integer updateServerInfo(ServerInfo serverInfo) throws DataAccessException;
    Integer updateServerInfoByStatus(ServerInfo serverInfo) throws DataAccessException;
	Integer deleteServerInfo(Integer serverId) throws DataAccessException;*/
    ServerInfo getServerInfo(Integer serverId);
   /* List<ServerInfo> getAllServerInfosByStatus(Integer status);
    List<ServerInfo> getAllServerInfos(); 
    List<ServerInfo> getServerInfoByparentId(Integer parentId);
    List<ServerInfo> getServerInfoByGameId(Integer gameId);
    ServerInfo getServerInfoByTopgameId(Integer gameId);*/
}
