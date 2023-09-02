package com.crx.project.model.dto.interfaceInfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 创建请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoAddRequest implements Serializable {

    /**
     * 接口名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;
    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 请求头
     */
    private String requestHander;

    /**
     * 响应头
     */
    private String reponseHeader;


    /**
     * 请求类型
     */
    private String method;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}