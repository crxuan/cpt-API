package com.crx.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.crx.cptapicommon.model.entity.InterfaceInfo;
import com.crx.cptapicommon.service.InnerInterfaceInfoService;
import com.crx.project.common.ErrorCode;
import com.crx.project.exception.BusinessException;
import com.crx.project.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * ClassName: InnerInterfaceInfoServiceImpl
 * Package: com.crx.project.service.impl
 * Description:
 * @author
 */
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {
    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAnyBlank(url,method)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("url",url);
        queryWrapper.eq("method",method);

        InterfaceInfo interfaceInfo = interfaceInfoMapper.selectOne(queryWrapper);
        return interfaceInfo;

    }

}
