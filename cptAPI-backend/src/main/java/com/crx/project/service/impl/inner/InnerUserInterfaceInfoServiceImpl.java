package com.crx.project.service.impl.inner;


import com.crx.cptapicommon.service.InnerUserInterfaceInfoService;
import com.crx.project.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * ClassName: InnerUserInterfaceInfoServiceImpl
 * Package: com.crx.project.service.impl
 * Description:
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;
    @Override
    public boolean invokeCount(Long interfaceInfoId, Long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId,userId);
    }
}
