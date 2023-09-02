package com.crx.cptapicommon.service;






/**
* @author 21189
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-08-25 13:32:40
*/
public interface InnerUserInterfaceInfoService  {



    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(Long interfaceInfoId,Long userId);

}
