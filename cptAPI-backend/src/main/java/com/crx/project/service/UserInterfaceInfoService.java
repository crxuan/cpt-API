package com.crx.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.crx.cptapicommon.model.entity.UserInterfaceInfo;


/**
* @author 21189
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-08-25 13:32:40
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(Long interfaceInfoId,Long userId);
}
