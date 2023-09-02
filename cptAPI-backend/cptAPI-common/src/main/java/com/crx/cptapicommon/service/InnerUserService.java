package com.crx.cptapicommon.service;


import com.crx.cptapicommon.model.entity.User;

/**
 * 用户服务
 *
 * @author crx
 */
public interface InnerUserService   {

    /**
     * 数据库查询是否分配给用户秘钥（accessKey)
     */
    User getInvokeUser(String accessKey);

}
