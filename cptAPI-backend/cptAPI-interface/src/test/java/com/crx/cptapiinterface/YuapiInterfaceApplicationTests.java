package com.crx.cptapiinterface;


import com.crx.cptclientsdk.client.CptApiClient;
import com.crx.cptclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@SpringBootTest
class YuapiInterfaceApplicationTests {

    @Resource
    private CptApiClient cptApiClient;

    @Test
    void contextLoads() {
        String result = cptApiClient.getNameByPost("cpt");
        User user = new User();
        user.setUsername("cpt");
        String usernameByPost = cptApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
