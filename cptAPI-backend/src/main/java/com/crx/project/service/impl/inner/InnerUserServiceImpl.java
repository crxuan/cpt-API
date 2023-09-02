package com.crx.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.crx.cptapicommon.model.entity.User;
import com.crx.cptapicommon.service.InnerUserService;
import com.crx.project.common.ErrorCode;
import com.crx.project.exception.BusinessException;
import com.crx.project.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * ClassName: InnerUserServiceImpl
 * Package: com.crx.project.service.impl
 * Description:
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("accessKey",accessKey);
        return  userMapper.selectOne(queryWrapper);
    }
}
