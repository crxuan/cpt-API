package com.crx.cptapicommon.service;


import com.crx.cptapicommon.model.entity.InterfaceInfo;


/**
* @author 21189
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-08-21 21:10:17
*/
public interface InnerInterfaceInfoService  {
     /**
      * 从数据库中查询接口是否存在
      * @param path
      * @param method
      * @return
      */
     InterfaceInfo getInterfaceInfo(String path, String method);

}
