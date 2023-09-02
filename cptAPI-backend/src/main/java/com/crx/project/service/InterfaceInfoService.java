package com.crx.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.crx.cptapicommon.model.entity.InterfaceInfo;


/**
* @author 21189
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-08-21 21:10:17
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
     void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
